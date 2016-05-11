package alvi17.bcspreliquestionsanswer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by User on 5/5/2016.
 */
public class GridAdapter extends BaseAdapter{

    private Context context;
    private final String[] Values;
    View gridView;
    public GridAdapter(Context context,String[] val)
    {
        this.context=context;
        this.Values=val;
    }

    @Override
    public int getCount() {
        return Values.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        gridView = new View(context);
        gridView = inflater.inflate(R.layout.grid_item, null);

        TextView txt=(TextView)gridView.findViewById(R.id.buttontextView3);
        txt.setText(Values[position]);


        return gridView;


    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
}
