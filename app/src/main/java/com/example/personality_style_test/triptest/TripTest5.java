package com.example.personality_style_test.triptest;

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
 * Use the {@link TripTest5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTest5 extends Fragment {

    private String active_o;
    private String active_x;


    public TripTest5() {
        // Required empty public constructor
    }

    public static TripTest5 newInstance(String param1, String param2) {
        TripTest5 fragment = new TripTest5();
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
        View tripTest5 = inflater.inflate(R.layout.fragment_trip_test5, container, false);

        Button tripTest5_an1 = tripTest5.findViewById(R.id.triptest_5_an1);
        Button tripTest5_an2 = tripTest5.findViewById(R.id.triptest_5_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            String alone_o = bundle.getString("alone_o");
            String alone_x = bundle.getString("alone_x");
            String plan_o = bundle.getString("plan_o");
            String plan_x = bundle.getString("plan_x");
            String active_o = bundle.getString("active_o");
            String active_x = bundle.getString("active_x");

            TripTest6 tripTest6 = new TripTest6();
            Bundle bundleNext = new Bundle();

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            bundleNext.putString("alone_o", alone_o);
            bundleNext.putString("alone_x", alone_x);
            bundleNext.putString("plan_o", plan_o);
            bundleNext.putString("plan_x", plan_x);
            bundleNext.putString("active_o", active_o);
            bundleNext.putString("active_x", active_x);

            tripTest5_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    tripTest6.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest6);
                    transaction.commit();
                }
            });

            tripTest5_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    tripTest6.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest6);
                    transaction.commit();
                }
            });

        }
        return tripTest5;
    }
}