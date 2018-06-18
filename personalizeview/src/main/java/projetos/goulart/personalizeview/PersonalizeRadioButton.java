package projetos.goulart.personalizeview;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.RadioButton;

/**
 * Criado por Igor Goulart de Oliveira em 11/06/2018.
 */
public class PersonalizeRadioButton {

    private final AppCompatRadioButton radioButton;
    private final Activity activity;

    private PersonalizeRadioButton(Builder builder){
        radioButton = (AppCompatRadioButton) builder.radioButton;
        activity = builder.activity;

        setContent(builder.content);
        setColorContent(builder.colorContent);
        setCircleColor(builder.circleColorUnchecked, builder.circleColorChecked);
    }

    private void setContent(String content) {
        if(content != null){
            radioButton.setText(content);
        }
    }

    private void setColorContent(int color) {
        if(color != -1){
            radioButton.setTextColor(ContextCompat.getColor(activity, color));
        }
    }

    private void setCircleColor(int unchecked, int checked){
        if(unchecked == -1){
            unchecked = R.color.radioButtonUncheckedPV_PersonalizeRB;
        }

        if(checked == -1){
            checked =  R.color.radioButtonCheckedPV_PersonalizeRB;
        }

        ColorStateList colorStateList = new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_checked},
                        new int[]{android.R.attr.state_checked}
                },
                new int[] {
                        ContextCompat.getColor(activity, unchecked),
                        ContextCompat.getColor(activity, checked)
                }
        );
        radioButton.setButtonTintList(colorStateList);
    }

    public static class Builder {

        private final RadioButton radioButton;
        private final Activity activity;
        private String content;
        private int colorContent, circleColorUnchecked, circleColorChecked;

        public Builder(Activity activity, RadioButton radioButton) {
            this.activity = activity;
            this.radioButton = radioButton;
            colorContent = -1;
            circleColorUnchecked = -1;
            circleColorChecked = -1;
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder colorContent(int color){
            this.colorContent = color;
            return this;
        }

        public Builder circleColorUnchecked(int color){
            this.circleColorUnchecked = color;
            return this;
        }

        public Builder circleColorChecked(int color){
            this.circleColorChecked = color;
            return this;
        }

        public PersonalizeRadioButton build(){
            return new PersonalizeRadioButton(this);
        }

    }

}
