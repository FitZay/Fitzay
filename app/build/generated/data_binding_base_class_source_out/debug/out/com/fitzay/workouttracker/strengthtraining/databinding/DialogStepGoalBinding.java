// Generated by view binder compiler. Do not edit!
package com.fitzay.workouttracker.strengthtraining.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fitzay.workouttracker.strengthtraining.R;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogStepGoalBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnCancel;

  @NonNull
  public final TextView btnSave;

  @NonNull
  public final LinearLayout llButtons;

  @NonNull
  public final EditText tvStepGoal;

  @NonNull
  public final MaterialTextView tvTitle;

  private DialogStepGoalBinding(@NonNull LinearLayout rootView, @NonNull TextView btnCancel,
      @NonNull TextView btnSave, @NonNull LinearLayout llButtons, @NonNull EditText tvStepGoal,
      @NonNull MaterialTextView tvTitle) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnSave = btnSave;
    this.llButtons = llButtons;
    this.tvStepGoal = tvStepGoal;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogStepGoalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogStepGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_step_goal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogStepGoalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancel;
      TextView btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btnSave;
      TextView btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.llButtons;
      LinearLayout llButtons = ViewBindings.findChildViewById(rootView, id);
      if (llButtons == null) {
        break missingId;
      }

      id = R.id.tvStepGoal;
      EditText tvStepGoal = ViewBindings.findChildViewById(rootView, id);
      if (tvStepGoal == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      MaterialTextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new DialogStepGoalBinding((LinearLayout) rootView, btnCancel, btnSave, llButtons,
          tvStepGoal, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
