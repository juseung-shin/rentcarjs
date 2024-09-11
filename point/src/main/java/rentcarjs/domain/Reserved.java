package rentcarjs.domain;

import java.util.*;
import lombok.*;
import rentcarjs.domain.*;
import rentcarjs.infra.AbstractEvent;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String userId;
    private Date reservedDt;
}
