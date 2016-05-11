package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
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

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;

    Button b;

    String[] ques;
    int correct=0;
    int incorrect=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exam_layout);

        ques=getResources().getStringArray(R.array.exam1);

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



        t1.setText(ques[1].replace("+"," "));
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
                
                if(e1.getText().equals(ans1[0]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }


                if(e2.getText().equals(ans1[1]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                if(e3.getText().equals(ans1[2]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                if(e4.getText().equals(ans1[3]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                if(e5.getText().equals(ans1[4]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                if(e6.getText().equals(ans1[5]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                if(e7.getText().equals(ans1[6]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                if(e8.getText().equals(ans1[7]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                if(e9.getText().equals(ans1[8]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                if(e10.getText().equals(ans1[9]))
                {
                    correct++;
                }
                else
                {
                    incorrect++;
                }

                showDialog(correct,incorrect);
            }



        });

    }


    public void showDialog(int correct,int incorrect)
    {
        
        Toast.makeText(getApplicationContext(),"Score: \n Correct :"+correct+"\n Incorrect :"+incorrect+"\n",Toast.LENGTH_LONG).show();
    }
}
