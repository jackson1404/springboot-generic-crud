/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.generic_crud_testing.order.service;

import com.jackson.generic_crud_testing.common.service.CrudService;
import com.jackson.generic_crud_testing.common.service.serviceImpl.BaseCrudServiceImpl;
import com.jackson.generic_crud_testing.order.dto.OrderDto;
import com.jackson.generic_crud_testing.order.mapper.OrderMapper;
import com.jackson.generic_crud_testing.order.model.OrderEntity;
import com.jackson.generic_crud_testing.order.repository.OrderRepository;
import org.hibernate.query.Order;
import org.springframework.stereotype.Service;

/**
 * OrderService Class.
 * <p>
 * </p>
 *
 * @author
 */
@Service
public class OrderService extends BaseCrudServiceImpl<OrderEntity, OrderDto, Long> {

    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper){
        super(orderRepository, orderMapper);
    }

}
