/**
 * ʹ��ϵͳClass�࣬��ȡӦ�ó�����������丸����
 */
/*
import java.awt.*;
import java.awt.event.*;

public class eg_3_17 extends Frame {
    Class_Object() {
        super("getClass()��getSuperClass()��getName()����");
    }

    public static void main(String[] args) // �������ڷ���
    {
        Class_Object frmclo = new Class_Object();// ������ܴ���
        // ���ÿ�ܴ�����¼�����(�رմ����¼�)
        frmclo.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Label out = new Label("�����رհ�ť�����Թرոô���");
        frmclo.setLayout(new FlowLayout());
        frmclo.add(out);
        Label dis1 = new Label();// ����������ǩ
        Label dis2 = new Label();
        Label dis3 = new Label();
        Class classObj;
        classObj = frmclo.getClass(); // �õ��������
        dis1.setText("������" + classObj.getName());
        dis2.setText("������" + frmclo.getClass());
        classObj = classObj.getSuperclass(); // �õ����õĳ���
        dis3.setText("���ࣺ" + classObj.getName());
        // frmclo.getSuperclass();//�����ô����
        frmclo.add(dis1);// �����ǩ
        frmclo.add(dis2);
        frmclo.add(dis3);
        frmclo.setSize(200, 100);
        frmclo.setBackground(Color.yellow);// ��ܱ���ɫ
        // frmclo.pack();
        frmclo.show();// ��ʾ��ܴ���
    }
}
 */