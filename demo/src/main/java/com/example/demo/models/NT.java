package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class NT {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    ----инициализация переменных и методы работы с ними (чтение и запись из бд)-----
//    private int timent, responseTime;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int getTiment() {
//        return timent;
//    }
//
//    public void setTiment(int timent) {
//        this.timent = timent;
//    }
//
//    public int getResponseTime() {
//        return responseTime;
//    }
//
//    public void setResponseTime(int responseTime) {
//        this.responseTime = responseTime;
//    }
}
