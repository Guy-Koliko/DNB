package com.example.dnb.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.dnb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LevelThreeHundredFragment extends Fragment {


    public LevelThreeHundredFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //=======================================================//
        // this part creates new fragment files to be added     //
        //=====================================================//
        View dnbRoot;

        dnbRoot = inflater.inflate(R.layout.dnb_time_table_screen,container,false);

        return dnbRoot;
    }

}
