package ru.alina.kafkaproducerforcreditbroker.rest;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.alina.kafkaproducerforcreditbroker.dto.UserDto;
import ru.alina.kafkaproducerforcreditbroker.producer.CreditService;

@RestController
@RequestMapping("api/v1/credit")
public class CreditController {
    private final CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }

    @PostMapping
    public ResponseEntity<?> creditApplication(@RequestBody @Valid UserDto userDto) {
            creditService.creditApplication(userDto);
            return ResponseEntity.ok().build();
    }
}
