package org.zerock.w1.todo.dto;

import java.time.LocalDate;

public class TodoDTO {

	private int tno;
	private String title;
	private LocalDate dueDate;
	private boolean finished;
	
	public int getTno() {
		return tno;
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
