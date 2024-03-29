package io.namoosori.java.travelClub.ui.console;

import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.service.ClubService;
import io.namoosori.java.travelClub.service.logic.ClubServiceLogic;
import io.namoosori.java.travelClub.util.ConsoleUtil;

public class ClubConsole {
    private ConsoleUtil consoleUtil;

    private ClubService clubService;

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
        //이후 변경될 코드...
        this.clubService = new ClubServiceLogic();
    }

    public void register() {
        //
        while (true) {
            String clubName = consoleUtil.getValueOf("Club name(0.Club Menu)");
            if (clubName.equals("0")) {
                return;
            }

            String intro = consoleUtil.getValueOf("Club Intro(0.Club Menu)");
            if (intro.equals("0")) {
                return;
            }

            TravelClub newClub = new TravelClub(clubName, intro);

            clubService.resister(newClub);

            System.out.println("Registered club : " + newClub.toString());
        }
    }

    public void findAll() {
        //
        TravelClub[] foundClubs = clubService.finAll();
        if (foundClubs.length == 0) {
            System.out.println("Empty!!");
            return;
        }
        for (TravelClub club : foundClubs) {
            System.out.println(club.toString());
        }
    }

    public void findById() {
        TravelClub foundClub = null;

        while(true) {
            String clubId = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if (clubId.equals("0")) {
                break;
            }

            foundClub = clubService.findById(clubId);

            if (foundClub != null) {
                System.out.println(foundClub.toString());
            }else {
                System.out.println("Can not find club, Id : " +clubId);
            }
        }
    }

    public void findByName() {
        TravelClub[] foundClubs = null;
        while(true) {
            String clubName = consoleUtil.getValueOf("Club name to find(0.Club Menu)");
            if (clubName.equals("0")) {
                break;
            }

            foundClubs = clubService.findByName(clubName);
            if (foundClubs != null && foundClubs.length != 0) {
                for (TravelClub club : foundClubs) {
                    System.out.println(club);
                }
            }else {
                System.out.println("Can not find club, name : " +clubName);
            }
        }

    }
    private TravelClub findOne() {
        TravelClub foundClub = null;

        while(true) {
            String clubId = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if (clubId.equals("0")) {
                break;
            }

            foundClub = clubService.findById(clubId);

            if (foundClub != null) {
                break;
            }else {
                System.out.println("Can not find club, Id : " +clubId);
            }
        }
        return foundClub;
    }
    public void modify() {
        TravelClub targetClub = findOne();

        String newName = consoleUtil.getValueOf("New Club Name(0. Club Menu, Enter. No Change.)");
        if (newName.equals("0")) {
            return;
        }
        if (!newName.isEmpty()) {
            targetClub.setClubName(newName);

        }
        String newIntro = consoleUtil.getValueOf("New Club Intro(0. Club Menu, Enter. No Change.)");

        if (! newIntro.isEmpty()) {
            targetClub.setIntro(newIntro);
        }

        clubService.modify(targetClub);
        System.out.println("Modify Club : " + targetClub.toString());
    }
    public void remove() {
        TravelClub targetClub = findOne();
        String confirmStr = consoleUtil.getValueOf("Remove this club?(Y:yes, N:no)");
        if (confirmStr.toLowerCase().equals("y") || confirmStr.toLowerCase().equals("yes")) {
            System.out.println("Removing a club -->" + targetClub.getClubName());
            clubService.remove(targetClub.getId());
        }else {
            System.out.println("Remove cancelled, your club is safe." + targetClub.getClubName());
        }
    }
}
