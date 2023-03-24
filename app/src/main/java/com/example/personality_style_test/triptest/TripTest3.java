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
 * Use the {@link TripTest3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTest3 extends Fragment {

    private String alone_x;
    private String alone_o;
    private String plan_o;

    public TripTest3() {
        // Required empty public constructor
    }

    public static TripTest3 newInstance(String param1, String param2) {
        TripTest3 fragment = new TripTest3();
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
        View tripTest3 = inflater.inflate(R.layout.fragment_trip_test3, container, false);

        Button tripTest3_an1 = tripTest3.findViewById(R.id.triptest_3_an1);
        Button tripTest3_an2 = tripTest3.findViewById(R.id.triptest_3_an2);
        Button tripTest3_an3 = tripTest3.findViewById(R.id.triptest_3_an3);

        Bundle bundle = getArguments();

        if (bundle != null) {
            alone_o = bundle.getString("alone_o");
            alone_x = bundle.getString("alone_x");
            plan_o = "plan_o";

            TripTest4 tripTest4 = new TripTest4();
            Bundle bundleNext = new Bundle();

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            tripTest3_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("alone_o", alone_o);
                    bundleNext.putString("alone_x", alone_x);
                    bundleNext.putString("plan_o", plan_o);

                    tripTest4.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest4);
                    transaction.addToBackStack(null).commit();
                }
            });

            tripTest3_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("alone_o", alone_o);
                    bundleNext.putString("alone_x", alone_x);
                    bundleNext.putString("plan_o", plan_o);

                    tripTest4.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest4);
                    transaction.addToBackStack(null).commit();
                }
            });

            tripTest3_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String plan_x = "plan_x";
                    bundleNext.putString("alone_o", alone_o);
                    bundleNext.putString("alone_x", alone_x);
                    bundleNext.putString("plan_x", plan_x);

                    tripTest4.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest4);
                    transaction.addToBackStack(null).commit();
                }
            });
        }
        return tripTest3;
    }
}