package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDao extends CrudRepository<Item, Integer> {
}
