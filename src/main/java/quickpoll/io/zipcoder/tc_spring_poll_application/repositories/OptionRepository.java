package quickpoll.io.zipcoder.tc_spring_poll_application.repositories;

import quickpoll.io.zipcoder.tc_spring_poll_application.domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
