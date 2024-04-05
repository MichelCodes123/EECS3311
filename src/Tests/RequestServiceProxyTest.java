package Tests;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import models.Request;

public class RequestServiceProxyTest {

    @Test
    void ObjectCreation() {
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertNotNull(rs);
    }

    @Test
    void RequestProxyCreation1() {
       Request req = new Request("110-11", "1", "Course");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertDoesNotThrow(() -> {rs.addRequest(req);});

    }

    @Test
    void RequestProxyCreation2() {
        Request req = new Request("110", "1", "Course");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertDoesNotThrow(() -> {rs.addRequest(req);});

    }

    @Test
    void RequestProxyCreation3() {
        Request req = new Request("110-11", "1-11", "Course");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertDoesNotThrow(() -> {rs.addRequest(req);});

    }

    @Test
    void RequestProxyCreation4() {
        Request req = new Request("110-11", "1", "Course");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertDoesNotThrow(() -> {rs.addRequest(req);});

    }

    @Test
    void RequestProxyCreation5() {
        Request req = new Request("110-11", "1", "NotCourse");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertDoesNotThrow(() -> {rs.addRequest(req);});

    }

    @Test
    void RequestProxyCreation6() {
        Request req = new Request("110-11", "1-11", "NotCourse");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertDoesNotThrow(() -> {rs.addRequest(req);});

    }

    @Test
    void RequestProxyCreation7() {
        Request req = new Request("110", "1-11", "NotCourse");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertDoesNotThrow(() -> {rs.addRequest(req);});

    }

    @Test
    void DoesNotMorphType() {
        Request req = new Request("110", "1-11", "Course");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
       assertEquals("Course", req.getType());

    }

    @Test
    void DoesNotMorphType2() {
        Request req = new Request("110", "1-11", "NotCourse");
        services.RequestServiceProxy rs = new services.RequestServiceProxy();
        assertEquals("NotCourse", req.getType());

    }

}