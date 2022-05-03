package com.javaFundamentalsDemo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DroidFactory {
    private final String serialNumber;

    private final Model model;


 protected final List<Tool> tools;


    public List<Tool> getTools() {
        return tools;
    }



    public DroidFactory(String serialNumber, Model model, List<Tool> tools){
        this.serialNumber = serialNumber;
        this.model = model;
        this.tools = tools.stream().map(Tool::new).collect(Collectors.toList());
    }

    public String speak (String serialNumber){
        return serialNumber + " is speaking now.";
    }

    public String getSerialNumber() {
        return serialNumber;
    }



    public void repairStarship(){
        Optional<Tool> repairToolOptional = tools.stream().filter(tool -> tool.getToolType().equals(Tool.ToolType.STARSHIP_REPAIR) && tool.getDurability() >= 1).findFirst();
        if(repairToolOptional.isPresent()){
            Tool repairTool = repairToolOptional.get();
            repairTool.useTool();
            System.out.println("Starship Repaired");
            if(repairTool.getDurability() == 0){
                System.out.println("tool broke");
                tools.remove(repairTool);
            }
        } else {
            System.out.println("No tool available, starship still needs repairs.");
        }
    }


    @Override
    public String toString() {
        return "Droid{" +
                "serialNumber='" + serialNumber + '\''+
                '}';
    }
}
