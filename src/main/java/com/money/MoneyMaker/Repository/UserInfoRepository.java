package com.money.MoneyMaker.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.money.MoneyMaker.table.userinfo;
public interface UserInfoRepository extends JpaRepository<userinfo,Integer> {

}
