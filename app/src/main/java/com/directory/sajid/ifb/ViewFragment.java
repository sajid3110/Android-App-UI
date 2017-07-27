package com.directory.sajid.ifb;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewFragment extends Fragment {


    ListView listview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view, container, false);

        String[] myList = new String[]{
                "item 1" ,
                "item 2" ,
                "item 3" ,
                "item 4" ,
                "item 5" ,
                "item 6" ,
                "item 7" ,
                "item 8" ,
                "item 9" ,
                "item 10" ,
                "item 11" ,
                "item 12" ,
                "item 13" ,
                "item 14" ,
        };


        listview = rootView.findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(
                getActivity(),
                android.R.layout.simple_list_item_1,
                myList);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity() , DetailsActivity.class);
                intent.putExtra("listItem" , listview.getItemAtPosition(i).toString() );
                startActivity(intent);
            }
        });

        return rootView;
    }


}