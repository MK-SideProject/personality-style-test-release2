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
 * Use the {@link TripTest4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTest4 extends Fragment {

    private String active_o;
    private String active_x;


    public TripTest4() {
        // Required empty public constructor
    }

    public static TripTest4 newInstance(String param1, String param2) {
        TripTest4 fragment = new TripTest4();
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
        View tripTest4 = inflater.inflate(R.layout.fragment_trip_test4, container, false);

        Button tripTest4_an1 = tripTest4.findViewById(R.id.triptest_4_an1);
        Button tripTest4_an2 = tripTest4.findViewById(R.id.triptest_4_an2);
        Button tripTest4_an3 = tripTest4.findViewById(R.id.triptest_4_an3);

        Bundle bundle = getArguments();

        if (bundle != null) {
            String alone_o = bundle.getString("alone_o");
            String alone_x = bundle.getString("alone_x");
            String plan_o = bundle.getString("plan_o");
            String plan_x = bundle.getString("plan_x");
            active_o = "active_o";
            active_x = "active_x";

            TripTest5 tripTest5 = new TripTest5();
            Bundle bundleNext = new Bundle();

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            bundleNext.putString("alone_o", alone_o);
            bundleNext.putString("alone_x", alone_x);
            bundleNext.putString("plan_o", plan_o);
            bundleNext.putString("plan_x", plan_x);

            tripTest4_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("active_o", active_o);

                    tripTest5.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest5);
                    transaction.addToBackStack(null).commit();
                }
            });

            tripTest4_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("active_o", active_o);

                    tripTest5.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest5);
                    transaction.addToBackStack(null).commit();
                }
            });

            tripTest4_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("active_x", active_x);

                    tripTest5.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest5);
                    transaction.addToBackStack(null).commit();
                }
            });
        }
        return tripTest4;
    }
}