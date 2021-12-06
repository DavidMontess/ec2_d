package com.example.ec2_david;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

public class pagina1Fragment extends Fragment {
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedIntancestate)
    {
        View view=inflater.inflate(R.layout.ventana1_fragment,container, false);
        MaterialButton nextbutton=view.findViewById(R.id.nextpage_button);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((NavigationHost)getActivity()).navigationTo(new ventanaprincipalFragment(),false);

            }
        });
        return view;
    }

}
