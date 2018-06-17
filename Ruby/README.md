
Technologies used
-----------------------------------------------------------------------------------------
Ruby 2.5, Open Weather Map (open-weather), Sinatra, Spotify (RSpotify)

Settings and notes
-----------------------------------------------------------------------------------------
Define the constants in open_weather_map.rb.

1. open_weather_map_key

Define the constants in spotify.rb.

1. spotify_client_id
2. spotify_secret

Set the path to Windows if not configured.

SETX PATH "%PATH%;C:\Ruby25-x64\bin"

Needed to install.

1. gem install open-weather
2. gem install rspotify
3. gem install sinatra

Script to be executed.

ruby app.rb

Endpoints to category
-----------------------------------------------------------------------------------------
localhost:8080/category/city?cityname=campinas&countrycode=br

localhost:8080/category/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

Endpoints to Spotify
-----------------------------------------------------------------------------------------
localhost:8080/spotify/playlist/classical

localhost:8080/spotify/playlist/party

localhost:8080/spotify/playlist/pop

localhost:8080/spotify/playlist/rock

-----------------------------------------------------------------------------------------

localhost:8080/spotify/track/classical

localhost:8080/spotify/track/party

localhost:8080/spotify/track/pop

localhost:8080/spotify/track/rock

Endpoints to recommendation
-----------------------------------------------------------------------------------------
localhost:8080/recommendation/city?cityname=campinas&countrycode=br

localhost:8080/recommendation/playlist/city?cityname=campinas&countrycode=br

localhost:8080/recommendation/track/city?cityname=campinas&countrycode=br

-----------------------------------------------------------------------------------------

localhost:8080/recommendation/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

localhost:8080/recommendation/playlist/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

localhost:8080/recommendation/track/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

Endpoints to temperature
-----------------------------------------------------------------------------------------
localhost:8080/temperature/city?cityname=campinas&countrycode=br

localhost:8080/temperature/coordinate?latitude=52.3555177&longitude=-1.1743197000000691
