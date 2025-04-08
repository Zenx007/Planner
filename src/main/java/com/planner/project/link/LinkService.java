package com.planner.project.link;

import com.planner.project.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink (LinkRequestPayload payload, Trip trip) {
        Link newLink = new Link(payload.title(),payload.url(),trip);

        this.repository.save(newLink);

        return new LinkResponse (newLink.getId());
    }
}
