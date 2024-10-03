package tw.proxy.manager.services;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import tw.proxy.manager.data.Proxy;
import tw.proxy.manager.data.ProxyRepository;

@Service
public class ProxyService {

    private final ProxyRepository repository;

    public ProxyService(ProxyRepository repository) {
        this.repository = repository;
    }

    public Optional<Proxy> get(Long id) {
        return repository.findById(id);
    }

    public Proxy update(Proxy entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Proxy> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Proxy> list(Pageable pageable, Specification<Proxy> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
