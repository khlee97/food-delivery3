package fooddelivery.external;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Data
public class PayCommand {

    private Long orderId;
    private Long price;
}
