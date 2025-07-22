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

/**
 * OrderMapper Class.
 * <p>
 * </p>
 *
 * @author
 */

public class OrderMapper implements Mapper<OrderEntity, OrderDto> {

    @Override
    public OrderEntity toEntity(OrderDto dto) {
        return null;
    }

    @Override
    public OrderDto toDto(OrderEntity entity) {
        return null;
    }

    @Override
    public void updateEntityFromDto(OrderEntity entity, OrderDto dto) {

    }
}
