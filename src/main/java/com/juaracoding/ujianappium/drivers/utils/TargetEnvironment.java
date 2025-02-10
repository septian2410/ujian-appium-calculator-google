package com.juaracoding.ujianappium.drivers.utils;

public class TargetEnvironment {
    public static final String ECOMMERCE = "ecommerce";
    public static final String GOOGLE_CALCULATOR = "google-calculator";

    // prevent instance
    private TargetEnvironment() {
        throw new UnsupportedOperationException("Class ini hanya boleh mengakses konstanta");
    }

}
