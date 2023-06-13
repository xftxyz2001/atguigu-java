package com.atguigu06.project.team.domain;

/**
 * ClassName: NoteBook
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:26
 * @Version 1.0
 */
public class NoteBook implements Equipment{

    private String model;//机器的型号
    private double price;//价格

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
