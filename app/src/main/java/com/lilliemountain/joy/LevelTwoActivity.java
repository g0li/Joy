package com.lilliemountain.joy;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Explode;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class LevelTwoActivity extends AppCompatActivity {
    ImageView oneIV,twoIV,threeIV,fourIV,fiveIV;
    TextView oneTV,twoTV,threeTV,fourTV,fiveTV;
    String a,b,c,d,e;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setEnterTransition(new Slide());
        setContentView(R.layout.activity_level_two);
        a=getIntent().getStringExtra("one");
        b=getIntent().getStringExtra("two");
        c=getIntent().getStringExtra("three");
        d=getIntent().getStringExtra("four");
        e=getIntent().getStringExtra("five");
        int number=getIntent().getIntExtra("number",5);
        
        fab=findViewById(R.id.floatingActionButton);
        oneIV=findViewById(R.id.oneIV);
        twoIV=findViewById(R.id.twoIV);
        threeIV=findViewById(R.id.threeIV);
        fourIV=findViewById(R.id.fourIV);
        fiveIV=findViewById(R.id.fiveIV);
        oneTV=findViewById(R.id.oneTV);
        twoTV=findViewById(R.id.twoTV);
        threeTV=findViewById(R.id.threeTV);
        fourTV=findViewById(R.id.fourTV);
        fiveTV=findViewById(R.id.fiveTV);
        
        switcher(number);
        switcher(oneIV,1);
        switcher(twoIV,2);
        switcher(threeIV,3);
        switcher(fourIV,4);
        switcher(fiveIV,5);
        switcher(oneTV,1);
        switcher(twoTV,2);
        switcher(threeTV,3);
        switcher(fourTV,4);
        switcher(fiveTV,5);
    }
    void switcher(View v, final int number){
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switcher(number);
            }
        });
    }
    void switcher(int number) {
        switch (number)
        {
            case 1:
                fiveTV.setText(a);
                oneTV.setText(b);
                twoTV.setText(c);
                threeTV.setText(d);
                fourTV.setText(e);

                fiveIV.setColorFilter(Color.parseColor(a));
                oneIV.setColorFilter(Color.parseColor(b));
                twoIV.setColorFilter(Color.parseColor(c));
                threeIV.setColorFilter(Color.parseColor(d));
                fourIV.setColorFilter(Color.parseColor(e));
                break;
            case 2:
                oneTV.setText(a);
                fiveTV.setText(b);
                threeTV.setText(c);
                fourTV.setText(d);
                twoTV.setText(e);

                oneIV.setColorFilter(Color.parseColor(a));
                fiveIV.setColorFilter(Color.parseColor(b));
                threeIV.setColorFilter(Color.parseColor(c));
                fourIV.setColorFilter(Color.parseColor(d));
                twoIV.setColorFilter(Color.parseColor(e));
                break;
            case 3:
                oneTV.setText(a);
                twoTV.setText(b);
                fiveTV.setText(c);
                fourTV.setText(d);
                threeTV.setText(e);

                oneIV.setColorFilter(Color.parseColor(a));
                twoIV.setColorFilter(Color.parseColor(b));
                fiveIV.setColorFilter(Color.parseColor(c));
                fourIV.setColorFilter(Color.parseColor(d));
                threeIV.setColorFilter(Color.parseColor(e));
                break;
            case 4:
                oneTV.setText(a);
                twoTV.setText(b);
                threeTV.setText(c);
                fiveTV.setText(d);
                fourTV.setText(e);
                
                oneIV.setColorFilter(Color.parseColor(a));
                twoIV.setColorFilter(Color.parseColor(b));
                threeIV.setColorFilter(Color.parseColor(c));
                fiveIV.setColorFilter(Color.parseColor(d));
                fourIV.setColorFilter(Color.parseColor(e));
                break;
            case 5:
                oneTV.setText(a);
                twoTV.setText(b);
                threeTV.setText(c);
                fourTV.setText(d);
                fiveTV.setText(e);

                oneIV.setColorFilter(Color.parseColor(a));
                twoIV.setColorFilter(Color.parseColor(b));
                threeIV.setColorFilter(Color.parseColor(c));
                fourIV.setColorFilter(Color.parseColor(d));
                fiveIV.setColorFilter(Color.parseColor(e));
                break;
        }
    }
    public void bpressed(View v)
    {
        onBackPressed();
    }
    @Override
    public void onBackPressed() {
        supportFinishAfterTransition();
    }
}
