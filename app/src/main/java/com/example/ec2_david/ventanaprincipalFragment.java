package com.example.ec2_david;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ventanaprincipalFragment extends Fragment {
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savecInstanceState){
        return inflater.inflate(R.layout.ventanaprincipal_fragment,container,false);
    }
}
