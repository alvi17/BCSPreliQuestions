package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 5/10/2016.
 */
public class ExamActivity extends Activity{


    String[] ans1={"d","d","a","a","a","c","c","c","a","a"};

    String[] ans2={"b","c","d","a","a","b","d","c","a","c"};

    String[] ans3={"a","c","a","b","a","a","d","c","d","b"};

    String[] ans4={"b","d","d","d","a","b","d","d","b","b"};
    String[] ans5={"d","c","d","c","b","b","b","d","c","a"};



    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;

    Button b;

    String[] ques;
    int correct=0;
    int incorrect=0;
    Dialog dialog;

    int tried=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exam_layout);

        int serial=getIntent().getIntExtra("Exam",0);


        if(serial==0)
        {
            ques=getResources().getStringArray(R.array.exam1);

        }
        else if(serial==1)
        {
            ans1=ans2;
            ques=getResources().getStringArray(R.array.exam2);
        }
        else if(serial==2)
        {
            ans1=ans3;
            ques=getResources().getStringArray(R.array.exam3);
        }
        else if(serial==3)
        {
            ans1=ans4;
            ques=getResources().getStringArray(R.array.exam4);
        }
        else if(serial==4)
        {
            ans1=ans5;
            ques=getResources().getStringArray(R.array.exam5);
        }




        t1=(TextView)findViewById(R.id.examtextView1);
        t2=(TextView)findViewById(R.id.examtextView2);
        t3=(TextView)findViewById(R.id.examtextView3);
        t4=(TextView)findViewById(R.id.examtextView4);
        t5=(TextView)findViewById(R.id.examtextView5);
        t6=(TextView)findViewById(R.id.examtextView6);
        t7=(TextView)findViewById(R.id.examtextView7);
        t8=(TextView)findViewById(R.id.examtextView8);
        t9=(TextView)findViewById(R.id.examtextView9);
        t10=(TextView)findViewById(R.id.examtextView10);

        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);
        e6=(EditText)findViewById(R.id.editText6);
        e7=(EditText)findViewById(R.id.editText7);
        e8=(EditText)findViewById(R.id.editText8);
        e9=(EditText)findViewById(R.id.editText9);
        e10=(EditText)findViewById(R.id.editText10);

        b=(Button)findViewById(R.id.submitbutton);

        tried=0;
        t1.setText(ques[0].replace("+"," "));
        t2.setText(ques[1].replace("+"," "));
        t3.setText(ques[2].replace("+"," "));
        t4.setText(ques[3].replace("+"," "));
        t5.setText(ques[4].replace("+"," "));
        t6.setText(ques[5].replace("+"," "));
        t7.setText(ques[6].replace("+"," "));
        t8.setText(ques[7].replace("+"," "));
        t9.setText(ques[8].replace("+"," "));
        t10.setText(ques[9].replace("+"," "));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tried==0) {

                    if (e1.getText().toString().equals(ans1[0])) {
                        correct++;
                    } else {
                        incorrect++;
                    }


                    if (e2.getText().toString().equals(ans1[1])) {
                        correct++;
                    } else {
                        incorrect++;
                    }

                    if (e3.getText().toString().equals(ans1[2])) {
                        correct++;
                    } else {
                        incorrect++;
                    }

                    if (e4.getText().toString().equals(ans1[3])) {
                        correct++;
                    } else {
                        incorrect++;
                    }

                    if (e5.getText().toString().equals(ans1[4])) {
                        correct++;
                    } else {
                        incorrect++;
                    }

                    if (e6.getText().toString().equals(ans1[5])) {
                        correct++;
                    } else {
                        incorrect++;
                    }

                    if (e7.getText().toString().equals(ans1[6])) {
                        correct++;
                    } else {
                        incorrect++;
                    }

                    if (e8.getText().toString().equals(ans1[7])) {
                        correct++;
                    } else {
                        incorrect++;
                    }

                    if (e9.getText().toString().equals(ans1[8])) {
                        correct++;
                    } else {
                        incorrect++;
                    }

                    if (e10.getText().toString().equals(ans1[9])) {
                        correct++;
                    } else {
                        incorrect++;
                    }
                    tried = 1;
                    // Toast.makeText(getApplicationContext(),e10.getText().toString()+" ",Toast.LENGTH_LONG).show();
                    showDialog(correct, incorrect);
                }
                else {
                    finish();
                    startActivity(getIntent());
                }
            }



        });

    }



    public void showDialog(int correct,int incorrect)
    {
        dialog=new Dialog(this);
        dialog.setContentView(R.layout.dialog_layout);
        dialog.setTitle("Exam Result");
        TextView cText=(TextView)dialog.findViewById(R.id.ctextView4);
        cText.setText("Correct Answer: " + correct);
        TextView iText=(TextView)dialog.findViewById(R.id.itextView5);
        iText.setText("Incorrect Answer: " + incorrect);
        Button sButton=(Button)dialog.findViewById(R.id.detailbutton2);
        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                showResult();
                b.setText("Try Again");

            }
        });

        this.correct=0;
        this.incorrect=0;

        dialog.show();

        Toast.makeText(getApplicationContext(),"Score: \n Correct :"+correct+"\n Incorrect :"+incorrect+"\n",Toast.LENGTH_LONG).show();
    }

    public void showResult()
    {
        if(!e1.getText().toString().equals(ans1[0]))
        {
            t1.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t1.setBackgroundColor(Color.argb(210,190,240,170));

        }

        if(!e2.getText().toString().equals(ans1[1]))
        {
            t2.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t2.setBackgroundColor(Color.argb(210,190,240,170));

        }

        if(!e3.getText().toString().equals(ans1[2]))
        {
            t3.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t3.setBackgroundColor(Color.argb(210,190,240,170));

        }

        if(!e4.getText().toString().equals(ans1[3]))
        {
            t4.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t4.setBackgroundColor(Color.argb(210,190,240,170));

        }

        if(!e5.getText().toString().equals(ans1[4]))
        {
            t5.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t5.setBackgroundColor(Color.argb(210,190,240,170));

        }
        if(!e6.getText().toString().equals(ans1[5]))
        {
            t6.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t6.setBackgroundColor(Color.argb(210,190,240,170));

        }
        if(!e7.getText().toString().equals(ans1[6]))
        {
            t7.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t7.setBackgroundColor(Color.argb(210,190,240,170));

        }
        if(!e8.getText().toString().equals(ans1[7]))
        {
            t8.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t8.setBackgroundColor(Color.argb(210,190,240,170));

        }
        if(!e9.getText().toString().equals(ans1[8]))
        {
            t9.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t9.setBackgroundColor(Color.argb(210,190,240,170));

        }
        if(!e10.getText().toString().equals(ans1[9]))
        {
            t10.setBackgroundColor(Color.argb(129,241,130,130));
        }
        else
        {
            t10.setBackgroundColor(Color.argb(210,190,240,170));

        }
    }
}
