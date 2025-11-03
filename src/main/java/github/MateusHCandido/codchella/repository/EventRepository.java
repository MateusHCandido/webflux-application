package github.MateusHCandido.codchella.repository;

import github.MateusHCandido.codchella.entity.Events;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EventRepository extends ReactiveCrudRepository<Events, Long> {
}
