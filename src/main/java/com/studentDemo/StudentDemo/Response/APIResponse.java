package com.studentDemo.StudentDemo.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse {
    public APIResponse() { }

    @JsonProperty("data")
    private Object data= null;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @JsonProperty("message")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String message = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("meta")
    private PageInfo pageInfo=null;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    private APIResponse(Object data, PageInfo pageInfo)
    {
        setData(data);
        setPageInfo(pageInfo);
    }

    //private APIResponse(String message)
    {
      //  setMessage(message);
    }

    /*public static APIResponse ok(Object objects, PageInfo pageInfo) {
        return new APIResponse(objects, pageInfo);
    }

    public static APIResponse ok(Object objects) {
        return new APIResponse(objects,null);
    }

    public static APIResponse ok(String message) {
        return new APIResponse(message);
    }*/


}
