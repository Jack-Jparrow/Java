/**
 * 使用系统Class类，获取应用程序的类名和其父类名
 */
/*
import java.awt.*;
import java.awt.event.*;

public class eg_3_17 extends Frame {
    Class_Object() {
        super("getClass()和getSuperClass()、getName()方法");
    }

    public static void main(String[] args) // 程序的入口方法
    {
        Class_Object frmclo = new Class_Object();// 创建框架窗体
        // 设置框架窗体的事件监听(关闭窗体事件)
        frmclo.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Label out = new Label("单击关闭按钮，可以关闭该窗口");
        frmclo.setLayout(new FlowLayout());
        frmclo.add(out);
        Label dis1 = new Label();// 创建几个标签
        Label dis2 = new Label();
        Label dis3 = new Label();
        Class classObj;
        classObj = frmclo.getClass(); // 得到类的引用
        dis1.setText("类名：" + classObj.getName());
        dis2.setText("类名：" + frmclo.getClass());
        classObj = classObj.getSuperclass(); // 得到引用的超类
        dis3.setText("超类：" + classObj.getName());
        // frmclo.getSuperclass();//不能用此语句
        frmclo.add(dis1);// 加入标签
        frmclo.add(dis2);
        frmclo.add(dis3);
        frmclo.setSize(200, 100);
        frmclo.setBackground(Color.yellow);// 框架背景色
        // frmclo.pack();
        frmclo.show();// 显示框架窗体
    }
}
 */