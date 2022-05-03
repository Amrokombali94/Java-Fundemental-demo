package com.javaFundamentalsDemo;

public class Tool {

    private ToolType toolType;
    private int durability;

    public Tool(ToolType toolType) {
        this.toolType = toolType;
        this.durability = 3;
    }

    public Tool(Tool tool) {
        this.toolType = tool.getToolType();
        this.durability =  tool.getDurability();
    }

    public ToolType getToolType() {
        return toolType;
    }



    public int getDurability() {
        return durability;
    }

    public void useTool(){
        --durability;
        if(durability == 0) {
            System.out.println("tool is out");
        }
    }



    @Override
    public String toString() {
        return "Tool{" +
                "toolType=" + toolType +
                ", durability=" + durability +
                '}';
    }

    public enum ToolType {
        STARSHIP_REPAIR, RIFLE
    }
}
