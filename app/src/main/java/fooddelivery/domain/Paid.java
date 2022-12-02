package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer price;
    private String status;
    private String foodId;
    private String address;
    private String storeId;
    private String customerId;
}
