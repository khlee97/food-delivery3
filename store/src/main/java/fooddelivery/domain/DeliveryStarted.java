package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String foodId;
    private String storeId;
    private String status;
    private String address;
    private String customerId;

    public DeliveryStarted(OrderProcessing aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
