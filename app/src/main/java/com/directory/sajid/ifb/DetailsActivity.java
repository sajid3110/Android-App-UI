package com.directory.sajid.ifb;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.width;
import static com.directory.sajid.ifb.R.attr.height;

public class DetailsActivity extends AppCompatActivity {

    TextView textView;
    LinearLayout linearLayout;
    ListView listView;
    ArrayList<String> selectedItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textView = (TextView) findViewById(R.id.textView1);
        Bundle bundle = getIntent().getExtras();
        textView.setText(bundle.getString("listItem"));


        linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
        listView = (ListView) findViewById(R.id.list);

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        String[] items = {"Part 1" , "Part 2", "Part 3", "Part 4", "Part 5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_multiple_choice , items  );
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(DetailsActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });




        Button b = new Button(DetailsActivity.this);
        b.setText("Update");
        b.setBackgroundResource(R.drawable.buttonshape);
        b.setTextColor(Color.WHITE);
        linearLayout.addView(b);

    }
}
