package cn.green.oa.service;

import cn.green.oa.base.BaseDao;
import cn.green.oa.domain.Forum;

public interface ForumService extends BaseDao<Forum> {

	/**
	 * 上移，最上面的不能上移
	 * @param id
	 */
	void moveUp(Long id);

	/**
	 * 下移，最下面的不能下移
	 * @param id
	 */
	void moveDown(Long id);

}
