package net.yiyutao.dubbo.cli.stup;

import net.yiyutao.dubbo.cli.api.IUserService;
import net.yiyutao.dubbo.cli.common.base.BaseResult;
import net.yiyutao.dubbo.cli.common.enums.ResultEnum;
import net.yiyutao.dubbo.cli.domain.User;

import java.util.List;

/**
 * @author masterYI
 * @date 2019/4/11 16:34
 */
public class UserServiceStub implements IUserService {

    private final IUserService userService;

    public UserServiceStub(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public BaseResult add(User user) {
        System.out.println("进行参数验证===========");
        return userService.add(user);
    }

    @Override
    public BaseResult remove(Integer userid) {
        if(userid == null){
            BaseResult result = new BaseResult();
            result.setResultEnum(ResultEnum.SUCCESS);
            return result;
        }
        return userService.remove(userid);
    }

    @Override
    public BaseResult update(User user) {
        if(user == null || user.getUserid() == null){
            BaseResult result = new BaseResult();
            result.setResultEnum(ResultEnum.MISS_PARAM);
            return result;
        }
        return userService.update(user);
    }

    @Override
    public BaseResult<List<User>> list(User user, int pageNum, int pageSize) {
        return userService.list(user, pageNum, pageSize);
    }

}
