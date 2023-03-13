package io.namoosori.play.entity;

import io.namoosori.play.model.Guitar;
import io.namoosori.play.model.Sport;
import io.namoosori.play.util.BassGuitar;
import io.namoosori.play.util.Soccer;

public class InterfaceAssist {
    public static void main(String[] args) {
        play(new Soccer());
        play(new BassGuitar());

        System.out.println("=================");
        Guitar guitar = new BassGuitar();
        Sport sport = new Soccer();
        guitar.play();
        sport.play();
    }
    public static void play(IBehavior ib) {
        ib.play();
    }


}
