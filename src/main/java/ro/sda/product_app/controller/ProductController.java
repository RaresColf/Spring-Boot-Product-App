package ro.sda.product_app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.sda.product_app.dto.Product;
import ro.sda.product_app.service.ProductService;

@RestController
public class ProductController {

private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
@PostMapping("/product/add")
    public void addProduct(@RequestBody Product p){
        productService.addProduct(p);

    }
}
