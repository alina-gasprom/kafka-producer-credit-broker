package ru.alina.kafkaproducerforcreditbroker.dto;


import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto {

    @NotBlank
    private final String username;

    @NotBlank
    private final String surname;

    private final String secondName;

    @NotBlank
    @Size(min = 4, max = 4)
    private final String passportSeries;

    @NotBlank
    @Size(min = 6, max = 6)
    private final String passportNumber;

    @JsonCreator
    public UserDto(String username, String surname, String secondName, String passportSeries, String passportNumber) {
        this.username = username;
        this.surname = surname;
        this.secondName = secondName;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
