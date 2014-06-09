package org.springframework.data.riak.repository.support;

import java.io.Serializable;

import org.springframework.data.repository.core.EntityInformation;

public interface RiakEntityInformation<T, ID extends Serializable> extends EntityInformation<T, ID> {

}
