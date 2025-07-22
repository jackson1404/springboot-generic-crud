/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.generic_crud_testing.order.mapper;

import com.jackson.generic_crud_testing.common.mapper.Mapper;
import com.jackson.generic_crud_testing.order.dto.OrderDto;
import com.jackson.generic_crud_testing.order.model.OrderEntity;
import org.springframework.stereotype.Component;

/**
 * OrderMapper Class.
 * <p>
 * </p>
 *
 * @author
 */
@Component
public class OrderMapper implements Mapper<OrderEntity, OrderDto> {

    @Override
    public OrderEntity toEntity(OrderDto dto) {
        OrderEntity order = new OrderEntity();
        order.setOrderNo(dto.getOrderNo());
        order.setOrderAmount(dto.getOrderAmount());
        order.setOrderQuantity(dto.getOrderQuantity());
        return order;
    }

    @Override
    public OrderDto toDto(OrderEntity entity) {
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderAmount(entity.getOrderAmount());
        orderDto.setOrderQuantity(entity.getOrderQuantity());
        orderDto.setOrderNo(entity.getOrderNo());
        return orderDto;
    }

    @Override
    public void updateEntityFromDto(OrderEntity entity, OrderDto dto) {
        entity.setOrderQuantity(dto.getOrderQuantity());
        entity.setOrderNo(dto.getOrderNo());
        entity.setOrderAmount(dto.getOrderAmount());
    }
}
