package net.yiyutao.dubbo.cli;

import net.yiyutao.dubbo.cli.api.IUserService;
import net.yiyutao.dubbo.cli.common.base.BaseResult;
import net.yiyutao.dubbo.cli.domain.User;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author masterYI
 * @date 2019/4/11 17:18
 */
@SpringBootTest
@RunWith(SpringRunner.class)

public class UserTest {

    @Reference(version = "1.0.0")
    private IUserService userService;

    @Test
    public void add(){
        User user = new User();
        user.setAge(18);
        user.setName("masterYI");
        BaseResult baseResult = userService.add(user);
        Assert.assertTrue(baseResult.isSuccess());
    }
}
