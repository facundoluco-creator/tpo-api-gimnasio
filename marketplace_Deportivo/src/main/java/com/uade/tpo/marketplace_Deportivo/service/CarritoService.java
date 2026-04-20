package com.uade.tpo.marketplace_Deportivo.service;

public interface CarritoService {
        public List<Carrito> getCarrito();
    
    public Optional<Carrito> GetCarritoById(Long carritoID);

    public Carrito createCarrito(String description) throws carritoDuplicateException;

}
