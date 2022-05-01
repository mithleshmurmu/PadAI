package com.example.padai.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.padai.Activity11;
import com.example.padai.Activity12;
import com.example.padai.Activity13;
import com.example.padai.Activity14;
import com.example.padai.Activity15;
import com.example.padai.Activity16;
import com.example.padai.R;
import com.example.padai.databinding.FragmentGalleryBinding;

import java.util.zip.Inflater;

public class GalleryFragment extends Fragment implements View.OnClickListener{

    private FragmentGalleryBinding binding;

    Button b1,b2,b3,b4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);*/

        /* binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();*/

        /*final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);*/



        View v = inflater.inflate(R.layout.fragment_gallery,container,false);

        b1 = v.findViewById(R.id.button1);
        b2 = v.findViewById(R.id.button2);
        b3 = v.findViewById(R.id.button3);
        b4 = v.findViewById(R.id.button4);

        b2.setOnClickListener((View.OnClickListener) this);
        b3.setOnClickListener((View.OnClickListener) this);
        b4.setOnClickListener((View.OnClickListener) this);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Activity13.class);
                startActivity(intent);
            }
        });

        return  v;
        //return root;


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button2:
                Intent intent1 = new Intent(getActivity(), Activity14.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(getActivity(), Activity15.class);
                startActivity(intent2);
                break;
            case R.id.button4:
                Intent intent3 = new Intent(getActivity(), Activity16.class);
                startActivity(intent3);
                break;
        }
    }
   /* @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        b1 = view.findViewById(R.id.button1);
        b2 = view.findViewById(R.id.button2);
        b3 = view.findViewById(R.id.button3);
        b4 = view.findViewById(R.id.button4);

        b1.setOnClickListener((View.OnClickListener) this);
        b2.setOnClickListener((View.OnClickListener) this);
        b3.setOnClickListener((View.OnClickListener) this);
        b4.setOnClickListener((View.OnClickListener) this);

    }*/

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}