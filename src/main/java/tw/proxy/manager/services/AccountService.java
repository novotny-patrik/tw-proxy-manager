package tw.proxy.manager.services;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import tw.proxy.manager.data.Account;
import tw.proxy.manager.data.AccountRepository;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Optional<Account> get(Long id) {
        return repository.findById(id);
    }

    public Account update(Account entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Account> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Account> list(Pageable pageable, Specification<Account> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
