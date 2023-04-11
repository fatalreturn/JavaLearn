package io.namoosori.java.travelClub.service.logic;

import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.service.ClubService;

public class ClubServiceLogic implements ClubService {
    private TravleClub[] clubs;
    private int index;

    public ClubServiceLogic() {
        this.clubs = new TravleClub[10];
        this.index = 0;
    }

    @Override

    public void resister(TravelClub travelClub) {

    }

    @Override
    public TravelClub[] finAll() {
        return new TravelClub[0];
    }

    @Override
    public TravelClub[] findByName(String clubName) {
        return new TravelClub[0];
    }

    @Override
    public TravelClub findById(String clubId) {
        return null;
    }

    @Override
    public void modify(TravelClub modifyClub) {

    }

    @Override
    public void remove(String clubId) {

    }
}
