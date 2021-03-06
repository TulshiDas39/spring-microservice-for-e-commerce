package com.inventory.repository;

import com.inventory.domain.Item;
import com.inventory.domain.ReduceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InventoryMapper {

    List<Item> selectItemsByCategoryId(@Param("categoryId") final Integer categoryId);

    Item selectItemById(@Param("id") final Integer id);

    boolean update(final ReduceInfo reduceInfo);
}
