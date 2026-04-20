package com.uade.tpo.marketplace_Deportivo.service;


public class CarritoServiceImpl implements CarritoService{
    @Autowired
    private CarritoRepository carritoRepository;


    public List<Carrito> getCarrito(){
        return carritoRepository.findAll();
    }

    public Optional<Carrito> GetCarritoById(long carritoID){
        return carritoRepository.findByID(carritoID);
    }

    public Carrito createCarrito(String description) throws CarritoDuplicateException {
        List<Carrito> categories = carritoRepository.findAll();
        if (carrito.stream().anyMatch(
                carrito -> carrito.getDescription().equals(description)))
            throw new CarritoDuplicateException();
        return carritoRepository.save(new Carrito(description));
    }

}
