package tomspaulding.com.frameanimationcontainer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import tomspaulding.com.frameanimationcontainer.Util.FrameAnimationContainer;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get the frame animation Container
        FrameAnimationContainer container = FrameAnimationContainer.getInstance(demoImageView);

        //get the images
        final int[] IMAGE_RESOURCES = {R.drawable.demo_01, R.drawable.demo_02, R.drawable.demo_03, R.drawable.demo_04,
                R.drawable.demo_05, R.drawable.demo_06, R.drawable.demo_07, R.drawable.demo_08, R.drawable.demo_09, R.drawable.demo_10,
                R.drawable.demo_11, R.drawable.demo_12, R.drawable.demo_13, R.drawable.demo_14, R.drawable.demo_15, R.drawable.demo_16,
                R.drawable.demo_17, R.drawable.demo_18, R.drawable.demo_19, R.drawable.demo_20, R.drawable.demo_21, R.drawable.demo_22,
                R.drawable.demo_23, R.drawable.demo_24, R.drawable.demo_25, R.drawable.demo_26, R.drawable.demo_27, R.drawable.demo_28,
                R.drawable.demo_29, R.drawable.demo_30, R.drawable.demo_31, R.drawable.demo_32, R.drawable.demo_33, R.drawable.demo_34,
                R.drawable.demo_35, R.drawable.demo_36, R.drawable.demo_37, R.drawable.demo_38, R.drawable.demo_39, R.drawable.demo_40,
                R.drawable.demo_41, R.drawable.demo_42, R.drawable.demo_43, R.drawable.demo_44, R.drawable.demo_45, R.drawable.demo_46,
                R.drawable.demo_47, R.drawable.demo_48, R.drawable.demo_49, R.drawable.demo_50, R.drawable.demo_51, R.drawable.demo_52,
                R.drawable.demo_53, R.drawable.demo_54, R.drawable.demo_55, R.drawable.demo_56, R.drawable.demo_57, R.drawable.demo_58,
                R.drawable.demo_59, R.drawable.demo_60, R.drawable.demo_61};

        //set the amount of time each image will be visible
        final int ANIMATION_INTERVAL = 15;

        //make the imageview visible
        demoImageView.setVisibility(View.VISIBLE);

        //set the images for the animation container
        container.addAllFrames(IMAGE_RESOURCES, ANIMATION_INTERVAL);

        //when animation restarts, start at frame 14
        container.setRestartAtFrame(14);

        //start the animation
        container.start();
    }
}
