package com.javaFundamentalsDemo;

import java.util.List;

public class ProtocolDroid extends DroidFactory{
    public ProtocolDroid(String serialNumber, Model model, List<Tool> tools) {
        super(serialNumber, model, tools);
    }

    protected void speak (){
        System.out.println("I don't speak");
    }
}
