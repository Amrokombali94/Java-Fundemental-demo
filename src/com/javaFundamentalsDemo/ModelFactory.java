package com.javaFundamentalsDemo;

import java.util.HashMap;
import java.util.Map;

public class ModelFactory {

    static Model model = new Model();
    private static Map<Model> map;

    static
    {
        map = new HashMap<Model>();
    }
}
