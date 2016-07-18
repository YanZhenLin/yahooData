package yahooData.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import yahooData.data.entities.Account;

/* 
 * important usage notes:
 * By extending MongoRepository, we are using Spring Data's automatic generation through its  
 * We don't need to declare this interface as a component, when we 
 * 
 */
public interface MongoAccountRepository extends MongoRepository<Account, String> {
	public Account findByUsername(String username);
}
