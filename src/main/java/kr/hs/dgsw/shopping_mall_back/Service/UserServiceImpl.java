package kr.hs.dgsw.shopping_mall_back.Service;

import kr.hs.dgsw.shopping_mall_back.Domain.User;
import kr.hs.dgsw.shopping_mall_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List findAll() {
        return this.userMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return this.userMapper.deleteById(id);
    }

    @Override
    public Long add(User user) {
        return this.userMapper.add(user);
    }

    @Override
    public int modify(User user) {
        return this.userMapper.modify(user);
    }

    @Override
    public User findById(Long id) {
        return this.userMapper.findById(id);
    }

    @Override
    public User login(User user) {
        return this.userMapper.login(user);
    }
}
