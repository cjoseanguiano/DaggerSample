package com.example.carlosanguiano.dagger2_sample;

import android.app.Application;

import com.example.carlosanguiano.dagger2_sample.component.DaggerImageDownloaderComponent;
import com.example.carlosanguiano.dagger2_sample.component.ImageDownloaderComponent;
import com.example.carlosanguiano.dagger2_sample.module.ImageDownloaderModule;

/**
 * Created by Carlos Anguiano on 17/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class App extends Application {
    private static App app;
    private ImageDownloaderComponent imageDownloaderComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        imageDownloaderComponent = DaggerImageDownloaderComponent.builder().imageDownloaderModule(new ImageDownloaderModule(this)).build();
    }

    public static App app() {
        return app;
    }

    public ImageDownloaderComponent getImageDownloaderComponent() {
        return this.imageDownloaderComponent;
    }
}
