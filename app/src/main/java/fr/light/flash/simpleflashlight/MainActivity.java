package fr.light.flash.simpleflashlight;

import android.app.AlertDialog;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private boolean mHasFlash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // First check if device is supporting flashlight
        mHasFlash = getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
        if(!mHasFlash){
            // show message device doesn't support flash

            AlertDialog alert = new AlertDialog.Builder(this).create();
            alert.setTitle(getResources().getString(R.string.error));
            alert.setMessage(getResources().getString(R.string.message));
        }

    }
}
