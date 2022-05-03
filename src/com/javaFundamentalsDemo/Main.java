package com.javaFundamentalsDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Model model = ModelFactory.getModel(ModelFactory.ModelType.ASTROMECH);

        List<Tool> tools = new ArrayList<>();
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));
        tools.add(new Tool(Tool.ToolType.STARSHIP_REPAIR));

        AstromechDroid droid = new AstromechDroid("R2D2", model, tools);


        System.out.println(droid);
        System.out.println(droid.speak("R2D2"));
    }
}
