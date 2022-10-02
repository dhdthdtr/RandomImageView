package com.example.randomimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int tong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> cardImage = new ArrayList<Integer>();
        // add all card images
        cardImage.add(101);
        cardImage.add(102);
        cardImage.add(103);
        cardImage.add(104);
        cardImage.add(105);
        cardImage.add(106);
        cardImage.add(107);
        cardImage.add(108);
        cardImage.add(109);
        cardImage.add(110);
        cardImage.add(111);
        cardImage.add(112);
        cardImage.add(113);
        cardImage.add(201);
        cardImage.add(202);
        cardImage.add(203);
        cardImage.add(204);
        cardImage.add(205);
        cardImage.add(206);
        cardImage.add(207);
        cardImage.add(208);
        cardImage.add(209);
        cardImage.add(210);
        cardImage.add(211);
        cardImage.add(212);
        cardImage.add(213);
        cardImage.add(301);
        cardImage.add(302);
        cardImage.add(303);
        cardImage.add(304);
        cardImage.add(305);
        cardImage.add(306);
        cardImage.add(307);
        cardImage.add(308);
        cardImage.add(309);
        cardImage.add(310);
        cardImage.add(311);
        cardImage.add(312);
        cardImage.add(313);
        cardImage.add(401);
        cardImage.add(402);
        cardImage.add(403);
        cardImage.add(404);
        cardImage.add(405);
        cardImage.add(406);
        cardImage.add(407);
        cardImage.add(408);
        cardImage.add(409);
        cardImage.add(410);
        cardImage.add(411);
        cardImage.add(412);
        cardImage.add(413);

        Random random = new Random();

        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        TextView textview_ketqua = findViewById(R.id.textview_ketqua);

        Button btn_random = findViewById(R.id.button_chon);
        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(cardImage);

                assignImage(cardImage.get(0), imageView1);
                assignImage(cardImage.get(1), imageView2);
                assignImage(cardImage.get(2), imageView3);

                textview_ketqua.setText("Kết quả: " + (tong % 10));
            }
        });
    }

    public void assignImage(int card, ImageView image){
        switch(card){
            case 101:
                image.setImageResource(R.drawable.c_a);
                tong += 1;
                break;
            case 102:
                image.setImageResource(R.drawable.c2);
                tong += 2;
                break;
            case 103:
                image.setImageResource(R.drawable.c3);
                tong += 3;
                break;
            case 104:
                image.setImageResource(R.drawable.c4);
                tong += 4;
                break;
            case 105:
                image.setImageResource(R.drawable.c5);
                tong += 5;
                break;
            case 106:
                image.setImageResource(R.drawable.c6);
                tong += 6;
                break;
            case 107:
                image.setImageResource(R.drawable.c7);
                tong += 7;
                break;
            case 108:
                image.setImageResource(R.drawable.c8);
                tong += 8;
                break;
            case 109:
                image.setImageResource(R.drawable.c9);
                tong += 9;
                break;
            case 110:
                image.setImageResource(R.drawable.c10);
                tong += 0;
                break;
            case 111:
                image.setImageResource(R.drawable.c_j);
                tong += 0;
                break;
            case 112:
                image.setImageResource(R.drawable.c_q);
                tong += 0;
                break;
            case 113:
                image.setImageResource(R.drawable.c_k);
                tong += 0;
                break;
            case 201:
                image.setImageResource(R.drawable.d_a);
                tong += 1;
                break;
            case 202:
                image.setImageResource(R.drawable.d2);
                tong += 2;
                break;
            case 203:
                image.setImageResource(R.drawable.d3);
                tong += 3;
                break;
            case 204:
                image.setImageResource(R.drawable.d4);
                tong += 4;
                break;
            case 205:
                image.setImageResource(R.drawable.d5);
                tong += 5;
                break;
            case 206:
                image.setImageResource(R.drawable.d6);
                tong += 6;
                break;
            case 207:
                image.setImageResource(R.drawable.d7);
                tong += 7;
                break;
            case 208:
                image.setImageResource(R.drawable.d8);
                tong += 8;
                break;
            case 209:
                image.setImageResource(R.drawable.d9);
                tong += 9;
                break;
            case 210:
                image.setImageResource(R.drawable.d10);
                tong += 0;
                break;
            case 211:
                image.setImageResource(R.drawable.d_j);
                tong += 0;
                break;
            case 212:
                image.setImageResource(R.drawable.d_q);
                tong += 0;
                break;
            case 213:
                image.setImageResource(R.drawable.d_k);
                tong += 0;
                break;
            case 301:
                image.setImageResource(R.drawable.h_a);
                tong += 1;
                break;
            case 302:
                image.setImageResource(R.drawable.h2);
                tong += 2;
                break;
            case 303:
                image.setImageResource(R.drawable.h3);
                tong += 3;
                break;
            case 304:
                image.setImageResource(R.drawable.h4);
                tong += 4;
                break;
            case 305:
                image.setImageResource(R.drawable.h5);
                tong += 5;
                break;
            case 306:
                image.setImageResource(R.drawable.h6);
                tong += 6;
                break;
            case 307:
                image.setImageResource(R.drawable.h7);
                tong += 7;
                break;
            case 308:
                image.setImageResource(R.drawable.h8);
                tong += 8;
                break;
            case 309:
                image.setImageResource(R.drawable.h9);
                tong += 9;
                break;
            case 310:
                image.setImageResource(R.drawable.h10);
                tong += 10;
                break;
            case 311:
                image.setImageResource(R.drawable.h_j);
                tong += 10;
                break;
            case 312:
                image.setImageResource(R.drawable.h_q);
                tong += 10;
                break;
            case 313:
                image.setImageResource(R.drawable.h_k);
                tong += 10;
                break;
            case 401:
                image.setImageResource(R.drawable.s_a);
                tong += 1;
                break;
            case 402:
                image.setImageResource(R.drawable.s2);
                tong += 2;
                break;
            case 403:
                image.setImageResource(R.drawable.s3);
                tong += 3;
                break;
            case 404:
                image.setImageResource(R.drawable.s4);
                tong += 4;
                break;
            case 405:
                image.setImageResource(R.drawable.s5);
                tong += 5;
                break;
            case 406:
                image.setImageResource(R.drawable.s6);
                tong += 6;
                break;
            case 407:
                image.setImageResource(R.drawable.s7);
                tong += 7;
                break;
            case 408:
                image.setImageResource(R.drawable.s8);
                tong += 8;
                break;
            case 409:
                image.setImageResource(R.drawable.s9);
                tong += 9;
                break;
            case 410:
                image.setImageResource(R.drawable.s10);
                tong += 10;
                break;
            case 411:
                image.setImageResource(R.drawable.s_j);
                tong += 10;
                break;
            case 412:
                image.setImageResource(R.drawable.s_q);
                tong += 10;
                break;
            case 413:
                image.setImageResource(R.drawable.s_k);
                tong += 10;
                break;
        }
    }
}