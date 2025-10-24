package com.ruturaj.book_management_api.controller;

import com.ruturaj.book_management_api.entity.BookEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private Map<Long, BookEntry> bookEntries = new HashMap<Long, BookEntry>();

    @GetMapping
    public List<BookEntry> getAll(){
        return new ArrayList<>(bookEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody BookEntry newBookEntry){
        bookEntries.put(newBookEntry.getId(), newBookEntry);
        return true;
    }

    @GetMapping("/{myId}")
    public BookEntry getById(@PathVariable Long myId){
        return bookEntries.get(myId);
    }

    @PutMapping("/{myId}")
    public BookEntry modifyEntryById(@PathVariable Long myId, @RequestBody BookEntry updatedBook){
        return bookEntries.put(myId, updatedBook);
    }

    @DeleteMapping("/{myId}")
    public boolean deleteEntryById(@PathVariable Long myId){
        bookEntries.remove(myId);
        return true;
    }
}
