package com.example.ec2_david;
import androidx.fragment.app.Fragment;

/*
* cree un host que muestre con los fragmentos
* eventos de navegacion
* */
public interface NavigationHost {

    void navigationTo(Fragment fragment, boolean addToBackstack);
}
