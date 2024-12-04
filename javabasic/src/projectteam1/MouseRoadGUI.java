package projectteam1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseRoadGUI extends JFrame implements MouseListener, MouseMotionListener {

    private Block[][] gameMap;  // 게임 맵 데이터
    private boolean gameStarted = false;  // 게임 시작 여부
    private int timeRemaining = 90;  // 남은 시간 (초)
    private JLabel timerLabel;  // 타이머 표시 레이블
    private boolean timeOverFlag = false;  // 시간을 초과했는지 확인하는 플래그
    private Point gameStartButtonPos;  // 게임 시작 버튼 위치 (시작 위치)
    private boolean gameOverFlag = false; // 게임 오버 후 다시 시작할 수 있는지 여부

    private final int BLOCK_SIZE = 42;  // 블록 크기
    private final int GAME_WIDTH = 16;  // 맵 가로 크기 (16x16 맵)
    private final int GAME_HEIGHT = 16; // 맵 세로 크기 (16x16 맵)

    private int rankTime;  // 랭킹 시간 저장용 변수

    public MouseRoadGUI() {
        setTitle("Mouse Road");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 900);

        // 기본 패널 만들기
        JPanel basicPanel = new JPanel(new BorderLayout());

        // 상단 고정 패널 (랭킹, 타이머, 로고)
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(700, 150));

        // [Ranking] 왼쪽 패널
        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200, 150));
        leftPanel.setBackground(new Color(200, 200, 255));
        leftPanel.add(new JLabel("Ranking"));
        topPanel.add(leftPanel, BorderLayout.WEST);

        // [Timer] 가운데 패널
        JPanel centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(300, 125));
        centerPanel.add(new JLabel("Timer"));
        topPanel.add(centerPanel, BorderLayout.CENTER);

        // 타이머 레이블
        timerLabel = new JLabel(String.valueOf(timeRemaining));
        timerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        centerPanel.add(timerLabel);

        // 타이머 설정
        javax.swing.Timer gameTimer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 타이머가 1초씩 감소
                if (timeRemaining > 0 && !timeOverFlag) {
                    timeRemaining--;
                    timerLabel.setText(String.valueOf(timeRemaining));
                } else if (timeRemaining == 0 && !timeOverFlag) {
                    gameOver("시간이 다 되었습니다! 게임 오버!");
                    timeOverFlag = true;  // 시간을 초과했으므로 플래그를 true로 설정
                }
            }
        });

        gameTimer.start();  // 타이머 시작

        // [Logo] 오른쪽 패널
        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(200, 150));
        rightPanel.setBackground(new Color(200, 255, 200));
        rightPanel.add(new JLabel("Logo"));
        topPanel.add(rightPanel, BorderLayout.EAST);

        basicPanel.add(topPanel, BorderLayout.NORTH);

        // 타임바 패널
        JPanel bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(300, 25));  // 긴 직사각형 패널 크기
        bottomPanel.setBackground(new Color(200, 255, 100));  // 색상 설정
        bottomPanel.add(new JLabel("Time Bar"));

        bottomPanel.setLayout(null);
        int second = 90;
        TimeBar timebar = new TimeBar(second);  // 타임바 생성
        Thread threadbar = new Thread(timebar);
        bottomPanel.add(timebar);
        threadbar.start();  // 타임바 스레드 시작

        topPanel.add(bottomPanel, BorderLayout.AFTER_LAST_LINE);  // 타임바 위치 설정

        // 맵 로딩
        MapLoader mapLoader = new MapLoader();
        gameMap = mapLoader.loadingMap(0);

        // 맵 그리기 패널
        JPanel mazepanel = new JPanel(new GridLayout(GAME_HEIGHT, GAME_WIDTH));
        mazepanel.setPreferredSize(new Dimension(700, 700));

        // 블록을 생성하고 맵에 추가
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[i].length; j++) {
                Block block = gameMap[i][j];
                JButton blockButton = new JButton();
                blockButton.setBackground(block.getColor());
                blockButton.setEnabled(false);  // 기본적으로 클릭 불가

                // 시작 지점에 버튼 추가 (!)
                if (i == 0 && j == 1) {
                    blockButton.setText("!");
                    blockButton.setEnabled(true);  // 클릭 가능
                    blockButton.addActionListener(e -> {
                        gameStarted = true;
                        // 게임 시작 버튼 위치를 게임 시작 위치로 설정
                        gameStartButtonPos = blockButton.getLocation();  // ! 버튼 클릭 시 위치 저장
                    });
                }

                // 도착 지점에 버튼 추가 (^)
                if (i == 15 && j == 14) {
                    blockButton.setText("^");
                    blockButton.setEnabled(true);  // 클릭 가능
                    blockButton.addActionListener(e -> {
                        if (gameStarted) {
                            JOptionPane.showMessageDialog(this, "게임을 종료합니다! 축하합니다.");
                            resetGame();  // 게임을 리셋하고 다시 시작
                        }
                    });
                }

                mazepanel.add(blockButton);  // 버튼을 패널에 추가
            }
        }

        // 마우스 이벤트 추가
        mazepanel.addMouseListener(this);
        mazepanel.addMouseMotionListener(this);
        basicPanel.add(mazepanel, BorderLayout.CENTER);

        add(basicPanel);
        setVisible(true);  // 프레임 표시
    }

    // 마우스 클릭 처리
    @Override
    public void mouseClicked(MouseEvent e) {
        if (!gameStarted) return;
    }

    // 마우스 이동 처리 (위험구역 감지 및 게임 영역 벗어남 감지)
    @Override
    public void mouseMoved(MouseEvent e) {
        if (!gameStarted) return;

        // 게임 맵의 상단과 하단 범위 설정
        int x = e.getX() / BLOCK_SIZE; // 블록 크기에 맞게 마우스 좌표를 변환
        int y = e.getY() / BLOCK_SIZE;

        // 게임 영역을 벗어나는지 확인 (게임 맵 + 상단 영역 포함)
        if (x < 0 || y < 0 || x >= GAME_WIDTH || y >= GAME_HEIGHT || e.getY() <= 150) {
            gameOver("게임 영역을 벗어났습니다! 게임 오버!");
        }

        // 위험구역에 진입했는지 확인
        if (!isInSafeZone(x, y)) {
            gameOver("위험구역에 진입했습니다! 게임 오버!");
        }
    }

    // 게임 오버 처리
    private void gameOver(String message) {
        // 게임 오버 메시지를 즉시 표시
        if (!gameOverFlag) {
            JOptionPane.showMessageDialog(this, message);
            gameOverFlag = true;  // 한 번만 알림 표시
        }

        // 게임 종료 처리
        gameStarted = false;
    }

    // 안전구역 확인
    private boolean isInSafeZone(int x, int y) {
        return x >= 0 && y >= 0 && y < gameMap.length && x < gameMap[0].length && !gameMap[y][x].isBlock();
    }

    // 게임 리셋
    private void resetGame() {
        // 게임을 리셋하는 코드
        timeRemaining = 90;  // 남은 시간 초기화
        gameStarted = false; // 게임 상태 초기화
        gameOverFlag = false;  // 게임 오버 상태 초기화
        timeOverFlag = false;  // 시간 초과 플래그 초기화
        timerLabel.setText(String.valueOf(timeRemaining));  // 타이머 리셋
    }

    // 사용하지 않는 마우스 이벤트 (빈 메서드)
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {} 
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseRoadGUI();
    }
}
