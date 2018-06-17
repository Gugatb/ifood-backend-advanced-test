
require 'open_weather'

# APIs information.
@open_weather_map_key = ''

# Definir as opcoes.
@options = {units: "metric", APPID: @open_weather_map_key}

# Obter a temperatura.
# Author: Gugatb
# Date: 17/06/2018
# Param: latitude a latitude
# Param: longitude a longitude
# Return: temperature a temperatura
def get_temperature_by_coordinate(latitude, longitude)
    temperature = 0

    begin
      # current = OpenWeather::Current.geocode(latitude, longitude, @options)
      # json = JSON.parse(current.to_json)
      # temperature = Float(json["main"]["temp"])
    rescue Exception => message
      puts message
    end
    return temperature
end

# Obter a temperatura.
# Author: Gugatb
# Date: 17/06/2018
# Param: city a cidade
# Param: country o pais
# Return: temperature a temperatura
def get_temperature_by_country(city, country)
    temperature = 0

    begin
      # current = OpenWeather::Current.city(city + ',' + country, @options)
      # json = JSON.parse(current.to_json)
      # temperature = Float(json["main"]["temp"])
    rescue Exception => message
      puts message
    end
    return temperature
end
