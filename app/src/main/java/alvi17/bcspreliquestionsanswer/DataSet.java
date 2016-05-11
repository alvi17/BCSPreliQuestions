package alvi17.bcspreliquestionsanswer;

/**
 * Created by User on 4/28/2016.
 */
public class DataSet {
    private String mText1;
    private String mText2;
    String mText3;
    String mText4,mText5;
    String answer;
    int position;


    DataSet (String text1,String ans,int pos){
        mText1 = text1;
        answer=ans;
        position=pos;
    }




    public String getmText1() {
        return mText1;
    }



    public String getAnswer()
    {
        return answer;
    }
}
