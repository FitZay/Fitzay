// Generated by view binder compiler. Do not edit!
package com.fitzay.workouttracker.strengthtraining.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fitzay.workouttracker.strengthtraining.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CategoriesLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView cat;

  @NonNull
  public final TextView fullBodyDesc;

  @NonNull
  public final ImageView imgType;

  @NonNull
  public final RelativeLayout layoutImg;

  private CategoriesLayoutBinding(@NonNull RelativeLayout rootView, @NonNull TextView cat,
      @NonNull TextView fullBodyDesc, @NonNull ImageView imgType,
      @NonNull RelativeLayout layoutImg) {
    this.rootView = rootView;
    this.cat = cat;
    this.fullBodyDesc = fullBodyDesc;
    this.imgType = imgType;
    this.layoutImg = layoutImg;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CategoriesLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CategoriesLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.categories_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CategoriesLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cat;
      TextView cat = ViewBindings.findChildViewById(rootView, id);
      if (cat == null) {
        break missingId;
      }

      id = R.id.fullBodyDesc;
      TextView fullBodyDesc = ViewBindings.findChildViewById(rootView, id);
      if (fullBodyDesc == null) {
        break missingId;
      }

      id = R.id.imgType;
      ImageView imgType = ViewBindings.findChildViewById(rootView, id);
      if (imgType == null) {
        break missingId;
      }

      id = R.id.layoutImg;
      RelativeLayout layoutImg = ViewBindings.findChildViewById(rootView, id);
      if (layoutImg == null) {
        break missingId;
      }

      return new CategoriesLayoutBinding((RelativeLayout) rootView, cat, fullBodyDesc, imgType,
          layoutImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
