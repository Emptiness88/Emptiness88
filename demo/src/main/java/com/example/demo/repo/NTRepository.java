package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import retrofit2.http.POST;

public interface NTRepository extends CrudRepository<POST,Long> {
}
