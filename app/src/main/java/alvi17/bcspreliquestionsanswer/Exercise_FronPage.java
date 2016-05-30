package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by User on 5/7/2016.
 */
public class Exercise_FronPage extends Activity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    public static final String MyPreference="mypreference";
    SharedPreferences sharedpreference;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_front_page);

        b1=(Button)findViewById(R.id.exbutton1);
        b2=(Button)findViewById(R.id.exbutton2);
        b3=(Button)findViewById(R.id.exbutton3);
        b4=(Button)findViewById(R.id.exbutton4);
        b5=(Button)findViewById(R.id.exbutton5);
        b6=(Button)findViewById(R.id.exbutton6);
        b7=(Button)findViewById(R.id.exbutton7);

        b8=(Button)findViewById(R.id.exbutton8);
        b9=(Button)findViewById(R.id.exbutton9);
        b10=(Button)findViewById(R.id.exbutton10);
        b11=(Button)findViewById(R.id.exbutton11);
        b12=(Button)findViewById(R.id.exbutton12);



        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);


        interstitial=new  InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-6508526601344465/5841176834");
        AdRequest aRequest = new AdRequest.Builder().build();

        // Begin loading your interstitial.
        interstitial.loadAd(aRequest);

        interstitial.setAdListener(
                new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        super.onAdLoaded();
                        interstitial.show();
                    }
                }
        );
    }


    @Override
    protected void onResume() {
        super.onResume();
        sharedpreference=this.getSharedPreferences(MyPreference, Context.MODE_PRIVATE);

        if(sharedpreference.contains("Quiz0"))
        {
            b3.setText("কুইজ- ১\n"+sharedpreference.getInt("Quiz0",0)+"/10");
        }
        if(sharedpreference.contains("Quiz1"))
        {
            b4.setText("কুইজ- ২\n"+sharedpreference.getInt("Quiz1",0)+"/10");
        }
        if(sharedpreference.contains("Quiz2"))
        {
            b5.setText("কুইজ- ৩\n"+sharedpreference.getInt("Quiz2",0)+"/10");
        }
        if(sharedpreference.contains("Quiz3"))
        {
            b6.setText("কুইজ- ৪\n"+sharedpreference.getInt("Quiz3",0)+"/10");
        }
        if(sharedpreference.contains("Quiz4"))
        {
            b7.setText("কুইজ- ৫\n"+sharedpreference.getInt("Quiz4",0)+"/10");
        }
        if(sharedpreference.contains("Quiz5"))
        {
            b8.setText("কুইজ- ৬\n"+sharedpreference.getInt("Quiz5",0)+"/10");
        }
        if(sharedpreference.contains("Quiz6"))
        {
            b9.setText("কুইজ- ৭\n"+sharedpreference.getInt("Quiz6",0)+"/10");
        }
        if(sharedpreference.contains("Quiz7"))
        {
            b10.setText("কুইজ- ৮\n"+sharedpreference.getInt("Quiz7",0)+"/10");
        }
        if(sharedpreference.contains("Quiz8"))
        {
            b11.setText("কুইজ- ৯\n"+sharedpreference.getInt("Quiz8",0)+"/10");
        }
    }

    @Override
    public void onClick(View v) {

        int id=v.getId();
        Intent intent;
        switch (id)
        {
            case R.id.exbutton1:
                intent=new Intent(Exercise_FronPage.this,Exercise.class);
                intent.putExtra("Exercise", 0);
                startActivity(intent);
                return;
            case R.id.exbutton2:
                intent=new Intent(Exercise_FronPage.this,Exercise.class);
                intent.putExtra("Exercise",1);
                startActivity(intent);
                return;
            case R.id.exbutton12:
                intent=new Intent(Exercise_FronPage.this,Exercise.class);
                intent.putExtra("Exercise",2);
                startActivity(intent);
                return;
            case R.id.exbutton3:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",0);
                startActivity(intent);
                return;
            case R.id.exbutton4:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",1);
                startActivity(intent);
                return;
            case R.id.exbutton5:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",2);
                startActivity(intent);
                return;
            case R.id.exbutton6:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",3);
                startActivity(intent);
                return;
            case R.id.exbutton7:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",4);
                startActivity(intent);
                return;

            case R.id.exbutton8:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",5);
                startActivity(intent);
                return;
            case R.id.exbutton9:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",6);
                startActivity(intent);
                return;
            case R.id.exbutton10:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",7);
                startActivity(intent);
                return;
            case R.id.exbutton11:
                intent=new Intent(Exercise_FronPage.this,ExamActivity.class);
                intent.putExtra("Exam",8);
                startActivity(intent);
                return;
        }

    }
}
