package com.lilliemountain.joy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class LevelOneAdapter extends RecyclerView.Adapter<LevelOneAdapter.LevelOneHolder> {
    List<List<String>> mega;
    int lastPosition=-1;
    Context context;
    public LevelOneAdapter(Context context, List<List<String>> mega) {
        this.mega=mega;
        this.context=context;
    }

    @NonNull
    @Override
    public LevelOneHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recyclerview,viewGroup,false);
        return new LevelOneHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LevelOneHolder levelOneHolder, int z) {
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.right_from_left);
        levelOneHolder.itemView.startAnimation(animation);
        lastPosition = z;
        switch(z)
        {
            case 0:
                switcher(levelOneHolder,0);
                break;
            case 1:
                switcher(levelOneHolder,1);
                break;
            case 2:
                switcher(levelOneHolder,2);
                break;
            case 3:
                switcher(levelOneHolder,3);
                break;
            case 4:
                switcher(levelOneHolder,4);
                break;
            case 5:
                switcher(levelOneHolder,5);
                break;
            case 6:
                switcher(levelOneHolder,6);
                break;
            case 7:
                switcher(levelOneHolder,7);
                break;
            case 8:
                switcher(levelOneHolder,8);
                break;
            case 9:
                switcher(levelOneHolder,9);
                break;
            case 10:
                switcher(levelOneHolder,10);
                break;
            case 11:
                switcher(levelOneHolder,11);
                break;
            case 12:
                switcher(levelOneHolder,12);
                break;
            case 13:
                switcher(levelOneHolder,13);
                break;
            case 14:
                switcher(levelOneHolder,14);
                break;
            case 15:
                switcher(levelOneHolder,15);
                break;
            case 16:
                switcher(levelOneHolder,16);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 16;
    }



    public void switcher(LevelOneHolder levelOneHolder,int i)
    {
        levelOneHolder.oneIV.setColorFilter(Color.parseColor(mega.get(i).get(0)));
        levelOneHolder.oneTV.setText(mega.get(i).get(0));

        levelOneHolder.twoIV.setColorFilter(Color.parseColor(mega.get(i).get(1)));
        levelOneHolder.twoTV.setText(mega.get(i).get(1));

        levelOneHolder.threeIV.setColorFilter(Color.parseColor(mega.get(i).get(2)));
        levelOneHolder.threeTV.setText(mega.get(i).get(2));

        levelOneHolder.fourIV.setColorFilter(Color.parseColor(mega.get(i).get(3)));
        levelOneHolder.fourTV.setText(mega.get(i).get(3));

        levelOneHolder.fiveIV.setColorFilter(Color.parseColor(mega.get(i).get(4)));
        levelOneHolder.fiveTV.setText(mega.get(i).get(4));
        Log.e("AS", mega.get(i).get(0));
        Log.e("AS", mega.get(i).get(1));
        Log.e("AS", mega.get(i).get(2));
        Log.e("AS", mega.get(i).get(3));
        Log.e("AS", mega.get(i).get(4));
    }
    @Override
    public void onViewDetachedFromWindow(LevelOneHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.itemView.clearAnimation();
    }

    public class LevelOneHolder extends ViewHolder {
        ImageView oneIV,twoIV,threeIV,fourIV,fiveIV;
        TextView oneTV,twoTV,threeTV,fourTV,fiveTV;
        LinearLayout one,two,three,four,five;
        ConstraintLayout as;
        public LevelOneHolder(@NonNull View itemView) {
            super(itemView);
            as=itemView.findViewById(R.id.as);
            one=itemView.findViewById(R.id.one);
            two=itemView.findViewById(R.id.two);
            three=itemView.findViewById(R.id.three);
            four=itemView.findViewById(R.id.four);
            five=itemView.findViewById(R.id.five);
            oneIV=itemView.findViewById(R.id.oneIV);
            twoIV=itemView.findViewById(R.id.twoIV);
            threeIV=itemView.findViewById(R.id.threeIV);
            fourIV=itemView.findViewById(R.id.fourIV);
            fiveIV=itemView.findViewById(R.id.fiveIV);
            oneTV=itemView.findViewById(R.id.oneTV);
            twoTV=itemView.findViewById(R.id.twoTV);
            threeTV=itemView.findViewById(R.id.threeTV);
            fourTV=itemView.findViewById(R.id.fourTV);
            fiveTV=itemView.findViewById(R.id.fiveTV);

            Pair<View, String> p1 = Pair.create((View)one, "one");
            Pair<View, String> p2 = Pair.create((View)two, "two");
            Pair<View, String> p3 = Pair.create((View)three, "three");
            Pair<View, String> p4 = Pair.create((View)four, "four");
            Pair<View, String> p5 = Pair.create((View)five, "five");
            Activity activity=(Activity)itemView.getContext();

            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, p1, p2, p3,p4,p5);

            buttonlisten(one, 1,options);
            buttonlisten(two, 2,options);
            buttonlisten(three,3,options);
            buttonlisten(four, 4,options);
            buttonlisten(five, 5,options);
        }
        void buttonlisten(LinearLayout view, final int number, final ActivityOptionsCompat options) {

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), LevelTwoActivity.class);
                    intent.putExtra("one",oneTV.getText().toString());
                    intent.putExtra("two",twoTV.getText().toString());
                    intent.putExtra("three",threeTV.getText().toString());
                    intent.putExtra("four",fourTV.getText().toString());
                    intent.putExtra("five",fiveTV.getText().toString());
                    intent.putExtra("number",number);
                    v.getContext().startActivity(intent, options.toBundle());
                }
            });
        }
    }
}
