package ru.avalon.java.frames;

import java.awt.*;
import javax.swing.*;
import ru.avalon.java.ui.AbstractFrame;

public class Calculator extends AbstractFrame{

    JButton CE = new JButton("CE");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton point = new JButton(".");
    JButton addition = new JButton("+");
    JButton subtraction = new JButton("-");
    JButton multiplication = new JButton("*");
    JButton division = new JButton("/");
    JButton equally = new JButton("=");

    JLabel result = new JLabel("0");

private JLabel createResultPanel(){
    result.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 35));
    result.setHorizontalAlignment(SwingConstants.RIGHT);
    result.setHorizontalTextPosition(SwingConstants.RIGHT);
    return result;
}

private JPanel createNumLine(Component... components) {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(1, components.length, 5, 5));
    for (Component comp : components) {
        comp.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
        panel.add(comp);
    }
    return panel;
}

private JButton createEquallyPanel(){
    equally.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
    return equally;
}

 @Override
protected void onCreate() {

    setTitle("Calculator");       
    setLayout(new GridLayout(6, 1, 5, 5));           
    setMinimumSize(new Dimension(350,450));
    add(createResultPanel());
    add(createNumLine(button7, button8, button9, addition));
    add(createNumLine(button4, button5, button6, subtraction));
    add(createNumLine(button1, button2, button3, multiplication));
    add(createNumLine(CE, button0, point, division));
    add(createEquallyPanel());
    }  
}
