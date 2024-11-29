package javabasic.exgui;

public class Memo {
	
	private int no;//메모 qjsgh
	private String subject;//메모 제목
	private String content;//메모 내용
	
	public Memo() {
	}

	
	public Memo(String subject, String content, int no) {
		super();
		this.subject = subject;
		this.content = content;
		this.no = no;
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}
	

	public void setContent(String content) {
		this.content = content;
	}
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	
}
