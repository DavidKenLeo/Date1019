package com.dkl.auser.date1019;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Button bprv, bnext;
    ImageView imag1;
    TextView showLocation, showData,showLocation2;
    EditText edtShow;
    int imgID[] = {R.drawable.view3, R.drawable.view4, R.drawable.view5};
    String location[] = {"11111111","1122", "222222", "wwwwwww", "wwwwwwww"};
    String location2[] = {"11111111","1122", "222222", "wwwwwww", "wwwwwwww"};
    int DescribeId[] = {R.string.app_article, R.string.app_article2, R.string.app_article3, R.string.app_article4,R.string.app_article};
    String texttimeID[]= {"11-1", "10-1", "12-2", "1-3","4-4"};
   int count = imgID.length;

    int p = 0;


//    Resources res =getResources();
//    String[] city=res.getStringArray(R.array.city);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bprv = (Button) findViewById(R.id.bprv);
        bnext = (Button) findViewById(R.id.bnext);
        showLocation = (TextView) findViewById(R.id.showLocation);
        showLocation2 = (TextView) findViewById(R.id.showLocation2);
        showData = (TextView) findViewById(R.id.showData);
        edtShow = (EditText) findViewById(R.id.editShow);
        imag1 = (ImageView) findViewById(R.id.imag1);

//
        bnext.setOnClickListener(btnprvlistenter);
        bprv.setOnClickListener(btnprvlistenter);

    }
    private Button.OnClickListener btnprvlistenter = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()){
        case  R.id.bprv:
                    p--;
            if (p < 0) {
                p = count - 1;

            }
            imag1.setImageResource(imgID[p]);
            edtShow.setText(DescribeId[p]);
            showLocation.setText(location[p]);
            showData.setText(texttimeID[p]);
            showLocation2.setText(location2[p]);


            Toast toast = Toast.makeText(getApplicationContext(),"你好", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP,100,100);
            toast.show();

                    break;

        case  R.id.bnext:
                    p++;
                if (p == count) {
                    p = 0;

                }
                imag1.setImageResource(imgID[p]);
                edtShow.setText(DescribeId[p]);
                showLocation.setText(location[p]);
                showData.setText(texttimeID[p]);
            showLocation2.setText(location2[p]);

                Toast toast1 = Toast.makeText(getApplicationContext(),"你好", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.BOTTOM,100,100);
                toast1.show();
            break;

        }

            }
        };


//    private Button.OnClickListener btnprvlistenter = new View.OnClickListener() {
//
//
//        @Override
//        public void onClick(View view) {
//            p--;
//            if (p < 0) {
//                p = count - 1;
//
//            }
//            imag1.setImageResource(imgID[p]);
//            edtShow.setText(DescribeId[p]);
//            showLocation.setText(location[p]);
//            showData.setText(texttimeID[p]);
//
//            Toast.makeText(getApplicationContext(),"你好",Toast.LENGTH_SHORT);
//            toast.setGravity(Gravity.TOP,100,100);
//            toast.show();
//
//        }
//
//    private Button.OnClickListener btnnextlistenter = new View.OnClickListener() {
//
//
//    @Override
//    public void onClick(View view) {
//        p++;
//        if (p < 0) {
//            p = count + 1;
//
//        }
//        imag1.setImageResource(imgID[p]);
//        edtShow.setText(DescribeId[p]);
//        showLocation.setText(location[p]);
//        showData.setText(texttimeID[p]);
//
//        Toast toast1 = Toast.makeText(getApplicationContext(), "你好", Toast.LENGTH_SHORT);
//        toast1.setGravity(Gravity.TOP, 100, 100);
//        toast1.show();
//    }
}




