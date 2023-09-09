package se331.lab.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import se331.lab.rest.entity.Organizer;

import se331.lab.rest.service.OrganizerService;



@Controller
@RequiredArgsConstructor
public class OrganizerController {
    private final OrganizerService organizerService;
    @GetMapping("organizer")
    public ResponseEntity<?> getOrganizerLists(@RequestParam(value = "_limit",
            required = false)Integer perPage
            , @RequestParam(value = "_page", required = false)Integer page) {
        Page<Organizer> output = null;
        Integer eventSize = organizerService.getOrganizerSize();
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count", String.valueOf(eventSize));
        try {
            output = (Page<Organizer>) organizerService.getOrganizers(perPage, page);
            return new ResponseEntity<>(output, responseHeader, HttpStatus.OK);
        } catch (IndexOutOfBoundsException ex) {
            return new ResponseEntity<>(output, responseHeader, HttpStatus.OK);
        }
    }
    @GetMapping("organizer/{id}")
    public ResponseEntity<?> getOrganizer(@PathVariable("id") Long id) {
        Organizer output = organizerService.getOrganizer(id);
        if(output != null) {
            return ResponseEntity.ok(output);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The given " +
                    "id is not found");
        }
    }
    @PostMapping("/organizer")
    public ResponseEntity<?> addOrganizer(@RequestBody Organizer organizer) {
        Organizer output = organizerService.save(organizer);
        return ResponseEntity.ok(organizer);
    }


}
