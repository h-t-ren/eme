/**
 * 
 */
package com.huihuan.eme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.huihuan.eme.domain.db.Company;


/**
 * @author 任宏涛， ren@ecust.edu.cn
 *
 * @created 2016年1月5日 下午10:04:09
 *
 */
public interface CompanyRepository  extends JpaRepository<Company, Long> {
	

}
