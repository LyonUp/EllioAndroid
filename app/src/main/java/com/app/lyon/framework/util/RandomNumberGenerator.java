package com.app.lyon.framework.util;

/**
 * Created by LiHang on 2016/5/2.
 */
import java.util.Random;

public class RandomNumberGenerator {
    private static Random rand = new Random();

    public static int getRandIntBetween(int lowerBound, int upperBound) {
        return rand.nextInt(upperBound - lowerBound) + lowerBound;
    }

    public static int getRandInt(int upperBound) {
        return rand.nextInt(upperBound);
    }
}
