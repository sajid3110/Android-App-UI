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

import java.util.ArrayList;

public class ViewFragment extends Fragment {


    ListView listview ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view, container, false);
        listview = rootView.findViewById(R.id.listView);
        ArrayList<Product> productList = new ArrayList<>();
        //create product objects
        Product p = new Product("IFB ECO 8879" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8880 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8881 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8882 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8883 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8884 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8885 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8886 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8887 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8888 ECO" , "07 : 10 : 00");
        productList.add(p);
         p = new Product("IFB 8889 ECO" , "07 : 10 : 00");
        productList.add(p);

        ProductListAdapter adapter = new ProductListAdapter(getContext(), R.layout.adapter_view_layout , productList);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product clickedObj = (Product)adapterView.getItemAtPosition(i);
                Intent intent = new Intent(getActivity() , DetailsActivity.class);
                intent.putExtra("listItem" , clickedObj.getModel_no() );
                startActivity(intent);
            }
        });

        return rootView;
    }


}