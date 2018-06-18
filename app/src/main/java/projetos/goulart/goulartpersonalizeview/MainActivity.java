package projetos.goulart.goulartpersonalizeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import projetos.goulart.personalizeview.PersonalizeButton;
import projetos.goulart.personalizeview.PersonalizeRadioButton;
import projetos.goulart.personalizeview.PersonalizeTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Text View
        personalizeTextView();

        // Radio Button
        personaizeRadioButton();

        // Button
        personalizeButton();
    }

    private void personalizeTextView(){
        TextView textView = findViewById(R.id.textViewPTV);

        new PersonalizeTextView.Builder(this, textView)
                .content("Personalizar Text View")
                .color(R.color.colorPrimary)
                .build();
    }

    private void personaizeRadioButton(){
        // Radio Button
        RadioButton radioButton = findViewById(R.id.radioButtonPRB);

        new PersonalizeRadioButton.Builder(this, radioButton)
                .content("Personalize Radio Button")
                .colorContent(R.color.colorPrimary)
                .circleColorUnchecked(R.color.radioButtonUncheckedPV_PersonalizeRB)
                .circleColorChecked(R.color.radioButtonCheckedPV_PersonalizeRB)
                .build();
    }

    private void personalizeButton(){
        // Button
        Button button = findViewById(R.id.buttonPBTN);

        new PersonalizeButton.Builder(this, button)
                .content("Personalizar Button")
                .colorContent(R.color.colorPrimaryDark)
                .build();
    }

}
