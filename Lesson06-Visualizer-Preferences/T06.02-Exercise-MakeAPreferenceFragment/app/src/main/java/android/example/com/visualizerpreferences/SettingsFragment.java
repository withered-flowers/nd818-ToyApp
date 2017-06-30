package android.example.com.visualizerpreferences;

import android.example.com.visualizerpreferences.R;
import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by Standard user on 6/29/2017.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
  //COMPLETED (2) Create a class called SettingsFragment that extends PreferenceFragmentCompat
  @Override
  public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
    // COMPLETED (5) In SettingsFragment onCreatePreferences method add the preference file using the
    // addPreferencesFromResource method
    addPreferencesFromResource(R.xml.pref_visualizer);
  }
}
