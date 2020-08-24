package org.nickhinds.know_your_vote;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game extends Fragment {

	Button btnSpin;
	TextView tvResult;
	ImageView imgWheel;

	int degree = 0;
	int degree_old = 0;

	Random rand;

	private static final float FACTOR = 11.25f;

	// inflates and displays the this fragment
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.game, container, false);
	}

	// loads the information used in this fragment
	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		btnSpin = view.findViewById(R.id.spinButton);
		tvResult = view.findViewById(R.id.result);
		imgWheel = view.findViewById(R.id.ic_partWheel);

		tvResult.setVisibility(View.GONE);

		rand = new Random();

		// in the onClick event we create and the animation on the Party Wheel
		btnSpin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				degree_old = degree % 360;
				degree = rand.nextInt(3600) + 720;

				RotateAnimation rotate = new RotateAnimation(degree_old, degree, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
				rotate.setDuration(3600);
				rotate.setFillAfter(true);
				rotate.setInterpolator(new DecelerateInterpolator());
				rotate.setAnimationListener(new Animation.AnimationListener() {
					@Override
					public void onAnimationStart(Animation animation) {
						tvResult.setText("");
						tvResult.setVisibility(View.GONE);
					}

					@Override
					public void onAnimationEnd(Animation animation) {
						tvResult.setText("Looks like your voting "+currentNumber(348 - (degree % 360)));
						tvResult.setVisibility(View.VISIBLE);
					}

					@Override
					public void onAnimationRepeat(Animation animation) {

					}
				});
				imgWheel.startAnimation(rotate);
				// Displays the uses with a disclaimer on spin
				Toast.makeText(getContext(), "Disclaimer!!\nThis is a joke\nPlease do not use this to vote", Toast.LENGTH_LONG).show();
			}
		});
	}

	// Base on the random degrees the wheel was spun calculates where it lands and provides the string for the associated party
	private String currentNumber(int degree)
	{
		String text = "";

		// tried to use else if checks for most of this part but in testing found it was less accurate then all the if checks
		if (degree >= (FACTOR*1) && degree < (FACTOR*3))
		{
			text = "Republican";
		}
		if (degree >= (FACTOR*3) && degree < (FACTOR*5))
		{
			text = "Democrat";
		}
		if (degree >= (FACTOR*5) && degree < (FACTOR*7))
		{
			text = "Republican";
		}
		if (degree >= (FACTOR*7) && degree < (FACTOR*9))
		{
			text = "Democrat";
		}
		if (degree >= (FACTOR*9) && degree < (FACTOR*11))
		{
			text = "Republican";
		}
		if (degree >= (FACTOR*11) && degree < (FACTOR*13))
		{
			text = "Libertarian";
		}
		if (degree >= (FACTOR*13) && degree < (FACTOR*15))
		{
			text = "Republican";
		}
		if (degree >= (FACTOR*15) && degree < (FACTOR*17))
		{
			text = "Democrat";
		}
		if (degree >= (FACTOR*17) && degree < (FACTOR*19))
		{
			text = "Green Party";
		}
		if (degree >= (FACTOR*19) && degree < (FACTOR*21))
		{
			text = "Republican";
		}
		if (degree >= (FACTOR*21) && degree < (FACTOR*23))
		{
			text = "Democrat";
		}
		if (degree >= (FACTOR*23) && degree < (FACTOR*25))
		{
			text = "Libertarian";
		}
		if (degree >= (FACTOR*25) && degree < (FACTOR*27))
		{
			text = "Democrat";
		}
		if (degree >= (FACTOR*27) && degree < (FACTOR*29))
		{
			text = "Republican";
		}
		if (degree >= (FACTOR*29) && degree < (FACTOR*31))
		{
			text = "Democrat";
		}
		if ((degree >= (FACTOR*31) && degree < 360) || (degree >= 0 && degree < (FACTOR*1)) || degree <= 10)
		{
			text = "Green Party";
		}

		return text;
	}
}
