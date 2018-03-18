package com.example.carlosanguiano.dagger2_sample.component;

import com.example.carlosanguiano.dagger2_sample.module.ImageDownloaderModule;
import com.example.carlosanguiano.dagger2_sample.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Carlos Anguiano on 17/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

@Singleton
@Component(modules = {ImageDownloaderModule.class})
public interface ImageDownloaderComponent {
    void inject(MainActivity mainActivity);
}
