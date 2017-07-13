package library;

import kz.lib.menu.AddEdition;
import kz.lib.menu.Del;
import kz.lib.menu.ShowAllPublishings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Run extends JFrame{
    JButton button1, button2, button3, button4, button5;
    Run(){
            Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
        this.setSize(400,400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Библиотечный фонд");
        button1 = new JButton("Просмотр зарегистрированных изданий в фонде");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
              ShowAllPublishings adf  = new ShowAllPublishings();
               adf.getWindowWithInfo();

            }
        });


        button2 = new JButton("Добавление нового издания в фонд");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent Event) {
                AddEdition cvb = new AddEdition();
                cvb.addPanel();
            }
            });
        
        button3 = new JButton("Просмотр информации выбранного издания");
        button4 = new JButton("Удаление выбранного издания");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent Event) {
               Del rtg = new Del();
                rtg.delete();
            }
        });
        button5 = new JButton("Выход");
        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        final Component add = c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        c.add(button5);
        
    }

    public static void main(String[] args) {
        Run run = new Run();
        SwingUtilities.updateComponentTreeUI(run);
    }
}
