package org.springframework.data.riak.repository.support;

import java.io.Serializable;

import org.springframework.data.repository.core.EntityInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

public class RiakRepositoryFactory extends RepositoryFactorySupport {

	@Override
	public <T, ID extends Serializable> EntityInformation<T, ID> getEntityInformation(
			Class<T> arg0) {
		return null;
	}

	@Override
	protected Class<?> getRepositoryBaseClass(RepositoryMetadata arg0) {
		return null;
	}

	@Override
	protected Object getTargetRepository(RepositoryMetadata arg0) {
		return null;
	}

}
