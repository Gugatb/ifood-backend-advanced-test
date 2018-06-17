
import json
import pyowm

# APIs information.
open_weather_map_key = ''

class open_weather_map:
    def get_city(self):
        """
        Obter a cidade.
        Author: Gugatb
        Date: 16/06/2018
        Return: city a cidade
        """
        return self.city

    def get_key(self):
        """
        Obter a chave.
        Author: Gugatb
        Date: 16/06/2018
        Return: key a chave
        """
        return self.key

    def get_temperature_by_coordinate(self, latitude, longitude):
        """
        Obter a temperatura.
        Author: Gugatb
        Date: 16/06/2018
        Param: latitude a latitude
        Param: longitude a longitude
        Return: temperature a temperatura
        """
        temperature = ''

        if self.key != '':
            observation = self.owm.weather_at_coords(latitude, longitude)
            weather = observation.get_weather()
            temperature = weather.get_temperature('celsius')
        return temperature

    def get_temperature_by_country(self, city, country):
        """
        Obter a temperatura.
        Author: Gugatb
        Date: 16/06/2018
        Param: city a cidade
        Param: country o pais
        Return: temperature a temperatura
        """
        temperature = ''

        if self.key != '':
            try:
                self.city = city
                self.country = country

                observation = self.owm.weather_at_place(self.city + ',' + self.country)
                weather = observation.get_weather()
                temperature = weather.get_temperature('celsius')
            except:
                self.city = ''
                self.country = ''
        return temperature

    def __init__(self):
        try:
            self.key = open_weather_map_key
            self.owm = pyowm.OWM(self.key)
        except:
            self.key = ''
