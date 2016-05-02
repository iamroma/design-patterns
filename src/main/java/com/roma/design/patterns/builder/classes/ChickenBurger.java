package com.roma.design.patterns.builder.classes;

import com.roma.design.patterns.builder.interfaces.Packing;

/**
 * Created by Roma on 5/3/16.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}