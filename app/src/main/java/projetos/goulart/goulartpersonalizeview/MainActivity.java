package projetos.goulart.goulartpersonalizeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

import projetos.goulart.personalizeview.PersonalizeRadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Radio Button
        RadioButton radioButton = findViewById(R.id.radioButtonPRB);
        new PersonalizeRadioButton.Builder(this, radioButton)
                .content("Personalize View")
                .colorContent(R.color.colorPrimaryDark)
                .circleColorUnchecked(R.color.radioButtonUncheckedPV)
                .circleColorChecked(R.color.radioButtonCheckedPV)
                .build();

    }
}
