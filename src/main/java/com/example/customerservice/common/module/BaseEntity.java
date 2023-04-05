package com.example.customerservice.common.module;

import lombok.Getter;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;


@Getter

public abstract class BaseEntity  {



    @LastModifiedBy
    private Long updateData;

    @LastModifiedBy
    private LocalDateTime localDateTime;
}
