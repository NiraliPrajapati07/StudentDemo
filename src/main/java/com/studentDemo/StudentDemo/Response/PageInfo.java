package com.studentDemo.StudentDemo.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PageInfo {

    @JsonProperty("current_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Integer currentPage;

    @JsonProperty("records_per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Integer recordsPerPage;

    @JsonProperty("total_records")
    Object totalRecords;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getRecordsPerPage() {
        return recordsPerPage;
    }

    public void setRecordsPerPage(Integer recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
    }

    public Object getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Object totalRecords) {
        this.totalRecords = totalRecords;
    }

}
