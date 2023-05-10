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
 * Use the {@link TripTest7#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTest7 extends Fragment {

    public TripTest7() {
        // Required empty public constructor
    }

    public static TripTest7 newInstance() {
        TripTest7 fragment = new TripTest7();
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
        View tripTest7 = inflater.inflate(R.layout.fragment_trip_test7, container, false);

        Button tripTest7_an1 = tripTest7.findViewById(R.id.triptest_7_an1);
        Button tripTest7_an2 = tripTest7.findViewById(R.id.triptest_7_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            String alone_o = bundle.getString("alone_o");
            String alone_x = bundle.getString("alone_x");
            String plan_o = bundle.getString("plan_o");
            String plan_x = bundle.getString("plan_x");
            String active_o = bundle.getString("active_o");
            String active_x = bundle.getString("active_x");

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            // Result
            TripTestResult1Fg tripTestResult1Fg = new TripTestResult1Fg();
            TripTestResult2Fg tripTestResult2Fg = new TripTestResult2Fg();
            TripTestResult3Fg tripTestResult3Fg = new TripTestResult3Fg();
            TripTestResult4Fg tripTestResult4Fg = new TripTestResult4Fg();
            TripTestResult5Fg tripTestResult5Fg = new TripTestResult5Fg();
            TripTestResult6Fg tripTestResult6Fg = new TripTestResult6Fg();
            TripTestResult7Fg tripTestResult7Fg = new TripTestResult7Fg();
            TripTestResult8Fg tripTestResult8Fg = new TripTestResult8Fg();


            tripTest7_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((alone_o != null && alone_o.equals("alone_o")) && (plan_o != null && plan_o.equals("plan_o")) && (active_x != null && active_x.equals("active_x"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult1Fg);
                        transaction.commit();
                    } else if ((alone_o != null && alone_o.equals("alone_o")) && (plan_o != null && plan_o.equals("plan_o")) && (active_o != null && active_o.equals("active_o"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult2Fg);
                        transaction.commit();
                    } else if ((alone_o != null && alone_o.equals("alone_o")) && (plan_x != null && plan_x.equals("plan_x")) && (active_o != null && active_o.equals("active_o"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult3Fg);
                        transaction.commit();

                    } else if ((alone_o != null && alone_o.equals("alone_o")) && (plan_x != null && plan_x.equals("plan_x")) && (active_x != null && active_x.equals("active_x"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult4Fg);
                        transaction.commit();
                    } else if ((alone_x != null && alone_x.equals("alone_x")) && (plan_o != null && plan_o.equals("plan_o")) && (active_o != null && active_o.equals("active_o"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult5Fg);
                        transaction.commit();
                    } else if ((alone_x != null && alone_x.equals("alone_x")) && (plan_x != null && plan_x.equals("plan_x")) && (active_o != null && active_o.equals("active_o"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult6Fg);
                        transaction.commit();
                    } else if ((alone_x != null && alone_x.equals("alone_x")) && (plan_o != null && plan_o.equals("plan_o")) && (active_x != null && active_x.equals("active_x"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult7Fg);
                        transaction.commit();
                    } else {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult8Fg);
                        transaction.commit();
                    }
                }
            });

            tripTest7_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((alone_o != null && alone_o.equals("alone_o")) && (plan_o != null && plan_o.equals("plan_o")) && (active_x != null && active_x.equals("active_x"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult1Fg);
                        transaction.commit();
                    } else if ((alone_o != null && alone_o.equals("alone_o")) && (plan_o != null && plan_o.equals("plan_o")) && (active_o != null && active_o.equals("active_o"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult2Fg);
                        transaction.commit();
                    } else if ((alone_o != null && alone_o.equals("alone_o")) && (plan_x != null && plan_x.equals("plan_x")) && (active_o != null && active_o.equals("active_o"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult3Fg);
                        transaction.commit();

                    } else if ((alone_o != null && alone_o.equals("alone_o")) && (plan_x != null && plan_x.equals("plan_x")) && (active_x != null && active_x.equals("active_x"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult4Fg);
                        transaction.commit();
                    } else if ((alone_x != null && alone_x.equals("alone_x")) && (plan_o != null && plan_o.equals("plan_o")) && (active_o != null && active_o.equals("active_o"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult5Fg);
                        transaction.commit();
                    } else if ((alone_x != null && alone_x.equals("alone_x")) && (plan_x != null && plan_x.equals("plan_x")) && (active_o != null && active_o.equals("active_o"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult6Fg);
                        transaction.commit();
                    } else if ((alone_x != null && alone_x.equals("alone_x")) && (plan_o != null && plan_o.equals("plan_o")) && (active_x != null && active_x.equals("active_x"))) {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult7Fg);
                        transaction.commit();
                    } else {
                        transaction.replace(R.id.triptest_start_fragment, tripTestResult8Fg);
                        transaction.commit();
                    }
                }
            });
        }
        return tripTest7;
    }
}
