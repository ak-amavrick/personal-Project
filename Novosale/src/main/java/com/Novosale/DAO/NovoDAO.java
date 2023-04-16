package com.Novosale.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Novosale.bean.Novo;
@Repository
public interface NovoDAO extends JpaRepository<Novo, Long> {

}
