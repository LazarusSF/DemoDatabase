package com.sf.lazarus.demodatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    MyDatabaseHelper myDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextTask);
        textView = (TextView) findViewById(R.id.textViewDisplay);
        myDatabaseHelper = new MyDatabaseHelper(this,null,null,1);
        printDB();
    }

    public void addButtonClicked(View view){
        Tasks tasks = new Tasks(editText.getText().toString());
        myDatabaseHelper.addTasks(tasks);
        printDB();
        editText.setText("");
    }
    public void removeButtonClicked(View view){
        String input = editText.getText().toString();
        myDatabaseHelper.removeTasks(input);
        printDB();
        editText.setText("");
    }
    public void printDB(){
        String dbString = myDatabaseHelper.databasetostring();
        textView.setText(dbString);
    }
}
