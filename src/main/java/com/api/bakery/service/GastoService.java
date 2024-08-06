package com.api.bakery.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bakery.model.Gasto;
import com.api.bakery.model.GastoInsumos;
import com.api.bakery.repository.GastoRepository;

@Service
public class GastoService {
    
    @Autowired
    private GastoRepository gastoRepository;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProveedorService proveedorService;

    public ArrayList<Gasto> getGastos(){
        return (ArrayList<Gasto>) this.gastoRepository.findAll();
    }

    public Gasto saveGasto(Gasto gasto){
        if(gasto instanceof GastoInsumos){
            GastoInsumos gastoInsumos = (GastoInsumos) gasto;
            if(gastoInsumos.getProductoInsumos().getIdProducto() == null){
                this.productoService.saveProducto(gastoInsumos.getProductoInsumos());
            }
            if(gastoInsumos.getProveedor().getIdProveedor() == null){
                this.proveedorService.saveProveedor(gastoInsumos.getProveedor());
            }
        }
        return this.gastoRepository.save(gasto);
    }
}
