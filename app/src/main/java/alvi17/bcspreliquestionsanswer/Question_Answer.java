package alvi17.bcspreliquestionsanswer;

import android.app.Activity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by User on 5/4/2016.
 */
public class Question_Answer extends Activity{

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    String[] ques;
    String[] ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_view_layout);
        ques=getResources().getStringArray(R.array.question12);
        ans=getResources().getStringArray(R.array.ans12);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new QuestionAdapter(ans);
        mRecyclerView.setAdapter(mAdapter);

    }


    @Override
    protected void onResume() {
        super.onResume();

        for(int i=0;i<ques.length;i++) {
            ((QuestionAdapter) mAdapter).addItem(new DataSet(ques[i].replace("+", " "),ans[i],i), i);
        }

    }



    String s=

           ""


            ;



                    



}
