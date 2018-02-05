package com.l2kdeveloper.fragmentdatapassing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.EditText;

import com.l2kdeveloper.fragmentdatapassing.Event_bus.Event_bus_msg_passing;

import org.greenrobot.eventbus.EventBus;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    private boolean is_data_passing=false;//when it is true then data will pass to next fragment using eventbus
    public FragmentA() {
        // Required empty public constructor
    }

    private EditText editText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view=inflater.inflate(R.layout.fragment_a, container, false);
        editText=view.findViewById(R.id.edit_text);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser){
            is_data_passing=true;
        }
        else {
            if (is_data_passing)
            {
               //when fragment is not visible to user then we pass the data
                EventBus.getDefault().post(new Event_bus_msg_passing(editText.getText().toString()));

            }
        }
    }
}
