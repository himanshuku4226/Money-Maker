package com.money.MoneyMaker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.money.MoneyMaker.table.incomehistory;

public interface IncomehistoryRepository extends JpaRepository<incomehistory, Integer> {

}
