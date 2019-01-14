package kosta.model.module.vo;

import java.io.Serializable;
import java.util.Date;

public class ScheduleCalender implements Serializable{

	private int calender_id;
	private String title;
	private String start_dt;
	private String end_dt;
	private String background_color;
	private int completion_per;
	private int x_pos;
	private int y_pos;
	private int category_id;
	private int tag_id;
		
	public ScheduleCalender() {
	}

	public ScheduleCalender(int calender_id, String title, String start_dt, String end_dt, String background_color,
			int completion_per, int x_pos, int y_pos, int category_id, int tag_id) {
		super();
		this.calender_id = calender_id;
		this.title = title;
		this.start_dt = start_dt;
		this.end_dt = end_dt;
		this.background_color = background_color;
		this.completion_per = completion_per;
		this.x_pos = x_pos;
		this.y_pos = y_pos;
		this.category_id = category_id;
		this.tag_id = tag_id;
	}

	public int getCalender_id() {
		return calender_id;
	}

	public void setCalender_id(int calender_id) {
		this.calender_id = calender_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart_dt() {
		return start_dt;
	}

	public void setStart_dt(String start_dt) {
		this.start_dt = start_dt;
	}

	public String getEnd_dt() {
		return end_dt;
	}

	public void setEnd_dt(String end_dt) {
		this.end_dt = end_dt;
	}

	public String getBackground_color() {
		return background_color;
	}

	public void setBackground_color(String background_color) {
		this.background_color = background_color;
	}

	public int getCompletion_per() {
		return completion_per;
	}

	public void setCompletion_per(int completion_per) {
		this.completion_per = completion_per;
	}

	public int getX_pos() {
		return x_pos;
	}

	public void setX_pos(int x_pos) {
		this.x_pos = x_pos;
	}

	public int getY_pos() {
		return y_pos;
	}

	public void setY_pos(int y_pos) {
		this.y_pos = y_pos;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getTag_id() {
		return tag_id;
	}

	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}

	@Override
	public String toString() {
		return "Calender [calender_id=" + calender_id + ", title=" + title + ", start_dt=" + start_dt + ", end_dt="
				+ end_dt + ", background_color=" + background_color + ", completion_per=" + completion_per + ", x_pos="
				+ x_pos + ", y_pos=" + y_pos + ", category_id=" + category_id + ", tag_id=" + tag_id + "]";
	}

	
}
