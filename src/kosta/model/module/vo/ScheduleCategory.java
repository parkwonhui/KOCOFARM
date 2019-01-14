package kosta.model.module.vo;

import java.io.Serializable;

public class ScheduleCategory implements Serializable {
	private int category_id;
	private String category_name;
	private int project_id;
	private int category_x_pos;

	public ScheduleCategory() {
	
	}

	public ScheduleCategory(int category_id, String category_name, int project_id, int category_x_pos) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.project_id = project_id;
		this.category_x_pos = category_x_pos;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public int getCategory_x_pos() {
		return category_x_pos;
	}

	public void setCategory_x_pos(int category_x_pos) {
		this.category_x_pos = category_x_pos;
	}

	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", project_id="
				+ project_id + ", category_x_pos=" + category_x_pos + "]";
	}



	
}
