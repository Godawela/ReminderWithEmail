package reminder.demo;

import java.util.List;

// src/main/java/com/example/reminder/ReminderController.java
// package com.example.reminder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reminders")
@CrossOrigin(origins= "*")
public class ReminderController {

    @Autowired
    private ReminderService reminderService;
    private ReminderRepository reminderRepository;

      @GetMapping
    public List<Reminder> getAllEvents() {
        return reminderRepository.findAll();
    }

    @PostMapping
    public Reminder createReminder(@RequestBody Reminder reminder) {
        return reminderService.saveReminder(reminder);
        
    }
}
