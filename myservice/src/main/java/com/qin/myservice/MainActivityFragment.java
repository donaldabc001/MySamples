package com.qin.myservice;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button startService;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        startService = view.findViewById(R.id.button);
        startService.setOnClickListener(startServiceClick);
        return view;
    }

    private View.OnClickListener startServiceClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), MyService.class);
            getActivity().startService(intent);
        }
    };
}
