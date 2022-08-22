package com.duo.kindergarten.mapper;

import com.duo.kindergarten.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;
import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-18 18:13:54
 */
@Repository
public interface UserMapper {
    public List<User> findByUser(@Param("pageno") int pageno, @Param("pagesize") int pagesize, @Param("user_name")String user_name);
    /*总计数*/
    public int getCount(@Param("user_name")String user_name);

}
