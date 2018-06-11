package projetos.goulart.personalizeview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

/**
 * Criado por Igor Goulart de Oliveira em 10/06/2018.
 */
public class PersonalizeTextView {

    private final TextView textView;
    private final Context context;

    private PersonalizeTextView(Builder builder){
        textView = builder.textView;
        context = builder.context;

        setContent(builder.content);
        setColor(builder.color);
        setTextSize(builder.textSize);
    }

    private void setContent(String content) {
        if(content != null){
            textView.setText(content);
        }
    }

    private void setColor(int color) {
        if(color != -1){
            textView.setTextColor(ContextCompat.getColor(context, color));
        }
    }

    private void setTextSize(float size){
        if(size != -1){
            textView.setTextSize(size);
        }
    }

    public static class Builder {

        private final TextView textView;
        private final Context context;
        private String content;
        private int color;
        private float textSize;

        public Builder(Context context, TextView textView) {
            this.context = context;
            this.textView = textView;
            this.color = -1;
            this.textSize = -1;
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder color(int color){
            this.color = color;
            return this;
        }

        public Builder textSize(float size){
            this.textSize = size;
            return this;
        }

        public PersonalizeTextView build(){
            return new PersonalizeTextView(this);
        }

    }

}
