package io.namoosori.java.travelClub.entity;

import io.namoosori.java.travelClub.util.DateUtil;

import java.util.UUID;

public class TravelClub {
    //Fields
    private static final int MINIMUM_NAME_LENGTH = 3;
    private static final int MINIMUM_INTRO_LENGTH = 5;

    private String id;
    private String clubName;
    private String intro;
//    private String message;
    private String foundationDay;

    //Constructors
    private TravelClub(){
        this.id = UUID.randomUUID().toString();
    }

    public TravelClub(String clubName, String intro){
        this();
        setClubName(clubName);
        setIntro(intro);
        this.foundationDay = DateUtil.today();
    }
    //setter
    public void setClubName(String clubName){
        if(clubName.length() < MINIMUM_NAME_LENGTH) {
            System.out.println("Club name should be longer then " + MINIMUM_NAME_LENGTH);
            return;
        }
        this.clubName = clubName;
    }
    //getter
    public String getClubName(){
        return this.clubName;
    }

    public void setIntro(String intro) {
        if (intro.length() < MINIMUM_INTRO_LENGTH) {
            System.out.println("Club intro should be longer then " + MINIMUM_INTRO_LENGTH);
            return;
            // + 연산자 오버로딩 : 피연산자가 무엇인지에 따라서 다르게 기능하는 것
        }
        this.intro = intro;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getId() {
        return this.id;
    }

    public String getFoundationDay() {
        return this.foundationDay;
    }

    public static TravelClub getSample() {
        String clubName = "Sample Club";
        String intro = "Sample Club Intro~";
        TravelClub sampleClub = new TravelClub(clubName, intro);
        return sampleClub;

//        return new TravelClub("Sample Club", "Sample Intro");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TravelClub club ID : ").append(id);
        builder.append(", ClubName : ").append(clubName);
        builder.append(", Intro : ").append(intro);
        builder.append(", FoundationDay : ").append(foundationDay);

        return builder.toString();
    }

    //    public TravelClub(String clubname, String intro, String message){
////        this.id = UUID.randomUUID().toString();
////        this.clubName = clubName;
////        this.intro = intro;
//
//        this(clubname, intro);
//        this.message = message;
//    }
}

