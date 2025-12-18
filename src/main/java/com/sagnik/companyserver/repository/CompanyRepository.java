package com.sagnik.companyserver.repository;

import com.sagnik.companyserver.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,String> {
}
