package com.money.MoneyMaker.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.money.MoneyMaker.table.transection;
public interface TransectionRepository extends JpaRepository<transection,Integer> {

}
