package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class J04_JPanel {

	/*
		# JPanel
		
		- 컨테이너 역할을 수행하는 컴포넌트
		- 각 패널에 레이아웃을 설정할 수 있기 때문에 여러가지 레이아웃을 함께 적용할 수 있다.
	*/
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("JPanel Example");
		
		// JPanel은 프레임 위에 붙일 수 있는 컴포넌트이지만, 컨테이너 역할을 한다.
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new GridLayout(3, 3));
		panel3.setLayout(new FlowLayout());
		panel4.setLayout(null);
		
		// 1번 패널에 붙일 버튼을 생성
		JButton btn1_1 = new JButton("동");
		JButton btn1_2 = new JButton("서");
		JButton btn1_3 = new JButton("남");
		JButton btn1_4 = new JButton("북");
		JButton btn1_5 = new JButton("가운데");
		
		// 1번 패널에 버튼을 붙임
		panel1.add(btn1_1, BorderLayout.EAST);
		panel1.add(btn1_2, BorderLayout.WEST);
		panel1.add(btn1_3, BorderLayout.SOUTH);
		panel1.add(btn1_4, BorderLayout.NORTH);
		panel1.add(btn1_5, BorderLayout.CENTER);
		
		f.add(panel1);
		f.add(panel2);
		f.add(panel3);
		f.add(panel4);
		
		// 2번 패널에 붙일 버튼 생성
		ActionListener btnEventListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트가 발생할때마다 e에 이벤트 정보가 함께 도착한다.
				
				// 어떤 버튼이 이벤트를 발생시켰는지 getSource()를 통해 알 수 있다.
				
				JButton btn = (JButton)(e.getSource());
				
				System.out.println(btn.getText() + "가 눌렸습니다!");
			}
		};
		
		for (int i = 0; i < 9; i++) {
			JButton btn = new JButton("버튼" + i);
			
			btn.addActionListener(btnEventListener);
			
			panel2.add(btn);
		}
		
		f.setLayout(new GridLayout(2, 2));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
