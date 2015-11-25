package com.example.navid.mrpotato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }


    public void checkboxClickForAll(View view) {

        ImageView arms = (ImageView)findViewById(R.id.arms);
        ImageView ears = (ImageView)findViewById(R.id.ears);
        ImageView eyevbrows = (ImageView)findViewById(R.id.eyebrows);
        ImageView eyes = (ImageView)findViewById(R.id.eyes);
        ImageView glasses = (ImageView)findViewById(R.id.glasses);
        ImageView hat = (ImageView)findViewById(R.id.hat);
        ImageView mouth = (ImageView)findViewById(R.id.mouth);
        ImageView mustache = (ImageView)findViewById(R.id.mustache);
        ImageView nose = (ImageView)findViewById(R.id.nose);
        ImageView shoes = (ImageView)findViewById(R.id.shoes);


        // check which check box is checked
        // very cool way
        boolean myCheckBoxChecked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.armsBox:
                if (myCheckBoxChecked){
                    arms.setVisibility(View.VISIBLE);
                }else{
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.earsBox:
                if (myCheckBoxChecked){
                    ears.setVisibility(View.VISIBLE);
                }else{
                    ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyebrowsBox:
                if (myCheckBoxChecked){
                    eyevbrows.setVisibility(View.VISIBLE);
                }else{
                    eyevbrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyesBox:
                if (myCheckBoxChecked){
                    eyes.setVisibility(View.VISIBLE);
                }else{
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.glassesBox:
                if (myCheckBoxChecked){
                    glasses.setVisibility(View.VISIBLE);
                }else{
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hatBox:
                if (myCheckBoxChecked){
                    hat.setVisibility(View.VISIBLE);
                }else{
                    hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mouthBox:
                if (myCheckBoxChecked){
                    mouth.setVisibility(View.VISIBLE);
                }else{
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.noseBox:
                if (myCheckBoxChecked){
                    nose.setVisibility(View.VISIBLE);
                }else{
                    nose.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoesBox:
                if (myCheckBoxChecked){
                    shoes.setVisibility(View.VISIBLE);
                }else{
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mustacheBox:
                if (myCheckBoxChecked){
                    mustache.setVisibility(View.VISIBLE);
                }else{
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;



        }


    }
}