package com.atguigu.calendar;

import javax.swing.*;
import java.awt.*;

/**
 * @author shk
 * @create 23:27
 */
public class TopPanel extends JPanel { //面板
    Button btn;
    TextField textYear;
    TextField textMonth;

    public TopPanel(){
        this.setBackground(Color.green);

        //
        Label labelYear = new Label("year:");
        Label labelMonth = new Label("month:");

        TextField textFieldYear = new TextField(4);
        TextField textFieldMonth = new TextField(4);
        textYear = textFieldYear;
        textMonth = textFieldMonth;
        Button btn = new Button("confirm");
        this.btn = btn;

        this.add(labelYear);
        this.add(textFieldYear);
        this.add(labelMonth);
        this.add(textFieldMonth);
        this.add(btn);

    }
}
