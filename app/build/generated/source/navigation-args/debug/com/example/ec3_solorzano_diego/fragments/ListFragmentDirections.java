package com.example.ec3_solorzano_diego.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.ec3_solorzano_diego.R;
import com.example.ec3_solorzano_diego.model.Cerveceria;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListFragmentDirections {
  private ListFragmentDirections() {
  }

  @NonNull
  public static ActionListFragmentToDetailFragment actionListFragmentToDetailFragment(
      @NonNull Cerveceria cerveceria) {
    return new ActionListFragmentToDetailFragment(cerveceria);
  }

  public static class ActionListFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionListFragmentToDetailFragment(@NonNull Cerveceria cerveceria) {
      if (cerveceria == null) {
        throw new IllegalArgumentException("Argument \"cerveceria\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("cerveceria", cerveceria);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionListFragmentToDetailFragment setCerveceria(@NonNull Cerveceria cerveceria) {
      if (cerveceria == null) {
        throw new IllegalArgumentException("Argument \"cerveceria\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("cerveceria", cerveceria);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("cerveceria")) {
        Cerveceria cerveceria = (Cerveceria) arguments.get("cerveceria");
        if (Parcelable.class.isAssignableFrom(Cerveceria.class) || cerveceria == null) {
          __result.putParcelable("cerveceria", Parcelable.class.cast(cerveceria));
        } else if (Serializable.class.isAssignableFrom(Cerveceria.class)) {
          __result.putSerializable("cerveceria", Serializable.class.cast(cerveceria));
        } else {
          throw new UnsupportedOperationException(Cerveceria.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_listFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Cerveceria getCerveceria() {
      return (Cerveceria) arguments.get("cerveceria");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListFragmentToDetailFragment that = (ActionListFragmentToDetailFragment) object;
      if (arguments.containsKey("cerveceria") != that.arguments.containsKey("cerveceria")) {
        return false;
      }
      if (getCerveceria() != null ? !getCerveceria().equals(that.getCerveceria()) : that.getCerveceria() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getCerveceria() != null ? getCerveceria().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "cerveceria=" + getCerveceria()
          + "}";
    }
  }
}
