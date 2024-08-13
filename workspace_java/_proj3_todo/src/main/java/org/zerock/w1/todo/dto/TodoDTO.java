package org.zerock.w1.todo.dto;

import java.time.LocalDate;

public class TodoDTO {

	private int tno;			// 고유 번호 todo number
	private String title;		// 할 일
	private LocalDate dueDate;		// 할 시간
	private boolean finished;	// 했는지 여부
	
	public int getTno() {
		return this.tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	@Override
	public String toString() {
		return "TodoDTO [tno=" + tno + ", title=" + title + ", dueDate=" + dueDate + ", finished=" + finished + "]";
	}
	
	
	
}
