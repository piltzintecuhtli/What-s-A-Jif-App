package com.example.whatsajif;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WhatsAJifActivity extends AppCompatActivity {
    private TextView narrator;
    private ImageView continueOnClick;
    private ImageView gifView;
    private AnimationDrawable ballBounce;
    private ImageView bread;
    private ImageView faceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whats_a_jif);
        narrator = findViewById(R.id.narratorTextView);
        gifView = findViewById(R.id.gifView);
        bread = findViewById(R.id.Bread);
        ballBounce = (AnimationDrawable) gifView.getBackground();
        faceView = findViewById(R.id.Character);

        continueOnClick = findViewById(R.id.imageView2);
        continueOnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeOnclick();
            }
        });
    }

    private void changeOnclick(){
        switch (narrator.getText().toString()){
            case "Hello!":
                narrator.setText("This app is to teach people what a jif is and isn't.");
                break;
            case "This app is to teach people what a jif is and isn't.":
                narrator.setText("Its target audience may or may not be Carlos.");
                faceView.setImageResource(R.drawable.normal_transparent_face);
                break;
            case "Its target audience may or may not be Carlos.":
                narrator.setText("To find out what a jif is, it may be helpful to know what a jif isn't.");
                faceView.setImageResource(R.drawable.happy_transparent_face);
                break;
            case "To find out what a jif is, it may be helpful to know what a jif isn't.":
                narrator.setText("This is not a jif.");
                faceView.setImageResource(R.drawable.teeth_smile_transparent_face);
                gifView.setBackgroundResource(R.drawable.ball_bounce);
                ballBounce = (AnimationDrawable) gifView.getBackground();
                ballBounce.start();
                break;
            case "This is not a jif.":
                narrator.setText("This is a gif.");
                faceView.setImageResource(R.drawable.happy_transparent_face);
                break;
            case "This is a gif.":
                narrator.setText("You pronounce the \"g\" like a HARD g");
                break;
            case "You pronounce the \"g\" like a HARD g":
                narrator.setText("NOT a SOFT g.");
                break;
            case "NOT a SOFT g.":
                narrator.setText("So what's the difference between a soft and hard g?");
                faceView.setImageResource(R.drawable.normal_transparent_face);
                ballBounce.stop();
                gifView.setBackgroundResource(0);
                break;
            case "So what's the difference between a soft and hard g?":
                narrator.setText("A hard g makes a \"guh\" sound.");
                faceView.setImageResource(R.drawable.teeth_smile_transparent_face);
                break;
            case "A hard g makes a \"guh\" sound.":
                narrator.setText("Like green,");
                faceView.setImageResource(R.drawable.happy_transparent_face);
                gifView.setBackgroundResource(R.drawable.ic_launcher_background);
                break;
            case "Like green,":
                narrator.setText("giant,");
                gifView.setBackgroundResource(R.drawable.giant);
                break;
            case "giant,":
                narrator.setText("green giant,");
                gifView.setBackgroundResource(R.drawable.green_giant);
                break;
            case "green giant,":
                narrator.setText("and gnat.");
                gifView.setBackgroundResource(R.drawable.gnat);
                break;
            case "and gnat.":
                narrator.setText("Hahahahahaha no");
                faceView.setImageResource(R.drawable.very_happy_transparent_face);
                break;
            case "Hahahahahaha no":
                narrator.setText("Please don't pronounce \"gnat\" like guh-nat.");
                faceView.setImageResource(R.drawable.normal_transparent_face);
                break;
            case "Please don't pronounce \"gnat\" like guh-nat.":
                narrator.setText("*That* g is silent.");
                break;
            case "*That* g is silent.":
                narrator.setText("If you pronounce gnat like guh-nat I just might become");
                gifView.setBackgroundResource(0);
                break;
            case "If you pronounce gnat like guh-nat I just might become":
                narrator.setText("um");
                break;
            case "um":
                narrator.setText("unhappy");
                faceView.setImageResource(R.drawable.teeth_smile_transparent_face);
                break;
            case "unhappy":
                narrator.setText("yeah that's the word I think");
                break;
            case "yeah that's the word I think":
                narrator.setText("Aaand we don't want that so just don't, yeah?");
                break;
            case "Aaand we don't want that so just don't, yeah?":
                narrator.setText("Anyways, words with a soft g, those g's are pronounced \"juh\"");
                faceView.setImageResource(R.drawable.happy_transparent_face);
                gifView.setBackgroundResource(0);
                break;
            case "Anyways, words with a soft g, those g's are pronounced \"juh\"":
                narrator.setText("like");
                break;
            case "like":
                narrator.setText("gel,");
                gifView.setBackgroundResource(R.drawable.gel);
                break;
            case "gel,":
                narrator.setText("germ,");
                gifView.setBackgroundResource(R.drawable.germ);
                break;
            case "germ,":
                narrator.setText("generate,");
                gifView.setBackgroundResource(R.drawable.generate);
                break;
            case "generate,":
                narrator.setText("and pterodactyl");
                gifView.setBackgroundResource(R.drawable.pterodactyl);
                break;
            case "and pterodactyl":
                narrator.setText("Haha no again");
                faceView.setImageResource(R.drawable.very_happy_transparent_face);
                break;
            case "Haha no again":
                narrator.setText("another silent g in there");
                faceView.setImageResource(R.drawable.happy_transparent_face);
                break;
            case "another silent g in there":
                narrator.setText("waaaaaaaaaaiiiiiiiiiiiit a sec");
                faceView.setImageResource(R.drawable.normal_transparent_face);
                break;
            case "waaaaaaaaaaiiiiiiiiiiiit a sec":
                narrator.setText("that's... not a g. That's a p?");
                faceView.setImageResource(R.drawable.sad_transparent_face);
                break;
            case "that's... not a g. That's a p?":
                narrator.setText("N-Not that it matters, of course....");
                faceView.setImageResource(R.drawable.worry_smiling_transparent_face);
                gifView.setBackgroundResource(0);
                break;
            case "N-Not that it matters, of course....":
                narrator.setText("Same rule still applies! Don't pronounce the silent p or else!");
                break;
            case "Same rule still applies! Don't pronounce the silent p or else!":
                narrator.setTextSize(20);
                narrator.setText("Eh he");
                faceView.setScaleX((float) 1.25);
                faceView.setScaleY((float) 1.25);
                break;
            case "Eh he":
                narrator.setTextSize(28);
                narrator.setText("Sooooo");
                faceView.setImageResource(R.drawable.teeth_smile_transparent_face);
                faceView.setScaleX((float) 1.75);
                faceView.setScaleY((float) 1.75);
                break;
            case "Sooooo":
                narrator.setText("just what *is* a jif?");
                faceView.setImageResource(R.drawable.happy_transparent_face);
                break;
            case "just what *is* a jif?":
                narrator.setText("Not a gif!");
                faceView.setImageResource(R.drawable.very_happy_transparent_face);
                break;
            case "Not a gif!":
                narrator.setText("CARLOS");
                faceView.setImageResource(R.drawable.angry_transparent_face);
                break;
            case "CARLOS":
                narrator.setText(" ");
                break;
            case " ":
                narrator.setText("Anyways, here's one creamy jif:");
                gifView.setBackgroundResource(R.drawable.jif);
                faceView.setImageResource(R.drawable.happy_transparent_face);
                break;
            case "Anyways, here's one creamy jif:":
                narrator.setText("And here's one squeezy boi");
                gifView.setBackgroundResource(R.drawable.squeeze_jif);
                break;
            case "And here's one squeezy boi":
                narrator.setText("We love Jif!");
                gifView.setBackgroundResource(R.drawable.more_jif);
                break;
            case "We love Jif!":
                narrator.setText("Yum, healthy Jif!");
                gifView.setBackgroundResource(R.drawable.healthy_jif);
                break;
            case "Yum, healthy Jif!":
                narrator.setText("More healthy Jif?!");
                gifView.setBackgroundResource(R.drawable.super_healthy_jif);
                break;
            case "More healthy Jif?!":
                narrator.setText("very_healthy_jif.png");
                gifView.setBackgroundResource(R.drawable.very_healthy_jif);
                break;
            case "very_healthy_jif.png":
                narrator.setText("Squeezy healthy Jif?! No waaaay");
                gifView.setBackgroundResource(R.drawable.healthy_squeeze_jif);
                faceView.setImageResource(R.drawable.kissy_transparent_face);
                break;
            case "Squeezy healthy Jif?! No waaaay":
                narrator.setText("There's even ~natural~ Jif");
                gifView.setBackgroundResource(R.drawable.natural_jif);
                break;
            case "There's even ~natural~ Jif":
                narrator.setText("And the original Jif! Yumtious!");
                gifView.setBackgroundResource(R.drawable.original_jif);
                faceView.setImageResource(R.drawable.very_happy_transparent_face);
                break;
            case "And the original Jif! Yumtious!":
                narrator.setText("And last, and certainly least, the Carlos Jif!");
                gifView.setBackgroundResource(R.drawable.ball_bounce);
                ballBounce = (AnimationDrawable) gifView.getBackground();
                ballBounce.start();
                break;
            case "And last, and certainly least, the Carlos Jif!":
                narrator.setText("(That wasn't funny, was it? None of my jokes are, are they?)");
                ballBounce.stop();
                gifView.setBackgroundResource(0);
                faceView.setImageResource(R.drawable.sad_transparent_face);
                break;
            case "(That wasn't funny, was it? None of my jokes are, are they?)":
                narrator.setText("So to help differentiate between Jifs and not Jifs,");
                faceView.setImageResource(R.drawable.happy_transparent_face);
                break;
            case "So to help differentiate between Jifs and not Jifs,":
                narrator.setText("here is a helpful method that has saved many lives:");
                break;
            case "here is a helpful method that has saved many lives:":
                narrator.setText("(That has not been verified by anyone ever sooo...)");
                faceView.setImageResource(R.drawable.kissy_transparent_face);
                break;
            case "(That has not been verified by anyone ever sooo...)":
                narrator.setText("To know what's a Jif and what isn't, first place a slice of bread down somewhere.");
                narrator.setTextSize(26);
                bread.setBackgroundResource(R.drawable.bread_slice);
                faceView.setImageResource(R.drawable.happy_transparent_face);
                break;
            case "To know what's a Jif and what isn't, first place a slice of bread down somewhere.":
                narrator.setText("Then");
                narrator.setTextSize(28);
                break;
            case "Then":
                narrator.setText("Place what you want to test on the piece of bread.");
                gifView.setBackgroundResource(R.drawable.pterodactyl);
                break;
            case "Place what you want to test on the piece of bread.":
                narrator.setText("If it looks something like this,");
                gifView.setBackgroundResource(R.drawable.jif);
                break;
            case "If it looks something like this,":
                narrator.setText("Then it is a Jif.");
                break;
            case "Then it is a Jif.":
                narrator.setText("But if it doesn't, like this,");
                gifView.setBackgroundResource(R.drawable.gel);
                break;
            case "But if it doesn't, like this,":
                narrator.setText("Or this,");
                gifView.setBackgroundResource(R.drawable.ball_bounce);
                ballBounce = (AnimationDrawable) gifView.getBackground();
                ballBounce.start();
                break;
            case "Or this,":
                narrator.setText("Theeeen it's most likely not a Jif.");
                faceView.setImageResource(R.drawable.teeth_smile_transparent_face);
                break;
            case "Theeeen it's most likely not a Jif.":
                narrator.setTextSize(24);
                narrator.setText("Welp, that's all I got so click the screen to go back to the main title page thing! Or not!");
                ballBounce.stop();
                gifView.setBackgroundResource(0);
                bread.setBackgroundResource(0);
                faceView.setImageResource(R.drawable.very_happy_transparent_face);
                break;
            case "Welp, that's all I got so click the screen to go back to the main title page thing! Or not!":
                Intent backToStart = new Intent(this, MainActivity.class);
                startActivity(backToStart);
                break;

        }
    }

}
