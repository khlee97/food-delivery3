package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponGenerated extends AbstractEvent {

    private Long id;
    private String storeId;
    private String customerId;
    private String status;

    public CouponGenerated(OrderProcessing aggregate){
        super(aggregate);
    }
    public CouponGenerated(){
        super();
    }
}
