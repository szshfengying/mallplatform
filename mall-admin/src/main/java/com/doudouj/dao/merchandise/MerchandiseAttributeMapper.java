package com.doudouj.dao.merchandise;

import com.doudouj.dto.merchandise.MerchandiseAttribute;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchandiseAttributeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MerchandiseAttribute record);

    int insertSelective(MerchandiseAttribute record);

    MerchandiseAttribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchandiseAttribute record);

    int updateByPrimaryKey(MerchandiseAttribute record);
}