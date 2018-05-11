import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A4 extends JFrame implements ActionListener{
	private JComboBox box;
	private String[] str = new String[]{"red","black","blue"};
	private JPanel jp;
	public A4(){
		//���������б�
		box = new JComboBox(str);
		box.addActionListener(this);
		
		//ֻ����壨���ñ�����ɫ��
		jp = new JPanel();
		jp.setBackground(Color.red);
		jp.add(box);
		
		this.add(jp);//�����嵽�����
		this.setSize(200, 200);//���ô�С
		this.setVisible(true);//���ӻ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����ɹر�
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == box) {
			int index = box.getSelectedIndex();//��ȡ�����б�����ֵ
			switch (index) {
				case 0:
					jp.setBackground(Color.red);
					break;
				case 1:
					jp.setBackground(Color.black);
					break;
				case 2:
					jp.setBackground(Color.blue);
					break;
				}
			}
		}
	public static void main(String[] args) {
		new A4();
	}
}
