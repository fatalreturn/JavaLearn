package io.namoosori.java.travelClub;

import io.namoosori.java.travelClub.entity.TravelClub;

public class StoryAssistant {
    public static void main(String[] args) {
//        int random = (int)(Math.random()* 11 + 10);
//        System.out.println(random);
//        double rr = (Math.random() * 10 + 0);
//        System.out.println(rr);

//        long currentTime = System.currentTimeMillis();
//        System.out.println(currentTime); //1970년 1월 1일 00시 00분 00초부터 밀리세컨드 단위로 더해지면서 현재 시간의 값
//        System.out.println(DateUtil.today());

        TravelClub newClub = new TravelClub("Jeju Club", "Jeju TravelClub~~");
        System.out.println(newClub.toString());

        System.out.println(TravelClub.getSample().toString());

    }
}
