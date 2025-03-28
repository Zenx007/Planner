package com.planner.project.participant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participants")
public class ParticipantController {

    @PostMapping("/{id}/confirm")
    public ResponseEntity<Participant> confirmParticipant(){}
}
