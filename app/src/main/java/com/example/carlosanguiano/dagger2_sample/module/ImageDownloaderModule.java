package com.example.carlosanguiano.dagger2_sample.module;

import android.content.Context;

import com.example.carlosanguiano.dagger2_sample.model.ImageDownloader;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Carlos Anguiano on 17/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

@Module
public class ImageDownloaderModule {
    private Context context;

    public ImageDownloaderModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    ImageDownloader provideImageDownloader(Context context) {
        return new ImageDownloader(context);
    }
}
