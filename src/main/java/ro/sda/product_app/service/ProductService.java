package ro.sda.product_app.service;

import org.springframework.stereotype.Service;
import ro.sda.product_app.dto.Product;
import ro.sda.product_app.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product p) {
        productRepository.save(p);
    }
}
