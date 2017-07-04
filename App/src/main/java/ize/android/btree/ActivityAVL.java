package ize.android.btree;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ActivityAVL extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avl);

        Toast.makeText(this, "Hi",
                Toast.LENGTH_LONG).show();

        AVL<String, Integer> st = new AVL<String, Integer>();

        for(int i=0; i<50; i++) {
            st.put(String.valueOf(i), i);
        }

        for (String s : st.keys()) {
            Log.e("AHHHHHHHHH", s + " --- " + st.get(s));
        }

        Toast.makeText(this, "Done",
                Toast.LENGTH_LONG).show();

        super.finish();

    }

}
