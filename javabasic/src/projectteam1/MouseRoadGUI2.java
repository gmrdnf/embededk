//package projectteam1;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class MouseRoadGUI2 {
//    public static void main(String[] args) {
//
//        // 프레임 만들기
//        JFrame frame = new JFrame("Mouse Road");
//
//        // X버튼 누르면 닫히도록 설정
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // 프레임 크기 설정
//        frame.setSize(700, 900);
//
//        // 큰 패널 만들기
//        JPanel basicPanel = new JPanel();
//        // 상단 고정 패널 (랭킹, 타이머, 로고 틀)
//        JPanel topPanel = new JPanel(new BorderLayout());
//        topPanel.setPreferredSize(new Dimension(700, 150)); // 크기 설정
//
//        // [Ranking] 왼쪽 패널
//        JPanel leftPanel = new JPanel();
//        leftPanel.setPreferredSize(new Dimension(200, 150));
//        leftPanel.setBackground(new Color(200, 200, 255));
//        leftPanel.add(new JLabel("Ranking"));
//        leftPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 5)); // 테두리
//        topPanel.add(leftPanel, BorderLayout.WEST);
//
//        // [Timer] 가운데 패널
//        JPanel centerPanel = new JPanel();
//        centerPanel.setPreferredSize(new Dimension(300, 125));
//        centerPanel.add(new JLabel("Timer"));
//        topPanel.add(centerPanel, BorderLayout.CENTER);
//
//        // [Logo] 오른쪽 패널
//        JPanel rightPanel = new JPanel();
//        rightPanel.setPreferredSize(new Dimension(200, 150));
//        rightPanel.setBackground(new Color(200, 255, 200));
//        rightPanel.add(new JLabel("Logo"));
//        topPanel.add(rightPanel, BorderLayout.EAST);
//
//        // [Timer Bar] 가운데 패널 아래 직사각 패널
//        JPanel bottomPanel = new JPanel();
//        bottomPanel.setPreferredSize(new Dimension(300, 25)); // 긴 직사각형 패널 크기
//        bottomPanel.setBackground(new Color(200, 255, 100)); // 색상 설정
//        bottomPanel.add(new JLabel("Time Bar"));
//        topPanel.add(bottomPanel, BorderLayout.AFTER_LAST_LINE);
//
//        basicPanel.add(topPanel, BorderLayout.NORTH);
//
//        // 맵보드
//        JPanel mazepanel = new JPanel(new GridLayout(16, 16)); // 16x16 그리드
//        mazepanel.setPreferredSize(new Dimension(700, 700)); // 크기 설정
//        MapLoader ml = new MapLoader();
//        ml.loadingMap(0);
//
//        // 각 셀에 버튼 추가 (이후 기능 추가 가능)
//        for (int i = 0; i < 16 * 16; i++) {
//            JButton button = new JButton();
//            button.setBackground(Color.GRAY); // 기본 색상 (벽)
//            mazepanel.add(button);
//        }
//
//        // 가림패널
//        JPanel overlayPanel = new JPanel();
//        overlayPanel.setBackground(Color.black);
//        overlayPanel.setBounds(0, 0, 600, 600);
//        // 가림패널 오버레이
//        JPanel layeredPanel = new JPanel();
//        mazepanel.setBounds(0, 0, 700, 700);
//        layeredPanel.add(mazepanel, JLayeredPane.DEFAULT_LAYER); // mazepanel을 기본 레이어에 추가
//        layeredPanel.add(overlayPanel, JLayeredPane.POPUP_LAYER); // overlayPanel을 PALETTE_LAYER에 추가
//
//        basicPanel.add(layeredPanel, BorderLayout.CENTER);
//
//        // 마우스 리스너 패널 설정
//        mazepanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int x = e.getX() / 40; // 16x16 그리드 기준으로 클릭된 좌표
//                int y = e.getY() / 40;
//
//                if (isAtEndZone(x, y)) {
//                    gameCleared();  // 도착지점에 도달하면 게임 클리어
//                }
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                // 마우스가 영역 안에 들어올 때의 처리 (필요 시 구현)
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                // 마우스가 영역 밖으로 나갔을 때의 처리 (필요 시 구현)
//            }
//        });
//
//        // 마우스 이동 이벤트 처리
//        mazepanel.addMouseMotionListener(new MouseMotionAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent e) {
//                int x = e.getX() / 40; // 16x16 그리드 기준으로 이동된 좌표
//                int y = e.getY() / 40;
//
//                if (isInSafeZone(x, y)) {
//                    // 안전구역에 마우스가 있으면 처리
//                } else {
//                    gameOver("위험구역 진입! 게임 오버!");  // 위험구역에 들어가면 게임 오버 처리
//                }
//            }
//        });
//
//        frame.add(basicPanel); // 상단 패널
//        frame.setVisible(true); // 프레임 보이기
//    }
//
//    // static으로 변경하여 main에서 호출할 수 있게 만듦
//    private static boolean isAtEndZone(int x, int y) {
//        return x == 15 && y == 15;  // (15, 15) 위치가 도착지점
//    }
//
//    // static으로 변경하여 main에서 호출할 수 있게 만듦
//    private static boolean isInSafeZone(int x, int y) {
//        return true;  // 실제로 안전구역 여부를 판단하는 로직을 넣을 수 있다.
//    }
//
//    // static으로 변경하여 main에서 호출할 수 있게 만듦
//    private static void gameCleared() {
//        JOptionPane.showMessageDialog(null, "축하합니다! 게임 클리어!");
//    }
//
//    // static으로 변경하여 main에서 호출할 수 있게 만듦
//    private static void gameOver(String message) {
//        JOptionPane.showMessageDialog(null, message);
//    }
//}
