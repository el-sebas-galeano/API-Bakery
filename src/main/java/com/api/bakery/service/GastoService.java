package com.api.bakery.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bakery.model.Gasto;
import com.api.bakery.model.GastoEmpleados;
import com.api.bakery.model.GastoInsumos;
import com.api.bakery.model.GastoOtros;
import com.api.bakery.model.GastoServicios;
import com.api.bakery.repository.GastoRepository;

@Service
public class GastoService {
    
    @Autowired
    private GastoRepository gastoRepository;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProveedorService proveedorService;

    @Autowired
    private EmpleadoService empleadoService;

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
            return this.gastoRepository.save(gastoInsumos);
        } else if (gasto instanceof GastoEmpleados){
            GastoEmpleados gastoEmpleados = (GastoEmpleados) gasto;
            if(gastoEmpleados.getEmpleado().getIdEmpleado() == null){
                this.empleadoService.saveEmpleado(gastoEmpleados.getEmpleado());
            }
            return this.gastoRepository.save(gastoEmpleados);
        } else if(gasto instanceof GastoServicios){
            GastoServicios gastoServicios = (GastoServicios) gasto;
            return this.gastoRepository.save(gastoServicios);
        } else if(gasto instanceof GastoOtros){
            GastoOtros gastoOtros = (GastoOtros) gasto;
            return this.gastoRepository.save(gastoOtros);
        } else {
            return null;
        }
    }

    public ArrayList<Gasto> getGastosInsumos(){
        return (ArrayList<Gasto>)this.gastoRepository.findAllInsumos();
    }

    public ArrayList<Gasto> getGastosEmpleados(){
        return (ArrayList<Gasto>)this.gastoRepository.findAllEmpleados();
    }

    public ArrayList<Gasto> getGastosServicios(){
        return (ArrayList<Gasto>)this.gastoRepository.findAllServicios();
    }

    public ArrayList<Gasto> getGastosOtros(){
        return (ArrayList<Gasto>)this.gastoRepository.findAllOtros();
    }
}
