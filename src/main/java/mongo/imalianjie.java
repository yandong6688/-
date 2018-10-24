package mongo;

import java.util.ArrayList;  
import java.util.List;  
import com.mongodb.MongoClient;  
import com.mongodb.MongoCredential;  
import com.mongodb.ServerAddress;  
import com.mongodb.client.MongoDatabase; 

public class imalianjie {
	public static void main(String[] args){  
        try {  
            ServerAddress serverAddress = new ServerAddress("localhost",8081);  
            List<ServerAddress> addrs = new ArrayList<ServerAddress>();  
            addrs.add(serverAddress);  
            MongoCredential credential = MongoCredential.createScramSha1Credential("username", "databaseName", "password".toCharArray());  
            List<MongoCredential> credentials = new ArrayList<MongoCredential>();  
            credentials.add(credential);    
            MongoClient mongoClient = new MongoClient(addrs,credentials);  
            MongoDatabase mongoDatabase = mongoClient.getDatabase("databaseName");  
            System.out.println("Connect to database successfully");  
        } catch (Exception e) {  
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );  
        }  
    }  
}
