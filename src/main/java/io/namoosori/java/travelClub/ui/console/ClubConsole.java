package io.namoosori.java.travelClub.ui.console;

import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.util.ConsoleUtil;

public class ClubConsole {
    private ConsoleUtil consoleUtil;

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
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
            // 베열에 저장.
            System.out.println("Registered club : " + newClub.toString());
        }
    }

    public void findAll() {
        //
        System.out.println("Find All");
    }

    public void findById() {
        TravelClub foundClub = null;

        while(true) {
            String clubId = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if (clubId.equals("0")) {
                break;
            }

            //foundClub = clubService.find(clubId);

            if (foundClub != null) {
                System.out.println(foundClub.toString());
            }else {
                System.out.println("Can not find club, Id : " +clubId);
            }
        }
    }

    public void findByName() {

    }
}
