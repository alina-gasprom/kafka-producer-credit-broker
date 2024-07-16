package ru.alina.kafkaproducerforcreditbroker.dto;


public class UserDto {
    private final String username;
    private final String surname;
    private final String secondName;
    private final String passportSeries;
    private final String passportNumber;

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
