package com.example.ec3_solorzano_diego.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.ec3_solorzano_diego.model.Cerveceria;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("cerveceria")) {
      Cerveceria cerveceria;
      if (Parcelable.class.isAssignableFrom(Cerveceria.class) || Serializable.class.isAssignableFrom(Cerveceria.class)) {
        cerveceria = (Cerveceria) bundle.get("cerveceria");
      } else {
        throw new UnsupportedOperationException(Cerveceria.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (cerveceria == null) {
        throw new IllegalArgumentException("Argument \"cerveceria\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("cerveceria", cerveceria);
    } else {
      throw new IllegalArgumentException("Required argument \"cerveceria\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    if (savedStateHandle.contains("cerveceria")) {
      Cerveceria cerveceria;
      cerveceria = savedStateHandle.get("cerveceria");
      if (cerveceria == null) {
        throw new IllegalArgumentException("Argument \"cerveceria\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("cerveceria", cerveceria);
    } else {
      throw new IllegalArgumentException("Required argument \"cerveceria\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Cerveceria getCerveceria() {
    return (Cerveceria) arguments.get("cerveceria");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("cerveceria")) {
      Cerveceria cerveceria = (Cerveceria) arguments.get("cerveceria");
      if (Parcelable.class.isAssignableFrom(Cerveceria.class) || cerveceria == null) {
        __result.set("cerveceria", Parcelable.class.cast(cerveceria));
      } else if (Serializable.class.isAssignableFrom(Cerveceria.class)) {
        __result.set("cerveceria", Serializable.class.cast(cerveceria));
      } else {
        throw new UnsupportedOperationException(Cerveceria.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("cerveceria") != that.arguments.containsKey("cerveceria")) {
      return false;
    }
    if (getCerveceria() != null ? !getCerveceria().equals(that.getCerveceria()) : that.getCerveceria() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCerveceria() != null ? getCerveceria().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "cerveceria=" + getCerveceria()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Cerveceria cerveceria) {
      if (cerveceria == null) {
        throw new IllegalArgumentException("Argument \"cerveceria\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("cerveceria", cerveceria);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCerveceria(@NonNull Cerveceria cerveceria) {
      if (cerveceria == null) {
        throw new IllegalArgumentException("Argument \"cerveceria\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("cerveceria", cerveceria);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Cerveceria getCerveceria() {
      return (Cerveceria) arguments.get("cerveceria");
    }
  }
}
