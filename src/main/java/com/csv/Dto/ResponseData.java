package com.csv.Dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseData {
    
    private boolean status;
    private List<String> message = new ArrayList<>();
    private Object payload;
    
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public List<String> getMessage() {
        return message;
    }
    public void setMessage(List<String> message) {
        this.message = message;
    }
    public Object getPayload() {
        return payload;
    }
    public void setPayload(Object payload) {
        this.payload = payload;
    }

    
}
