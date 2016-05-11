package alvi17.bcspreliquestionsanswer;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by User on 5/4/2016.
 */
public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter
        .DataObjectHolder>{
    private ArrayList<DataSet> mDataset;
    private static MyClickListener myClickListener;

    String[] answer;
    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView label;
        TextView dateTime,ans,ans3,ans4;
        Button button;

        public DataObjectHolder(View itemView) {
            super(itemView);
            label = (TextView) itemView.findViewById(R.id.textView);
            ans=(TextView)itemView.findViewById(R.id.answertextView);

            button=(Button)itemView.findViewById(R.id.button);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }


    public QuestionAdapter(String[] answer) {

        mDataset = new ArrayList<DataSet>();
        this.answer=answer;
    }
    @Override
    public QuestionAdapter.DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_item, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder( final QuestionAdapter.DataObjectHolder holder, final int position) {


        final QuestionAdapter.DataObjectHolder h=holder;
        final int pos=position;

        holder.label.setText(mDataset.get(position).getmText1());
        holder.ans.setText(mDataset.get(position).getAnswer());




        holder.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (mDataset.get(pos).position == position && holder.ans.getVisibility() == View.INVISIBLE) {
                            holder.ans.setVisibility(View.VISIBLE);
                        }


                        // notifyDataSetChanged();
                    }
                }
        );
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }

    public void addItem(DataSet dataObj, int index) {
        mDataset.add(index, dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }
}
