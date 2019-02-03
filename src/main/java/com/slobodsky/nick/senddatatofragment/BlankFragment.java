package com.slobodsky.nick.senddatatofragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "argText";

    private static final String ARG_PARAM2 = "argNumber";

    private String text;

    private int number;

    private OnFragmentInteractionListener mListener;

    public BlankFragment() {

    }



    public static BlankFragment newInstance(String text, int number) {

        BlankFragment fragment = new BlankFragment();

        Bundle args = new Bundle();

        args.putString(ARG_PARAM1, text);

        args.putInt(ARG_PARAM2, number);

        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;

        v = inflater.inflate(R.layout.fragment_blank, container, false);

        TextView textView = v.findViewById(R.id.text_view_fragment);

        if (getArguments() != null) {

            text = getArguments().getString(ARG_PARAM1);

            number = getArguments().getInt(ARG_PARAM2);
        }

        textView.setText(text + number);

        return v;
    }


    public void onButtonPressed(Uri uri) {

        if (mListener != null) {

            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        if (context instanceof OnFragmentInteractionListener) {

            mListener = (OnFragmentInteractionListener) context;

        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {

        super.onDetach();

        mListener = null;
    }

    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(Uri uri);
    }
}
