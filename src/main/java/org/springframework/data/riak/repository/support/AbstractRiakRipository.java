package org.springframework.data.riak.repository.support;

import java.io.Serializable;

import org.springframework.data.riak.repository.RiakRepository;

public abstract class AbstractRiakRipository<T, ID extends Serializable> implements RiakRepository<T, ID> {

}
