package in.anirudhjwala.creatorstore.repositories;

import in.anirudhjwala.creatorstore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
