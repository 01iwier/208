package com.example.a208.ui.groupchat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a208.databinding.FragmentGroupchatBinding;
import com.example.a208.ui.groupchat.GroupchatViewModel;

public class GroupchatFragment extends Fragment {

    private FragmentGroupchatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GroupchatViewModel groupchatViewModel =
                new ViewModelProvider(this).get(GroupchatViewModel.class);

        binding = FragmentGroupchatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGroupchat;
        groupchatViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}