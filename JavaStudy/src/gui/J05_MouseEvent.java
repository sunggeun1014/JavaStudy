package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class J05_MouseEvent {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Mouse Event");
		f.setLayout(null);
		
		// 글자를 표시할 때 쓰는 컴포넌트
		JLabel label = new JLabel("ID: ");
		label.setBounds(10, 10, 100, 50);
		
		// 글자를 한 줄 입력할 때 쓰는 컴포넌트
		JTextField idField = new JTextField();
		idField.setBounds(50, 20, 300, 30);
		
		// 모든 컴포넌트에서는 키보드 이벤트를 추가할 수 있다.
		idField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("눌린키: " + e.getKeyChar());
				System.out.println("키가 눌린 시간: " + e.getWhen());
			}
		});
		
		JLabel label2 = new JLabel("자기소개: ");
		label2.setBounds(10, 100, 100, 50);
		
		// 글자를 여러 줄 입력할 때 쓰는 컴포넌트
		JTextArea introField = new JTextArea();
		introField.setBounds(10, 150, 300, 300);
		
		// 모든 컴포넌트에는 마우스 이벤트를 추가할 수 있다.
		introField.addMouseListener(new MouseAdapter() {
			// 다양한 메서드를 오버라이드 하여 이벤트를 처리할 수 있다.
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스가 클릭됨!");
				System.out.println("이벤트 발생 시의 x좌표" + e.getX());
				System.out.println("이벤트 발생 시의 y좌표" + e.getY());
				
				System.out.println("마우스의 어떤 버튼을 눌렀는가? " + e.getButton());
				System.out.println("연속 클릭 횟수: " + e.getClickCount());
				System.out.println("모니터에서의 좌표: " + e.getXOnScreen());
				System.out.println("모니터에서의 좌표: " + e.getYOnScreen());
				introField.setText(String.format("(%d, %d)", e.getXOnScreen(), e.getYOnScreen()));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스가 텍스트영역에 들어옴!");
				introField.setBackground(Color.BLUE);
				introField.setForeground(Color.YELLOW);
				introField.setFont(new Font("궁서체", Font.BOLD, 20));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스가 텍스트영역에서 나감!");
				introField.setBackground(Color.WHITE);
				introField.setForeground(Color.BLACK);
			}
		});
		
		f.add(label);
		f.add(idField);
		
		f.add(label2);
		f.add(introField);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
