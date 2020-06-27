package mongodb;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import com.xjc.mongodb.pojo.Address;
import com.xjc.mongodb.pojo.Person;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.ArrayList;
import java.util.List;

import static org.bson.codecs.configuration.CodecRegistries.*;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/18 16:11
 * @name PojoTest
 */
public class PojoTest {


    public static void main(String[] args) {

//        insertPojoOne();
        insertDocument();

    }

    public  static  void insertDocument(){
        MongoDatabase database = getMongoDatabase();
        List<Document> documents = new ArrayList<Document>();
        for (int i = 0; i < 100; i++) {
            documents.add(new Document("i", i));
        }
        MongoCollection<Person> collection = database.getCollection("test", Person.class);
//        test.insertMany(documents).subscribe();
//        List<Person> people = asList(
//                new Person("Charles Babbage", 45, new Address("5 Devonshire Street", "London", "W11")),
//                new Person("Alan Turing", 28, new Address("Bletchley Hall", "Bletchley Park", "MK12")),
//                new Person("Timothy Berners-Lee", 61, new Address("Colehill", "Wimborne", null))
//        );
//
//        collection.insertMany(people);
        FindIterable<Person> people = collection.find();
        people.forEach(e-> System.out.println(e.getName()));
        System.out.println(people);
    }

    private static MongoDatabase getMongoDatabase() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClientSettings settings = MongoClientSettings.builder().codecRegistry(pojoCodecRegistry)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        return mongoClient.getDatabase("test");
    }

    /**
     * 插入单行数据
     */
    public static void insertPojoOne(){
        MongoDatabase database = getMongoDatabase();
        MongoCollection<Person> people = database.getCollection("people", Person.class);
        Person ada = new Person("Ada Byron", 20, new Address("St James Square", "London", "W1"));
        people.insertOne(ada);

//        one.subscribe(new Subscriber<InsertOneResult>() {
//            @Override
//            public void onSubscribe(Subscription subscription) {
//                subscription.request(1);
//            }
//
//            @Override
//            public void onNext(InsertOneResult insertOneResult) {
//                System.out.println("Inserted: " +insertOneResult);
//            }
//
//            @Override
//            public void onError(Throwable throwable) {
//                System.out.println("Faild");
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("Completed");
//            }
//        });
    }

}
