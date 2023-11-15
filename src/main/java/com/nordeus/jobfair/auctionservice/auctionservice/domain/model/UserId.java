package com.nordeus.jobfair.auctionservice.auctionservice.domain.model;



import lombok.Getter;

@Getter
public class UserId {

    private static long nextId = 1;

    private final long id;

    public UserId() {
        this.id = nextId++;
    }

}
