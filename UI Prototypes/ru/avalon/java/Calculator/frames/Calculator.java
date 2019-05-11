package ru.avalon.java.Calculator.frames;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import ru.avalon.java.ui.AbstractFrame;

public class Calculator extends AbstractFrame{

    private JButton CE = new JButton("CE");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton button0 = new JButton("0");
    private JButton point = new JButton(".");
    private JButton addition = new JButton("+");
    private JButton subtract = new JButton("-");
    private JButton multiplication = new JButton("*");
    private JButton divide = new JButton("/");
    private JButton equally = new JButton("=");

    private JLabel display = new JLabel("");
    
    private Double firstArg;
    private Double secondArg;
    private Double result;
    private String operation;

private JLabel createResultPanel(){
    display.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 35));
    display.setHorizontalAlignment(SwingConstants.RIGHT);
    display.setHorizontalTextPosition(SwingConstants.RIGHT);
    return display;
}

private JPanel createNumLine(JButton... buttons) {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(1, buttons.length, 5, 5));
    for (JButton button : buttons) {
        button.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
        panel.add(button);
    }
    return panel;
}

private JButton createEquallyPanel(){
    equally.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
    return equally;
}

private void onCEClick(ActionEvent e){
    display.setText("");        
}

private void onButton1Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button1.getText();
    display.setText(takein);        
}

private void onButton2Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button2.getText();
    display.setText(takein);        
}

private void onButton3Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button3.getText();
    display.setText(takein);        
}

private void onButton4Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button4.getText();
    display.setText(takein);        
}

private void onButton5Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button5.getText();
    display.setText(takein);        
}

private void onButton6Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button6.getText();
    display.setText(takein);        
}

private void onButton7Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button7.getText();
    display.setText(takein);        
}

private void onButton8Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button8.getText();
    display.setText(takein);        
}

private void onButton9Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button9.getText();
    display.setText(takein);        
}

private void onButton0Click(ActionEvent e){  
    String takein;
    takein = display.getText() + button0.getText();
    display.setText(takein);        
}

private void onAdditionClick(ActionEvent e){
    firstArg = Double.parseDouble(display.getText());
    display.setText("");
    operation = "+";
}
private void onSubstractClick(ActionEvent e){
    firstArg = Double.parseDouble(display.getText());
    display.setText("");
    operation = "-";
}
private void onMultiplicationClick(ActionEvent e){
    firstArg = Double.parseDouble(display.getText());
    display.setText("");
    operation = "*";
}
private void onDivideClick(ActionEvent e){
    firstArg = Double.parseDouble(display.getText());
    display.setText("");
    operation = "/";
}
private void onPointClick(ActionEvent e){
    String takein; 
    takein = display.getText() + point.getText();
    display.setText(takein); 
}

private void onEquallyClick(ActionEvent e){
    
     secondArg = Double.valueOf(display.getText());
     
        switch (operation){
            case "+": result = firstArg + secondArg;
                break;
            case "-": result = firstArg - secondArg;
                break;
            case "*": result = firstArg * secondArg;
                break;
            case "/": result = firstArg / secondArg;   
                break;
            default: result = null;
                break;
        }
        String output = String.valueOf(result);
        display.setText(output); 
}
 @Override
protected void onCreate() {

    setTitle("Calculator"); 
    setLayout(new GridLayout(6, 1, 5, 5));
    Dimension minimumSize = new Dimension(350, 500);
    setMinimumSize(minimumSize);
    add(createResultPanel());
    add(createNumLine(button7, button8, button9, addition));
    add(createNumLine(button4, button5, button6, subtract));
    add(createNumLine(button1, button2, button3, multiplication));
    add(createNumLine(CE, button0, point, divide));
    add(createEquallyPanel());
    
    button1.addActionListener(this::onButton1Click);
    button2.addActionListener(this::onButton2Click);
    button3.addActionListener(this::onButton3Click);
    button4.addActionListener(this::onButton4Click);
    button5.addActionListener(this::onButton5Click);
    button6.addActionListener(this::onButton6Click);
    button7.addActionListener(this::onButton7Click);
    button8.addActionListener(this::onButton8Click);
    button9.addActionListener(this::onButton9Click);
    button0.addActionListener(this::onButton0Click);
    addition.addActionListener(this::onAdditionClick);
    subtract.addActionListener(this::onSubstractClick);
    multiplication.addActionListener(this::onMultiplicationClick);
    divide.addActionListener(this::onDivideClick);
    point.addActionListener(this::onPointClick);
    CE.addActionListener(this::onCEClick);
    equally.addActionListener(this::onEquallyClick);
    }
}
