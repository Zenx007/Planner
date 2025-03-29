package com.planner.project.participant;

import java.util.UUID;

public record ParticipantCreateResponse(UUID id, String name, String email, Boolean isConfirmed) {
}
