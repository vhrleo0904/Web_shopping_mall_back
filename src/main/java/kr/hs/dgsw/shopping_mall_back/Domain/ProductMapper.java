package kr.hs.dgsw.shopping_mall_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Product product);
    int modify(Product product);
    Product findById(@Param("id") Long id);
    List<Product> findByCategory(@Param("category") String category);
    List<Product> findByName(@Param("name") String name);
}
