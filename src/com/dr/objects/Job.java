package com.dr.objects;

import java.io.Serializable;

public class Job implements Serializable{
    private int jobId;
    private String company;
    private String title;
    private String description;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Job [jobId=" + jobId + ", company=" + company + ", title="
                + title + ", description=" + description + "]";
    }

}
