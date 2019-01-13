package kosta.mapper.schedule;

import java.util.List;

import kosta.model.module.vo.schedule.Calender;
import kosta.model.module.vo.schedule.Category;
import kosta.model.module.vo.schedule.Employee;
import kosta.model.module.vo.schedule.Project;

public interface ScheduleMapper {
	public List<Employee> listEmployee();
	public List<Project> listProject();
	public List<Category> listCategory(int projectId);
	public List<Calender> listCalender(int projectId);
}
