package com.javaFundamentalsDemo;

import java.util.List;
import java.util.Optional;

public class BattleDroid extends DroidFactory{
    public BattleDroid(String serialNumber, Model model, List<Tool> tools) {
        super(serialNumber, model, tools);
    }

    public void defend() {
        shootEnemy();
    }

    public void shootEnemy() {
        Optional<Tool> rifleOptional = tools.stream().filter(tool -> tool.getToolType().equals(Tool.ToolType.RIFLE) && tool.getDurability() >= 1).findFirst();
        if(rifleOptional.isPresent()){
            Tool rifle = rifleOptional.get();
            System.out.println("Enemy Shot");
            rifle.useTool();
            if(rifle.getDurability() == 0){
                tools.remove(rifle);
            }
        } else {
            System.out.println("There's too many of them, I'm out!");
        }
    }
}
