// Generated by view binder compiler. Do not edit!
package com.fitzay.workouttracker.strengthtraining.databinding;

import aglibs.loading.skeleton.layout.SkeletonRelativeLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fitzay.workouttracker.strengthtraining.R;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWorkoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardRecent;

  @NonNull
  public final ConstraintLayout clAds;

  @NonNull
  public final AppCompatButton cta;

  @NonNull
  public final FrameLayout frameBannerContainer;

  @NonNull
  public final TextView fullBodyDesc;

  @NonNull
  public final RelativeLayout fullbodychBtn;

  @NonNull
  public final ImageView img0001;

  @NonNull
  public final ImageView img001;

  @NonNull
  public final RelativeLayout layoutAd;

  @NonNull
  public final LinearLayout layoutShowBannerAds;

  @NonNull
  public final LinearLayout layoutloading;

  @NonNull
  public final LinearLayout linearLayoutAds;

  @NonNull
  public final TextView lowerBodyDesc;

  @NonNull
  public final TemplateView plannerTemplateDown;

  @NonNull
  public final TemplateView plannerTemplateUp;

  @NonNull
  public final CircularProgressIndicator progressBar;

  @NonNull
  public final TextView recentEx;

  @NonNull
  public final TextView recentExCat;

  @NonNull
  public final TextView recentExPercent;

  @NonNull
  public final RecyclerView recyclerview;

  @NonNull
  public final SkeletonRelativeLayout skeletonLayout;

  @NonNull
  public final SkeletonRelativeLayout skeletonLayout1;

  @NonNull
  public final ImageView text0001;

  @NonNull
  public final TextView text001;

  @NonNull
  public final TextView txtAdvance;

  @NonNull
  public final TextView txtBeginner;

  @NonNull
  public final TextView txtIntermediate;

  @NonNull
  public final TextView txtRecent;

  private FragmentWorkoutBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardRecent,
      @NonNull ConstraintLayout clAds, @NonNull AppCompatButton cta,
      @NonNull FrameLayout frameBannerContainer, @NonNull TextView fullBodyDesc,
      @NonNull RelativeLayout fullbodychBtn, @NonNull ImageView img0001, @NonNull ImageView img001,
      @NonNull RelativeLayout layoutAd, @NonNull LinearLayout layoutShowBannerAds,
      @NonNull LinearLayout layoutloading, @NonNull LinearLayout linearLayoutAds,
      @NonNull TextView lowerBodyDesc, @NonNull TemplateView plannerTemplateDown,
      @NonNull TemplateView plannerTemplateUp, @NonNull CircularProgressIndicator progressBar,
      @NonNull TextView recentEx, @NonNull TextView recentExCat, @NonNull TextView recentExPercent,
      @NonNull RecyclerView recyclerview, @NonNull SkeletonRelativeLayout skeletonLayout,
      @NonNull SkeletonRelativeLayout skeletonLayout1, @NonNull ImageView text0001,
      @NonNull TextView text001, @NonNull TextView txtAdvance, @NonNull TextView txtBeginner,
      @NonNull TextView txtIntermediate, @NonNull TextView txtRecent) {
    this.rootView = rootView;
    this.cardRecent = cardRecent;
    this.clAds = clAds;
    this.cta = cta;
    this.frameBannerContainer = frameBannerContainer;
    this.fullBodyDesc = fullBodyDesc;
    this.fullbodychBtn = fullbodychBtn;
    this.img0001 = img0001;
    this.img001 = img001;
    this.layoutAd = layoutAd;
    this.layoutShowBannerAds = layoutShowBannerAds;
    this.layoutloading = layoutloading;
    this.linearLayoutAds = linearLayoutAds;
    this.lowerBodyDesc = lowerBodyDesc;
    this.plannerTemplateDown = plannerTemplateDown;
    this.plannerTemplateUp = plannerTemplateUp;
    this.progressBar = progressBar;
    this.recentEx = recentEx;
    this.recentExCat = recentExCat;
    this.recentExPercent = recentExPercent;
    this.recyclerview = recyclerview;
    this.skeletonLayout = skeletonLayout;
    this.skeletonLayout1 = skeletonLayout1;
    this.text0001 = text0001;
    this.text001 = text001;
    this.txtAdvance = txtAdvance;
    this.txtBeginner = txtBeginner;
    this.txtIntermediate = txtIntermediate;
    this.txtRecent = txtRecent;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWorkoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWorkoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_workout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWorkoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardRecent;
      CardView cardRecent = ViewBindings.findChildViewById(rootView, id);
      if (cardRecent == null) {
        break missingId;
      }

      id = R.id.clAds;
      ConstraintLayout clAds = ViewBindings.findChildViewById(rootView, id);
      if (clAds == null) {
        break missingId;
      }

      id = R.id.cta;
      AppCompatButton cta = ViewBindings.findChildViewById(rootView, id);
      if (cta == null) {
        break missingId;
      }

      id = R.id.frameBannerContainer;
      FrameLayout frameBannerContainer = ViewBindings.findChildViewById(rootView, id);
      if (frameBannerContainer == null) {
        break missingId;
      }

      id = R.id.fullBodyDesc;
      TextView fullBodyDesc = ViewBindings.findChildViewById(rootView, id);
      if (fullBodyDesc == null) {
        break missingId;
      }

      id = R.id.fullbodychBtn;
      RelativeLayout fullbodychBtn = ViewBindings.findChildViewById(rootView, id);
      if (fullbodychBtn == null) {
        break missingId;
      }

      id = R.id.img0001;
      ImageView img0001 = ViewBindings.findChildViewById(rootView, id);
      if (img0001 == null) {
        break missingId;
      }

      id = R.id.img001;
      ImageView img001 = ViewBindings.findChildViewById(rootView, id);
      if (img001 == null) {
        break missingId;
      }

      id = R.id.layoutAd;
      RelativeLayout layoutAd = ViewBindings.findChildViewById(rootView, id);
      if (layoutAd == null) {
        break missingId;
      }

      id = R.id.layoutShowBannerAds;
      LinearLayout layoutShowBannerAds = ViewBindings.findChildViewById(rootView, id);
      if (layoutShowBannerAds == null) {
        break missingId;
      }

      id = R.id.layoutloading;
      LinearLayout layoutloading = ViewBindings.findChildViewById(rootView, id);
      if (layoutloading == null) {
        break missingId;
      }

      id = R.id.linearLayoutAds;
      LinearLayout linearLayoutAds = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutAds == null) {
        break missingId;
      }

      id = R.id.lowerBodyDesc;
      TextView lowerBodyDesc = ViewBindings.findChildViewById(rootView, id);
      if (lowerBodyDesc == null) {
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

      id = R.id.progressBar;
      CircularProgressIndicator progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.recentEx;
      TextView recentEx = ViewBindings.findChildViewById(rootView, id);
      if (recentEx == null) {
        break missingId;
      }

      id = R.id.recentExCat;
      TextView recentExCat = ViewBindings.findChildViewById(rootView, id);
      if (recentExCat == null) {
        break missingId;
      }

      id = R.id.recentExPercent;
      TextView recentExPercent = ViewBindings.findChildViewById(rootView, id);
      if (recentExPercent == null) {
        break missingId;
      }

      id = R.id.recyclerview;
      RecyclerView recyclerview = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview == null) {
        break missingId;
      }

      id = R.id.skeletonLayout;
      SkeletonRelativeLayout skeletonLayout = ViewBindings.findChildViewById(rootView, id);
      if (skeletonLayout == null) {
        break missingId;
      }

      id = R.id.skeletonLayout1;
      SkeletonRelativeLayout skeletonLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (skeletonLayout1 == null) {
        break missingId;
      }

      id = R.id.text0001;
      ImageView text0001 = ViewBindings.findChildViewById(rootView, id);
      if (text0001 == null) {
        break missingId;
      }

      id = R.id.text001;
      TextView text001 = ViewBindings.findChildViewById(rootView, id);
      if (text001 == null) {
        break missingId;
      }

      id = R.id.txtAdvance;
      TextView txtAdvance = ViewBindings.findChildViewById(rootView, id);
      if (txtAdvance == null) {
        break missingId;
      }

      id = R.id.txtBeginner;
      TextView txtBeginner = ViewBindings.findChildViewById(rootView, id);
      if (txtBeginner == null) {
        break missingId;
      }

      id = R.id.txtIntermediate;
      TextView txtIntermediate = ViewBindings.findChildViewById(rootView, id);
      if (txtIntermediate == null) {
        break missingId;
      }

      id = R.id.txtRecent;
      TextView txtRecent = ViewBindings.findChildViewById(rootView, id);
      if (txtRecent == null) {
        break missingId;
      }

      return new FragmentWorkoutBinding((ConstraintLayout) rootView, cardRecent, clAds, cta,
          frameBannerContainer, fullBodyDesc, fullbodychBtn, img0001, img001, layoutAd,
          layoutShowBannerAds, layoutloading, linearLayoutAds, lowerBodyDesc, plannerTemplateDown,
          plannerTemplateUp, progressBar, recentEx, recentExCat, recentExPercent, recyclerview,
          skeletonLayout, skeletonLayout1, text0001, text001, txtAdvance, txtBeginner,
          txtIntermediate, txtRecent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
