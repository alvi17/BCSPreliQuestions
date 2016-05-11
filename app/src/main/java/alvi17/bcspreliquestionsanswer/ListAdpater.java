package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 5/6/2016.
 */
public class ListAdpater extends ArrayAdapter<String>{

    String[] ques;
    String[] ans1,ans2,ans3,ans4;
    int[] ans;
    Activity context;

    public ListAdpater(Context context, int resource) {
        super(context, resource);
    }

    public ListAdpater(Activity context,String[] ques,String[] ans1,String[] ans2,String[] ans3,String[] ans4,int[] ans)
    {
        super(context,R.layout.exercise_layout,ques);
        this.context=context;
        this.ques=ques;
        this.ans1=ans1;
        this.ans2=ans2;
        this.ans3=ans3;
        this.ans4=ans4;
        this.ans=ans;

    }


    public class Holder
    {
        TextView question;
        Button b1,b2,b3,b4;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        final Holder holder=new Holder();
        View rowView= inflater.inflate(R.layout.exercise_layout, null,true);
        holder.question=(TextView)rowView.findViewById(R.id.quiztextView);
        holder.b1=(Button)rowView.findViewById(R.id.qbutton1);
        holder.b2=(Button)rowView.findViewById(R.id.qbutton2);
        holder.b3=(Button)rowView.findViewById(R.id.qbutton3);
        holder.b4=(Button)rowView.findViewById(R.id.qbutton4);


        holder.question.setText(ques[position]);
        holder.b1.setText(ans1[position]);
        holder.b2.setText(ans2[position]);
        holder.b3.setText(ans3[position]);
        holder.b4.setText(ans4[position]);


        holder.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans[position] == 0) {
                    holder.b1.setBackgroundColor(Color.GREEN);
                } else {
                    holder.b1.setBackgroundColor(Color.RED);

                    if (ans[position] == 1) {

                        holder.b2.setBackgroundColor(Color.BLUE);
                    } else if (ans[position] == 2) {
                        holder.b3.setBackgroundColor(Color.BLUE);
                    } else {
                        holder.b4.setBackgroundColor(Color.BLUE);
                    }

                }
                holder.b1.setClickable(false);
                holder.b2.setClickable(false);
                holder.b3.setClickable(false);
                holder.b4.setClickable(false);
            }
        });

        holder.b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans[position] == 1) {
                    holder.b2.setBackgroundColor(Color.GREEN);
                } else {
                    holder.b2.setBackgroundColor(Color.RED);

                    if (ans[position] == 0) {

                        holder.b1.setBackgroundColor(Color.BLUE);
                    } else if (ans[position] == 2) {
                        holder.b3.setBackgroundColor(Color.BLUE);
                    } else {
                        holder.b4.setBackgroundColor(Color.BLUE);
                    }

                }
               // holder.b2.setBackgroundColor(Color.BLUE);
                holder.b1.setClickable(false);
                holder.b2.setClickable(false);
                holder.b3.setClickable(false);
                holder.b4.setClickable(false);
            }
        });

        holder.b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans[position] == 2) {
                    holder.b3.setBackgroundColor(Color.GREEN);
                } else {
                    holder.b3.setBackgroundColor(Color.RED);

                    if (ans[position] == 1) {

                        holder.b2.setBackgroundColor(Color.BLUE);
                    } else if (ans[position] == 0) {
                        holder.b1.setBackgroundColor(Color.BLUE);
                    } else {
                        holder.b4.setBackgroundColor(Color.BLUE);
                    }

                }
              //  holder.b3.setBackgroundColor(Color.BLUE);
                holder.b1.setClickable(false);
                holder.b2.setClickable(false);
                holder.b3.setClickable(false);
                holder.b4.setClickable(false);
            }
        });

        holder.b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans[position] == 3) {
                    holder.b4.setBackgroundColor(Color.GREEN);
                } else {
                    holder.b4.setBackgroundColor(Color.RED);

                    if (ans[position] == 1) {

                        holder.b2.setBackgroundColor(Color.BLUE);
                    } else if (ans[position] == 2) {
                        holder.b3.setBackgroundColor(Color.BLUE);
                    } else {
                        holder.b1.setBackgroundColor(Color.BLUE);
                    }

                }
               // holder.b4.setBackgroundColor(Color.BLUE);
                holder.b1.setClickable(false);
                holder.b2.setClickable(false);
                holder.b3.setClickable(false);
                holder.b4.setClickable(false);
            }
        });

        return rowView;
    }
}
