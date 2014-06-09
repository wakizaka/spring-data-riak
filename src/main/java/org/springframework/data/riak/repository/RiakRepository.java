package org.springframework.data.riak.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface RiakRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {

}
