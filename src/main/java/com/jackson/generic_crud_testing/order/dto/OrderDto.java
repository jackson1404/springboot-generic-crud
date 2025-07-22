/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.generic_crud_testing.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OrderDto Class.
 * <p>
 * </p>
 *
 * @author
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private String orderNo;

    private Double orderAmount;

    private Integer orderQuantity;

}
