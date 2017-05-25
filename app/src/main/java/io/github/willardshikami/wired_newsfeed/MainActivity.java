package io.github.willardshikami.wired_newsfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReadRss readRss = new ReadRss(this);
        readRss.execute();
    }
}
            