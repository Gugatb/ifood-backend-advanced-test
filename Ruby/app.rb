
require './open_weather_map.rb'
require './response.rb'
require './spotify.rb'

require 'rubygems'
require 'sinatra'

# Obter o dicionario.
# Author: Gugatb
# Date: 17/06/2018
# Param: params os parametros
# Return: dictionary o dicionario
def get_dictionary_by_coordinate(params)
  dictionary = {
    'category' => '',
    'city' => '',
    'country' => '',
    'error' => false,
    'latitude' => Float(0),
    'longitude' => Float(0),
    'temperature' => Float(0),
    'tracks' => []
  }

  begin
    # Obter a temperatura.
    dictionary['latitude'] = Float(params['latitude'])
    dictionary['longitude'] = Float(params['longitude'])
    temperature = get_temperature_by_coordinate(dictionary['latitude'], dictionary['longitude'])
    dictionary['temperature'] = Float(temperature)

    # Obter a categoria e faixas de reproducao.
    dictionary['category'] = get_category(dictionary['temperature'])
    dictionary['tracks'] = get_tracks(dictionary['category'])
  rescue Exception => message
    dictionary['error'] = message
  end
  return dictionary
end

# Obter o dicionario.
# Author: Gugatb
# Date: 17/06/2018
# Param: params os parametros
# Return: dictionary o dicionario
def get_dictionary_by_country(params)
  dictionary = {
    'category' => '',
    'city' => '',
    'country' => '',
    'error' => false,
    'latitude' => Float(0),
    'longitude' => Float(0),
    'temperature' => Float(0),
    'tracks' => []
  }

  begin
    # Obter a temperatura.
    dictionary['city'] = params['cityname']
    dictionary['country'] = params['countrycode']
    temperature = get_temperature_by_country(dictionary['city'], dictionary['country'])
    dictionary['temperature'] = Float(temperature)

    # Obter a categoria e faixas de reproducao.
    dictionary['category'] = get_category(dictionary['temperature'])
    dictionary['tracks'] = get_tracks(dictionary['category'])
  rescue Exception => message
    dictionary['error'] = message
  end
  return dictionary
end

# Obter os parametros.
# Author: Gugatb
# Date: 17/06/2018
# Param: params os parametros
# Return: params os parametros
def get_params_by_coordinate(params)
  dictionary = get_dictionary_by_coordinate(params)
  recommendation = {
    'dictionary' => dictionary,
    'error' => false,
    'location' => get_rlocation('', '', Float(0), Float(0)),
    'playlist' => get_rplaylist('', []),
    'temperature' => get_rtemperature(Float(0))
  }

  if dictionary['error'] == false
    begin
      # Obter a localizacao, lista de reproducao e temperatura.
      recommendation['location'] = get_rlocation(dictionary['city'], dictionary['country'], dictionary['latitude'], dictionary['longitude'])
      recommendation['playlist'] = get_rplaylist(dictionary['category'], dictionary['tracks'])
      recommendation['temperature'] = get_rtemperature(dictionary['temperature'])
    rescue
      recommendation['error'] = true
    end
  else
    recommendation['error'] = true
  end
  return recommendation
end

# Obter os parametros.
# Author: Gugatb
# Date: 17/06/2018
# Param: params os parametros
# Return: params os parametros
def get_params_by_country(params)
  dictionary = get_dictionary_by_country(params)
  recommendation = {
      'dictionary' => dictionary,
      'error' => false,
      'location' => get_rlocation('', '', Float(0), Float(0)),
      'playlist' => get_rplaylist('', []),
      'temperature' => get_rtemperature(Float(0))
  }

  if dictionary['error'] == false
    begin
      # Obter a localizacao, lista de reproducao e temperatura.
      recommendation['location'] = get_rlocation(dictionary['city'], dictionary['country'], dictionary['latitude'], dictionary['longitude'])
      recommendation['playlist'] = get_rplaylist(dictionary['category'], dictionary['tracks'])
      recommendation['temperature'] = get_rtemperature(dictionary['temperature'])
    rescue
      recommendation['error'] = true
    end
  else
    recommendation['error'] = true
  end
  return recommendation
end

# Obter a categoria.
# Author: Gugatb
# Date: 17/06/2018
# Param: params os parametros
# Return: category a categoria
def get_acategory_by_coordinate(params)
  dictionary = get_dictionary_by_coordinate(params)

  if dictionary['error'] == false
    return get_rresponse(dictionary['category'])
  else
    return get_rresponse('')
  end
end

# Obter a categoria.
# Author: Gugatb
# Date: 17/06/2018
# Param: params os parametros
# Return: category a categoria
def get_acategory_by_country(params)
  dictionary = get_dictionary_by_country(params)

  if dictionary['error'] == false
    return get_rresponse(dictionary['category'])
  else
    return get_rresponse('')
  end
end

# Obter a lista de reproducao.
# Author: Gugatb
# Date: 17/06/2018
# Param: category a categoria
# Return: playlist a lista de reproducao
def get_aplaylist(category)
  begin
      # Obter as faixas de reproducao.
      tracks = get_tracks(category)

      # Definir a resposta.
      playlist = get_rplaylist(category, tracks)
      return get_rresponse(playlist)
  rescue
      return get_rresponse('')
  end
end

# Obter a recomendacao.
# Author: Gugatb
# Date: 17/06/2018
# Param: paramss os parametros
# Return recommendation a recomendacao
def get_arecommendation_by_coordinate(paramss)
  params = get_params_by_coordinate(paramss)

  if params['error'] == false
    # Definir a resposta.
    recommendation = get_rrecommendation(params['location'], params['playlist'], params['temperature'])
    return get_rresponse(recommendation)
  else
    return get_rresponse('')
  end
end

# Obter a recomendacao.
# Author: Gugatb
# Date: 17/06/2018
# Param: paramss os parametros
# Return recommendation a recomendacao
def get_arecommendation_by_coordinate2(paramss)
  params = get_params_by_coordinate(paramss)

  if params['error'] == false
    # Definir a resposta.
    return get_rresponse(params['playlist'])
  else
    return get_rresponse('')
  end
end

# Obter a recomendacao.
# Author: Gugatb
# Date: 17/06/2018
# Param: paramss os parametros
# Return recommendation a recomendacao
def get_arecommendation_by_coordinate3(paramss)
  params = get_params_by_coordinate(paramss)

  if params['error'] == false
      # Definir a resposta.
      return response.get_response(params['dictionary']['tracks'])
  else
      return response.get_response('')
  end
end

# Obter a recomendacao.
# Author: Gugatb
# Date: 17/06/2018
# Param: paramss os parametros
# Return recommendation a recomendacao
def get_arecommendation_by_country(paramss)
  params = get_params_by_country(paramss)

  if params['error'] == false
    # Definir a resposta.
    recommendation = get_rrecommendation(params['location'], params['playlist'], params['temperature'])
    return get_rresponse(recommendation)
  else
    return get_rresponse('')
  end
end

# Obter a recomendacao.
# Author: Gugatb
# Date: 17/06/2018
# Param: paramss os parametros
# Return recommendation a recomendacao
def get_arecommendation_by_country2(paramss)
  params = get_params_by_country(paramss)

  if params['error'] == false
    # Definir a resposta.
    return get_rresponse(params['playlist'])
  else
    return get_rresponse('')
  end
end

# Obter a recomendacao.
# Author: Gugatb
# Date: 17/06/2018
# Param: paramss os parametros
# Return recommendation a recomendacao
def get_arecommendation_by_country3(paramss)
  params = get_params_by_country(paramss)

  if params['error'] == false
    # Definir a resposta.
    return get_rresponse(params['dictionary']['tracks'])
  else
    return get_rresponse('')
  end
end

# Obter a temperatura.
# Author: Gugatb
# Date: 17/06/2018
# Param: params os parametros
# Return temperature a temperatura
def get_atemperature_by_coordinate(params)
  dictionary = get_dictionary_by_coordinate(params)

  if dictionary['error'] == false
    # Definir a resposta.
    return get_rresponse(dictionary['temperature'])
  else
    return get_rresponse('')
  end
end

# Obter a temperatura.
# Author: Gugatb
# Date: 17/06/2018
# Param: params os parametros
# Return temperature a temperatura
def get_atemperature_by_country(params)
  dictionary = get_dictionary_by_country(params)

  if dictionary['error'] == false
    # Definir a resposta.
    return get_rresponse(dictionary['temperature'])
  else
    return get_rresponse('')
  end
end

# Obter as faixas.
# Author: Gugatb
# Date: 17/06/2018
# Param: category a categoria
# Return: tracks as faixas
def get_atracks(category)
  begin
      # Obter as faixas de reproducao.
      tracks = get_tracks(category)

      # Definir a resposta.
      return get_rresponse(tracks)
  rescue
      return get_rresponse('')
  end
end

# Definir os endpoints e a porta.
set :port, 8080

get '/category/city' do
  get_acategory_by_country(params).to_json
end

get '/category/coordinate' do
  get_acategory_by_coordinate(params).to_json
end

get '/spotify/playlist/:category' do
  get_aplaylist(params[:category]).to_json
end

get '/recommendation/coordinate' do
  get_arecommendation_by_coordinate(params).to_json
end

get '/recommendation/playlist/coordinate' do
  get_arecommendation_by_coordinate2(params).to_json
end

get '/recommendation/track/coordinate' do
  get_arecommendation_by_coordinate3(params).to_json
end

get '/recommendation/city' do
  get_arecommendation_by_country(params).to_json
end

get '/recommendation/playlist/city' do
  get_arecommendation_by_country2(params).to_json
end

get '/recommendation/track/city' do
  get_arecommendation_by_country3(params).to_json
end

get '/spotify/track/:category' do
  get_atracks(params[:category]).to_json
end

get '/temperature/city' do
  get_atemperature_by_country(params).to_json
end

get '/temperature/coordinate' do
  get_atemperature_by_coordinate(params).to_json
end
