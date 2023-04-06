package com.example.customerservice.customerstory.model.consts;


import com.example.customerservice.common.exception.ApiCommonException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomerStoryConst {
    public enum ResponseError{
        NOT_FOUND_CUSTOMER_STORY_ID(HttpStatus.NOT_FOUND , "401-1" , "존재하지 않는 고객스토리(구축사례)");


        HttpStatus status;
        String messageCode;
        String messageDetail;
        ResponseError(HttpStatus status , String messageCode , String messageDetail) {
            this.messageCode = messageCode;
            this.messageDetail = messageDetail;
            this.status = status;
        }

        public ApiCommonException throwException(){
            return  new ApiCommonException(this.status , this.messageCode , this.messageDetail);
        }
    }
}
