package javabasic.excollection;

public class Score {
	int kr;
	int eng;
	int math;

	public Score() {
	}

	public Score(int kr, int eng, int math) {
		super();
		this.kr = kr;
		this.eng = eng;
		this.math = math;

	}

	public int getKr() {
		return kr;
	}

	public void setKr(int kr) {
		this.kr = kr;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
