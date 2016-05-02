package com.app.lyon.framework.animation;

/**
 * Created by LiHang on 2016/5/2.
 */

import android.graphics.Bitmap;

public class Frame {
    private Bitmap image;
    private double duration;

    public Frame(Bitmap image, double duration) {
        this.image = image;
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public Bitmap getImage() {
        return image;
    }
}