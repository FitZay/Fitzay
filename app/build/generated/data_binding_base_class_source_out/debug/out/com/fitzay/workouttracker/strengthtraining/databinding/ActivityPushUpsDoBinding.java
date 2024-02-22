// Generated by view binder compiler. Do not edit!
package com.fitzay.workouttracker.strengthtraining.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fitzay.workouttracker.strengthtraining.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPushUpsDoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnNext;

  @NonNull
  public final ConstraintLayout cl1529;

  @NonNull
  public final ConstraintLayout cl30;

  @NonNull
  public final ConstraintLayout cl629Week;

  @NonNull
  public final ConstraintLayout clBottomNext;

  @NonNull
  public final ConstraintLayout clLess5;

  @NonNull
  public final ImageView iv1529Checked;

  @NonNull
  public final ImageView iv30;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ImageView ivLess5Checked;

  @NonNull
  public final MaterialToolbar materialToolbar;

  @NonNull
  public final MaterialTextView tv1529;

  @NonNull
  public final MaterialTextView tv30;

  @NonNull
  public final MaterialTextView tv629;

  @NonNull
  public final ImageView tv629Checked;

  @NonNull
  public final MaterialTextView tvLess5;

  @NonNull
  public final MaterialTextView tvQuestion;

  private ActivityPushUpsDoBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnNext, @NonNull ConstraintLayout cl1529,
      @NonNull ConstraintLayout cl30, @NonNull ConstraintLayout cl629Week,
      @NonNull ConstraintLayout clBottomNext, @NonNull ConstraintLayout clLess5,
      @NonNull ImageView iv1529Checked, @NonNull ImageView iv30, @NonNull ImageView ivBack,
      @NonNull ImageView ivLess5Checked, @NonNull MaterialToolbar materialToolbar,
      @NonNull MaterialTextView tv1529, @NonNull MaterialTextView tv30,
      @NonNull MaterialTextView tv629, @NonNull ImageView tv629Checked,
      @NonNull MaterialTextView tvLess5, @NonNull MaterialTextView tvQuestion) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.cl1529 = cl1529;
    this.cl30 = cl30;
    this.cl629Week = cl629Week;
    this.clBottomNext = clBottomNext;
    this.clLess5 = clLess5;
    this.iv1529Checked = iv1529Checked;
    this.iv30 = iv30;
    this.ivBack = ivBack;
    this.ivLess5Checked = ivLess5Checked;
    this.materialToolbar = materialToolbar;
    this.tv1529 = tv1529;
    this.tv30 = tv30;
    this.tv629 = tv629;
    this.tv629Checked = tv629Checked;
    this.tvLess5 = tvLess5;
    this.tvQuestion = tvQuestion;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPushUpsDoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPushUpsDoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_push_ups_do, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPushUpsDoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnNext;
      MaterialButton btnNext = ViewBindings.findChildViewById(rootView, id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.cl1529;
      ConstraintLayout cl1529 = ViewBindings.findChildViewById(rootView, id);
      if (cl1529 == null) {
        break missingId;
      }

      id = R.id.cl30;
      ConstraintLayout cl30 = ViewBindings.findChildViewById(rootView, id);
      if (cl30 == null) {
        break missingId;
      }

      id = R.id.cl629Week;
      ConstraintLayout cl629Week = ViewBindings.findChildViewById(rootView, id);
      if (cl629Week == null) {
        break missingId;
      }

      id = R.id.clBottomNext;
      ConstraintLayout clBottomNext = ViewBindings.findChildViewById(rootView, id);
      if (clBottomNext == null) {
        break missingId;
      }

      id = R.id.clLess5;
      ConstraintLayout clLess5 = ViewBindings.findChildViewById(rootView, id);
      if (clLess5 == null) {
        break missingId;
      }

      id = R.id.iv1529Checked;
      ImageView iv1529Checked = ViewBindings.findChildViewById(rootView, id);
      if (iv1529Checked == null) {
        break missingId;
      }

      id = R.id.iv30;
      ImageView iv30 = ViewBindings.findChildViewById(rootView, id);
      if (iv30 == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.ivLess5Checked;
      ImageView ivLess5Checked = ViewBindings.findChildViewById(rootView, id);
      if (ivLess5Checked == null) {
        break missingId;
      }

      id = R.id.materialToolbar;
      MaterialToolbar materialToolbar = ViewBindings.findChildViewById(rootView, id);
      if (materialToolbar == null) {
        break missingId;
      }

      id = R.id.tv1529;
      MaterialTextView tv1529 = ViewBindings.findChildViewById(rootView, id);
      if (tv1529 == null) {
        break missingId;
      }

      id = R.id.tv30;
      MaterialTextView tv30 = ViewBindings.findChildViewById(rootView, id);
      if (tv30 == null) {
        break missingId;
      }

      id = R.id.tv629;
      MaterialTextView tv629 = ViewBindings.findChildViewById(rootView, id);
      if (tv629 == null) {
        break missingId;
      }

      id = R.id.tv629Checked;
      ImageView tv629Checked = ViewBindings.findChildViewById(rootView, id);
      if (tv629Checked == null) {
        break missingId;
      }

      id = R.id.tvLess5;
      MaterialTextView tvLess5 = ViewBindings.findChildViewById(rootView, id);
      if (tvLess5 == null) {
        break missingId;
      }

      id = R.id.tvQuestion;
      MaterialTextView tvQuestion = ViewBindings.findChildViewById(rootView, id);
      if (tvQuestion == null) {
        break missingId;
      }

      return new ActivityPushUpsDoBinding((ConstraintLayout) rootView, btnNext, cl1529, cl30,
          cl629Week, clBottomNext, clLess5, iv1529Checked, iv30, ivBack, ivLess5Checked,
          materialToolbar, tv1529, tv30, tv629, tv629Checked, tvLess5, tvQuestion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
