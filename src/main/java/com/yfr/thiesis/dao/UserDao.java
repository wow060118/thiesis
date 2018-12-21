package com.yfr.thiesis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.yfr.thiesis.model.*;

@Repository
public interface UserDao {
    UserEntity getUser(@Param("username")String username);
}
