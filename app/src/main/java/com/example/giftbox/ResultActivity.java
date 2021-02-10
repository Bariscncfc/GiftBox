package com.example.giftbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ResultActivity extends AppCompatActivity {

    ImageView img;
    TextView name;
    TextView price;
    Button home;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        try {
            img = (ImageView)findViewById(R.id.result_image);
            name = (TextView)findViewById(R.id.result_name);
            price= (TextView)findViewById(R.id.result_price);
            ImageButton amazon = (ImageButton) findViewById(R.id.amazon_btn);





            Intent i = getIntent();
            String[] checkList = i.getStringArrayExtra("checkArrayList");
            String hediye = "";

                if(checkList[1].equals("1") && checkList[3].equals("1") && checkList[4].equals("1") ){
                    Resources res = getResources(); /** from an Activity */
                    img.setImageDrawable(res.getDrawable(R.drawable.hollywod));
                    name.setText("Hollywood Baskılı T-shırt");
                    price.setText("50 TL");

                    ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            intent.addCategory(Intent.CATEGORY_BROWSABLE);
                            intent.setData(Uri.parse("https://www.amazon.com/Hollywood-T-Shirt-Straight-Outta-Shirt/dp/B07N4CWY8Y?customId=B0752XJYNL&th=1"));
                            startActivity(intent);
                        }
                    });

                }
            if(checkList[0].equals("3") && checkList[1].equals("2") && checkList[4].equals("1") ){
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.batman));
                name.setText("Batman Notebook Etiket ");
                price.setText("35 TL");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/DekorLoft-Batman-Notebook-Etiket-NS-6198/dp/B07DQHF8N1"));
                        startActivity(intent);
                    }
                });

            }
            if(checkList[1].equals("2") && checkList[2].equals("1") && checkList[4].equals("2") ){
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.basketbol));
                name.setText("Basketbol Pota ");
                price.setText("Bilinmiyor");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/Unbekannt-oltas%C4%B1-Basket-potas%C4%B1-Basketballring/dp/B007900J0K"));
                        startActivity(intent);
                    }
                });


            }

            if(checkList[0].equals("2") && checkList[1].equals("2") && checkList[4].equals("1") ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.spiderman));
                name.setText("Spiderman Figür Oyuncak ");
                price.setText("100 TL");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/NECA-Classic-Knocker-Extreme-Spiderman/dp/B00EALQLPS"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("1") && checkList[2].equals("2") && checkList[3].equals("3") && checkList[4].equals("2") ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.roma));
                name.setText("Roma Baskılı T-shirt ");
                price.setText("300 TL");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com/Giallorossi-Football-Soccer-T-Shirt-Medium/dp/B01A3IUPTO"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("2") &&  checkList[3].equals("2") && checkList[4].equals("3") ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.roma));
                name.setText("Gitar ");
                price.setText("119$");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com/Ashthorpe-Full-Size-Cutaway-Thinline-Acoustic-Electric/dp/B07FDHDP8H"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("2") &&  checkList[3].equals("2") && checkList[4].equals("3") ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.roma));
                name.setText("Gitar ");
                price.setText("119$");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com/Ashthorpe-Full-Size-Cutaway-Thinline-Acoustic-Electric/dp/B07FDHDP8H"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("3") &&   checkList[4].equals("3") ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.airpod));
                name.setText("Airpod Kulaklık");
                price.setText("119$");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/HUAWEI-55030899-Huawei-Kablosuz-Kulakl%C4%B1k/dp/B07TTPV185"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("2") &&   checkList[2].equals("3") && checkList[4].equals("2") ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.swim));
                name.setText("Maske Dalış Seti");
                price.setText("239 TL");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/Bermuda-Profesyonel-Silikon-Maske-Snorkel/dp/B07TQSMTH5"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("1") &&   checkList[2].equals("2") && checkList[3].equals("3") && checkList[4].equals("2")) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.juve));
                name.setText("Juventus Ronaldo Forması");
                price.setText("20 $");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com/Juventus-F-C-Cristiano-Ronaldo-Black/dp/B07RN999HK"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[0].equals("1") && checkList[1].equals("1") && checkList[3].equals("1") && checkList[4].equals("1")) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.tshirt));
                name.setText("Superman T-shirt");
                price.setText("20 $");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com/DC-Comics-Superman-Classic-T-shirt/dp/B00C04DOSO"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("2") && checkList[3].equals("1") && checkList[4].equals("2") ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.amerikantopu));
                name.setText("Amerikan Futbol Topu");
                price.setText("178 TL");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/NFL-American-Football-Resmi-Boyut/dp/B0795G9YFS"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("2") && checkList[3].equals("3")  ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.kupa));
                name.setText("İtalya Temalı Kupa");
                price.setText("7$");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/Kahve-bardak-ROM-Motif-foto%C4%9Fraflar-hediyelik/dp/B077NDZC6M"));
                        startActivity(intent);
                    }
                });
            }
            if(checkList[1].equals("2") && checkList[2].equals("2")  && checkList[4].equals("2") ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.langrtt));
                name.setText("Langırt");
                price.setText("40$");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/Team-Power-Lang%C4%B1rt-Seti-Toplu/dp/B081SZ1Q2C"));
                        startActivity(intent);
                    }
                });

            }
            if(checkList[2].equals("3")  ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.langrtt));
                name.setText("Bluetooth Hoparlör");
                price.setText("228 TL");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/Jblgo2Yel-Ta%C5%9F%C4%B1nabilir-Bluetooth-Hoparl%C3%B6r-Sar%C4%B1/dp/B07B8QPQ8V/ref=sr_1_3?__mk_tr_TR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=haporl%C3%B6r&qid=1608628476&sr=8-3"));
                        startActivity(intent);
                    }
                });

            }
            if(checkList[3].equals("2")  ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.ktap));
                name.setText("İspanya Tarihi Kitap");
                price.setText("26 TL");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/%C4%B0spanya-Fa%C5%9Fizmden-Demokrasiye-Ra%C5%9Fit-Kaya/dp/6053144061/ref=sr_1_1?__mk_tr_TR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=%C4%B0SPANYA&qid=1608628664&sr=8-1"));
                        startActivity(intent);
                    }
                });

            }
            if(checkList[0].equals("2") && checkList[1].equals("1")  ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.spider));
                name.setText("Spiderman Baskılı T-shirt");
                price.setText("17$");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com/Spiderman-Distressed-Print-Logo-T-Shirt/dp/B07KQPKDMP"));
                        startActivity(intent);
                    }
                });

            }
            if(checkList[0].equals("2") && checkList[1].equals("1")  ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.spider));
                name.setText("Spiderman Baskılı T-shirt");
                price.setText("17$");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com/Spiderman-Distressed-Print-Logo-T-Shirt/dp/B07KQPKDMP"));
                        startActivity(intent);
                    }
                });

            }
            if(checkList[1].equals("2") || checkList[3].equals("1")  ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.lego));
                name.setText("Lego Town City");
                price.setText("329 $");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com/LEGO-60097-City-Square/dp/B00SDTYXVM"));
                        startActivity(intent);
                    }
                });

            }
            if(checkList[1].equals("2") || checkList[3].equals("3")  ) {
                Resources res = getResources(); /** from an Activity */
                img.setImageDrawable(res.getDrawable(R.drawable.pissa));
                name.setText("3D PİSA Kulesi Maket");
                price.setText("109,50 TL");

                ImageButton btn = (ImageButton) findViewById(R.id.amazon_btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.amazon.com.tr/Cubic-Par%C3%A7a-Puzzle-Pisa-Kulesi/dp/B007EM9W5Q"));
                        startActivity(intent);
                    }
                });

            }

        }
        catch (Exception ex){
            System.out.println("Error : " + ex.getMessage());
        }


    }
}