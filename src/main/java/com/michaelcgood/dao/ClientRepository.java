package com.michaelcgood.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.michaelcgood.model.ClientModel;

@Repository
public interface ClientRepository extends PagingAndSortingRepository<ClientModel,Long> {

}
