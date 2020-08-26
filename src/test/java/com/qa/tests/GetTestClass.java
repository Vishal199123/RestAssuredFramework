package com.qa.tests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GetTestClass {

    @Test(enabled=false)
    public void getTest(){

        given()
                .header("content-type","application/json")
                .get("https://reqres.in/api/users?page=2")
                .then()
                        .statusCode(200)
                        .body("data.id[1]",equalTo(8))
                        .body("data.first_name",hasItems("Michael","Lindsay"))
                        .log()
                        .all();
    }

    @Test(enabled=false)
    public void postTest(){

        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("name","Vishal");
        bodyJSON.put("job","QA");

        given()
                .header("content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(bodyJSON.toJSONString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201);
    }

    @Test(enabled=true)
    public void putTest(){

        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("name","Vishal");
        bodyJSON.put("job","QA");

        given()
                .header("content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(bodyJSON.toJSONString())
                .when()
                .put("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test(enabled=true)
    public void patchTest(){

        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("name","Vishal");
        bodyJSON.put("job","QA");

        given()
                .header("content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(bodyJSON.toJSONString())
                .when()
                .patch("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test(enabled=true)
    public void deleteTest(){

        given()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .log().all();
    }
}
