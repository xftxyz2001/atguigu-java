package com.atguigu06.project.team.domain;

/**
 * ClassName: PC
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:24
 * @Version 1.0
 */
public class PC implements Equipment{
    private String model;//机器的型号
    private String display;//显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
