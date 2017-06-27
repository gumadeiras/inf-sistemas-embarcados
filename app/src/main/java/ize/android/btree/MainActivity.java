package ize.android.btree;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    // -----------------------------------------------------------

    public void avl10(View v) {

        int QUANTIDADE = 10;

        Toast.makeText(this, "AVL para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        // REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            b1.put(i, i);
            // b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            b1.get(i);
            // b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void avl25(View v) {

        int QUANTIDADE = 25;

        Toast.makeText(this, "AVL para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        // REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            b1.put(i, i);
            // b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            b1.get(i);
            // b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void avl50(View v) {

        int QUANTIDADE = 50;

        Toast.makeText(this, "AVL para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        // REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            b1.put(i, i);
            // b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            b1.get(i);
            // b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void avl100(View v) {

        int QUANTIDADE = 100;

        Toast.makeText(this, "AVL para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        // REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            b1.put(i, i);
            // b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            b1.get(i);
            // b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void avl250(View v) {

        int QUANTIDADE = 250;

        Toast.makeText(this, "AVL para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        // REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            b1.put(i, i);
            // b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            b1.get(i);
            // b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void avl500(View v) {

        int QUANTIDADE = 500;

        Toast.makeText(this, "AVL para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        // REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            b1.put(i, i);
            // b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            b1.get(i);
            // b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void avl1000(View v) {

        int QUANTIDADE = 1000;

        Toast.makeText(this, "AVL para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        // REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            b1.put(i, i);
            // b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            b1.get(i);
            // b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void avl10000(View v) {

        int QUANTIDADE = 10000;

        Toast.makeText(this, "AVL para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        // REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            b1.put(i, i);
            // b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            b1.get(i);
            // b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    // -----------------------------------------------------------

    public void rb10(View v) {

        int QUANTIDADE = 10;

        Toast.makeText(this, "REDBLACK para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
         REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
             b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
             b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb25(View v) {

        int QUANTIDADE = 25;

        Toast.makeText(this, "REDBLACK para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb50(View v) {

        int QUANTIDADE = 50;

        Toast.makeText(this, "REDBLACK para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb100(View v) {

        int QUANTIDADE = 100;

        Toast.makeText(this, "REDBLACK para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb250(View v) {

        int QUANTIDADE = 250;

        Toast.makeText(this, "REDBLACK para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb500(View v) {

        int QUANTIDADE = 500;

        Toast.makeText(this, "REDBLACK para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb1000(View v) {

        int QUANTIDADE = 1000;

        Toast.makeText(this, "REDBLACK para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb10000(View v) {

        int QUANTIDADE = 10000;

        Toast.makeText(this, "REDBLACK para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        // BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            b2.put(i, i);
            // b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            b2.get(i);
            // b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    // -----------------------------------------------------------

    public void btree10(View v) {

        int QUANTIDADE = 10;

        Toast.makeText(this, "BTREE para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        //REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
         BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            //b2.put(i, i);
             b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            //b2.get(i);
             b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void btree25(View v) {

        int QUANTIDADE = 25;

        Toast.makeText(this, "BTREE para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        //REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            //b2.put(i, i);
            b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            //b2.get(i);
            b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void btree50(View v) {

        int QUANTIDADE = 50;

        Toast.makeText(this, "BTREE para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        //REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            //b2.put(i, i);
            b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            //b2.get(i);
            b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void btree100(View v) {

        int QUANTIDADE = 100;

        Toast.makeText(this, "BTREE para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        //REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            //b2.put(i, i);
            b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            //b2.get(i);
            b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void btree250(View v) {

        int QUANTIDADE = 250;

        Toast.makeText(this, "BTREE para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        //REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            //b2.put(i, i);
            b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            //b2.get(i);
            b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void btree500(View v) {

        int QUANTIDADE = 500;

        Toast.makeText(this, "BTREE para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        //REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            //b2.put(i, i);
            b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            //b2.get(i);
            b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void btree1000(View v) {

        int QUANTIDADE = 1000;

        Toast.makeText(this, "BTREE para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        //REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            //b2.put(i, i);
            b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            //b2.get(i);
            b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void btree10000(View v) {

        int QUANTIDADE = 10000;

        Toast.makeText(this, "BTREE para "+QUANTIDADE+" itens",
                Toast.LENGTH_LONG).show();

        //AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        //REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();

        long startTime = System.currentTimeMillis();


        for(int i=0; i<QUANTIDADE; i++) {
            //b1.put(i, i);
            //b2.put(i, i);
            b3.put(i, i);
        }

        for(int i=0; i<QUANTIDADE; i++) {
            //b1.get(i);
            //b2.get(i);
            b3.get(i);
        }

        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    // -----------------------------------------------------------

    public void caso1tempos(View v) {
        Toast.makeText(this, "tempos, caso1",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();


        long startTime;
        long endTime;
        long totalTime;


        startTime = System.currentTimeMillis();

        for(int i=0; i<10; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<10; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (10): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<10; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<10; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (10): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<10; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<10; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (10): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<25; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (25): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<25; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (25): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<25; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (25): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<50; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (50): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<50; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (50): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<50; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (50): " + totalTime);




        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<100; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (100): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<100; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (100): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<100; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (100): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<250; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (250): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<250; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (250): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<250; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (250): " + totalTime);




        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<500; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (500): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<500; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (500): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<500; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (500): " + totalTime);






        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<1000; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (1000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<1000; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (1000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<1000; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (1000): " + totalTime);






        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<5000; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (5000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<5000; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (5000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<5000; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (5000): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<10000; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (10000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<10000; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (10000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<10000; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (10000): " + totalTime);



        Toast.makeText(this, "Done",
                Toast.LENGTH_LONG).show();
    }

    public void caso2tempos(View v) {
        Toast.makeText(this, "tempos, caso2",
                Toast.LENGTH_LONG).show();

        AVL<Integer, Integer> b1 = new AVL<Integer, Integer>();
        REDBLACK<Integer, Integer> b2 = new REDBLACK<Integer, Integer>();
        BTREE<Integer, Integer> b3 = new BTREE<Integer, Integer>();


        long startTime;
        long endTime;
        long totalTime;


        startTime = System.currentTimeMillis();

        for(int i=0; i<10; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (10): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<10; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (10): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<10; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (10): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (25): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (25): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (25): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (50): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (50): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (50): " + totalTime);




        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (100): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (100): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (100): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (250): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (250): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (250): " + totalTime);




        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (500): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (500): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (500): " + totalTime);






        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (1000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (1000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (1000): " + totalTime);



        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<5000; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (5000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<5000; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (5000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<5000; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (5000): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b1.put(i, i);
        }

        for(int i=0; i<10000; i++) {
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (10000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b2.put(i, i);
        }

        for(int i=0; i<10000; i++) {
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (10000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b3.put(i, i);
        }

        for(int i=0; i<10000; i++) {
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (10000): " + totalTime);



        Toast.makeText(this, "Done",
                Toast.LENGTH_LONG).show();
    }

    // -----------------------------------------------------------

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
