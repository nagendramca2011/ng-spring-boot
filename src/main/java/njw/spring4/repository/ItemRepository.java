package njw.spring4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import njw.spring4.model.Item;
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
