package com.javaFundamentalsDemo;

import java.util.HashMap;
import java.util.Map;

public class ModelFactory {

  private Model model;

  public enum ModelType {
    ASTROMECH, PROTOCOL, BATTLE
  }

  public static Model getModel(ModelType modelName) {
    return modelMap.get(modelName);
  }
    private static Map<String, Model> modelMap =  new HashMap<>();

    static
    {
      modelMap.put("Astromech", new Model("Astromech", "Starship Repair/Support"));
      modelMap.put("Protocol", new Model("Protocol", "Bounty Hunting"));
      modelMap.put("Battle" ,new Model("Battle", "Battle"));
    }
}
