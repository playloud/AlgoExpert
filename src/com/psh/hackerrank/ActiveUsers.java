package com.psh.hackerrank;
import com.fasterxml.jackson.annotation.*;

//@JsonIgnoreProperties
public class ActiveUsers {
    private long page;
    private long perPage;
    private long total;
    private long totalPages;
    private Datum[] data;

    @JsonProperty("page")
    public long getPage() { return page; }
    @JsonProperty("page")
    public void setPage(long value) { this.page = value; }

    @JsonProperty("per_page")
    public long getPerPage() { return perPage; }
    @JsonProperty("per_page")
    public void setPerPage(long value) { this.perPage = value; }

    @JsonProperty("total")
    public long getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(long value) { this.total = value; }

    @JsonProperty("total_pages")
    public long getTotalPages() { return totalPages; }
    @JsonProperty("total_pages")
    public void setTotalPages(long value) { this.totalPages = value; }

    @JsonProperty("data")
    public Datum[] getData() { return data; }
    @JsonProperty("data")
    public void setData(Datum[] value) { this.data = value; }
}

// Datum.java
