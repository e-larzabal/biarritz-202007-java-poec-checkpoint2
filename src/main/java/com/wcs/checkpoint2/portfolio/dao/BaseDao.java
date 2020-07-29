package com.wcs.checkpoint2.portfolio.dao;

import com.wcs.checkpoint2.portfolio.model.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Long> {
}