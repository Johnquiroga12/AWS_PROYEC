package com.todotic.demospringboots3.modelo.vm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Asset {
    private byte[] content;
    private String contentType;


}
