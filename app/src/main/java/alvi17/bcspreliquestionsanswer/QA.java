package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import org.w3c.dom.Text;

/**
 * Created by User on 5/4/2016.
 */
public class QA extends Activity{

    TextView txt,title;
    FrameLayout fm;
    AdView adView;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ques_ans_layout);

        fm=(FrameLayout)findViewById(R.id.qa_frame);
        adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-6508526601344465/2887710430");
        adView.setAdSize(AdSize.BANNER);
        layout = new LinearLayout(this);
        layout.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        layout.addView(adView);
        fm.addView(layout);
        int pos=getIntent().getIntExtra("Position",0);

        txt=(TextView)findViewById(R.id.qatextView);
        title=(TextView)findViewById(R.id.titletextView);


        if(pos==0)
        {
            title.setText(getResources().getString(R.string.q10_title));
            txt.setText(getResources().getString(R.string.q10).replace(" "," "));
        }
        else if(pos==1)
        {
            title.setText(getResources().getString(R.string.q11_title));
            txt.setText(getResources().getString(R.string.q11).replace(" "," "));
        }
        else if(pos==2)
        {
            title.setText(getResources().getString(R.string.q12_title));
            txt.setText(getResources().getString(R.string.q12).replace(" "," "));
        }
        else if(pos==3)
        {
            title.setText(getResources().getString(R.string.q13_title));
            txt.setText(getResources().getString(R.string.q13).replace(" "," "));
        }
       else  if(pos==4)
        {
            title.setText(getResources().getString(R.string.q14_title));
            txt.setText(getResources().getString(R.string.q14).replace(" "," "));
        }
        else if(pos==5)
        {
            title.setText(getResources().getString(R.string.q15_title));
            txt.setText(getResources().getString(R.string.q15).replace(" "," "));
        }

        else if(pos==6){
            title.setText(getResources().getString(R.string.q16_title));
            txt.setText(getResources().getString(R.string.q16).replace(" "," "));
        }

        else if(pos==7){
            title.setText(getResources().getString(R.string.q17_title));
            txt.setText(getResources().getString(R.string.q17).replace(" "," "));
        }

        else if(pos==8){
            title.setText(getResources().getString(R.string.q18_title));
            txt.setText(getResources().getString(R.string.q18).replace(" "," "));
        }

        else if(pos==9){
            title.setText(getResources().getString(R.string.q19_title));
            txt.setText(getResources().getString(R.string.q19).replace(" "," "));
        }

        else if(pos==10){
            title.setText(getResources().getString(R.string.q20_title));
            txt.setText(getResources().getString(R.string.q20).replace(" "," "));
        }

        else if(pos==11){
            title.setText(getResources().getString(R.string.q21_title));
            txt.setText(getResources().getString(R.string.q21).replace(" "," "));
        }

        else if(pos==12){
            title.setText(getResources().getString(R.string.q22_title));
            txt.setText(getResources().getString(R.string.q22).replace(" "," "));
        }

        else if(pos==13){
            title.setText(getResources().getString(R.string.q23_title));
            txt.setText(getResources().getString(R.string.q23).replace(" "," "));
        }

        else if(pos==14){
            title.setText(getResources().getString(R.string.q24_title));
            txt.setText(getResources().getString(R.string.q24).replace(" "," "));
        }

        else if(pos==15){
            title.setText(getResources().getString(R.string.q25_title));
            txt.setText(getResources().getString(R.string.q25).replace(" "," "));
        }

        else if(pos==16){
            title.setText(getResources().getString(R.string.q26_title));
            txt.setText(getResources().getString(R.string.q26).replace(" "," "));
        }

        else if(pos==17){
            title.setText(getResources().getString(R.string.q28_title));
            txt.setText(getResources().getString(R.string.q28).replace(" "," "));
        }
        else if(pos==18){
            title.setText(getResources().getString(R.string.q29_title));
            txt.setText(getResources().getString(R.string.q29).replace(" "," "));
        }
        else if(pos==19){
            title.setText(getResources().getString(R.string.q31_title));
            txt.setText(getResources().getString(R.string.q31).replace(" "," "));
        }
        else if(pos==20){
            title.setText(getResources().getString(R.string.q32_title));
            txt.setText(getResources().getString(R.string.q32).replace(" "," "));
        }


        else if(pos==21){
            title.setText(getResources().getString(R.string.q33_title));
            txt.setText(getResources().getString(R.string.q33).replace(" "," "));
        }

        else if(pos==22){
            title.setText(getResources().getString(R.string.q34_title));
            txt.setText(getResources().getString(R.string.q34).replace(" "," "));
        }
        else if(pos==23){
            title.setText(getResources().getString(R.string.q35_title));
            txt.setText(getResources().getString(R.string.q35).replace(" "," "));
        }
        else if(pos==24){
            title.setText(getResources().getString(R.string.q36_title));
            txt.setText(getResources().getString(R.string.q36).replace(" "," "));
        }

    }


    @Override
    protected void onResume() {
        super.onResume();



    }
}
