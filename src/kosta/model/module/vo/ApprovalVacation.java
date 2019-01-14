package kosta.model.module.vo;

import java.io.Serializable;

public class ApprovalVacation implements Serializable {
	private int draft_id;
	private int form_id;
	private String vacation_start_dt;
	private String vacation_end_dt;
	private String vacation_type;
	private int vacation_days;
	private String vacation_reason;
	private int replacement_id;
	public ApprovalVacation() {
		super();
	}
	public ApprovalVacation(int draft_id, int form_id, String vacation_start_dt, String vacation_end_dt,
			String vacation_type, int vacation_days, String vacation_reason, int replacement_id) {
		super();
		this.draft_id = draft_id;
		this.form_id = form_id;
		this.vacation_start_dt = vacation_start_dt;
		this.vacation_end_dt = vacation_end_dt;
		this.vacation_type = vacation_type;
		this.vacation_days = vacation_days;
		this.vacation_reason = vacation_reason;
		this.replacement_id = replacement_id;
	}
	public int getDraft_id() {
		return draft_id;
	}
	public void setDraft_id(int draft_id) {
		this.draft_id = draft_id;
	}
	public int getForm_id() {
		return form_id;
	}
	public void setForm_id(int form_id) {
		this.form_id = form_id;
	}
	public String getVacation_start_dt() {
		return vacation_start_dt;
	}
	public void setVacation_start_dt(String vacation_start_dt) {
		this.vacation_start_dt = vacation_start_dt;
	}
	public String getVacation_end_dt() {
		return vacation_end_dt;
	}
	public void setVacation_end_dt(String vacation_end_dt) {
		this.vacation_end_dt = vacation_end_dt;
	}
	public String getVacation_type() {
		return vacation_type;
	}
	public void setVacation_type(String vacation_type) {
		this.vacation_type = vacation_type;
	}
	public int getVacation_days() {
		return vacation_days;
	}
	public void setVacation_days(int vacation_days) {
		this.vacation_days = vacation_days;
	}
	public String getVacation_reason() {
		return vacation_reason;
	}
	public void setVacation_reason(String vacation_reason) {
		this.vacation_reason = vacation_reason;
	}
	public int getReplacement_id() {
		return replacement_id;
	}
	public void setReplacement_id(int replacement_id) {
		this.replacement_id = replacement_id;
	}
	
	
}
