package com.learning.backend.domain.model.job;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "JOB")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Job {
    @Id
    @Column(name = "JOB_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int jobId;
    @Column(name = "COMPANY")
    //May implement a Company Class
    private String company;
    @Column(name = "EMPLOYMENT_TYPE")
    private String employmentType;
    @Column(name = "INDUSTRY")
    private String industry;
    @Column(name = "JOB_DESCRIPTION")
    private String jobDescription;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "CITY")
    private String city;
    @Column(name = "SENIORITY_LEVEL")
    private String seniorityLevel;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "TOTAL_APPLICANTS")
    private int totalApplicants;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSeniorityLevel() {
        return seniorityLevel;
    }

    public void setSeniorityLevel(String seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalApplicants() {
        return totalApplicants;
    }

    public void setTotalApplicants(int totalApplicants) {
        this.totalApplicants = totalApplicants;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", company='" + company + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", industry='" + industry + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", seniorityLevel='" + seniorityLevel + '\'' +
                ", title='" + title + '\'' +
                ", totalApplicants=" + totalApplicants +
                '}';
    }
}