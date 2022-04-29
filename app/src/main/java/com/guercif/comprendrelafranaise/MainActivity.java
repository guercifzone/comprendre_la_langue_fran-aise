package com.guercif.comprendrelafranaise;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import pl.droidsonroids.gif.GifImageButton;

public class MainActivity extends AppCompatActivity {
   private GifImageButton ltr_B,ltr_C,ltr_D,ltr_F,ltr_G,ltr_H,ltr_J,ltr_K,ltr_L,ltr_M,ltr_N,ltr_P,ltr_Q,ltr_R,ltr_S,ltr_T,ltr_V,ltr_W,ltr_X,ltr_Y,ltr_Z;;
    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ltr_B = findViewById(R.id.letters_b);
        ltr_C = findViewById(R.id.letters_c);
        ltr_D = findViewById(R.id.letters_d);
        ltr_F = findViewById(R.id.letters_f);
        ltr_G = findViewById(R.id.letters_g);
        ltr_H = findViewById(R.id.letters_h);
        ltr_J = findViewById(R.id.letters_j);
        ltr_K = findViewById(R.id.letters_k);
        ltr_L = findViewById(R.id.letters_l);
        ltr_M = findViewById(R.id.letters_m);
        ltr_N = findViewById(R.id.letters_n);
        ltr_P = findViewById(R.id.letters_p);
        ltr_Q = findViewById(R.id.letters_q);
        ltr_R = findViewById(R.id.letters_r);
        ltr_S = findViewById(R.id.letters_s);
        ltr_T = findViewById(R.id.letters_t);
        ltr_V = findViewById(R.id.letters_v);
        ltr_W = findViewById(R.id.letters_w);
        ltr_X = findViewById(R.id.letters_x);
        ltr_Y = findViewById(R.id.letters_y);
        ltr_Z = findViewById(R.id.letters_z);


        ltr_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {
                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {


                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {
                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });
        ltr_Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        try {

                            sleep(1000);
                            finish();
                        }catch (Exception t){
                            t.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Alphabetic_List_Activity.class);
                            startActivity(intent);
                        }
                    }
                };thread.start();
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
    @Override
    protected void onResume() {
        super.onResume();

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}