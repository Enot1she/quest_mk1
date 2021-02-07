package com.example.quest_mk1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.quest_mk1.product_buy.product_question1;

public class QuestMenu extends AppCompatActivity {

    ImageButton productBuy;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_menu);
        productBuy = (ImageButton) findViewById(R.id.product);

        productBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQuestions = new Intent(QuestMenu.this, product_question1.class);
                startActivity(intentQuestions);
            }
        });
    }
}