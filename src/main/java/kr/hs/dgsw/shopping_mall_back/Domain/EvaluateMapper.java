package kr.hs.dgsw.shopping_mall_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EvaluateMapper {
    List<Evaluate> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Evaluate evaluate);
    int modify(Evaluate evaluate);
}
