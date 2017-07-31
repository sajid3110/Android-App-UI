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
                "IFB 8888 Eco" ,
                "IFB 8889 Eco" ,
                "IFB 8890 Eco" ,
                "IFB 8891 Eco" ,
                "IFB 8892 Eco" ,
                "IFB 8893 Eco" ,
                "IFB 8894 Eco" ,
                "IFB 8895 Eco" ,
                "IFB 8896 Eco" ,
                "IFB 8897 Eco" ,
                "IFB 8898 Eco" ,


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