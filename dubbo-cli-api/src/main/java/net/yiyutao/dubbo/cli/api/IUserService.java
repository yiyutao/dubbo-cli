package net.yiyutao.dubbo.cli.api;

import net.yiyutao.dubbo.cli.common.base.BaseResult;
import net.yiyutao.dubbo.cli.domain.User;

import java.util.List;

/**
 * @author masterYI
 * @date 2019/4/11 16:30
 */
public interface IUserService {

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return 新增结果
     */
    BaseResult add(User user);

    /**
     * 删除用户
     *
     * @param userid 根据用户id删除用户
     * @return
     */
    BaseResult remove(Integer userid);

    /**
     * 更新用户
     *
     * @param user 用户信息
     * @return 更新结果
     */
    BaseResult update(User user);

    /**
     * 查询用户列表
     *
     * @param user     查询条件
     * @param pageNum  分页查询，页码
     * @param pageSize 分页查询，每页数量
     * @return list
     */
    BaseResult<List<User>> list(User user, int pageNum, int pageSize);


}
