package com.money.MoneyMaker.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.money.MoneyMaker.table.taskcomplete;
public interface TaskCompleteRepository extends JpaRepository<taskcomplete,Integer> {

}
