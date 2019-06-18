package kr.hs.dgsw.shopping_mall_back.Service;

import kr.hs.dgsw.shopping_mall_back.Domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List findAll();
    int deleteById(@Param("id") Long id);
    Long add(User user);
    int modify(User user);
    User findById(@Param("id") Long id);
    User login(User user);
}
