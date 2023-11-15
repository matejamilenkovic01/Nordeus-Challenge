package com.nordeus.jobfair.auctionservice.auctionservice.domain.model;

import lombok.Getter;

@Getter
public class AuctionId {

    private static long nextId = 1;

    private final long id;

    public AuctionId() {
        this.id = nextId++;
    }

}
