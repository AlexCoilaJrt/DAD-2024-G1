package com.example.mspedidoservice.feign;

import com.example.mspedidoservice.dto.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-client-service",path = "/categoria")
public interface ClientFeign {
    @GetMapping("/{id}")
    public ResponseEntity<Client> listById(@PathVariable(required = true) Integer id);


}
