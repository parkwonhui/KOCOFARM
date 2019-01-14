package kosta.model.module.vo;

import java.io.Serializable;

public class ApprovalDraft implements Serializable {
	private int draft_id;
	private String draft_name;
	private String draft_Dt;
	private String draft_title;
	private int emp_id;
	private int draft_year;
	private int form_id;
	private String approve_stete;
	public ApprovalDraft(int draft_id, String draft_name, String draft_Dt, String draft_title, int emp_id, int draft_year,
			int form_id, String approve_stete) {
		super();
		this.draft_id = draft_id;
		this.draft_name = draft_name;
		this.draft_Dt = draft_Dt;
		this.draft_title = draft_title;
		this.emp_id = emp_id;
		this.draft_year = draft_year;
		this.form_id = form_id;
		this.approve_stete = approve_stete;
	}
	public ApprovalDraft() {
		super();
	}
	public int getDraft_id() {
		return draft_id;
	}
	public void setDraft_id(int draft_id) {
		this.draft_id = draft_id;
	}
	public String getDraft_name() {
		return draft_name;
	}
	public void setDraft_name(String draft_name) {
		this.draft_name = draft_name;
	}
	public String getDraft_Dt() {
		return draft_Dt;
	}
	public void setDraft_Dt(String draft_Dt) {
		this.draft_Dt = draft_Dt;
	}
	public String getDraft_title() {
		return draft_title;
	}
	public void setDraft_title(String draft_title) {
		this.draft_title = draft_title;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getDraft_year() {
		return draft_year;
	}
	public void setDraft_year(int draft_year) {
		this.draft_year = draft_year;
	}
	public int getForm_id() {
		return form_id;
	}
	public void setForm_id(int form_id) {
		this.form_id = form_id;
	}
	public String getApprove_stete() {
		return approve_stete;
	}
	public void setApprove_stete(String approve_stete) {
		this.approve_stete = approve_stete;
	}
	
	
}
