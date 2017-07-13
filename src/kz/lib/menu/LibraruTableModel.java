package kz.lib.menu;

import javax.swing.table.AbstractTableModel;

/**
 * Created by Ибрагим on 05.07.2017.
 */
public class LibraruTableModel extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return null;
    }
}
