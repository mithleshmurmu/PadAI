package com.example.padai.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.padai.Activity10;
import com.example.padai.Activity11;
import com.example.padai.Activity12;
import com.example.padai.Activity9;
import com.example.padai.R;
import com.example.padai.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private FragmentHomeBinding binding;

    Button b5,b6,b7,b8;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;*/

        View v = inflater.inflate(R.layout.fragment_home,container,false);

        b5 = v.findViewById(R.id.button5);
        b6 = v.findViewById(R.id.button6);
        b7 = v.findViewById(R.id.button7);
        b8 = v.findViewById(R.id.button8);

        b5.setOnClickListener((View.OnClickListener) this);
        b6.setOnClickListener((View.OnClickListener) this);
        b7.setOnClickListener((View.OnClickListener) this);
        b8.setOnClickListener((View.OnClickListener) this);

        return  v;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button5:
                Intent intent5 = new Intent(getActivity(), Activity12.class);
                startActivity(intent5);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(getActivity(), Activity11.class);
                startActivity(intent6);
                break;
            case R.id.button7:
                Intent intent7 = new Intent(getActivity(), Activity10.class);
                startActivity(intent7);
                break;
            case R.id.button8:
                Intent intent8 = new Intent(getActivity(), Activity9.class);
                startActivity(intent8);
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}