package com.example.ejerciciobottomnavigation.ui.dam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ejerciciobottomnavigation.databinding.FragmentDamBinding;
import com.example.ejerciciobottomnavigation.ui.dam.DamViewModel;

public class DamFragment extends Fragment {

    private FragmentDamBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DamViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DamViewModel.class);

        binding = FragmentDamBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvDam;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}