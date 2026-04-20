package com.uade.tpo.marketplace_Deportivo.controller;

@RestController
@RequestMapping("carrito")
public class CarritoController {
    @Autowired
    private CarritoService carritoService;


    @GetMapping
    public ResponseEntity<List<Carrito>> getCarrito(){
        return ResponseEntity.ok(carritoService.getCarrito());
    }

    @GetMapping("/{carritoID}")
    public ResponseEntity<Carrito> GetCarritoById(@PathVariable long carritoID){
        Optional<Carrito> result = carritoService.getCarritoById(carritoID);
        if (result.isPesent())
            return ResponseEntity.ok(result.get());
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Object> createCarrito@RequestBody CarritoRequest carritoRequest)
            throws CarritoDuplicateException {
        Carrito result = carritoService.createCarrito(carritoRequest.getDescription());
        return ResponseEntity.created(URI.create("/carrito/" + result.getId())).body(result);
    }

}
