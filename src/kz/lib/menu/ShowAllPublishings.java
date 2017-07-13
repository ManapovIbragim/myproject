package kz.lib.menu;


import javax.swing.*;
import java.awt.*;

public class ShowAllPublishings extends JFrame {
    public void getWindowWithInfo() {
        JFrame frame = new JFrame("Test frame");
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
        String[][] row = {
                {"1","Книга","Война и мир","1869 г.","781","Азбука","Роман","Наши победили!"},
                {"2","Книга","Отцы и дети","1863","451","Москва","Роман",""},
                {"3","Журнал","Forbes","1917","85","Forbes Media LLC,","",""}

        };

        JTable table = new JTable(row, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(750, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
