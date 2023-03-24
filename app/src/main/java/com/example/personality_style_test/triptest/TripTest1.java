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
 * Use the {@link TripTest1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTest1 extends Fragment {

    public TripTest1() {
        // Required empty public constructor
    }

    public static TripTest1 newInstance() {
        TripTest1 fragment = new TripTest1();
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
        View tripTest1 = inflater.inflate(R.layout.fragment_trip_test1, container, false);
        Button tripTest1_an1 = tripTest1.findViewById(R.id.triptest_1_an1);
        Button tripTest1_an2 = tripTest1.findViewById(R.id.triptest_1_an2);
        Button tripTest1_an3 = tripTest1.findViewById(R.id.triptest_1_an3);

        TripTest2 tripTest2 = new TripTest2();
        Bundle bundle = new Bundle();

        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        tripTest1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alone_x = "alone_x";

                bundle.putString("alone_x", alone_x);
                tripTest2.setArguments(bundle);

                transaction.replace(R.id.triptest_start_fragment, tripTest2);
                transaction.addToBackStack(null).commit();
            }
        });

        tripTest1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alone_x = "alone_x";

                bundle.putString("alone_x", alone_x);
                tripTest2.setArguments(bundle);

                transaction.replace(R.id.triptest_start_fragment, tripTest2);
                transaction.addToBackStack(null).commit();
            }
        });

        tripTest1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String alone_o = "alone_o";

                bundle.putString("alone_o", alone_o);
                tripTest2.setArguments(bundle);

                transaction.replace(R.id.triptest_start_fragment, tripTest2);
                transaction.addToBackStack(null).commit();
            }
        });
        return tripTest1;
    }
}