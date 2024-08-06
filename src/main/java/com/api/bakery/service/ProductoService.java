package com.api.bakery.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bakery.model.Producto;
import com.api.bakery.repository.ProductoRepository;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;

    public ArrayList<Producto> getProductos(){
        return (ArrayList<Producto>)this.productoRepository.findAll();
    }

    public Producto saveProducto(Producto producto){
        return this.productoRepository.save(producto);
    }
}
