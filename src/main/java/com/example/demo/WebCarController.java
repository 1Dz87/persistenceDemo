package com.example.demo;

import com.example.demo.model.Cabriolet;
import com.example.demo.model.Truck;
import com.example.demo.persistence.CabrioletRepository;
import com.example.demo.persistence.TruckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class WebCarController {

    public final TruckRepository truckRepository;

    public final CabrioletRepository cabrioletRepository;

    @GetMapping("/create")
    public void doCreate() {
        Truck truck = new Truck();
        truck.setWeight(6000F);
        truck.setMaxWeightLift(12000F);
        Cabriolet cabriolet = new Cabriolet();
        cabriolet.setSpeed(200F);
        cabriolet.setWeight(1200F);
        truckRepository.save(truck);
        cabrioletRepository.save(cabriolet);

    }
}
