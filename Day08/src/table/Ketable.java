package table;

import javax.swing.*;

public class Ketable {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        JTable table= new JTable(new Datas());//jtable只是一个展现表格的类，用来制图的，（即起到一个展现的作用）具体的数据在Datas类中保存
        JScrollPane pane=new JScrollPane(table);//JScrollPane类实现全部展现，不会隐藏
        frame.add(pane);//将整个面板的内容加到frame窗口中
        frame.setVisible(true);//可见窗口
        frame.pack();//自适应不同计算机窗口的大小，默认最佳大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口可随时关闭
    }
}
//总结这里的JTable是知道TableModel的，创建Datas类为了实现TableModel的接口，以及继承或者重写的里面的方法，最终又由JTable
//反过来调用，每需要一个调用一个。经典的“MVC”架构以及‘控制反转’思想
//自己写的数据由TableModel来保存维护，而JTable只管表现，不管数据
//MVC模式（Model(数据),view（表现）,control（控制，包括各种输入，比如用鼠标移动，点击，键盘输入等操作））
//一旦Model里面的数据被control改变了，那么view就重新画一遍，不管具体细节变化，整个界面重新画一下
//control作用：用户在界面上做了各种动作，例如在表格中输入了数据或者删除了数据
//注意：control和view之间没有关系
//这个例子中JTable（view）与control合并在一起了，这是常见的MVC模式的操作