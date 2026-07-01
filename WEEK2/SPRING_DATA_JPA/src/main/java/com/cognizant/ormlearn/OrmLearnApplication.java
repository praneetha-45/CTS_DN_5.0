package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        testGetAllCountries();

        testFindCountry();

        testAddCountry();

        testUpdateCountry();

        testDeleteCountry();

        testFindCountriesByPartialName();
    }

    // Get all countries
    private void testGetAllCountries() {

        System.out.println("\n===== ALL COUNTRIES =====");

        List<Country> countries = countryService.getAllCountries();

        countries.forEach(System.out::println);
    }

    // Find country by code
    private void testFindCountry() throws CountryNotFoundException {

        System.out.println("\n===== FIND COUNTRY =====");

        Country country = countryService.findCountryByCode("IN");

        System.out.println(country);
    }

    // Add country
    private void testAddCountry() throws CountryNotFoundException {

        System.out.println("\n===== ADD COUNTRY =====");

        Country country = new Country("JP", "Japan");

        countryService.addCountry(country);

        System.out.println(countryService.findCountryByCode("JP"));
    }

    // Update country
    private void testUpdateCountry() throws CountryNotFoundException {

        System.out.println("\n===== UPDATE COUNTRY =====");

        countryService.updateCountry("JP", "Japan Updated");

        System.out.println(countryService.findCountryByCode("JP"));
    }

    // Delete country
    private void testDeleteCountry() {

        System.out.println("\n===== DELETE COUNTRY =====");

        countryService.deleteCountry("JP");

        System.out.println("Country JP deleted successfully.");
    }

    // Find countries by partial name
    private void testFindCountriesByPartialName() {

        System.out.println("\n===== SEARCH BY PARTIAL NAME =====");

        List<Country> countries =
                countryService.findCountriesByPartialName("Ind");

        countries.forEach(System.out::println);
    }
}