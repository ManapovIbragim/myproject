package kz.lib.menu;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEdition extends JFrame {
    public void addPanel() {
        JFrame frame = new JFrame("Добавление нового издания в фонд");
        JTable table = new JTable();
        String[] columns ={
                "ID",
                "Тип",
                "Наименование",
                "Год",
                "Кол-во Стр",
                "Издание",
                "Жанр",
                "Содержание"
        };
        String[] row = new String[8];

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
      //  frame.setPreferredSize(new Dimension(750, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      frame.setSize(800,350);
   ;
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setLayout(new BorderLayout());
      JPanel panel2 = new JPanel();
     // panel2.add(table,  BorderLayout.PAGE_START);
       // panel2.setPreferredSize(new Dimension(200,220));
        //panel2.setSize(200,600);

      JPanel panel = new JPanel();
      panel.setPreferredSize(new Dimension(600,120));

      JLabel label1 = new JLabel("id: ");
      JTextField  textField1 = new JTextField(10);
      JLabel label2 = new JLabel("Тип: ");
      JTextField  textField2 = new JTextField(10);
        JLabel label3 = new JLabel("Наименование: ");
        JTextField  textField3 = new JTextField(20);
        JLabel label4 = new JLabel("Год: ");
        JTextField  textField4 = new JTextField(10);
        JLabel label5 = new JLabel("Количество страниц: ");
        JTextField  textField5 = new JTextField(10);
        JLabel label6 = new JLabel("Издательство: ");
        JTextField  textField6 = new JTextField(40);
        JLabel label7 = new JLabel("Жанр: ");
        JTextField  textField7 = new JTextField(20);
        JLabel label8 = new JLabel("Содержание: ");
        JTextField  textField8 = new JTextField(30);
        JButton button = new JButton("Добавить");


      panel.add(label1);
      panel.add(textField1);
      panel.add(label2);
      panel.add(textField2);
      panel.add(label3);
      panel.add(textField3);
      panel.add(label4);
      panel.add(textField4);
        panel.add(label5);
        panel.add(textField5);
        panel.add(label6);
        panel.add(textField6);
        panel.add(label7);
        panel.add(textField7);
        panel.add(label8);
        panel.add(textField8);
        panel.add(button);

        frame.add(panel, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
          row [0]= textField1.getText();
              row [1] = textField2.getText();
              row [2] = textField3.getText();
              row [3] = textField4.getText();
              row [4] = textField5.getText();
              row [5] = textField6.getText();
              row [6] = textField7.getText();
              row [7] = textField8.getText();

             model.addRow(row);

          }

        });

    }

}
