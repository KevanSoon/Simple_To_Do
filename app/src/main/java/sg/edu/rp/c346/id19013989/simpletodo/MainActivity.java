package sg.edu.rp.c346.id19013989.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etTask;
    Button btnAdd;
    Button btnClear;
    ListView lvTask;

    ArrayList<String> alTask;
    ArrayAdapter<String> aaTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTask = findViewById(R.id.editTextAddTask);
        btnAdd = findViewById(R.id.buttonAdd);
        btnClear = findViewById(R.id.buttonClear);
        lvTask = findViewById(R.id.ListViewTasks);

        alTask = new ArrayList<>();

        aaTask = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alTask);
        lvTask.setAdapter(aaTask);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String new_task = etTask.getText().toString();
                alTask.add(new_task);

                aaTask.notifyDataSetChanged();



                etTask.setText(null);




            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alTask.clear();

                aaTask.notifyDataSetChanged();









            }
        });


    }
}
