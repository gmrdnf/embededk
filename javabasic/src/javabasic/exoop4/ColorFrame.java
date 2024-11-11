package javabasic.exoop4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorFrame extends JFrame{

	JFrame jFrame;
	JPanel jPanel;
	JPanel jBtnPanel;
	JButton redButton;
	JButton blueButton;
	JButton orangeButton;
	
	
	public ColorFrame() {
		init();
	}
	
	void init() {
		jFrame =new JFrame("배경색 변경 프로그램");
		jFrame.setLayout(new BorderLayout());
		jFrame.setBounds(100,100,400,400);
		
		jPanel =new JPanel();
		jPanel.setLayout(new BorderLayout());
		
		jBtnPanel = new JPanel();
		
		redButton = new JButton("RED");
		blueButton = new JButton("BLUE");
		orangeButton = new JButton("ORANGE");
				
				addListener(redButton, jPanel, Color.RED);
				addListener(blueButton, jPanel, Color.BLUE);//이게 메소드로써서 가져온거
				addListener(orangeButton, jPanel, Color.ORANGE);
				//많이 축약됨 이런식으로 코드 지어야함
				
//				redButton.addActionListener(new ActionListener() {//리스너는 이벤트를 감지
//					@Override
//					public void actionPerformed(ActionEvent e) {//수행
//						//이게 익명클래스임
//						jPanel.setBackground(Color.RED);//빨강
//						//이제 레드
//					}
//				});
//				blueButton.addActionListener(new ActionListener() {//리스너는 이벤트를 감지
//					@Override
//					public void actionPerformed(ActionEvent e) {//수행
//						//이게 익명클래스임
//						jPanel.setBackground(Color.BLUE);//파랑
//						//이제 레드
//					}//궁금하면 api ActionListener 찾아보자
//				});//2개라도 중복되면 메소드로 묶기 그래서main 위에 만듬 보셈
				
				jBtnPanel.add(redButton);
				jBtnPanel.add(blueButton);
				jBtnPanel.add(orangeButton);//이거 추가안하면 오렌지 버튼이 안뜸
				//멍청이
				jPanel.add(jBtnPanel,BorderLayout.SOUTH);
				jFrame.add(jPanel,BorderLayout.CENTER);
				
				jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				jFrame.setVisible(true);
	}//이렇게 화면만드는걸 gui라고함
	
	
	public static void addListener(JButton jButton,JPanel jPanel,Color color) {
		jButton.addActionListener(new ActionListener() {//리스너는 이벤트를 감지
			@Override
			public void actionPerformed(ActionEvent e) {//수행
				//이게 익명클래스임
				jPanel.setBackground(color);
			}//이게 위에 축약한 코드 메소드임
		});
		
		
		
	}
	
	public static void main(String[] args) {
		new ColorFrame();
	}
	
}//class
