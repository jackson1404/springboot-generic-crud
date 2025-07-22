/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.generic_crud_testing.order.controller;

import com.jackson.generic_crud_testing.common.controller.CrudController;
import com.jackson.generic_crud_testing.order.dto.OrderDto;
import com.jackson.generic_crud_testing.order.model.OrderEntity;
import com.jackson.generic_crud_testing.order.repository.OrderRepository;
import com.jackson.generic_crud_testing.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController Class.
 * <p>
 * </p>
 *
 * @author
 */
@RestController
@RequestMapping("/api/orders")
public class OrderController extends CrudController<OrderEntity, OrderDto, Long> {

    public OrderController(OrderRepository orderRepository, OrderService orderService){
        super(orderRepository, orderService);
    }


}
