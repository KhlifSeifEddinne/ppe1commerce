package com.example.dao;  
import java.util.List;
  
  import org.springframework.data.jpa.repository.JpaRepository; import
  org.springframework.data.jpa.repository.config.EnableJpaRepositories; import
  org.springframework.data.repository.query.Param; import
  org.springframework.data.rest.core.annotation.RepositoryRestResource; import
  org.springframework.data.rest.core.annotation.RestResource; import
  org.springframework.stereotype.Service; import
  org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Client;
  
@Service
@CrossOrigin("*")
@RepositoryRestResource
@EnableJpaRepositories 
public interface ClientRepository extends JpaRepository<Client, Long> {
  @RestResource(path = "/byidClient") 
  public List<Client> findByidClientContains(@Param("mc") Long idCl);
  
  
}
 