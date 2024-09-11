package rentcarjs.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import rentcarjs.domain.*;
import rentcarjs.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointIncreased extends AbstractEvent {

    private Long id;

    public PointIncreased(Point aggregate) {
        super(aggregate);
    }

    public PointIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
