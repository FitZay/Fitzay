// Generated by view binder compiler. Do not edit!
package com.fitzay.workouttracker.strengthtraining.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fitzay.workouttracker.strengthtraining.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPlayAlarmBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MaterialTextView alarmLabel;

  @NonNull
  public final ImageView imgType;

  @NonNull
  public final RelativeLayout layoutDismiss;

  @NonNull
  public final MaterialButton snooze;

  @NonNull
  public final MaterialTextView tvDate;

  @NonNull
  public final MaterialTextView tvSleepEnough;

  @NonNull
  public final MaterialTextView tvTime;

  @NonNull
  public final MaterialTextView txtWakeSleep;

  private ActivityPlayAlarmBinding(@NonNull RelativeLayout rootView,
      @NonNull MaterialTextView alarmLabel, @NonNull ImageView imgType,
      @NonNull RelativeLayout layoutDismiss, @NonNull MaterialButton snooze,
      @NonNull MaterialTextView tvDate, @NonNull MaterialTextView tvSleepEnough,
      @NonNull MaterialTextView tvTime, @NonNull MaterialTextView txtWakeSleep) {
    this.rootView = rootView;
    this.alarmLabel = alarmLabel;
    this.imgType = imgType;
    this.layoutDismiss = layoutDismiss;
    this.snooze = snooze;
    this.tvDate = tvDate;
    this.tvSleepEnough = tvSleepEnough;
    this.tvTime = tvTime;
    this.txtWakeSleep = txtWakeSleep;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPlayAlarmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPlayAlarmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_play_alarm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPlayAlarmBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alarmLabel;
      MaterialTextView alarmLabel = ViewBindings.findChildViewById(rootView, id);
      if (alarmLabel == null) {
        break missingId;
      }

      id = R.id.imgType;
      ImageView imgType = ViewBindings.findChildViewById(rootView, id);
      if (imgType == null) {
        break missingId;
      }

      id = R.id.layoutDismiss;
      RelativeLayout layoutDismiss = ViewBindings.findChildViewById(rootView, id);
      if (layoutDismiss == null) {
        break missingId;
      }

      id = R.id.snooze;
      MaterialButton snooze = ViewBindings.findChildViewById(rootView, id);
      if (snooze == null) {
        break missingId;
      }

      id = R.id.tvDate;
      MaterialTextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvSleepEnough;
      MaterialTextView tvSleepEnough = ViewBindings.findChildViewById(rootView, id);
      if (tvSleepEnough == null) {
        break missingId;
      }

      id = R.id.tvTime;
      MaterialTextView tvTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTime == null) {
        break missingId;
      }

      id = R.id.txtWakeSleep;
      MaterialTextView txtWakeSleep = ViewBindings.findChildViewById(rootView, id);
      if (txtWakeSleep == null) {
        break missingId;
      }

      return new ActivityPlayAlarmBinding((RelativeLayout) rootView, alarmLabel, imgType,
          layoutDismiss, snooze, tvDate, tvSleepEnough, tvTime, txtWakeSleep);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
