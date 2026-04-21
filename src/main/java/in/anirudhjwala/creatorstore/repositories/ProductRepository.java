package in.anirudhjwala.creatorstore.repositories;

import in.anirudhjwala.creatorstore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
