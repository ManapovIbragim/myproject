package kz.lib.menu;

import javax.swing.*;

public class Del  extends JFrame{
    public void delete(){
    JFrame frame = new JFrame("Удаление выбранного издания");
    frame.setSize(200,100);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Введите id: ");
    JTextField field = new JTextField(5);
    JButton button = new JButton("Удалить");
    panel.add(label);
    panel.add(field);
    panel.add(button);

    frame.add(panel);


    }
}
