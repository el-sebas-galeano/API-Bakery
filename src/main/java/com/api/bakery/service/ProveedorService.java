package com.api.bakery.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bakery.model.Proveedor;
import com.api.bakery.repository.ProveedorRepository;

@Service
public class ProveedorService {
    
    @Autowired
    private ProveedorRepository proveedorRepository;

    public ArrayList<Proveedor> getProveedores(){
        return (ArrayList<Proveedor>) this.proveedorRepository.findAll();
    }

    public Proveedor saveProveedor(Proveedor proveedor){
        return this.proveedorRepository.save(proveedor);
    }
}
