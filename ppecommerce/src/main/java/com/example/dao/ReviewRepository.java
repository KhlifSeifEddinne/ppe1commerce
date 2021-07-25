/*
 * package com.example.dao;
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.data.repository.query.Param; import
 * org.springframework.data.rest.core.annotation.RepositoryRestResource; import
 * org.springframework.data.rest.core.annotation.RestResource; import
 * org.springframework.web.bind.annotation.CrossOrigin;
 * 
 * import com.example.entities.Review;
 * 
 * @CrossOrigin("*")
 * 
 * @RepositoryRestResource public interface ReviewRepository extends
 * JpaRepository<Review, Long> {
 * 
 * @RestResource(path = "/byIdReview") public List<Review>
 * findByIdReview(@Param("mc") Long idR);
 * 
 * }
 */