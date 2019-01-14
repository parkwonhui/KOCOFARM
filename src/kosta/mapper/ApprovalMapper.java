package kosta.mapper;

import kosta.model.module.ApprovalDraft;
import kosta.model.module.ApprovalVacation;

public interface ApprovalMapper {
	int insertDraft(ApprovalDraft draft);
	int insertVacation(ApprovalVacation vacation);
}
