package rentcarjs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import rentcarjs.infra.AbstractEvent;

@Data
public class Reserved extends AbstractEvent {

    private Long id;
    private String userId;
    private Date reservedDt;
}
