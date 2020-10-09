package com.example.test.springjdbcsample1;


import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringjdbcsampletestApp.class)
@TestPropertySource(locations="classpath:application-test.properties")
public class SolrServerSampleTests {

    @Autowired
    CloudSolrClient cloudSolrClient;


}
