package kosta.model.module.vo;

import java.io.Serializable;
import java.util.Date;

public class ScheduleProject implements Serializable{

	private long project_id;
	private String title;
	private long project_leader;		// ?îÑÎ°úÏ†ù?ä∏ ???û•
	private long emp_id;
	private String project_start_dt;
	private String project_end_dt;
	private int project_reg_dt;
	private int project_completion;
	private boolean public_project;
	
	public ScheduleProject() {
	
	}

	public ScheduleProject(long project_id, String title, long project_leader, long emp_id, String project_start_dt,
			String project_end_dt, int project_reg_dt, int project_completion, boolean public_project) {
		super();
		this.project_id = project_id;
		this.title = title;
		this.project_leader = project_leader;
		this.emp_id = emp_id;
		this.project_start_dt = project_start_dt;
		this.project_end_dt = project_end_dt;
		this.project_reg_dt = project_reg_dt;
		this.project_completion = project_completion;
		this.public_project = public_project;
	}

	public long getProject_id() {
		return project_id;
	}

	public void setProject_id(long project_id) {
		this.project_id = project_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getProject_leader() {
		return project_leader;
	}

	public void setProject_leader(long project_leader) {
		this.project_leader = project_leader;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getProject_start_dt() {
		return project_start_dt;
	}

	public void setProject_start_dt(String project_start_dt) {
		this.project_start_dt = project_start_dt;
	}

	public String getProject_end_dt() {
		return project_end_dt;
	}

	public void setProject_end_dt(String project_end_dt) {
		this.project_end_dt = project_end_dt;
	}

	public int getProject_reg_dt() {
		return project_reg_dt;
	}

	public void setProject_reg_dt(int project_reg_dt) {
		this.project_reg_dt = project_reg_dt;
	}

	public int getProject_completion() {
		return project_completion;
	}

	public void setProject_completion(int project_completion) {
		this.project_completion = project_completion;
	}

	public boolean isPublic_project() {
		return public_project;
	}

	public void setPublic_project(boolean public_project) {
		this.public_project = public_project;
	}

	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", title=" + title + ", project_leader=" + project_leader
				+ ", emp_id=" + emp_id + ", project_start_dt=" + project_start_dt + ", project_end_dt=" + project_end_dt
				+ ", project_reg_dt=" + project_reg_dt + ", project_completion=" + project_completion
				+ ", public_project=" + public_project + "]";
	}
}
