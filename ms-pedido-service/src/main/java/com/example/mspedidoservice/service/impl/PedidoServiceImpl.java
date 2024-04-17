package com.example.mspedidoservice.service.impl;


import com.example.mspedidoservice.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mspedidoservice.repository.PedidoRepository;
import com.example.mspedidoservice.service.PedidoService;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRespository;

    @Override
    public List<Pedido> listar() {
        return pedidoRespository.findAll();
    }

    @Override
    public Pedido guardar(Pedido pedido) {
        return pedidoRespository.save(pedido);
    }

    @Override
    public Pedido buscarPorId(Integer id) {
        return pedidoRespository.findById(id).get();
    }

    @Override
    public Pedido editar(Pedido pedido) {
        return pedidoRespository.save(pedido);
    }

    @Override
    public void eliminar(Integer id) {
        pedidoRespository.deleteById(id);
    }

}
