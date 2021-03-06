package com.example.hotel.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hotel.databinding.FragmentTrangchuBinding;

public class trangchuFragment extends Fragment {

    private FragmentTrangchuBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        trangchuViewModel homeViewModel =
                new ViewModelProvider(this).get(trangchuViewModel.class);

        binding = FragmentTrangchuBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome1;

        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}