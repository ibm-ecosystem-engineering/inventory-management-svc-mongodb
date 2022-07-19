package com.ibm.inventory_management.repositories;

import com.ibm.inventory_management.models.StockItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockItemRepository extends MongoRepository<StockItem, String> {
}
