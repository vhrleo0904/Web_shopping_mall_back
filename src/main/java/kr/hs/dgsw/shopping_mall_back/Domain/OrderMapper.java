package kr.hs.dgsw.shopping_mall_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Order order);
    int modify(Order order);
    List<Order> findByUserId(@Param("user_id") Long userId);
    List<Order> findById(@Param("id") Long id);
}
