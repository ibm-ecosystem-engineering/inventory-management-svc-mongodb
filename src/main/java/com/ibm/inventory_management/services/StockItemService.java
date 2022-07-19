package com.ibm.inventory_management.services;

import java.util.List;

import com.ibm.inventory_management.repositories.StockItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.inventory_management.models.StockItem;

@Service
public class StockItemService implements StockItemApi {
      @Autowired
      private StockItemRepository stockItemRepository;
      @Override
      public List<StockItem> listStockItems() {
            return stockItemRepository.findAll();
      }
}
