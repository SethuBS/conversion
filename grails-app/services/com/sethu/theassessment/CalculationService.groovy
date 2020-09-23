package com.sethu.theassessment

class CalculationService {


    def convertCelsiusToKelvin(float celsiusValue) {
        float oneCelsius = 273.15F
        return celsiusValue + oneCelsius
    }


    def convertMilesToKilometers(double distanceInMiles) {
        double oneMile = 1.60934
        return distanceInMiles * oneMile
    }


    def convertPoundsToKilograms(double pounds) {
        double onePound = 0.454
        return pounds * onePound
    }
}
