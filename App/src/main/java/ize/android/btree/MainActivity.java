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
import android.widget.Spinner;
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
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (10): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<10; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (10): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<10; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (10): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (25): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (25): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<25; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (25): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (50): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (50): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<50; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (50): " + totalTime);




        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (100): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (100): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<100; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (100): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (250): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (250): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<250; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (250): " + totalTime);




        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (500): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (500): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<500; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (500): " + totalTime);






        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (1000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (1000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<1000; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (1000): " + totalTime);






        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (5000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (5000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all btree (5000): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all AVL (10000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add all RedBlack (10000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b3.put(i, i);
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
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (5000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (5000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<5000; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (5000): " + totalTime);





        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b1.put(i, i);
            b1.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one AVL (10000): " + totalTime);

        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b2.put(i, i);
            b2.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one RedBlack (10000): " + totalTime);


        startTime = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            b3.put(i, i);
            b3.get(i);
        }

        endTime   = System.currentTimeMillis();

        totalTime = endTime - startTime;

        Log.e("AH","add one, search one btree (10000): " + totalTime);



        Toast.makeText(this, "Done",
                Toast.LENGTH_LONG).show();
    }

    // -------------------------------------------------------------------------------------------------------------------------------------------------------------------

    static final int[] numbers =
            {
                    983,   87,  376,  870,  680,  402,  709,  176,  890,  686,  441,  655,  117,  527,   42,  876,
                    679,  380,  601,   92,  580,  108,  405,   49,  752,  875,  618,  468,  130,  621,  331,  530,
                    855,   97,  292,  990,  551,  756,  813,  201,  695,  517,  403,   36,  991,   39,  216,   66,
                    493,  674,  755,  467,  803,  934,  225,  943,  643,  501,  347,  465,  653,   73,  251,  603,
                    649,  317,  654,  663,  910,  475,  169,  824,  981,  633,  288,  562,  234,  735,  944,  741,
                    971,  295,  183,  346,  391,  411,  694,  591,    5,  899,  945,  816,  689,   83,  759,  738,
                    243,  820,  743,  211,  149,  477,  349,  726,  195,  393,  354,  725,  646,  862,  531,    3,
                    952,  466,  338,  685,  264,  150,  778,   80,  153,  964,  877,  788,  818,  597,  313,  430,
                    670,  472,  634,   65,  170,  461,  479,   58,  727,   41,  972,  602,  819,  821,  230,   91,
                    244,  259,  708,  386,  599,  262,  832,  706,  879,   53,  958,  312,  355,   20,  175,  458,
                    303,  443, 1000,  128,  247,  593,   55,  789,  612,  736,  955,  547,  873,  378,   68,  659,
                    953,  246,  635,  197,  595,   60,   79,  896,  121,  584,  358,  375,  342,  511,  588,  191,
                    368,  143,  784,  488,  453,  829,  109,  569,  495,  365,  831,  283,   93,  352,  804,  385,
                    318,  897,  923,  332,  388,  105,  324,  673,  552,  970,  606,  492,  716,  781,  638,   26,
                    82,  129,   45,  188,  884,  494,  205,  864,  644,   25,  413,  770,  431,   47,  913,  280,
                    518,  596,  110,  565,  941,  684,  711,  315,  865,  421,  178,  140,  506,  610,    7,  221,
                    127,  721,  783,  340,  486,  444,  333,  120,  384,  681,  577,  459,  515,  306,  912,  740,
                    348,  184,  940,  930,  307,  412,  156,  850,  390,  308,  594,  463,  454,  383,   14,  894,
                    615,  474,   76,  636,  293,  400,  470,  481,  291,  123,  605,  442,  528,  891,   31,  310,
                    322,   95,  522,  549,  265,  526,  959,  929,  587,  237,  776,  632,  903,   30,  731,  650,
                    915,   19,  255,  478,  180,  984,  807,   51,   23,  645,  228,   38,   21,  171,  566,  367,
                    967,  112,  699,  218,  775,  840,  258,  296,  185,   70,  691,  155,  656,  408,   63,   84,
                    942,  350,  830,  712,  973,  768,  889,  718,   12,  239,  688,  267,   89,  739,  572,  208,
                    568,  698,  534,  499,  869,  418,  436,  328,  452,  782,  701,  608,  909,  371,  113,  861,
                    841,  289,  961,  162,  834,  483,  369,  657,  173,  462,  810,  617,  167,  319,   10,  451,
                    273,  335,   62,  460,  583,  998,  504,  749,  604,  980,  666,  450,  717,  932,  277,  751,
                    50,  336,  298,  627,  482,  925,  357,  766,  760,  372,  166,  423,   48,  132,  238,  253,
                    746,  729,  554,  921,  396,  609,  823,  217,   86,  254,  199,  287,  174,  187,  790,   29,
                    410,  975,   90,  223,   98,  908,  469,  916,  160,  435,  791,  682,  142,  616,  496,  157,
                    524,  111,   88,  152,  344,  274,  669,  690,  581,  529,  425,  314,  911,  362,  780,  272,
                    67,  311,  240,  414,  316,  578,  693,  382,  537,  567,  256,  126,  541,  812,  337,  900,
                    356,  271,  282,  564,  667,  278,  858,  158,  471,  660,   56,   32,  786,    8,  509,  904,
                    772,  432,  426,  968,  131,  559,  546,   85,  842,  856,  687,  422,  798,   44,  104,  514,
                    366,  381,  748,  343,  732,  219,  136,  614,   37,  484,    9,  710,  723,  134,  525,  792,
                    558,  815,  888,  852,  677,  619,   24,  762,  302,  575,  922,  119,  210,  533,  242,  535,
                    373,  144,  557,  294,   61,  794,  863,  702,  853,  641,  141,  137,   33,  122,  100,  935,
                    203,  939,  995,  193,  341,  507,  560,  570,  198,  988,  438,  851,  954,  398,  455,  364,
                    46,  276,  624,  491,  138,    6,  345,  924,   54,  415,    1,  161,  969,  919,  895,  620,
                    801,  629,  761,  582,   11,  931,  275,  399,  882,  960,  987,  194,  838,  773,   57,    4,
                    300,  763,  513,  440,  696,  439,  181,  204,  648,  672,  168,  652,  883,  907,  828,  245,
                    543,  811,  722,  154,  747,  395,  590,  777,  630,  974,  497,   13,  996,  720,  857,   75,
                    734,  917,  611,  401,  404,  771,  285,  297,  878,  874,  487,  886,  579,  628,  270,  212,
                    490,   71,  139,  779,  926,  623,  544,  437,  848,  428,  417,  446,  182,  456,  703,  416,
                    918,  866,  553,  902,  999,  473,  600,  539,  323,  946,  299,  370,  589,   94,  151,  671,
                    571,  963,  639,  937,  713,  164,  845,  241,  982,  379,   69,  796,   28,  420,  622,  351,
                    523,  330,  993,  502,  585,  133,  464,  665,  905,  906,  872,  833,  928,  802,  505,  159,
                    286,  962,  445,  550,  927,  118,  843,  545,  676,  997,  329,  764,  914,  662,   17,  261,
                    700,  353,  231,  222,  290,  881,  102,  707,  457,  260,  692,  190,  753,  115,  836,  839,
                    43,  209,  880,  392,  394,  951,  202,  213,  844,  574,   27,  846,  817,  563,   22,  664,
                    229,  598,  363,  795,  542,  901,   81,  519,  304,  232,  135,  724,  809,  521,  950,  683,
                    948,  859,  116,   96,  387,  837,  827,  250,  956,  949,  871,  434,  449,  548,  536,  214,
                    18,  814,  196,  227,  540,  106,  489,  419,  266,  947,  226,  427,  397,  822,  697,  825,
                    163,  206,  592,  268,  576,  424,  745,  284,   78,  263,  520,  728,  236,  936,  854,  224,
                    561,  215,  269,  976,  101,  409,  124,  429,   59,  733,  661,  742,  920,  933,  377,  977,
                    966,  334,  433,  279,  799,  233,  407,  979,  730,  678,  281,  538,  938,  765,  715,   64,
                    74,  321,    2,  885,  573,  994,  248,  147,  625,  320,  360,  389,  651,  607,   34,  512,
                    77,   15,  165,  898,  510,  805,  339,  868,  327,  359,  200,   72,  985,  406,  613,  860,
                    640,  714,  647,  125,  826,  500,  503,  986,  704,  309,  485,  849,  179,  107,  305,  887,
                    785,  480,  754,  787,  148,  847,  631,  114,  719,  675,   16,  361,  992,  774,  207,  757,
                    40,  177,  744,  637,  532,  325,  705,  516,  965,  192,  189,  806,  145,  556,  235,  797,
                    892,  326,  146,  626,  867,  769,   99,   35,  555,  978,  893,  758,  586,  447,  767,  668,
                    257,  476,  252,  793,  808,   52,  989,  186,  374,  249,  835,  498,  301,  957,  508,  750,
                    172,  800,  658,  642,  737,  103,  448,  220
            };

    public void avl_insert(View v){

        int n = 1; // SPINNER

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
        n = Integer.parseInt(mySpinner.getSelectedItem().toString());

        AVL<Integer, Integer> avl_tree = new AVL<Integer, Integer>();

        Toast.makeText(this, "AVL insert "+ n +" itens",
                Toast.LENGTH_LONG).show();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < n; i++){
            avl_tree.put(numbers[i], i);
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb_insert(View v){

        int n = 1; // SPINNER

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner2);
        n = Integer.parseInt(mySpinner.getSelectedItem().toString());

        REDBLACK<Integer, Integer> rb_tree = new REDBLACK<Integer, Integer>();

        Toast.makeText(this, "REDBLACK insert with "+ n +" itens",
                Toast.LENGTH_LONG).show();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < n; i++){
            rb_tree.put(numbers[i], i);
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void avl_insert_search_all(View v){

        int n = 1; // SPINNER

        Spinner mySpinner = (Spinner) findViewById(R.id.spinnerb);
        n = Integer.parseInt(mySpinner.getSelectedItem().toString());


        AVL<Integer, Integer> avl_tree = new AVL<Integer, Integer>();

        Toast.makeText(this, "AVL insertion all and search all with "+ n +" itens",
                Toast.LENGTH_LONG).show();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < n; i++){
            avl_tree.put(numbers[i], i);
        }
        for(int i = 0; i < n; i++){
            avl_tree.get(numbers[i]);
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done (" + totalTime + " ms)",
                Toast.LENGTH_LONG).show();
    }


    public void rb_insert_search_all(View v){;

        int n = 1; // SPINNER

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner2b);
        n = Integer.parseInt(mySpinner.getSelectedItem().toString());


        REDBLACK<Integer, Integer> rb_tree = new REDBLACK<Integer, Integer>();

        Toast.makeText(this, "REDBLACK insertion all and search all with "+ n +" itens",
                Toast.LENGTH_LONG).show();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < n; i++){
            rb_tree.put(numbers[i], i);
        }
        for(int i = 0; i < n; i++){
            rb_tree.get(numbers[i]);
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }


    public void avl_insert_search_one(View v){

        int n = 1; // SPINNER

        Spinner mySpinner = (Spinner) findViewById(R.id.spinnerc);
        n = Integer.parseInt(mySpinner.getSelectedItem().toString());


        AVL<Integer, Integer> avl_tree = new AVL<Integer, Integer>();

        Toast.makeText(this, "AVL insert one and search one with "+ n +" itens",
                Toast.LENGTH_LONG).show();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < n; i++){
            avl_tree.put(numbers[i], i);
            avl_tree.get(numbers[i]);
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    public void rb_insert_search_one(View v){

        int n = 1; // SPINNER

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner2c);
        n = Integer.parseInt(mySpinner.getSelectedItem().toString());


        REDBLACK<Integer, Integer> rb_tree = new REDBLACK<Integer, Integer>();

        Toast.makeText(this, "REDBLACK insert one and search one with "+ n +" itens",
                Toast.LENGTH_LONG).show();

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < n; i++){
            rb_tree.put(numbers[i], i);
            rb_tree.get(numbers[i]);
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        Toast.makeText(this, "Done ("+totalTime+" ms)",
                Toast.LENGTH_LONG).show();
    }

    // -------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
