package cn.itcast.mongodb;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;

import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.eq;


public class TestPerson {
    private MongoCollection<Person> collection;
    @Before
    public void init(){
        //定义对象的解码注册器
        CodecRegistry pojoCodecRegistry = CodecRegistries. fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()) );
        //建立连接
        MongoClient mongoClient = MongoClients.create("mongodb://192.168.27.130:27017");
        //选择数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb").withCodecRegistry(pojoCodecRegistry);
        //选择表
        collection = mongoDatabase.getCollection("person",Person.class);

    }
    @Test
    public void testInsert() {
        Person person = new Person(ObjectId.get(), "张三", 20,new Address("人民路", "上海市", "666666"));
        this.collection.insertOne(person); System.out.println("插入数据成功");

        collection.find(eq("name","张三")).forEach((Consumer<? super Person>) Document-> System.out.println(Document));
    }



}
