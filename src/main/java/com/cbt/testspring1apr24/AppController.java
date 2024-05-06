package com.cbt.testspring1apr24;

import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1")
public class AppController
{
    private final BusroutestationRepository busroutestationRepository;
    BookingRepository bookingRepo;
    BusroutestationRepository busRouteStationRepo;
    PassengerRepository passengerRepo;
    PaymentRepository paymentRepo;
    TransactionRepository transactionRepo;
     AppController(BookingRepository bookingRepo,
                   BusroutestationRepository busRouteStationRepo,
                   PassengerRepository passengerRepo,
                   PaymentRepository paymentRepo,
                   TransactionRepository transactionRepo, BusroutestationRepository busroutestationRepository)
    {
    this.bookingRepo = bookingRepo;
    this.busRouteStationRepo = busRouteStationRepo;
    this.passengerRepo = passengerRepo;
    this.paymentRepo = paymentRepo;
    this.transactionRepo = transactionRepo;
        this.busroutestationRepository = busroutestationRepository;
    }

    @GetMapping("get/all/routes")
    public ResponseEntity<List<Busroutestation>> getAllBusRoutes()
    {
         return ResponseEntity.ok(busRouteStationRepo.findAll());
    }

    @PostMapping("add/route")
    public ResponseEntity<Busroutestation> addRoute(@RequestBody Busroutestation busroutestation)
    {
        busRouteStationRepo.save(busroutestation);
        return ResponseEntity.ok(busroutestation);
    }


    @PostMapping("delete/route/{routeid}")
    @Transactional
    public ResponseEntity<String> deleteRoute(@PathVariable int routeid)
    {
        busRouteStationRepo.deleteById(routeid);
        return ResponseEntity.ok("BusRoute deleted");
    }

    @PostMapping("update/route")
    @Transactional
    public ResponseEntity<String> updateRoute(@RequestBody Busroutestation busroutestation)
    {
        Busroutestation route =  busRouteStationRepo.findById(busroutestation.getId()).get();
        route.setBusnumber(busroutestation.getBusnumber());
        route.setDestination(busroutestation.getDestination());
        route.setSource(busroutestation.getSource());
        route.setPrice(busroutestation.getPrice());
        busRouteStationRepo.save(route);
        return ResponseEntity.ok("BusRoute Updated");
    }
}
