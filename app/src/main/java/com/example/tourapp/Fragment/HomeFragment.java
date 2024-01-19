package com.example.tourapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourapp.DetailActivity;
import com.example.tourapp.R;
import com.makeramen.roundedimageview.RoundedImageView;


public class HomeFragment extends Fragment {
    View view;
    RoundedImageView pc1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_home, container, false);

        pc1 = view.findViewById(R.id.pc1);
        pc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getActivity(), DetailActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}