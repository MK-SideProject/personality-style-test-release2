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
 * Use the {@link TripTest6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTest6 extends Fragment {

    private String plan_o;
    private String plan_x;


    public TripTest6() {
        // Required empty public constructor
    }

    public static TripTest6 newInstance(String param1, String param2) {
        TripTest6 fragment = new TripTest6();
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
        View tripTest6 = inflater.inflate(R.layout.fragment_trip_test6, container, false);

        Button tripTest6_an1 = tripTest6.findViewById(R.id.triptest_6_an1);
        Button tripTest6_an2 = tripTest6.findViewById(R.id.triptest_6_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            String alone_o = bundle.getString("alone_o");
            String alone_x = bundle.getString("alone_x");
            String active_o = bundle.getString("active_o");
            String active_x = bundle.getString("active_x");

            plan_o = bundle.getString("plan_o");
            plan_x = bundle.getString("plan_x");

            TripTest7 tripTest7 = new TripTest7();
            Bundle bundleNext = new Bundle();

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            bundleNext.putString("alone_o", alone_o);
            bundleNext.putString("alone_x", alone_x);
            bundleNext.putString("active_o", active_o);
            bundleNext.putString("active_x", active_x);

            tripTest6_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plan_o = "plan_o";

                    bundleNext.putString("plan_o", plan_o);
                    bundleNext.putString("plan_x", plan_x);

                    tripTest7.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest7);
                    transaction.addToBackStack(null).commit();
                }
            });

            tripTest6_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plan_x = "plan_x";

                    bundleNext.putString("plan_o", plan_o);
                    bundleNext.putString("plan_x", plan_x);

                    tripTest7.setArguments(bundleNext);
                    transaction.replace(R.id.triptest_start_fragment, tripTest7);
                    transaction.addToBackStack(null).commit();
                }
            });

        }
        return tripTest6;
    }
}