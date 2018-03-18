package com.example.carlosanguiano.dagger2_sample.model;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Carlos Anguiano on 17/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class ImageDownloader {
    private Context context;

    public ImageDownloader(Context context) {
        this.context = context;
    }

    public void toImageView(ImageView imageView, String url) {
        Glide.with(context).load(url).into(imageView);
    }
}
