package com.planner.project.trip;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String destination;

    @Column(name = "starts_at", nullable = false)
    private LocalDateTime startsAt;
}
