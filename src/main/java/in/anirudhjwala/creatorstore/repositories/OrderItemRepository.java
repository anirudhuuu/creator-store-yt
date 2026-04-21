package in.anirudhjwala.creatorstore.repositories;

import in.anirudhjwala.creatorstore.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
