package com.technical.instaclone.Controller;

import com.technical.instaclone.Entity.Status;
import com.technical.instaclone.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    StatusService statusService;
    @PostMapping("")
    private Status submitStatus(@RequestBody Status status){
        return statusService.submitDataInDB(status);
    }
    @GetMapping("")
    private ArrayList<Status> getAllStatus()
    {
        return statusService.retriveStatus();
    }

}
