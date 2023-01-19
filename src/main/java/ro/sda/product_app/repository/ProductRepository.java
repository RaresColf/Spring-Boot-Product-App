package ro.sda.product_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sda.product_app.dto.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
