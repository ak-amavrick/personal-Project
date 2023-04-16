package com.dealerproduct.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dealerproduct.bean.DealerBean;
@Repository
public interface DealerDAO extends JpaRepository<DealerBean, Long> {

}
