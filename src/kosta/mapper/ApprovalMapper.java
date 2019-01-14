package kosta.mapper;

import kosta.model.module.vo.ApprovalDraft;
import kosta.model.module.vo.ApprovalExpence;
import kosta.model.module.vo.ApprovalVacation;


public interface ApprovalMapper {
	int insertDraft(ApprovalDraft draft);
	int insertVacation(ApprovalVacation vacation);
	int insertExpence(ApprovalExpence expence);
}
