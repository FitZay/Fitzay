// Generated by view binder compiler. Do not edit!
package com.fitzay.workouttracker.strengthtraining.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fitzay.workouttracker.strengthtraining.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFullbodyWorkoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final ImageView backpressBtn;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final ConstraintLayout constraintLayout11;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final MaterialCardView materialCardView10;

  @NonNull
  public final MaterialCardView materialCardView11;

  @NonNull
  public final MaterialCardView materialCardView12;

  @NonNull
  public final MaterialCardView materialCardView13;

  @NonNull
  public final MaterialCardView materialCardView14;

  @NonNull
  public final MaterialCardView materialCardView4;

  @NonNull
  public final MaterialCardView materialCardView8;

  @NonNull
  public final MaterialCardView materialCardView9;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final ImageView toolBarImage;

  private ActivityFullbodyWorkoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull ImageView backpressBtn,
      @NonNull CollapsingToolbarLayout collapsingToolbar,
      @NonNull ConstraintLayout constraintLayout11, @NonNull FrameLayout frameLayout,
      @NonNull MaterialCardView materialCardView10, @NonNull MaterialCardView materialCardView11,
      @NonNull MaterialCardView materialCardView12, @NonNull MaterialCardView materialCardView13,
      @NonNull MaterialCardView materialCardView14, @NonNull MaterialCardView materialCardView4,
      @NonNull MaterialCardView materialCardView8, @NonNull MaterialCardView materialCardView9,
      @NonNull TextView textView20, @NonNull TextView textView22, @NonNull TextView textView6,
      @NonNull ImageView toolBarImage) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.backpressBtn = backpressBtn;
    this.collapsingToolbar = collapsingToolbar;
    this.constraintLayout11 = constraintLayout11;
    this.frameLayout = frameLayout;
    this.materialCardView10 = materialCardView10;
    this.materialCardView11 = materialCardView11;
    this.materialCardView12 = materialCardView12;
    this.materialCardView13 = materialCardView13;
    this.materialCardView14 = materialCardView14;
    this.materialCardView4 = materialCardView4;
    this.materialCardView8 = materialCardView8;
    this.materialCardView9 = materialCardView9;
    this.textView20 = textView20;
    this.textView22 = textView22;
    this.textView6 = textView6;
    this.toolBarImage = toolBarImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFullbodyWorkoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFullbodyWorkoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_fullbody_workout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFullbodyWorkoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.backpressBtn;
      ImageView backpressBtn = ViewBindings.findChildViewById(rootView, id);
      if (backpressBtn == null) {
        break missingId;
      }

      id = R.id.collapsingToolbar;
      CollapsingToolbarLayout collapsingToolbar = ViewBindings.findChildViewById(rootView, id);
      if (collapsingToolbar == null) {
        break missingId;
      }

      id = R.id.constraintLayout11;
      ConstraintLayout constraintLayout11 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout11 == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.materialCardView10;
      MaterialCardView materialCardView10 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView10 == null) {
        break missingId;
      }

      id = R.id.materialCardView11;
      MaterialCardView materialCardView11 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView11 == null) {
        break missingId;
      }

      id = R.id.materialCardView12;
      MaterialCardView materialCardView12 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView12 == null) {
        break missingId;
      }

      id = R.id.materialCardView13;
      MaterialCardView materialCardView13 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView13 == null) {
        break missingId;
      }

      id = R.id.materialCardView14;
      MaterialCardView materialCardView14 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView14 == null) {
        break missingId;
      }

      id = R.id.materialCardView4;
      MaterialCardView materialCardView4 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView4 == null) {
        break missingId;
      }

      id = R.id.materialCardView8;
      MaterialCardView materialCardView8 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView8 == null) {
        break missingId;
      }

      id = R.id.materialCardView9;
      MaterialCardView materialCardView9 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView9 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.toolBarImage;
      ImageView toolBarImage = ViewBindings.findChildViewById(rootView, id);
      if (toolBarImage == null) {
        break missingId;
      }

      return new ActivityFullbodyWorkoutBinding((ConstraintLayout) rootView, appBarLayout,
          backpressBtn, collapsingToolbar, constraintLayout11, frameLayout, materialCardView10,
          materialCardView11, materialCardView12, materialCardView13, materialCardView14,
          materialCardView4, materialCardView8, materialCardView9, textView20, textView22,
          textView6, toolBarImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
