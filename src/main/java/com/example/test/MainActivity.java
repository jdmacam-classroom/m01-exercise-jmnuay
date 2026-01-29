package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.trivia);
    }
    private String trivias[] = {
            "To have a high IQ, you tend to specialize, think deep thoughts. You avoid trivia.",
            "In the absence of clearly-defined goals, we become strangely loyal to performing daily trivia until ultimately we become enslaved by it.",
            "Lead yourself, lead your superiors, lead your peers, and free your people to do the same. All else is trivia.",
            "The first rule of success, and the one that supersedes all others, is to have energy. It is important to know how to concentrate it, how to husband it, how to focus it on important things instead of frittering it away on trivia.",
            "Trivia rarely affect efficiency. Are all the machinations worth it, when their primary effect is to make the code less readable?",
            "From such trivia, I believe my soul was born.",
            "It's a great medium for trivia and hobbies, but not the place for reasoned, reflective judgment. Suprisingly often, discussions degenerate into acrimony, insults and flames.",
            "In a fast paced world, today's popular brand could be tomorrow's trivia question.",
            "In wilderness I sense the miracle of life, and behind it our scientific accomplishments fade to trivia.",
            "Once you have been confronted with a life and death situation, trivia no longer matters. Your perspective grows and you live at a deeper level. There's no time for pettiness."
    };
    public Integer random (){
        int random = (int )(Math.random() * 5);
        return random;
    }
    public void buttonClick(View view){
        TextView textView = (TextView) findViewById(R.id.trivia);
        textView.setText(trivias[random()]);
    }
}