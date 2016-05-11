package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by User on 5/5/2016.
 */
public class QA_Page extends Activity{


    GridView gridView;

    String[] names={"১০ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান","১১ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান","১২ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান","১৩ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
   " ১৪ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান","১৫ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান","১৬ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান","১৭ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            " ১৮ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "১৯ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            " ২০ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            " ২১ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            " ২২ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "২৩ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "২৪তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "২৫ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "২৬ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "২৮ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "২৯ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "৩১ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "৩২ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "৩৩ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "৩৪ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "৩৫ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান",
            "৩৬ তম বিসিএস পরীক্ষার প্রশ্ন ও সমাধান"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_answers_front_page);

        gridView=(GridView)findViewById(R.id.gridView);

        gridView.setAdapter(new GridAdapter(this,names));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(QA_Page.this,QA.class);
                intent.putExtra("Position",position);
                startActivity(intent);

            }
        });

    }
}
