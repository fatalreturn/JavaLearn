package io.namoosori.java.travelClub.service;

import io.namoosori.java.travelClub.entity.TravelClub;

public interface ClubService {

    void resister(TravelClub travelClub);
    TravelClub [] finAll();
    TravelClub [] findByName(String clubName);
    TravelClub findById(String clubId);
    void modify(TravelClub modifyClub);
    void remove(String clubId);
}
