package com.apollo.apollotest.mysql;


import com.apollo.apollotest.dto.UserDetailDto;
import com.apollo.apollotest.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author wulei
 * @date 2019-02-13 11:19
 */
@Mapper
public interface TestDao {

    List<Map<String,Object>> queryAllUser();

    void insertUser(UserDto userDto);

    void insertUserDetail(UserDetailDto userDto);

    void updateUserId(@Param("id") int id);

    Map queryUserById(@Param("userId") int userId);

    String getNowTime();
}
