package ca.pintsofwine.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String BUTTON_CLICKED_MESSAGE = "This button will launch my %s project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View view) {
        Button buttonClicked = (Button) view;
        String toastMessage = String.format(BUTTON_CLICKED_MESSAGE, buttonClicked.getText());
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }
}
