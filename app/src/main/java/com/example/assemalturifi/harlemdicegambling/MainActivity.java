package com.example.assemalturifi.harlemdicegambling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollBtn;
    ImageView dice1;
    ImageView dice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        upView();

        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee", "Button has been pressed");

                Random random=new Random();

                int number=random.nextInt(6);

                int[]array={R.drawable.dice1,
                        R.drawable.dice2,
                        R.drawable.dice3,
                        R.drawable.dice4,
                        R.drawable.dice5,
                        R.drawable.dice6};

                dice1.setImageResource(array[number]);

                number = random.nextInt(6);

                dice2.setImageResource(array[number]);


            }
        });



    }
    public void upView(){
        rollBtn=findViewById(R.id.btn);
        dice1 = findViewById(R.id.image2);
        dice2 = findViewById(R.id.image3);


    }


}
