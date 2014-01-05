package cn.green.oa.service;

import java.util.List;

import cn.green.oa.base.BaseDao;
import cn.green.oa.domain.PageBean;
import cn.green.oa.domain.Reply;
import cn.green.oa.domain.Topic;
import cn.green.oa.util.HqlHelper;

public interface ReplyService extends BaseDao<Reply> {

	/**
	 * 查询指定主题中所有的回复列表，排序：最前面的是最早发表的回帖
	 * 
	 * @param topic
	 * @return
	 */
	@Deprecated
	List<Reply> findByTopic(Topic topic);

	/**
	 * 获取分页信息
	 * 
	 * @param pageNum
	 * @param topic
	 * @return
	 */
	@Deprecated
	PageBean getPageBean(int pageNum, Topic topic);


}
