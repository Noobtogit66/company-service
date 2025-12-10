package com.sagnik.companyserver.model;

import java.util.List;

public class Company {

    private String companyId;
    private String companyName;
    private String companyAddress;
    private String companyEmail;
    private long regularIntime;
    private long regularOuttime;
    private List<Long> holidayList;
    private List<WorkingDays> workingDays;
}
