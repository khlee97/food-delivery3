package fooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long id;
    private Long orderId;
    private Integer price;
    private String status;
    private String foodId;
    private String address;
    private String storeId;
    private String customerId;
}


