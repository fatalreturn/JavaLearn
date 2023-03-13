package io.namoosori.play.util;

import io.namoosori.play.entity.IBehavior;
import io.namoosori.play.model.Sport;

public class Soccer extends Sport implements IBehavior {
    @Override
    public void play() {
        System.out.println("Playing Soccer");
    }
}
