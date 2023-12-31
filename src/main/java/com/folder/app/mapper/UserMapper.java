package com.folder.app.mapper;

import com.folder.app.dto.UserDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user3 where del = 0")
    public List<UserDTO> findAll();

    @Update("update user3 set name = #{name}, pwd = #{pwd}, gender = #{gender} where no = #{no}")
    public int editById(UserDTO uDto);

    @Update("update user3 set del = true where no = #{no}")
    public int delete(int no);

    @Insert("insert into user3 (name,email,pwd,gender) value (#{name},#{email},#{pwd},#{gender})")
    public int save(UserDTO uDto);
}
