package com.quizapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.quizapp.R;
import com.quizapp.modelClass.QuestionClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView counter, timer, queName;
    Button opt1, opt2, opt3, opt4;
    int count;

    ArrayList<QuestionClass> queList = new ArrayList<>();
    CountDownTimer tn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = findViewById(R.id.counter);
        timer = findViewById(R.id.timer);
        queName = findViewById(R.id.qname);

        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);

        //load data
        queList.add(new QuestionClass("Which country has been known to have the happiest citizens in the world?", "Myanmar", "Malaysia", "Finland", "Greenland", "Finland"));
        queList.add(new QuestionClass("Who was the first human to leave the Earth's atmosphere?", "Neil Armstrong", "Yuri Gagarin", "Edwin 'Buzz' Aldrin ", "Gherman Titov", "Yuri Gagarin"));
        queList.add(new QuestionClass("How many states does Malaysia have?", "10", "9", "13", "14", "14"));
        queList.add(new QuestionClass("Which country is Kathmandu the capital of?", "Scotland", "Yemen", "Laos", "Nepal", "Nepal"));
        queList.add(new QuestionClass("What is the name of the current president of India?", "Narendra Modi", "Salman Khan", "Dawood Ibrahim", "Ram Nath Kovind", "Ram Nath Kovind"));
        queList.add(new QuestionClass("How long does the moon take to complete a revolution around the Earth?", "27 days", "15 days", "32 days", "63 days", "27 days"));
        queList.add(new QuestionClass("What is the current population of humans on Earth?", "8 Billion", "7.9 Billion", "7.8 Billion", "7.7 Billion", "7.9 Billion"));
        queList.add(new QuestionClass("What was the bomb dropped on Hiroshima in 1945 nicknamed?", "Little Pump", "Little Boy", "Big Boy", "Small Girl?", "Little Boy"));
        queList.add(new QuestionClass("Who let the dogs out?", "Who?", "Baha Men", "N.W.A", "I don't have a dog", "Baha Men"));
        queList.add(new QuestionClass("Where does the President of the United States of America reside?", "The Kremlin", "Goa", "The White House", "MIU", "The White House"));

        count = 0;
        loadQuestions(count);

        timer.setText("12");
        tn = new CountDownTimer(12 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("" + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Time Out!", Toast.LENGTH_SHORT).show();
            }
        };
    }
    public void loadQuestions(int n){
        QuestionClass q = queList.get(n);

        counter.setText((n+1) + "/" + queList.size());
        queName.setText("#" + (n+1) + " " + q.getQue());
        opt1.setText("" + q.getOp1());
        opt2.setText("" + q.getOp2());
        opt3.setText("" + q.getOp3());
        opt4.setText("" + q.getOp4());

        timer.setText(""+ 12);

        if(tn!=null){
            tn.start();
        }

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt1.getText().equals(q.getCorrectOp())){
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if(count < (queList.size()-1)){
                        tn.cancel();
                        count++;
                        loadQuestions(count);
                    }else{
                        Toast.makeText(MainActivity.this, "All Questions completed!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt2.getText().equals(q.getCorrectOp())){
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if(count < (queList.size()-1)){
                        tn.cancel();
                        count++;
                        loadQuestions(count);
                    }else{
                        Toast.makeText(MainActivity.this, "All Questions completed!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt3.getText().equals(q.getCorrectOp())){
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if(count < (queList.size()-1)){
                        tn.cancel();
                        count++;
                        loadQuestions(count);
                    }else{
                        Toast.makeText(MainActivity.this, "All Questions completed!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt4.getText().equals(q.getCorrectOp())){
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    if(count < (queList.size()-1)){
                        tn.cancel();
                        count++;
                        loadQuestions(count);
                    }else{
                        Toast.makeText(MainActivity.this, "All Questions completed!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}