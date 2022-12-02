package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CouponGenerated extends AbstractEvent {

    private Long id;
    private String storeId;
    private String customerId;
    private String status;
}


