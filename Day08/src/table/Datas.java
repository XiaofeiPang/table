package table;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Datas implements TableModel {
   private String []title={
            "周一","周二","周三","周四","周五","周六","周日"
    };
    private String data[][]=new String[8][7];//对象数组只是管理者
    public Datas(){
        for (int i=0;i<data.length;i++){
            for (int j=0;j<data[i].length;j++){
                data[i][j]="";//一开始对每个单元格赋值为空串
            }
        }
    }
    @Override
    public int getRowCount() {
        return 8;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return title[columnIndex];//getColumn每次的参数根据getColumncount()函数返回值进行更新
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;//返回单元格数据为字符串类型
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;//每个单元格（cell）都是可以编辑的
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];//返回字符串值
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
          data[rowIndex][columnIndex]=(String)aValue;
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
