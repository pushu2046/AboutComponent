package com.learn.library_common.base;

import android.content.Context;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

     Context context();

}
