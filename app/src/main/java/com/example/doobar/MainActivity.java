package com.example.doobar;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;

import com.example.doobar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    final private static int ANIMATION_DURATION = 2000; // 2-second animation duration

    private ActivityMainBinding binding;
    private ObjectAnimator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // setup animation buttons

        // Linear
        binding.linear.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.linear, "translationX", 200f);
            animator.setInterpolator(new LinearInterpolator());
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });

        // Accelerate
        binding.accelerate.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.accelerate, "translationX", 200f);
            animator.setInterpolator(new AccelerateInterpolator());
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });

        // Decelerate
        binding.decelerate.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.decelerate, "translationX", 200f);
            animator.setInterpolator(new DecelerateInterpolator());
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });

        // Bounce
        binding.bounce.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.bounce, "translationX", 200f);
            animator.setInterpolator(new BounceInterpolator());
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });

        // Overshoot
        binding.overshoot.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.overshoot, "translationX", 200f);
            animator.setInterpolator(new OvershootInterpolator());
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });

        // Anticipate
        binding.anticipate.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.anticipate, "translationX", 200f);
            animator.setInterpolator(new AnticipateInterpolator());
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });

        // Cycle
        binding.cycle.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.cycle, "translationX", 200f);
            animator.setInterpolator(new CycleInterpolator(2));
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });

        // Accelerate Decelerate
        binding.accelerateDecelerate.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.accelerateDecelerate, "translationX", 200f);
            animator.setInterpolator(new AccelerateDecelerateInterpolator());
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });

        // Anticipate Overshoot
        binding.anticipateOvershoot.setOnClickListener(clickedView -> {
            animator = ObjectAnimator.ofFloat(binding.anticipateOvershoot, "translationX", 200f);
            animator.setInterpolator(new AnticipateOvershootInterpolator());
            animator.setDuration(ANIMATION_DURATION);
            animator.start();
        });
    }
}