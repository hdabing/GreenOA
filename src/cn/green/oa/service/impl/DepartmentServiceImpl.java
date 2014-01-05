package cn.green.oa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.green.oa.base.BaseDaoImpl;
import cn.green.oa.domain.Department;
import cn.green.oa.service.DepartmentService;

@Service
@SuppressWarnings("unchecked")
public class DepartmentServiceImpl extends BaseDaoImpl<Department> implements DepartmentService {

	public List<Department> findTopList() {
		return getSession().createQuery(//
				"FROM Department d WHERE d.parent IS NULL")//
				.list();
	}

	public List<Department> findChildren(Long parentId) {
		return getSession().createQuery(//
				"FROM Department d WHERE d.parent.id=?")//
				.setParameter(0, parentId)//
				.list();
	}

}
