package com.lilliemountain.joy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.AutoTransition;
import android.transition.Explode;
import android.transition.Slide;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> names0=new ArrayList<>();
    List<String> names1=new ArrayList<>();
    List<String> names2=new ArrayList<>();
    List<String> names3=new ArrayList<>();
    List<String> names4=new ArrayList<>();
    List<String> names5=new ArrayList<>();
    List<String> names6=new ArrayList<>();
    List<String> names7=new ArrayList<>();
    List<String> names8=new ArrayList<>();
    List<String> names9=new ArrayList<>();
    List<String> names10=new ArrayList<>();
    List<String> names11=new ArrayList<>();
    List<String> names12=new ArrayList<>();
    List<String> names13=new ArrayList<>();
    List<String> names14=new ArrayList<>();
    List<String> names15=new ArrayList<>();
    List<String> names16=new ArrayList<>();
    List<List<String>> mega=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setExitTransition(new Slide());
        setContentView(R.layout.activity_main);
        colorit();
        LevelOneAdapter levelOneAdapter=new LevelOneAdapter(this,   mega);
        RecyclerView recyclerView=findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(levelOneAdapter);
        }
        void colorit()
        {
            names0.add("#009933");
            names0.add("#333333");
            names0.add("#666666");
            names0.add("#999999");
            names0.add("#CCCCCC");
            names1.add("#FFFFFF");
            names1.add("#996666");
            names1.add("#663333");
            names1.add("#CC9999");
            names1.add("#993333");
            names2.add("#CC6666");
            names2.add("#CC3333");
            names2.add("#330000");
            names2.add("#660000");
            names2.add("#990000");
            names3.add("#CC0000");
            names3.add("#FF0000");
            names3.add("#FF3333");
            names3.add("#FF6666");
            names3.add("#FF9999");
            names4.add("#FFCCCC");
            names4.add("#FF3300");
            names4.add("#CC3300");
            names4.add("#FF6633");
            names4.add("#CC6633");
            names5.add("#993300");
            names5.add("#FF9966");
            names5.add("#FF6600");
            names5.add("#996633");
            names5.add("#CC9966");
            names6.add("#663300");
            names6.add("#CC6600");
            names6.add("#FF9933");
            names6.add("#FFCC99");
            names6.add("#FF9900");
            names7.add("#CC9933");
            names7.add("#996600");
            names7.add("#FFCC66");
            names7.add("#CC9900");
            names7.add("#FFCC33");
            names8.add("#FFCC00");
            names8.add("#999966");
            names8.add("#666633");
            names8.add("#CCCC99");
            names8.add("#999933");
            names9.add("#CCCC66");
            names9.add("#CCCC33");
            names9.add("#333300");
            names9.add("#666600");
            names9.add("#999900");

            names10.add("#CCCC00");
            names10.add("#FFFF00");
            names10.add("#FFFF33");
            names10.add("#FFFF66");
            names10.add("#FFFF99");
            names11.add("#FFFFCC");
            names11.add("#CCFF00");
            names11.add("#99CC00");
            names11.add("#CCFF33");
            names11.add("#99CC33");
            names12.add("#669900");
            names12.add("#CCFF66");
            names12.add("#99FF00");
            names12.add("#669933");
            names12.add("#99CC66");
            names13.add("#336600");
            names13.add("#66CC00");
            names13.add("#99FF33");
            names13.add("#CCFF99");
            names13.add("#66FF00");
            names14.add("#66CC33");
            names14.add("#339900");
            names14.add("#99FF66");
            names14.add("#33CC00");
            names14.add("#66FF33");
            names15.add("#33FF00");
            names15.add("#669966");
            names15.add("#336633");
            names15.add("#99CC99");
            names15.add("#339933");
            names16.add("#33CCFF");
            names16.add("#3399CC");
            names16.add("#006699");
            names16.add("#66CCFF");
            names16.add("#0099FF");

            mega.add(names0);
            mega.add(names1);
            mega.add(names2);
            mega.add(names3);
            mega.add(names4);
            mega.add(names5);
            mega.add(names6);
            mega.add(names7);
            mega.add(names8);
            mega.add(names9);
            mega.add(names10);
            mega.add(names11);
            mega.add(names12);
            mega.add(names13);
            mega.add(names14);
            mega.add(names15);
            mega.add(names16);


        }
}

