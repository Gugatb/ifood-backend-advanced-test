
from datetime import datetime

class response:
    def get_response(self, value):
        """
        Obter a resposta.
        Author: Gugatb
        Date: 17/06/2018
        Param: value o valor
        Return: response a resposta
        """
        return {'response': value, 'time': str(datetime.now())}

    def get_tracks(self, tracks):
        """
        Obter as faixas.
        Author: Gugatb
        Date: 17/06/2018
        Param: tracks as faixas
        Return: tracks as faixas
        """
        array = []

        for track in tracks:
            array.append({"name": track})
        return array

    def get_playlist(self, category, tracks):
        """
        Obter a lista de reproducao.
        Author: Gugatb
        Date: 17/06/2018
        Param: category a categoria
        Param: tracks as faixas
        Return: playlist a lista de reproducao
        """
        return {'category': category, 'tracks': self.get_tracks(tracks)}

    def get_location(self, city, country, latitude, longitude):
        """
        Obter a localizacao.
        Author: Gugatb
        Date: 17/06/2018
        Param: city a cidade
        Param: country o pais
        Param: latitude a latitude
        Param: longitude a longitude
        Return: location a localizacao
        """
        return {'city': city, 'country': country, 'latitude': str(latitude), 'longitude': str(longitude)}

    def get_recommendation(self, location, playlist, temperature):
        """
        Obter a recomendacao.
        Author: Gugatb
        Date: 17/06/2018
        Param: location a localizacao
        Param: playlist a lista de reproducao
        Param temperature a temperatura
        Return: recommendation a recomendacao
        """
        return {'location': location, 'playlist': playlist, 'temperature': temperature}

    def get_temperature(self, value):
        """
        Obter a temperatura.
        Author: Gugatb
        Date: 17/06/2018
        Param: value o valor
        Return: temperature a temperatura
        """
        return {'unit': 'CELSIUS', 'value': str(value)}
