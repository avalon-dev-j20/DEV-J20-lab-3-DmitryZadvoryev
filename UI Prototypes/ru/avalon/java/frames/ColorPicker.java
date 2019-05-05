package ru.avalon.java.frames;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import ru.avalon.java.ui.AbstractFrame;

public class ColorPicker extends AbstractFrame{

    private JSlider redSlider = new JSlider(0, 255, 125);
    private JSlider greenSlider = new JSlider(0, 255, 125);
    private JSlider blueSlider = new JSlider(0, 255, 125);

    private JLabel redLabel = new JLabel("Red: ");
    private JLabel greenLabel = new JLabel("Green: ");
    private JLabel blueLabel = new JLabel("Blue: ");

    private JPanel palettePanel = new JPanel();
    private JPanel controlPanel = new JPanel();
    
private JPanel createColorControlPanel(JLabel label, JSlider slider) {
    
    JPanel panel = new JPanel();
    Dimension dimension = new Dimension(40, 0);
    
    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(15);
    slider.setSnapToTicks(true);
    slider.setMajorTickSpacing(255);
    slider.setPaintLabels(true);
    
    label.setPreferredSize(dimension);
    
    panel.setLayout(new BorderLayout());
    panel.add(label, BorderLayout.LINE_START);
    panel.add(slider);
    
    return panel;
    }

private JPanel controlPanel(){

     controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
     controlPanel.add(createColorControlPanel(redLabel, redSlider));
     controlPanel.add(createColorControlPanel(greenLabel, greenSlider));
     controlPanel.add(createColorControlPanel(blueLabel, blueSlider));
     
     Border border = BorderFactory.createLineBorder(this.getContentPane().getBackground(), 10);
     controlPanel.setBorder(border);

     return controlPanel;
    }

private JPanel palettePanel(){
    
    Border border = BorderFactory.createLineBorder(this.getContentPane().getBackground(), 10);
    palettePanel.setBorder(border);
    Dimension dimension = new Dimension(150, 150); 
    palettePanel.setPreferredSize(dimension);    
    palettePanel.setBackground(Color.LIGHT_GRAY);       
    return palettePanel;
    }


private void updateColor(){
    int R = redSlider.getValue();
    int G = greenSlider.getValue();
    int B = blueSlider.getValue();
    Color color = new Color(R,G,B);
    palettePanel.setBackground(color);
    }

private void onSliderChange(ChangeEvent e){
    updateColor();
    }

@Override
protected void onCreate() {
    
    setTitle("Color Picker");
    add(controlPanel(), BorderLayout.LINE_END);
    add(palettePanel());
    setMinimumSize(new Dimension(500, 250)); 
    redSlider.addChangeListener(this::onSliderChange);
    greenSlider.addChangeListener(this::onSliderChange);
    blueSlider.addChangeListener(this::onSliderChange);
    }
}