package io.namoosori.play.util;

import io.namoosori.play.entity.IBehavior;
import io.namoosori.play.model.Guitar;

public class BassGuitar extends Guitar implements IBehavior {
    @Override
    public void play() {
        System.out.println("Playing BassGuitar");
    }
}
