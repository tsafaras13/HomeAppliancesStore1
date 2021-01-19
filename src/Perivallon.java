import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Perivallon extends JFrame{

    private JLabel label1; // Fridge:
    private JLabel label2; // WashineMachine:
    private JLabel label3; // Oven:
    private JLabel label4; // AirCondition:

    private JTextField Text1; // Fridges [ ... ]
    private JTextField Text2; // WashineMachine
    private JTextField Text3; // Oven
    private JTextField Text4; // AirCondition

    private JButton reg;


    public Perivallon(){
        super("HomeApplianceStore");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // Labels
        label1 = new JLabel("Fridges: ");
        label2 = new JLabel("WashineMachines: ");
        label3 = new JLabel("Ovens: ");
        label4 = new JLabel("AirCondition: ");

        // TextFields
        Text1 = new JTextField(3);
        Text2 = new JTextField(3);
        Text3 = new JTextField(3);
        Text4 = new JTextField(3);

        add(label1); add(label2); add(label3); add(label4);
        add(Text1); add(Text2); add(Text3); add(Text4);

        // Creating Button
        reg = new JButton("DONE");
        add(reg);

        // Creating ActionListener
        Handling handle = new Handling();
        reg.addActionListener(handle);
    }

    // Class to Handle the Actions
    private class Handling implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String temp = "";

            int Fridges = 0, WashineMachines = 0, Ovens = 0, AirConditions = 0;
            try {
                temp = Text1.getText();
                Fridges = Integer.parseInt(temp);
                temp = Text2.getText();
                WashineMachines = Integer.parseInt(temp);
                temp = Text3.getText();
                Ovens = Integer.parseInt(temp);
                temp = Text4.getText();
                AirConditions = Integer.parseInt(temp);
            } catch (Exception e1) {
                System.out.println("Error");
                return;
            }

            Fridge FridgesObjects[] = new Fridge[Fridges];
            WashineMachine WashineMachineObjects[] = new WashineMachine[WashineMachines];
            Oven OvensObjects[] = new Oven[Ovens];
            AirCondition AirConditionObjects[] = new AirCondition[AirConditions];

            if (e.getSource() == reg) {

                for (int i = 0; i < Fridges; i++) {
                    FridgesObjects[i] = new Fridge("Lg", "Lg", "Lg", 60, 180, 60, 53);
                }
                for (int i = 0; i < WashineMachines; i++) {
                    WashineMachineObjects[i] = new WashineMachine("Samsung", "Samsung", "Samsung", 60, 60, 60, 45);
                }
                for (int i = 0; i < Ovens; i++) {
                    OvensObjects[i] = new Oven("Pitsos", "Pitsos", "Pitsos", 60, 60, 60, 75);
                }
                for (int i = 0; i < AirConditions; i++) {
                    AirConditionObjects[i] = new AirCondition("Panasonic", "Panasonic", "Panasonic", 50, 30, 30, 61);
                }

                JFrame jframe = new JFrame("JTextArea");
                jframe.setSize(300, 300);
                JTextArea area = new JTextArea(Fridge.Suskeuh() + "\n" + WashineMachine.Suskeuh() + "\n" + Oven.Suskeuh() + "\n" + AirCondition.Suskeuh());
                jframe.add(area);
                area.setBounds(10, 20, 300, 300);
                jframe.setVisible(true);


            }
        }
    }}
