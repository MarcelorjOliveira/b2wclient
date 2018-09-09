package org.b2w.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraCqlSessionFactoryBean;

//@Configuration
// @EnableCassandraRepositories(basePackages = "org.b2w.client.repository")
public class CassandraConfig {
/*
	@Bean
	public CassandraCqlClusterFactoryBean cluster() {

		CassandraCqlClusterFactoryBean cluster = new CassandraCqlClusterFactoryBean();
		cluster.setContactPoints("172.21.0.2");

		return cluster;
	}

	@Bean
	public CassandraCqlSessionFactoryBean session() {

		CassandraCqlSessionFactoryBean session = new CassandraCqlSessionFactoryBean();
		session.setCluster(cluster().getObject());
		session.setKeyspaceName("planetas");

		return session;
	}
*/
}
