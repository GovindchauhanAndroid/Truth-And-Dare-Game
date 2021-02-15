package com.yandex.india.truthdare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import java.time.temporal.ValueRange;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView BtlImg;
    private final Random random = new Random();
    private boolean Spinning;
    private int Lastdir;
    int value = 0;
    String valueupdt;
    private static int _counter = 0;
    private String _stringVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtlImg = findViewById(R.id.bottel);
        BtlImg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SpinBtl(v);
                _counter++;
                _stringVal = Integer.toString(_counter);
                if (_counter == 20) {
                    _counter = 0;
                }
            }
        });
    }

    private void SpinBtl(View v) {
        if (!Spinning) {
            int NewDir = random.nextInt(4500);
            float privotX = BtlImg.getWidth() / 2;
            float privotY = BtlImg.getHeight() / 2;
            Animation animation = new RotateAnimation(Lastdir, NewDir, privotX, privotY);
            animation.setDuration(8000);
            animation.setFillAfter(true);
            animation.setAnimationListener(new Animation.AnimationListener() {

                @Override
                public void onAnimationStart(Animation animation) {
                    Spinning = true;
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    Spinning = false;
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
            Lastdir = NewDir;
            BtlImg.startAnimation(animation);

        }
    }

    public void dare(View view) {
        switch (_counter) {
            case 1:
                Toast.makeText(MainActivity.this, "Do a free-style rap for the next minute", Toast.LENGTH_LONG).show();
                break;

            case 2:
                Toast.makeText(MainActivity.this, "Let another person post a status on your behalf.", Toast.LENGTH_LONG).show();
                break;

            case 3:
                Toast.makeText(MainActivity.this, "Show us your best dance moves.", Toast.LENGTH_LONG).show();
                break;

            case 4:
                Toast.makeText(MainActivity.this, "When was the last time you cried?", Toast.LENGTH_LONG).show();
                break;
            case 5:
                Toast.makeText(MainActivity.this, "Do 20 squats.", Toast.LENGTH_LONG).show();
                break;
            case 6:
                Toast.makeText(MainActivity.this, "If you could be invisible, what is the first thing you would do?", Toast.LENGTH_LONG).show();
                break;

            case 7:
                Toast.makeText(MainActivity.this, "What is the most embarrassing music you listen to?", Toast.LENGTH_LONG).show();
                break;

            case 8:
                Toast.makeText(MainActivity.this, "Who is your secret crush?.", Toast.LENGTH_LONG).show();
                break;

            case 9:
                Toast.makeText(MainActivity.this, "Reveal all the details of your first kiss.", Toast.LENGTH_LONG).show();
                break;
            case 10:
                Toast.makeText(MainActivity.this, "How many selfies do you take a day?", Toast.LENGTH_LONG).show();
                break;
            case 11:
                Toast.makeText(MainActivity.this, "Have you ever farted loudly in class?", Toast.LENGTH_LONG).show();
                break;

            case 12:
                Toast.makeText(MainActivity.this, "Do you ever talk to yourself in the mirror?", Toast.LENGTH_LONG).show();
                break;

            case 13:
                Toast.makeText(MainActivity.this, "Do you sleep with a stuffed animal?.", Toast.LENGTH_LONG).show();
                break;

            case 14:
                Toast.makeText(MainActivity.this, "Do you talk in your sleep?", Toast.LENGTH_LONG).show();
                break;
            case 15:
                Toast.makeText(MainActivity.this, "What don't you like about me?", Toast.LENGTH_LONG).show();
                break;
            case 16:
                Toast.makeText(MainActivity.this, "Who is your favorite: Mom or Dad?", Toast.LENGTH_LONG).show();
                break;

            case 17:
                Toast.makeText(MainActivity.this, "Have you ever thought about cheating on your partner?", Toast.LENGTH_LONG).show();
                break;

            case 18:
                Toast.makeText(MainActivity.this, "Do you pee in the shower?", Toast.LENGTH_LONG).show();
                break;

            case 19:
                Toast.makeText(MainActivity.this, "What is your biggest fear?", Toast.LENGTH_LONG).show();
                break;
            case 20:
                Toast.makeText(MainActivity.this, "When was the last time you wet the bed?", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(MainActivity.this, "Give a Dare", Toast.LENGTH_LONG).show();

        }

    }

    public void truth(View view) {
        switch (_counter) {
            case 1:
                Toast.makeText(MainActivity.this, "What was the last thing you searched for on your phone?", Toast.LENGTH_LONG).show();
                break;

            case 2:
                Toast.makeText(MainActivity.this, "Have you ever walked in on your parents doing it?", Toast.LENGTH_LONG).show();
                break;

            case 3:
                Toast.makeText(MainActivity.this, "What's the first thing you would do if you woke up one day as the opposite sex?", Toast.LENGTH_LONG).show();
                break;

            case 4:
                Toast.makeText(MainActivity.this, "Have you ever peed in the pool?", Toast.LENGTH_LONG).show();
                break;
            case 5:
                Toast.makeText(MainActivity.this, "Who do you think is the worst-dressed person in this room?", Toast.LENGTH_LONG).show();
                break;
            case 6:
                Toast.makeText(MainActivity.this, "Have you ever farted in an elevator?", Toast.LENGTH_LONG).show();
                break;

            case 7:
                Toast.makeText(MainActivity.this, "What are some things you think about when sitting on the toilet?", Toast.LENGTH_LONG).show();
                break;

            case 8:
                Toast.makeText(MainActivity.this, "Have you ever practiced kissing in a mirror?", Toast.LENGTH_LONG).show();
                break;

            case 9:
                Toast.makeText(MainActivity.this, "What is your worst habit?", Toast.LENGTH_LONG).show();
                break;
            case 10:
                Toast.makeText(MainActivity.this, "Do you pick your nose?", Toast.LENGTH_LONG).show();
                break;
            case 11:
                Toast.makeText(MainActivity.this, "Do a free-style rap for the next minute", Toast.LENGTH_LONG).show();
                break;

            case 12:
                Toast.makeText(MainActivity.this, "Let another person post a status on your behalf.", Toast.LENGTH_LONG).show();
                break;

            case 13:
                Toast.makeText(MainActivity.this, "Show us your best dance moves.", Toast.LENGTH_LONG).show();
                break;

            case 14:
                Toast.makeText(MainActivity.this, "When was the last time you cried?", Toast.LENGTH_LONG).show();
                break;
            case 15:
                Toast.makeText(MainActivity.this, "Do 20 squats.", Toast.LENGTH_LONG).show();
                break;
            case 16:
                Toast.makeText(MainActivity.this, "If you could be invisible, what is the first thing you would do?", Toast.LENGTH_LONG).show();
                break;

            case 17:
                Toast.makeText(MainActivity.this, "What is the most embarrassing music you listen to?", Toast.LENGTH_LONG).show();
                break;

            case 18:
                Toast.makeText(MainActivity.this, "Who is your secret crush?.", Toast.LENGTH_LONG).show();
                break;

            case 19:
                Toast.makeText(MainActivity.this, "Reveal all the details of your first kiss.", Toast.LENGTH_LONG).show();
                break;
            case 20:
                Toast.makeText(MainActivity.this, "How many selfies do you take a day?", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(MainActivity.this, "Please tell Me a Truth ", Toast.LENGTH_LONG).show();

        }
    }


}


