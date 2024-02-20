// Generated by view binder compiler. Do not edit!
package com.fitzay.workouttracker.strengthtraining.databinding;

import aglibs.loading.skeleton.layout.SkeletonRelativeLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
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
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAskingHeightBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnNext;

  @NonNull
  public final ConstraintLayout clAds;

  @NonNull
  public final ConstraintLayout clBottomLayout;

  @NonNull
  public final ConstraintLayout clBottomNext;

  @NonNull
  public final ConstraintLayout clInput;

  @NonNull
  public final AppCompatButton cta;

  @NonNull
  public final EditText etInputCm;

  @NonNull
  public final EditText etInputFeet;

  @NonNull
  public final EditText etInputInch;

  @NonNull
  public final ImageView img001;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final RelativeLayout layoutAd;

  @NonNull
  public final LinearLayout llCm;

  @NonNull
  public final LinearLayout llFeetInch;

  @NonNull
  public final MaterialToolbar materialToolbar;

  @NonNull
  public final TemplateView plannerTemplateDown;

  @NonNull
  public final TemplateView plannerTemplateUp;

  @NonNull
  public final MaterialRadioButton rbCm;

  @NonNull
  public final MaterialRadioButton rbFeetInch;

  @NonNull
  public final RadioGroup rbOptions;

  @NonNull
  public final ConstraintLayout rootLayout;

  @NonNull
  public final SkeletonRelativeLayout skeletonLayout;

  @NonNull
  public final TextView text001;

  @NonNull
  public final MaterialTextView tvQuestion;

  @NonNull
  public final TextView txtSkip;

  private ActivityAskingHeightBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnNext, @NonNull ConstraintLayout clAds,
      @NonNull ConstraintLayout clBottomLayout, @NonNull ConstraintLayout clBottomNext,
      @NonNull ConstraintLayout clInput, @NonNull AppCompatButton cta, @NonNull EditText etInputCm,
      @NonNull EditText etInputFeet, @NonNull EditText etInputInch, @NonNull ImageView img001,
      @NonNull ImageView ivBack, @NonNull RelativeLayout layoutAd, @NonNull LinearLayout llCm,
      @NonNull LinearLayout llFeetInch, @NonNull MaterialToolbar materialToolbar,
      @NonNull TemplateView plannerTemplateDown, @NonNull TemplateView plannerTemplateUp,
      @NonNull MaterialRadioButton rbCm, @NonNull MaterialRadioButton rbFeetInch,
      @NonNull RadioGroup rbOptions, @NonNull ConstraintLayout rootLayout,
      @NonNull SkeletonRelativeLayout skeletonLayout, @NonNull TextView text001,
      @NonNull MaterialTextView tvQuestion, @NonNull TextView txtSkip) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.clAds = clAds;
    this.clBottomLayout = clBottomLayout;
    this.clBottomNext = clBottomNext;
    this.clInput = clInput;
    this.cta = cta;
    this.etInputCm = etInputCm;
    this.etInputFeet = etInputFeet;
    this.etInputInch = etInputInch;
    this.img001 = img001;
    this.ivBack = ivBack;
    this.layoutAd = layoutAd;
    this.llCm = llCm;
    this.llFeetInch = llFeetInch;
    this.materialToolbar = materialToolbar;
    this.plannerTemplateDown = plannerTemplateDown;
    this.plannerTemplateUp = plannerTemplateUp;
    this.rbCm = rbCm;
    this.rbFeetInch = rbFeetInch;
    this.rbOptions = rbOptions;
    this.rootLayout = rootLayout;
    this.skeletonLayout = skeletonLayout;
    this.text001 = text001;
    this.tvQuestion = tvQuestion;
    this.txtSkip = txtSkip;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAskingHeightBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAskingHeightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_asking_height, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAskingHeightBinding bind(@NonNull View rootView) {
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

      id = R.id.clBottomLayout;
      ConstraintLayout clBottomLayout = ViewBindings.findChildViewById(rootView, id);
      if (clBottomLayout == null) {
        break missingId;
      }

      id = R.id.clBottomNext;
      ConstraintLayout clBottomNext = ViewBindings.findChildViewById(rootView, id);
      if (clBottomNext == null) {
        break missingId;
      }

      id = R.id.clInput;
      ConstraintLayout clInput = ViewBindings.findChildViewById(rootView, id);
      if (clInput == null) {
        break missingId;
      }

      id = R.id.cta;
      AppCompatButton cta = ViewBindings.findChildViewById(rootView, id);
      if (cta == null) {
        break missingId;
      }

      id = R.id.etInputCm;
      EditText etInputCm = ViewBindings.findChildViewById(rootView, id);
      if (etInputCm == null) {
        break missingId;
      }

      id = R.id.etInputFeet;
      EditText etInputFeet = ViewBindings.findChildViewById(rootView, id);
      if (etInputFeet == null) {
        break missingId;
      }

      id = R.id.etInputInch;
      EditText etInputInch = ViewBindings.findChildViewById(rootView, id);
      if (etInputInch == null) {
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

      id = R.id.llCm;
      LinearLayout llCm = ViewBindings.findChildViewById(rootView, id);
      if (llCm == null) {
        break missingId;
      }

      id = R.id.llFeetInch;
      LinearLayout llFeetInch = ViewBindings.findChildViewById(rootView, id);
      if (llFeetInch == null) {
        break missingId;
      }

      id = R.id.materialToolbar;
      MaterialToolbar materialToolbar = ViewBindings.findChildViewById(rootView, id);
      if (materialToolbar == null) {
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

      id = R.id.rbCm;
      MaterialRadioButton rbCm = ViewBindings.findChildViewById(rootView, id);
      if (rbCm == null) {
        break missingId;
      }

      id = R.id.rbFeetInch;
      MaterialRadioButton rbFeetInch = ViewBindings.findChildViewById(rootView, id);
      if (rbFeetInch == null) {
        break missingId;
      }

      id = R.id.rbOptions;
      RadioGroup rbOptions = ViewBindings.findChildViewById(rootView, id);
      if (rbOptions == null) {
        break missingId;
      }

      ConstraintLayout rootLayout = (ConstraintLayout) rootView;

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

      return new ActivityAskingHeightBinding((ConstraintLayout) rootView, btnNext, clAds,
          clBottomLayout, clBottomNext, clInput, cta, etInputCm, etInputFeet, etInputInch, img001,
          ivBack, layoutAd, llCm, llFeetInch, materialToolbar, plannerTemplateDown,
          plannerTemplateUp, rbCm, rbFeetInch, rbOptions, rootLayout, skeletonLayout, text001,
          tvQuestion, txtSkip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
