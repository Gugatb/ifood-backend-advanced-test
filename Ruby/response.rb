
# Obter a localizacao.
# Author: Gugatb
# Date: 17/06/2018
# Param: city a cidade
# Param: country o pais
# Param: latitude a latitude
# Param: longitude a longitude
# Return: location a localizacao
def get_rlocation(city, country, latitude, longitude)
    return {'city' => city, 'country' => country, 'latitude' => latitude, 'longitude' => longitude}
end

# Obter a lista de reproducao.
# Author: Gugatb
# Date: 17/06/2018
# Param: category a categoria
# Param: tracks as faixas
# Return: playlist a lista de reproducao
def get_rplaylist(category, tracks)
    return {'category' => category, 'tracks' => get_rtracks(tracks)}
end

# Obter a recomendacao.
# Author: Gugatb
# Date: 17/06/2018
# Param: location a localizacao
# Param: playlist a lista de reproducao
# Param temperature a temperatura
# Return: recommendation a recomendacao
def get_rrecommendation(location, playlist, temperature)
    return {'location' => location, 'playlist' => playlist, 'temperature' => temperature}
end

# Obter a resposta.
# Author: Gugatb
# Date: 17/06/2018
# Param: value o valor
# Return: response a resposta
def get_rresponse(value)
    return {'response' => value, 'time' => Time.now}
end

# Obter a temperatura.
# Author: Gugatb
# Date: 17/06/2018
# Param: value o valor
# Return: temperature a temperatura
def get_rtemperature(value)
    return {'unit' => 'CELSIUS', 'value' => value}
end

# Obter as faixas.
# Author: Gugatb
# Date: 17/06/2018
# Param: tracks as faixas
# Return: tracks as faixas
def get_rtracks(tracks)
    array = []

    tracks.each { |track|
        array << {'name' => track}
    }
    return array
end
