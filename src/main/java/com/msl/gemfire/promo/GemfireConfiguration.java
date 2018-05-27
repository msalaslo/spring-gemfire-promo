package com.msl.gemfire.promo;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.CacheFactoryBean;
import org.springframework.data.gemfire.LocalRegionFactoryBean;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

import com.gemstone.gemfire.cache.DataPolicy;
import com.gemstone.gemfire.cache.GemFireCache;
import com.msl.gemfire.promo.entity.Employee;
import com.msl.gemfire.promo.repository.EmployeeRepository;

@Configuration
@ComponentScan(basePackages = {"com.msl.gemfire.promo.component, com.msl.gemfire.promo.service, com.msl.gemfire.promo.repository"})
@EnableGemfireRepositories(basePackages = {"com.msl.gemfire.promo.entity, com.msl.gemfire.promo.repository"})
public class GemfireConfiguration {

    @Autowired
    EmployeeRepository employeeRepository;


    @Bean
    Properties gemfireProperties() {
        Properties gemfireProperties = new Properties();
        gemfireProperties.setProperty("name", "SpringDataGemfirePromoApplication");
        gemfireProperties.setProperty("mcast-port", "0");
        gemfireProperties.setProperty("log-level", "config");
        return gemfireProperties;
    }

    @Bean
    @Autowired
    CacheFactoryBean gemfireCache() {
        CacheFactoryBean gemfireCache = new CacheFactoryBean();
        gemfireCache.setClose(true);
        gemfireCache.setProperties(gemfireProperties());
        return gemfireCache;
    }


    @Bean(name="employee")
    @Autowired
    LocalRegionFactoryBean<String, Employee> getEmployee(final GemFireCache cache) {
        LocalRegionFactoryBean<String, Employee> employeeRegion = new LocalRegionFactoryBean<String, Employee>();
        employeeRegion.setCache(cache);
        employeeRegion.setClose(false);
        employeeRegion.setName("employee");
        employeeRegion.setPersistent(false);
        employeeRegion.setDataPolicy(DataPolicy.PRELOADED);
        return employeeRegion;
    }


}

