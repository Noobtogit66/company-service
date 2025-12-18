package com.sagnik.companyserver.controller;

import com.sagnik.companyserver.model.Company;
import com.sagnik.companyserver.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/company")
public class CompanyController {

@Autowired
    private CompanyService companyService;

@GetMapping("/getCompany/{companyId}")
    public ResponseEntity<Optional<Company>> getCompany(@PathVariable String companyId)
{
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(companyService.getCompany(companyId)) ;
}
@GetMapping("/getCompanyList")
    public ResponseEntity getCompanyList()
{
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(companyService.getCompanyList());
}
@PostMapping("/addCompany")
public ResponseEntity<Company>addCompany(@RequestBody Company company)
{
    log.info(company.toString());
    companyService.addCompany(company);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(company);
}
@DeleteMapping("/deleteCompany/{companyId}")
public ResponseEntity<Optional<Company>> deleteCompany(@PathVariable String companyId)
{
    return ResponseEntity.status(HttpStatus.OK).body(null) ;
}
}
