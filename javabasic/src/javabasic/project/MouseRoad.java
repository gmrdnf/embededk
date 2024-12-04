package javabasic.project;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseRoad {

	public class MouseBorderLogic implements MouseListener, MouseMotionListener {
	    
	    @Override
	    public void mouseClicked(MouseEvent e) {
	        // 도착 지점 클릭 시 게임 종료 또는 리셋 로직
	        System.out.println("도착 지점 클릭 감지!");
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {
	        // 마우스가 위험구역에 들어갈 때 처리
	        System.out.println("위험구역에 들어옴!");
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	        // 마우스가 게임 보드 밖으로 나갔을 때 게임오버 처리
	        System.out.println("게임 영역 밖으로 나감! 게임 오버!");
	    }

	    @Override
	    public void mouseMoved(MouseEvent e) {
	        // 마우스가 움직일 때마다 현재 좌표 확인
	        int x = e.getX();
	        int y = e.getY();
	        System.out.println("마우스 위치: (" + x + ", " + y + ")");
	        
	        // 위험구역 충돌 로직 추가 필요
	    }

	    @Override
	    public void mouseDragged(MouseEvent e) {
	        // 드래그 시 동작 필요 시 구현
	    }
	}

}
