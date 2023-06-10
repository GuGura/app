package com.folder.app.dao;

import com.folder.app.dto.UserDTO;
import com.folder.app.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    public final UserMapper userMapper;

    public UserDaoImp(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDTO> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int editById(UserDTO uDto) {
        return userMapper.editById(uDto);
    }

    @Override
    public int delete(int no) {
        return userMapper.delete(no);
    }

    @Override
    public int save(UserDTO uDto) {
        return userMapper.save(uDto);
    }
}
