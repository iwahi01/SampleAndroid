package project.android.sample.sampleapp;

import android.app.Application;
import com.deploygate.sdk.DeployGate;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by s-takayanagi on 6/20/15.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        DeployGate.install(this);
    }
}
