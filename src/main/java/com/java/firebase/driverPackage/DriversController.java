package com.java.firebase.driverPackage;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DriversController {
    public DriversService driversService;

    public DriversController(DriversService driversService){
        this.driversService = driversService;
    }

    @GetMapping("/getDriver")
    public Drivers getDriver(@RequestParam String driverID) throws Exception{
        return driversService.getDriver(driverID);
    }


    @PutMapping("/updateDriver")
    public String updateDriver(@RequestBody Drivers driver) throws Exception{
        return driversService.updateDriver(driver);
    }

    @PutMapping("/deleteDriver")
    public String deleteDriver(@RequestParam String driverID) throws Exception{
        return driversService.deleteDriver(driverID);
    }

    @GetMapping("/testDriver")
    public ResponseEntity<String> testGetEndPoint(){
        return ResponseEntity.ok("Test get endpoint is working");
    }
}
