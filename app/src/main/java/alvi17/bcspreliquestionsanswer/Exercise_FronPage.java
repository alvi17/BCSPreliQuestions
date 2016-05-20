package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 5/7/2016.
 */
public class Exercise_FronPage extends Activity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5,b6,b7;

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

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);

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


        }

    }
}
