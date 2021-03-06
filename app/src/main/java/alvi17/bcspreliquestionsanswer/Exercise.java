package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/**
 * Created by User on 5/6/2016.
 */
public class Exercise extends Activity{

    ListView listView;
    String[] ques={"What is your name?","What is your father'sname?"};
    String[] ans1={"Alvi","FF"};
    String[] ans2={"BB","FG"};
    String[] ans3={"CC","GE"};
    String[] ans4={"DD","ER"};
    int[] ans_1={1,2,2,1,2,0,0,1,1,1};
   // ১-খ, ২-গ, ৩-গ, ৪-খ, ৫-গ, ৬-ক, ৭-ঘ, ৮-ক, ৯-খ, ১০-খ, ১১-খ, ১২-খ

    FrameLayout fm;
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_layout);
        listView=(ListView)findViewById(R.id.listView);

        fm=(FrameLayout)findViewById(R.id.exercise_frame);
        adView = new AdView(this);
        int serial=getIntent().getIntExtra("Exercise",0);

        if(serial==0) {
            ques = getResources().getStringArray(R.array.quiz);
            ans1 = getResources().getStringArray(R.array.ans1);
            ans2 = getResources().getStringArray(R.array.ans2);
            ans3 = getResources().getStringArray(R.array.ans3);
            ans4 = getResources().getStringArray(R.array.ans4);
            int[] ans_1={1,2,2,1,2,0,0,1,1,1};
            listView.setAdapter(new ListAdpater(this, ques, ans1, ans2, ans3, ans4, ans_1));
        }
        else if(serial==1)
        {
            ques = getResources().getStringArray(R.array.quiz2);
            ans1 = getResources().getStringArray(R.array.ans2_1);
            ans2 = getResources().getStringArray(R.array.ans2_2);
            ans3 = getResources().getStringArray(R.array.ans2_3);
            ans4 = getResources().getStringArray(R.array.ans2_4);
            //১-খ, ২-খ, ৩-গ, ৪-ক, ৫-খ, ৬-খ, ৭-খ, ৮-খ, ৯-ক, ১০-গ, ১১-ক, ১২-ক
            int[] ans_1={1,1,2,0,1,1,1,1,0,2,0,2};

            listView.setAdapter(new ListAdpater(this, ques, ans1, ans2, ans3, ans4, ans_1));
        }

        else
        {
            ques = getResources().getStringArray(R.array.quiz3);
            ans1 = getResources().getStringArray(R.array.ans3_1);
            ans2 = getResources().getStringArray(R.array.ans3_2);
            ans3 = getResources().getStringArray(R.array.ans3_3);
            ans4 = getResources().getStringArray(R.array.ans3_4);
            //১-খ, ২-খ, ৩-গ, ৪-ক, ৫-খ, ৬-খ, ৭-খ, ৮-খ, ৯-ক, ১০-গ, ১১-ক, ১২-ক
            int[] ans_1={2,1,0,1,1,3,1,2,0,0,2,0,3};

            listView.setAdapter(new ListAdpater(this, ques, ans1, ans2, ans3, ans4, ans_1));
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            }
        });
        adView.setAdUnitId("ca-app-pub-6508526601344465/2887710430");
        adView.setAdSize(AdSize.BANNER);
        LinearLayout layout = new LinearLayout(this);
        layout.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        layout.addView(adView);
        fm.addView(layout);


    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}
