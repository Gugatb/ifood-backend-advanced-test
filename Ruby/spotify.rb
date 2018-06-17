
require 'rspotify'

# APIs information.
@spotify_client_id = ''
@spotify_secret = ''

# Autenticar o cliente.
RSpotify.authenticate(@spotify_client_id, @spotify_secret)

# Criar a categoria.
# Author: Gugatb
# Date: 17/06/2018
# Param: temperature a temperatura
# Return: category a categoria
def get_category(temperature)
  category = ''

  if temperature <= 9
      category = 'classical'
  elsif temperature >= 10 and temperature <= 14
      category = 'rock'
  elsif temperature >= 15 and temperature <= 30
      category = 'pop'
  else
      category = 'party'
  end
  return category
end

# Criar a categoria.
# Author: Gugatb
# Date: 17/06/2018
# Param: category a categoria
# Return: tracks as faixas
def get_tracks(category)
  tracks = []

  begin
    # recommendations = RSpotify::Recommendations.generate(seed_genres: ['pop'])
    # recommendations.tracks.each { |track|
    #   tracks << track.name
    # }
  rescue Exception => message
    puts message
  end
  return tracks
end
