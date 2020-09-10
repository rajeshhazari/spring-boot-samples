package com.example.test.springjdbcsample1;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.LBHttpSolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@EnableAutoConfiguration(exclude = {SolrAutoConfiguration.class})
@EnableConfigurationProperties(ApiModuleProperties.class)
public class AppSearchModuleConfig   {

    @Value("${solr.url}")
    private List<String> solrUrl ;
    @Value("${solr.zkhosts}")
    private List<String> zkHost ;
    @Autowired
    private DataSource dataSource;



    @Bean
    public SolrClient cloudSolrClient(){
        return new CloudSolrClient.Builder(solrUrl)
                .withLBHttpSolrClient(lbHttpSolrClient())
                .withConnectionTimeout(10000)
                .withSocketTimeout(60000)
                .build();
    }


    @Bean
    public LBHttpSolrClient lbHttpSolrClient(){
        return new LBHttpSolrClient.Builder()
                .withBaseSolrUrls(String.valueOf(solrUrl))
                .withConnectionTimeout(10000)
                .withSocketTimeout(60000)
                .build();
    }

}
