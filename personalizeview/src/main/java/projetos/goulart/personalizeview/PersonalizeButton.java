package projetos.goulart.personalizeview;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.widget.Button;

/**
 * Criado por Igor Goulart de Oliveira em 15/06/2018.
 */
public class PersonalizeButton {

    private final Button button;
    private final Activity activity;

    private PersonalizeButton(Builder builder){
        button = builder.button;
        activity = builder.activity;

        setContent(builder.content);
        setColorContent(builder.colorContent);
    }

    private void setContent(String content) {
        button.setText(content);
    }

    private void setColorContent(int color) {
        button.setTextColor(ContextCompat.getColor(activity, color));
    }


    public static class Builder {

        private final Button button;
        private final Activity activity;
        private String content;
        private int colorContent;

        public Builder(Activity activity, Button button) {
            this.activity = activity;
            this.button = button;
            colorContent = ContextCompat.getColor(activity, R.color.colorTextButton__PersonalizeBTN);
            content = activity.getResources().getString(R.string.contentButton_PersonalizeButton);
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder colorContent(int color) {
            this.colorContent = color;
            return this;
        }

        public PersonalizeButton build(){
            return new PersonalizeButton(this);
        }

    }

}
