package net.yiyutao.dubbo.cli.service;

import net.yiyutao.dubbo.cli.api.IUserService;
import net.yiyutao.dubbo.cli.common.base.BaseResult;
import net.yiyutao.dubbo.cli.common.base.BaseService;
import net.yiyutao.dubbo.cli.common.enums.ResultEnum;
import net.yiyutao.dubbo.cli.domain.User;
import net.yiyutao.dubbo.cli.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author masterYI
 * @date 2019/4/11 16:30
 */
@Service(stub = "net.yiyutao.dubbo.cli.stup.UserServiceStub", version = "1.0.0")
public class UserServiceImpl extends BaseService implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public BaseResult add(User user) {
        BaseResult baseResult = new BaseResult();
        System.out.println("进入服务提供方，新增==========================");
        userMapper.insert(user);
        baseResult.setResultEnum(ResultEnum.SUCCESS);
        return baseResult;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public BaseResult remove(Integer userid) {
        BaseResult baseResult = new BaseResult();
        System.out.println("进入服务提供方，删除==========================");
        userMapper.deleteByPrimaryKey(userid);
        baseResult.setResultEnum(ResultEnum.SUCCESS);
        return baseResult;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public BaseResult update(User user) {
        BaseResult baseResult = new BaseResult();
        System.out.println("进入服务提供方，修改==========================");
        userMapper.updateByPrimaryKeySelective(user);
        baseResult.setResultEnum(ResultEnum.SUCCESS);
        return baseResult;
    }

    @Override
    public BaseResult<List<User>> list(User user, int pageNum, int pageSize) {
        System.out.println("进入服务提供方，查询==========================");
        return list(pageNum, pageSize, user, userMapper);
    }

}
