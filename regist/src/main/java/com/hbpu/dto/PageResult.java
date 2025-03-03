package com.hbpu.dto;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    private Long pages;
    private Long total;
    private List<T> data;

}