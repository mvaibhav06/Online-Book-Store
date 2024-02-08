package com.book.store.rest;

import com.book.store.entity.Publisher;
import com.book.store.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
public class PublisherRestController {

    PublisherService publisherService;

    @Autowired
    public PublisherRestController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping
    public List<Publisher> findAll(){
        return publisherService.findAll();
    }

    @GetMapping("/{id}")
    public Publisher findById(@PathVariable int id){
        return publisherService.findById(id);
    }

    @PostMapping
    public Publisher addPublisher(@RequestBody Publisher publisher){
        return publisherService.save(publisher);
    }
}
