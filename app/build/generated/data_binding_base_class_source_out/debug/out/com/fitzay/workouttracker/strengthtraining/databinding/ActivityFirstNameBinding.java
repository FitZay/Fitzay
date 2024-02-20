// Generated by view binder compiler. Do not edit!
package com.fitzay.workouttracker.strengthtraining.databinding;

import aglibs.loading.skeleton.layout.SkeletonRelativeLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fitzay.workouttracker.strengthtraining.R;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFirstNameBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnNext;

  @NonNull
  public final ConstraintLayout clAds;

  @NonNull
  public final ConstraintLayout clBottomNext;

  @NonNull
  public final AppCompatButton cta;

  @NonNull
  public final EditText etName;

  @NonNull
  public final ImageView img001;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final RelativeLayout layoutAd;

  @NonNull
  public final TemplateView plannerTemplateDown;

  @NonNull
  public final TemplateView plannerTemplateUp;

  @NonNull
  public final SkeletonRelativeLayout skeletonLayout;

  @NonNull
  public final TextView text001;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final MaterialTextView tvQuestion;

  @NonNull
  public final TextView txtSkip;

  private ActivityFirstNameBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnNext, @NonNull ConstraintLayout clAds,
      @NonNull ConstraintLayout clBottomNext, @NonNull AppCompatButton cta,
      @NonNull EditText etName, @NonNull ImageView img001, @NonNull ImageView ivBack,
      @NonNull RelativeLayout layoutAd, @NonNull TemplateView plannerTemplateDown,
      @NonNull TemplateView plannerTemplateUp, @NonNull SkeletonRelativeLayout skeletonLayout,
      @NonNull TextView text001, @NonNull MaterialToolbar toolbar,
      @NonNull MaterialTextView tvQuestion, @NonNull TextView txtSkip) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.clAds = clAds;
    this.clBottomNext = clBottomNext;
    this.cta = cta;
    this.etName = etName;
    this.img001 = img001;
    this.ivBack = ivBack;
    this.layoutAd = layoutAd;
    this.plannerTemplateDown = plannerTemplateDown;
    this.plannerTemplateUp = plannerTemplateUp;
    this.skeletonLayout = skeletonLayout;
    this.text001 = text001;
    this.toolbar = toolbar;
    this.tvQuestion = tvQuestion;
    this.txtSkip = txtSkip;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFirstNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFirstNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_first_name, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFirstNameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnNext;
      MaterialButton btnNext = ViewBindings.findChildViewById(rootView, id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.clAds;
      ConstraintLayout clAds = ViewBindings.findChildViewById(rootView, id);
      if (clAds == null) {
        break missingId;
      }

      id = R.id.clBottomNext;
      ConstraintLayout clBottomNext = ViewBindings.findChildViewById(rootView, id);
      if (clBottomNext == null) {
        break missingId;
      }

      id = R.id.cta;
      AppCompatButton cta = ViewBindings.findChildViewById(rootView, id);
      if (cta == null) {
        break missingId;
      }

      id = R.id.etName;
      EditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.img001;
      ImageView img001 = ViewBindings.findChildViewById(rootView, id);
      if (img001 == null) {
        break missingId;
      }

      id = R.id.ivBack;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.layoutAd;
      RelativeLayout layoutAd = ViewBindings.findChildViewById(rootView, id);
      if (layoutAd == null) {
        break missingId;
      }

      id = R.id.plannerTemplateDown;
      TemplateView plannerTemplateDown = ViewBindings.findChildViewById(rootView, id);
      if (plannerTemplateDown == null) {
        break missingId;
      }

      id = R.id.plannerTemplateUp;
      TemplateView plannerTemplateUp = ViewBindings.findChildViewById(rootView, id);
      if (plannerTemplateUp == null) {
        break missingId;
      }

      id = R.id.skeletonLayout;
      SkeletonRelativeLayout skeletonLayout = ViewBindings.findChildViewById(rootView, id);
      if (skeletonLayout == null) {
        break missingId;
      }

      id = R.id.text001;
      TextView text001 = ViewBindings.findChildViewById(rootView, id);
      if (text001 == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tvQuestion;
      MaterialTextView tvQuestion = ViewBindings.findChildViewById(rootView, id);
      if (tvQuestion == null) {
        break missingId;
      }

      id = R.id.txtSkip;
      TextView txtSkip = ViewBindings.findChildViewById(rootView, id);
      if (txtSkip == null) {
        break missingId;
      }

      return new ActivityFirstNameBinding((ConstraintLayout) rootView, btnNext, clAds, clBottomNext,
          cta, etName, img001, ivBack, layoutAd, plannerTemplateDown, plannerTemplateUp,
          skeletonLayout, text001, toolbar, tvQuestion, txtSkip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
