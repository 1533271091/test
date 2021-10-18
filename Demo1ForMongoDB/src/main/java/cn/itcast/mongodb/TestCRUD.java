package cn.itcast.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import org.bson.Document;
import org.junit.Before;
import org.junit.Test;

import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.*;

public class TestCRUD {
    private MongoCollection<Document> collection;
    @Before
    public void init(){
        //建立连接
        MongoClient mongoClient = MongoClients.create("mongodb://192.168.27.130:27017");
        //选择数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        //选择表
         collection = mongoDatabase.getCollection("user");
    }

    // 查询age<=50并且id>=100的用户信息，并且按照id倒序排序，只返回id，age字段，不返回_id字段
    @Test
    public void testQuery(){
        collection.find(
                and(
                        lte("age",50),
                        gte("id",100)
                )
        ).sort(Sorts.descending("id")).projection(
                Projections.fields(
                        Projections.include("id","age"),
                        Projections.excludeId()
                )
        ).forEach((Consumer<? super Document>) document -> System.out.println(document.toJson()));
    }



}
