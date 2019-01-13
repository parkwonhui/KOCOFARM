package kosta.model.module.dao.schedule;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta.mapper.schedule.ScheduleMapper;
import kosta.model.module.vo.schedule.Calender;
import kosta.model.module.vo.schedule.Category;
import kosta.model.module.vo.schedule.Employee;
import kosta.model.module.vo.schedule.Project;
import sun.security.jca.GetInstance;

import org.apache.ibatis.io.Resources;

public class ScheduleDao {
	private static ScheduleDao dao;

	static {
		dao = new ScheduleDao();
	}
	
	public static ScheduleDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFaction() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public List<Employee> listEmployee() {
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		List<Employee> list = sqlSession.getMapper(ScheduleMapper.class).listEmployee();
		return list;
	}

	public List<Project> listProject() {
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		List<Project> list = sqlSession.getMapper(ScheduleMapper.class).listProject();
		return list;	
	}

	public List<Category> listCategory(int projectId){
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		List<Category> list = sqlSession.getMapper(ScheduleMapper.class).listCategory(projectId);
		return list;
	}

	public List<Calender> listCalender(int projectId) {
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		List<Calender> list = sqlSession.getMapper(ScheduleMapper.class).listCalender(projectId);
		return list;
	}
}
