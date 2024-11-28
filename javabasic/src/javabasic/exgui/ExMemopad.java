package javabasic.exgui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class ExMemopad {
//메모목록 등록 수정 삭제 기능이있는 메모장 프로그램 구현
	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame("memo");

		// X버튼 누르면 닫히도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JFrame 사이즈
		frame.setSize(400, 500);

		// 탭패널 생성
		JTabbedPane tabbedPane= new JTabbedPane();
		//버튼 패널
		
		//1.ActionListener
		JPanel actionListenerPanel = new JPanel();
		JButton actionButton = new JButton("클릭");
		JLabel actionLabel = new JLabel("상태: 대기중");

		//이벤트타겟객체(actionButton)에 이벤트리스너 추가법 1 :ActionListener구현
		actionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actionLabel.setText("상태:버튼이 클릭됨");
			}
		});
				JPanel buttonPanel = new JPanel();
				buttonPanel.add(new JButton("메모 등록"), BorderLayout.SOUTH);
				buttonPanel.add(new JButton("메모 등록"));
				buttonPanel.add(new JButton("메모 수정"));
				buttonPanel.add(new JButton("메모 삭제"));
				tabbedPane.addTab("버튼", buttonPanel);
				
				//텍스트 입력 탭
				JPanel textPanel = new JPanel();
				textPanel.setLayout(new GridLayout(2,2));
				textPanel.add(new JTextField("텍스트필드"));
				textPanel.add(new JTextArea("텍스트에어리어"));
				tabbedPane.addTab("텍스트입력", textPanel);
				
	}//main
	
}//class
