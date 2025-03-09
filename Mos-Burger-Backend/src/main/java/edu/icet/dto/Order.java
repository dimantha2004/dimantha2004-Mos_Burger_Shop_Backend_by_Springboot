package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Integer id;
    private Date orderDate;
    private Double totalPrice;
    private Integer phonenumber;
<<<<<<< HEAD
    private List<OrderItem> items; // Add this field
=======
    private List<OrderItem> items;
>>>>>>> 3124de1 (Final Commit)
}