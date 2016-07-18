package yahooData.config;

import java.util.Arrays;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories("yahooData.data.repositories")
public class MongoConfig extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() { //return 
		return "Account";
	}

	@Override
	public Mongo mongo() throws Exception {
		MongoCredential credential = MongoCredential.createCredential("admin",
				"admin","charlieFoxTrott".toCharArray());
		return new MongoClient(new ServerAddress("localhost", 27017), 
				Arrays.asList(credential) );
	}

}
