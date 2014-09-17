package com.example.doushuqi.photogallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;

import com.example.doushuqi.photogallery.fragment.PhotoPageFragment;

/**
 * Created by administrator on 14-9-17.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PhotoPageFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
    }
}
