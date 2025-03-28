package com.planner.project.participant;

import com.planner.project.trip.Trip;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "participants")
public class Participant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column (name = "is_confirmed", nullable = false)
    private Boolean isConfirmed;

    @Column(nullable = false)
    private String name;

    @Column (nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name= "trip_id", nullable = false)
    private Trip trip;



}
