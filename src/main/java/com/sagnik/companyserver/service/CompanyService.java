package com.sagnik.companyserver.service;

import com.sagnik.companyserver.model.Company;
import com.sagnik.companyserver.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company addCompany(Company company)
    {
        companyRepository.save(company);
        return company;
    }

    public Optional<Company> getCompany(String companyId)
    {
        return companyRepository.findById(companyId);
    }

    public List<Company> getCompanyList()
    {
        return companyRepository.findAll();
    }

   public void deleteCompany(String companyId)
    {
        companyRepository.deleteById(companyId);
    }



}