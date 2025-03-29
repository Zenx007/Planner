package com.planner.project.participant;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository repository;

    public void registerParticipantsToEvent(List<String> participantsToInvite, Trip trip) {

        List<Participant> participants = particpantsToInvite.stream().map(email-> new Participant(email,trio)).toList();
        this.repository.saveAll(participants);

        System.out.println(participants.get(0).getId());

    }

    public void triggerConfirmationEmailToParticipants(UUID tripId) {

    }
}
