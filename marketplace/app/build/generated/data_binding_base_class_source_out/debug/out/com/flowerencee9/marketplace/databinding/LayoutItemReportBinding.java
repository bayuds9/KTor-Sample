// Generated by view binder compiler. Do not edit!
package com.flowerencee9.marketplace.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.flowerencee9.marketplace.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutItemReportBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tv1;

  @NonNull
  public final TextView tv2;

  @NonNull
  public final TextView tv3;

  @NonNull
  public final TextView tv4;

  @NonNull
  public final TextView tv5;

  @NonNull
  public final TextView tv6;

  private LayoutItemReportBinding(@NonNull LinearLayout rootView, @NonNull TextView tv1,
      @NonNull TextView tv2, @NonNull TextView tv3, @NonNull TextView tv4, @NonNull TextView tv5,
      @NonNull TextView tv6) {
    this.rootView = rootView;
    this.tv1 = tv1;
    this.tv2 = tv2;
    this.tv3 = tv3;
    this.tv4 = tv4;
    this.tv5 = tv5;
    this.tv6 = tv6;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutItemReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutItemReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_item_report, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutItemReportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv1;
      TextView tv1 = ViewBindings.findChildViewById(rootView, id);
      if (tv1 == null) {
        break missingId;
      }

      id = R.id.tv2;
      TextView tv2 = ViewBindings.findChildViewById(rootView, id);
      if (tv2 == null) {
        break missingId;
      }

      id = R.id.tv3;
      TextView tv3 = ViewBindings.findChildViewById(rootView, id);
      if (tv3 == null) {
        break missingId;
      }

      id = R.id.tv4;
      TextView tv4 = ViewBindings.findChildViewById(rootView, id);
      if (tv4 == null) {
        break missingId;
      }

      id = R.id.tv5;
      TextView tv5 = ViewBindings.findChildViewById(rootView, id);
      if (tv5 == null) {
        break missingId;
      }

      id = R.id.tv6;
      TextView tv6 = ViewBindings.findChildViewById(rootView, id);
      if (tv6 == null) {
        break missingId;
      }

      return new LayoutItemReportBinding((LinearLayout) rootView, tv1, tv2, tv3, tv4, tv5, tv6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}