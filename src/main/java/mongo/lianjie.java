package mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class lianjie {
	public static void main( String args[] ){
	      try{   
	         MongoClient mongoClient = new MongoClient( "localhost" , 8081 );
	         MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");  
	       System.out.println("Connect to database successfully");
	      }catch(Exception e){
	        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     }
	   }
}
