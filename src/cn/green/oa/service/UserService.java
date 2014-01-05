package cn.green.oa.service;

import cn.green.oa.base.BaseDao;
import cn.green.oa.domain.User;

public interface UserService extends BaseDao<User> {

	/**
	 * 查询用户
	 * 
	 * @param loginName
	 * @param password
	 *            明文密码
	 * @return
	 */
	User getByLoginNameAndPassword(String loginName, String password);

}
