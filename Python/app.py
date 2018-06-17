
import json

from flask import Flask, request
from flask_restful import Resource, Api, reqparse
from open_weather_map import *
from response import *
from spotify import *

app = Flask(__name__)
api = Api(app)
response = response()
spotify = spotify()
owm = open_weather_map()

def get_dictionary_by_coordinate(request):
    """
    Obter o dicionario.
    Author: Gugatb
    Date: 17/06/2018
    Param: request a requisicao
    Return: dictionary o dicionario
    """
    dictionary = {
        'category': '',
        'city': '',
        'country': '',
        'error': False,
        'latitude': float(0),
        'longitude': float(0),
        'temperature': float(0),
        'tracks': []
    }

    try:
        # Obter os parametros.
        parser = request.RequestParser()
        parser.add_argument('latitude', type = str)
        parser.add_argument('longitude', type = str)

        # Obter a temperatura.
        dictionary['latitude'] = float(parser.parse_args()['latitude'])
        dictionary['longitude'] = float(parser.parse_args()['longitude'])
        temperature = owm.get_temperature_by_coordinate(dictionary['latitude'], dictionary['longitude']).get('temp')
        dictionary['temperature'] = float(temperature)

        # Obter a categoria e faixas de reproducao.
        dictionary['category'] = spotify.get_category(dictionary['temperature'])
        dictionary['tracks'] = spotify.get_tracks(dictionary['category'])
    except:
        dictionary['error'] = True
    return dictionary

def get_dictionary_by_country(request):
    """
    Obter o dicionario.
    Author: Gugatb
    Date: 17/06/2018
    Param: request a requisicao
    Return: dictionary o dicionario
    """
    dictionary = {
        'category': '',
        'city': '',
        'country': '',
        'error': False,
        'latitude': float(0),
        'longitude': float(0),
        'temperature': float(0),
        'tracks': []
    }

    try:
        # Obter os parametros.
        parser = request.RequestParser()
        parser.add_argument('cityname', type = str)
        parser.add_argument('countrycode', type = str)

        # Obter a temperatura.
        dictionary['city'] = parser.parse_args()['cityname']
        dictionary['country'] = parser.parse_args()['countrycode']
        temperature = owm.get_temperature_by_country(dictionary['city'], dictionary['country']).get('temp')
        dictionary['temperature'] = float(temperature)

        # Obter a categoria e faixas de reproducao.
        dictionary['category'] = spotify.get_category(dictionary['temperature'])
        dictionary['tracks'] = spotify.get_tracks(dictionary['category'])
    except:
        dictionary['error'] = True
    return dictionary

def get_params_by_coordinate(request):
    """
    Obter os parametros.
    Author: Gugatb
    Date: 17/06/2018
    Param: request a requisicao
    Return: params os parametros
    """
    dictionary = get_dictionary_by_coordinate(request)
    recommendation = {
        'dictionary': dictionary,
        'error': False,
        'location': response.get_location('', '', float(0), float(0)),
        'playlist': response.get_playlist('', []),
        'temperature': response.get_temperature(float(0))
    }

    if dictionary['error'] == False:
        try:
            # Obter a localizacao, lista de reproducao e temperatura.
            recommendation['location'] = response.get_location(dictionary['city'], dictionary['country'], dictionary['latitude'], dictionary['longitude'])
            recommendation['playlist'] = response.get_playlist(dictionary['category'], dictionary['tracks'])
            recommendation['temperature'] = response.get_temperature(dictionary['temperature'])
        except:
            recommendation['error'] = True
    else:
        recommendation['error'] = True
    return recommendation

def get_params_by_country(request):
    """
    Obter os parametros.
    Author: Gugatb
    Date: 17/06/2018
    Param: request a requisicao
    Return: params os parametros
    """
    dictionary = get_dictionary_by_country(request)
    recommendation = {
        'dictionary': dictionary,
        'error': False,
        'location': response.get_location('', '', float(0), float(0)),
        'playlist': response.get_playlist('', []),
        'temperature': response.get_temperature(float(0))
    }

    if dictionary['error'] == False:
        try:
            # Obter a localizacao, lista de reproducao e temperatura.
            recommendation['location'] = response.get_location(dictionary['city'], dictionary['country'], dictionary['latitude'], dictionary['longitude'])
            recommendation['playlist'] = response.get_playlist(dictionary['category'], dictionary['tracks'])
            recommendation['temperature'] = response.get_temperature(dictionary['temperature'])
        except:
            recommendation['error'] = True
    else:
        recommendation['error'] = True
    return recommendation

class get_category_by_coordinate(Resource):
    """
    Obter a categoria.
    Author: Gugatb
    Date: 17/06/2018
    Return: category a categoria
    """
    def get(self):
        dictionary = get_dictionary_by_coordinate(reqparse)

        if dictionary['error'] == False:
            return response.get_response(dictionary['category'])
        else:
            return response.get_response('')

class get_category_by_country(Resource):
    """
    Obter a categoria.
    Author: Gugatb
    Date: 17/06/2018
    Return: category a categoria
    """
    def get(self):
        dictionary = get_dictionary_by_country(reqparse)

        if dictionary['error'] == False:
            return response.get_response(dictionary['category'])
        else:
            return response.get_response('')


class get_recommendation_by_coordinate(Resource):
    """
    Obter a recomendacao.
    Author: Gugatb
    Date: 17/06/2018
    Return recommendation a recomendacao
    """
    def get(self):
        params = get_params_by_coordinate(reqparse)

        if params['error'] == False:
            # Definir a resposta.
            recommendation = response.get_recommendation(params['location'], params['playlist'], params['temperature'])
            return response.get_response(recommendation)
        else:
            return response.get_response('')

class get_recommendation_by_coordinate2(Resource):
    """
    Obter a recomendacao.
    Author: Gugatb
    Date: 17/06/2018
    Return recommendation a recomendacao
    """
    def get(self):
        params = get_params_by_coordinate(reqparse)

        if params['error'] == False:
            # Definir a resposta.
            return response.get_response(params['playlist'])
        else:
            return response.get_response('')

class get_recommendation_by_coordinate3(Resource):
    """
    Obter a recomendacao.
    Author: Gugatb
    Date: 17/06/2018
    Return recommendation a recomendacao
    """
    def get(self):
        params = get_params_by_coordinate(reqparse)

        if params['error'] == False:
            # Definir a resposta.
            return response.get_response(params['dictionary']['tracks'])
        else:
            return response.get_response('')

class get_recommendation_by_country(Resource):
    """
    Obter a recomendacao.
    Author: Gugatb
    Date: 16/06/2018
    Return recommendation a recomendacao
    """
    def get(self):
        params = get_params_by_country(reqparse)

        if params['error'] == False:
            # Definir a resposta.
            recommendation = response.get_recommendation(params['location'], params['playlist'], params['temperature'])
            return response.get_response(recommendation)
        else:
            return response.get_response('')

class get_recommendation_by_country2(Resource):
    """
    Obter a recomendacao.
    Author: Gugatb
    Date: 17/06/2018
    Return recommendation a recomendacao
    """
    def get(self):
        params = get_params_by_country(reqparse)

        if params['error'] == False:
            # Definir a resposta.
            return response.get_response(params['playlist'])
        else:
            return response.get_response('')

class get_recommendation_by_country3(Resource):
    """
    Obter a recomendacao.
    Author: Gugatb
    Date: 17/06/2018
    Return recommendation a recomendacao
    """
    def get(self):
        params = get_params_by_country(reqparse)

        if params['error'] == False:
            # Definir a resposta.
            return response.get_response(params['dictionary']['tracks'])
        else:
            return response.get_response('')

class get_playlist(Resource):
    """
    Obter a lista de reproducao.
    Author: Gugatb
    Date: 16/06/2018
    Param: category a categoria
    Return: playlist a lista de reproducao
    """
    def get(self, category):
        try:
            # Obter as faixas de reproducao.
            tracks = spotify.get_tracks(category)

            # Definir a resposta.
            playlist = response.get_playlist(category, tracks)
            return response.get_response(playlist)
        except:
            return response.get_response('')

class get_temperature_by_coordinate(Resource):
    """
    Obter a temperatura.
    Author: Gugatb
    Date: 17/06/2018
    Return temperature a temperatura
    """
    def get(self):
        dictionary = get_dictionary_by_coordinate(reqparse)

        if dictionary['error'] == False:
            # Definir a resposta.
            return response.get_response(dictionary['temperature'])
        else:
            return response.get_response('')

class get_temperature_by_country(Resource):
    """
    Obter a temperatura.
    Author: Gugatb
    Date: 17/06/2018
    Return temperature a temperatura
    """
    def get(self):
        dictionary = get_dictionary_by_country(reqparse)

        if dictionary['error'] == False:
            # Definir a resposta.
            return response.get_response(dictionary['temperature'])
        else:
            return response.get_response('')

class get_tracks(Resource):
    """
    Obter as faixas.
    Author: Gugatb
    Date: 17/06/2018
    Param: category a categoria
    Return: tracks as faixas
    """
    def get(self, category):
        try:
            # Obter as faixas de reproducao.
            tracks = spotify.get_tracks(category)

            # Definir a resposta.
            return response.get_response(tracks)
        except:
            return response.get_response('')

# Definindo os endpoints.
api.add_resource(get_category_by_coordinate, '/category/coordinate')
api.add_resource(get_category_by_country, '/category/city')
api.add_resource(get_playlist, '/spotify/playlist/<category>')
api.add_resource(get_recommendation_by_coordinate, '/recommendation/coordinate')
api.add_resource(get_recommendation_by_coordinate2, '/recommendation/playlist/coordinate')
api.add_resource(get_recommendation_by_coordinate3, '/recommendation/track/coordinate')
api.add_resource(get_recommendation_by_country, '/recommendation/city')
api.add_resource(get_recommendation_by_country2, '/recommendation/playlist/city')
api.add_resource(get_recommendation_by_country3, '/recommendation/track/city')
api.add_resource(get_temperature_by_coordinate, '/temperature/coordinate')
api.add_resource(get_temperature_by_country, '/temperature/city')
api.add_resource(get_tracks, '/spotify/track/<category>')

if __name__ == '__main__':
	app.run(debug=True, port='8080')
