package android.example.com.visualizerpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

  // COMPLETED (1) Create a new Empty Activity named SettingsActivity; make sure to generate the
  // activity_settings.xml layout file as well and add the activity to the manifest

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
  }
}
