package projectteam1;

import java.awt.Color;

// 맵 모양, 경로설정
public class MapData {
	
	private MouseRoadMap mrm = new MouseRoadMap(16,16);
	
	private int row = mrm.getSizex();
	private int col = mrm.getSizey();

	// 블록 2차원 배열로 공간 설정
	private Block[][] gameMap = new Block[row][col];

	public MapData() {

		int rowSize = gameMap.length;
		int colSize = gameMap[0].length;
		
		// 검은 블록 배치 - 마우스 닿으면 안됨
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				gameMap[i][j] = new Block(i, j, Color.BLACK, true);
			}
		}

		// 흰 블록 배치 1
		gameMap[0][1] = new Block(1, 0, Color.WHITE, false);
		
		
		// 흰 블록 배치 2
		for (int i = 1; i < 7; i++) {
			gameMap[1][i] = new Block(1, i, Color.WHITE, false);
		}

		// 흰 블록 배치 3
		for (int i = 2; i < 10; i++) {
			gameMap[i][6] = new Block(i, 6, Color.WHITE, false);
		}

		// 흰 블록 배치 4
		for (int i = 6; i < 15; i++) {
			gameMap[7][i] = new Block(7, i, Color.WHITE, false);
		}
		
		// 흰 블록 배치 5
		for (int i = 7; i < 16; i++) {
			gameMap[i][14] = new Block(i, 14, Color.WHITE, false);
		}
		
	} // 생성자

	public Block[][] getGameMap() {
		return gameMap;
	}


} // class
