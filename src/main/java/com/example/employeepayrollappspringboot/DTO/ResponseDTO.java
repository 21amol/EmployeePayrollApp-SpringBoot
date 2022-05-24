package com.example.employeepayrollappspringboot.DTO;


import lombok.Data;

@Data                                    // By using this, no need to write getters and setters...
public class ResponseDTO {
    
    private String message;
    private Object data;

    public ResponseDTO () {}


    public ResponseDTO (String  message, Object data) {
        this.message = message;
        this.data = data;
    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }
}
