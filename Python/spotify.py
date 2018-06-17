
import json
import spotipy
import spotipy.oauth2 as oauth2

# APIs information.
spotify_client_id = ''
spotify_secret = ''

class spotify:
    def create_token(self):
        """
        Criar o token.
        Author: Gugatb
        Date: 16/06/2018
        Return: token o token
        """
        try:
            credentials = oauth2.SpotifyClientCredentials(
                client_id = spotify_client_id,
                client_secret = spotify_secret)
            token = credentials.get_access_token()
        except:
            token = ''
        return token

    def get_category(self, temperature):
        """
        Criar a categoria.
        Author: Gugatb
        Date: 16/06/2018
        Param: temperature a temperatura
        Return: category a categoria
        """
        category = ''

        if temperature <= 9:
            category = 'classical'
        elif temperature >= 10 and temperature <= 14:
            category = 'rock'
        elif temperature >= 15 and temperature <= 30:
            category = 'pop'
        else:
            category = 'party'
        return category

    def get_token(self):
        """
        Obter o token.
        Author: Gugatb
        Date: 16/06/2018
        Return: token o token
        """
        return self.token

    def get_tracks(self, category):
        """
        Obter as faixas.
        Author: Gugatb
        Date: 16/06/2018
        Param: category a categoria
        Return: tracks as faixas
        """
        tracks = []

        if self.token != '':
            result = self.instance.search(q = category, limit = 20)
            for attribute, value in result.items():
                for item in value.get('items'):
                    tracks.append(item.get('name', 'NA'))
        return tracks

    def __init__(self):
        self.token = spotify.create_token(self)

        if self.token != '':
            self.instance = spotipy.Spotify(auth = self.token)
