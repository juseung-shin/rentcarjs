package rentcarjs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import rentcarjs.domain.*;
import rentcarjs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String userId;
    private Date reservedDt;

    public Reserved(Reservation aggregate) {
        super(aggregate);
    }

    public Reserved() {
        super();
    }
}
//>>> DDD / Domain Event
