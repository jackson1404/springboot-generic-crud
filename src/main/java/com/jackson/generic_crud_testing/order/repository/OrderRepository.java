/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.generic_crud_testing.order.repository;

import com.jackson.generic_crud_testing.order.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * OrderRepository Class.
 * <p>
 * </p>
 *
 * @author
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
