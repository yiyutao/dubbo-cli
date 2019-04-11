package net.yiyutao.dubbo.cli.mapper;

import net.yiyutao.dubbo.cli.common.base.BaseMapper;
import net.yiyutao.dubbo.cli.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author masterYI
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}