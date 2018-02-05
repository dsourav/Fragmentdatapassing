package com.l2kdeveloper.fragmentdatapassing;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.l2kdeveloper.fragmentdatapassing.Event_bus.Event_bus_msg_passing;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {


    public FragmentB() {
        // Required empty public constructor
    }

    private TextView textView;
    String msg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_b, container, false);
        textView=view.findViewById(R.id.textview);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe
    public void onEvent(Event_bus_msg_passing message){

        msg=message.getValue();
        textView.setText("fragment 1 is saying "+msg);
        Toast.makeText(getContext(), ""+msg, Toast.LENGTH_SHORT).show();

    }
}
