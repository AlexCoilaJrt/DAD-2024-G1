package com.example.mspedidoservice.feign;

import com.example.mspedidoservice.dto.Producto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-catalogo-service",path = "/producto")
public interface ProductoFeign {
    @GetMapping("/{id}")
    @CircuitBreaker(name = "productoListarPorIdCB", fallbackMethod = "fallbackProductoPorId")
    public ResponseEntity<Producto> fallbackProductoPorId(@PathVariable(required = true) Integer id);
    default ResponseEntity<Producto> fallbackProducto(Integer id, Exception e) {
        return ResponseEntity.ok(new Producto());
    }


}
