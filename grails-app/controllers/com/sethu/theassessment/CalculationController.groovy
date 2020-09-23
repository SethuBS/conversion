package com.sethu.theassessment

class CalculationController {

    def calculationService

    def index() { }


    def celsiusToKelvin(float value){
        def response = GeneralUtils.responseSuccessObj()
        response.value_to_convert = value
        response.convesion_of_Celsius_To_Kelvin = calculationService.convertCelsiusToKelvin(value)
        render(contentType: "text/json") {
            response
        }
    }

    def milesToKilometers(double value){
        def response = GeneralUtils.responseSuccessObj()
        response.value_to_convert = value
        response.convesion_of_Miles_To_Kilometers = calculationService.convertMilesToKilometers(value)
        render(contentType: "text/json") {
            response
        }
    }

    def poundsToKilograms(double value){
        def response = GeneralUtils.responseSuccessObj()
        response.value_to_convert = value
        response.convesion_of_Pounds_To_Kilograms = calculationService.convertPoundsToKilograms(value)
        render(contentType: "text/json") {
            response
        }
    }
}
