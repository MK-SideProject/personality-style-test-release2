package com.example.personality_style_test.triptest;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TripTest2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTest2 extends Fragment {

    private String alone_x;
    private String alone_o;


    public TripTest2() {
        // Required empty public constructor
    }

    public static TripTest2 newInstance(String param1, String param2) {
        TripTest2 fragment = new TripTest2();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tripTest2 = inflater.inflate(R.layout.fragment_trip_test2, container, false);

        Button tripTest2_an1 = tripTest2.findViewById(R.id.triptest_2_an1);
        Button tripTest2_an2 = tripTest2.findViewById(R.id.triptest_2_an2);
        Button tripTest2_an3 = tripTest2.findViewById(R.id.triptest_2_an3);

        Bundle bundle = getArguments();

        if (bundle != null) {
            alone_o = bundle.getString("alone_o");
            alone_x = bundle.getString("alone_x");

            TripTest3 tripTest3 = new TripTest3();
            Bundle bundleNext = new Bundle();

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            tripTest2_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("alone_o", alone_o);
                    bundleNext.putString("alone_x", alone_x);

                    tripTest3.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest3);
                    transaction.commit();
                }
            });

            tripTest2_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("alone_o", alone_o);
                    bundleNext.putString("alone_x", alone_x);

                    tripTest3.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest3);
                    transaction.commit();
                }
            });

            tripTest2_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("alone_o", alone_o);
                    bundleNext.putString("alone_x", alone_x);

                    tripTest3.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest3);
                    transaction.commit();
                }
            });
        }
        return tripTest2;
    }
}