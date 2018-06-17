
Technologies used
-----------------------------------------------------------------------------------------
Java 8, Open Weather Map, Spotify, Spring Boot

Settings and notes
-----------------------------------------------------------------------------------------
Define the constants in com.ifood.Playlist.Api.

1. OPEN_WEATHER_MAP_KEY
2. SPOTIFY_CLIENT_ID
3. SPOTIFY_SECRET

To run the controller tests, the application must be running.

Endpoints to category
-----------------------------------------------------------------------------------------

localhost:8080/category/city?cityname=campinas

{"response":"POP","time":"2018-06-06T22:54:28.266+0000"}

localhost:8080/category/country?cityname=campinas&countrycode=br

{"response":"POP","time":"2018-06-06T22:54:41.942+0000"}

localhost:8080/category/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":"ROCK","time":"2018-06-06T22:55:26.879+0000"}

Endpoints to Spotify
-----------------------------------------------------------------------------------------

localhost:8080/spotify/playlist/classical

{"response":{"category":"classical","tracks":[{"name":"Requiem: Lacrimosa"},{"name":"Sonata No. 14 \"Moonlight\" in C-Sharp Minor\", Op. 27 No. 2: I. Adagio sostenuto"},{"name":"Unaccompanied Cello Suite No. 1 in G Major, BWV 1007: I. Prélude"},{"name":"Gymnopedie"},{"name":"Air on a G String"},{"name":"Adagio Albinoni"},{"name":"The Ludlows"},{"name":"Memories (Top Gun)"},{"name":"Six Etudes for Piano - q = 108"},{"name":"Bagatelle No. 25 in A Minor, WoO 59 \"Für Elise\""},{"name":"Blackbird (Arr. for Classical Guitar)"},{"name":"Goldberg-Variationen, BWV 988: Variatio 24. Canone all'Ottava. a 1 Clav."},{"name":"Love Story (Made Famous by Taylor Swift )"},{"name":"The Carnival of the Animals, R. 125: XIII. The Swan"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 18 in G-Sharp Minor, BWV 863"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 1 in C Major, BWV 846"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 2 in C Minor, BWV 847"},{"name":"The Well-Tempered Clavier, Book II, no. 5: Prelude in D Major - Remastered"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 3 in C-Sharp Major, BWV 848"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 4 in C-Sharp Minor, BWV 849"}]},"time":"2018-06-06T22:55:39.368+0000"}

localhost:8080/spotify/playlist/party

{"response":{"category":"party","tracks":[{"name":"Welcome to the Party (with French Montana & Lil Pump, feat. Zhavia Ward) - from Deadpool 2"},{"name":"Party"},{"name":"House Party"},{"name":"Play It Again"},{"name":"Party In The U.S.A."},{"name":"Party Monster"},{"name":"Dirt Road Anthem"},{"name":"My Kinda Party"},{"name":"That's My Kind Of Night"},{"name":"Come and See Me (feat. Drake)"},{"name":"Surprise Party (feat. Blackbear)"},{"name":"party favor"},{"name":"Body Party"},{"name":"Party Rock Anthem"},{"name":"Pity Party"},{"name":"Life Of The Party"},{"name":"Crash My Party"},{"name":"Party On The West Coast (feat. Snoop Dogg)"},{"name":"Party Up"},{"name":"Ride (feat. Macy Maloy)"}]},"time":"2018-06-06T22:57:35.114+0000"}

localhost:8080/spotify/playlist/pop

{"response":{"category":"pop","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Waking Lions"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Pop Dat"},{"name":"Pop iiT"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Waking Lions"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Footsteps"},{"name":"POP OUT"},{"name":"Trenches"}]},"time":"2018-06-06T22:56:25.729+0000"}

localhost:8080/spotify/playlist/rock

{"response":{"category":"rock","tracks":[{"name":"Horses (with PnB Rock, Kodak Black & A Boogie Wit da Hoodie)"},{"name":"Everyday We Lit (feat. PnB Rock)"},{"name":"Selfish"},{"name":"SMASH! - feat. PnB Rock"},{"name":"Rock"},{"name":"King's Dead (with Kendrick Lamar, Future & James Blake)"},{"name":"Beast Mode (feat. PnB Rock & YoungBoy Never Broke Again)"},{"name":"Rock Bottom"},{"name":"All Summer Long"},{"name":"Too Many Years"},{"name":"Should I Stay or Should I Go - Remastered"},{"name":"Imma Dog (feat. PnB Rock)"},{"name":"Issues (feat. Russ)"},{"name":"Rock Your Body"},{"name":"Rock the Casbah - Remastered"},{"name":"My Songs Know What You Did In The Dark (Light Em Up)"},{"name":"she ready"},{"name":"WIN"},{"name":"We Will Rock You - Remastered 2011"},{"name":"Feelins"}]},"time":"2018-06-06T22:56:40.004+0000"}

-----------------------------------------------------------------------------------------

localhost:8080/spotify/track/classical

{"response":[{"name":"Requiem: Lacrimosa"},{"name":"Sonata No. 14 \"Moonlight\" in C-Sharp Minor\", Op. 27 No. 2: I. Adagio sostenuto"},{"name":"Unaccompanied Cello Suite No. 1 in G Major, BWV 1007: I. Prélude"},{"name":"Gymnopedie"},{"name":"Air on a G String"},{"name":"Adagio Albinoni"},{"name":"The Ludlows"},{"name":"Memories (Top Gun)"},{"name":"Six Etudes for Piano - q = 108"},{"name":"Bagatelle No. 25 in A Minor, WoO 59 \"Für Elise\""},{"name":"Blackbird (Arr. for Classical Guitar)"},{"name":"Goldberg-Variationen, BWV 988: Variatio 24. Canone all'Ottava. a 1 Clav."},{"name":"Love Story (Made Famous by Taylor Swift )"},{"name":"The Carnival of the Animals, R. 125: XIII. The Swan"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 18 in G-Sharp Minor, BWV 863"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 1 in C Major, BWV 846"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 2 in C Minor, BWV 847"},{"name":"The Well-Tempered Clavier, Book II, no. 5: Prelude in D Major - Remastered"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 3 in C-Sharp Major, BWV 848"},{"name":"The Well-Tempered Clavier, Book 1: Prelude & Fugue No. 4 in C-Sharp Minor, BWV 849"}],"time":"2018-06-07T01:03:46.778+0000"}

localhost:8080/spotify/track/party

{"response":[{"name":"Welcome to the Party (with French Montana & Lil Pump, feat. Zhavia Ward) - from Deadpool 2"},{"name":"Party"},{"name":"House Party"},{"name":"Play It Again"},{"name":"Party In The U.S.A."},{"name":"Party Monster"},{"name":"Dirt Road Anthem"},{"name":"My Kinda Party"},{"name":"That's My Kind Of Night"},{"name":"Come and See Me (feat. Drake)"},{"name":"Surprise Party (feat. Blackbear)"},{"name":"party favor"},{"name":"Body Party"},{"name":"Party Rock Anthem"},{"name":"Pity Party"},{"name":"Life Of The Party"},{"name":"Crash My Party"},{"name":"Party On The West Coast (feat. Snoop Dogg)"},{"name":"Party Up"},{"name":"Ride (feat. Macy Maloy)"}],"time":"2018-06-07T01:04:32.412+0000"}

localhost:8080/spotify/track/pop

{"response":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Waking Lions"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Pop Dat"},{"name":"Pop iiT"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Waking Lions"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Footsteps"},{"name":"POP OUT"},{"name":"Trenches"}],"time":"2018-06-07T01:04:42.448+0000"}

localhost:8080/spotify/track/rock

{"response":[{"name":"Horses (with PnB Rock, Kodak Black & A Boogie Wit da Hoodie)"},{"name":"Everyday We Lit (feat. PnB Rock)"},{"name":"Selfish"},{"name":"SMASH! - feat. PnB Rock"},{"name":"Rock"},{"name":"King's Dead (with Kendrick Lamar, Future & James Blake)"},{"name":"Beast Mode (feat. PnB Rock & YoungBoy Never Broke Again)"},{"name":"Rock Bottom"},{"name":"All Summer Long"},{"name":"Too Many Years"},{"name":"Should I Stay or Should I Go - Remastered"},{"name":"Imma Dog (feat. PnB Rock)"},{"name":"Issues (feat. Russ)"},{"name":"Rock Your Body"},{"name":"Rock the Casbah - Remastered"},{"name":"My Songs Know What You Did In The Dark (Light Em Up)"},{"name":"she ready"},{"name":"WIN"},{"name":"We Will Rock You - Remastered 2011"},{"name":"Feelins"}],"time":"2018-06-07T01:04:52.045+0000"}

Endpoints to recommendation
-----------------------------------------------------------------------------------------

localhost:8080/recommendation/city?cityname=campinas

{"response":{"location":{"cityName":"campinas","countryCode":"","latitude":0.0,"longitude":0.0},"playlist":{"category":"POP","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Waking Lions"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Pop Dat"},{"name":"Pop iiT"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Waking Lions"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Footsteps"},{"name":"POP OUT"},{"name":"Trenches"}]},"temperature":{"unit":"CELSIUS","value":21.0}},"time":"2018-06-06T22:58:02.387+0000"}

localhost:8080/recommendation/playlist/city?cityname=campinas

{"response":{"category":"POP","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Waking Lions"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Pop Dat"},{"name":"Pop iiT"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Waking Lions"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Footsteps"},{"name":"POP OUT"},{"name":"Trenches"}]},"time":"2018-06-06T23:20:57.423+0000"}

localhost:8080/recommendation/track/city?cityname=campinas

{"response":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Waking Lions"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Pop Dat"},{"name":"Pop iiT"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Waking Lions"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Footsteps"},{"name":"POP OUT"},{"name":"Trenches"}],"time":"2018-06-06T23:21:35.488+0000"}

-----------------------------------------------------------------------------------------

localhost:8080/recommendation/country?cityname=campinas&countrycode=br

{"response":{"location":{"cityName":"campinas","countryCode":"br","latitude":0.0,"longitude":0.0},"playlist":{"category":"POP","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Waking Lions"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Pop Dat"},{"name":"Pop iiT"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Waking Lions"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Footsteps"},{"name":"POP OUT"},{"name":"Trenches"}]},"temperature":{"unit":"CELSIUS","value":21.0}},"time":"2018-06-06T22:58:29.665+0000"}

localhost:8080/recommendation/playlist/country?cityname=campinas&countrycode=br

{"response":{"category":"POP","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Waking Lions"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Pop Dat"},{"name":"Pop iiT"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Waking Lions"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Footsteps"},{"name":"POP OUT"},{"name":"Trenches"}]},"time":"2018-06-06T23:24:40.332+0000"}

localhost:8080/recommendation/track/country?cityname=campinas&countrycode=br

{"response":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Waking Lions"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Pop Dat"},{"name":"Pop iiT"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Waking Lions"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Footsteps"},{"name":"POP OUT"},{"name":"Trenches"}],"time":"2018-06-06T23:26:33.172+0000"}

-----------------------------------------------------------------------------------------

localhost:8080/recommendation/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":{"location":{"cityName":"","countryCode":"","latitude":52.35552,"longitude":-1.1743197},"playlist":{"category":"ROCK","tracks":[{"name":"Horses (with PnB Rock, Kodak Black & A Boogie Wit da Hoodie)"},{"name":"Everyday We Lit (feat. PnB Rock)"},{"name":"Selfish"},{"name":"SMASH! - feat. PnB Rock"},{"name":"Rock"},{"name":"King's Dead (with Kendrick Lamar, Future & James Blake)"},{"name":"Beast Mode (feat. PnB Rock & YoungBoy Never Broke Again)"},{"name":"Rock Bottom"},{"name":"All Summer Long"},{"name":"Too Many Years"},{"name":"Should I Stay or Should I Go - Remastered"},{"name":"Imma Dog (feat. PnB Rock)"},{"name":"Issues (feat. Russ)"},{"name":"Rock Your Body"},{"name":"Rock the Casbah - Remastered"},{"name":"My Songs Know What You Did In The Dark (Light Em Up)"},{"name":"she ready"},{"name":"WIN"},{"name":"We Will Rock You - Remastered 2011"},{"name":"Feelins"}]},"temperature":{"unit":"CELSIUS","value":13.0}},"time":"2018-06-06T22:58:45.417+0000"}

localhost:8080/recommendation/playlist/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":{"category":"ROCK","tracks":[{"name":"Horses (with PnB Rock, Kodak Black & A Boogie Wit da Hoodie)"},{"name":"Everyday We Lit (feat. PnB Rock)"},{"name":"Selfish"},{"name":"SMASH! - feat. PnB Rock"},{"name":"Rock"},{"name":"King's Dead (with Kendrick Lamar, Future & James Blake)"},{"name":"Beast Mode (feat. PnB Rock & YoungBoy Never Broke Again)"},{"name":"Rock Bottom"},{"name":"All Summer Long"},{"name":"Too Many Years"},{"name":"Should I Stay or Should I Go - Remastered"},{"name":"Imma Dog (feat. PnB Rock)"},{"name":"Issues (feat. Russ)"},{"name":"Rock Your Body"},{"name":"Rock the Casbah - Remastered"},{"name":"My Songs Know What You Did In The Dark (Light Em Up)"},{"name":"she ready"},{"name":"WIN"},{"name":"We Will Rock You - Remastered 2011"},{"name":"Feelins"}]},"time":"2018-06-06T23:27:32.595+0000"}

localhost:8080/recommendation/track/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":[{"name":"Horses (with PnB Rock, Kodak Black & A Boogie Wit da Hoodie)"},{"name":"Everyday We Lit (feat. PnB Rock)"},{"name":"Selfish"},{"name":"SMASH! - feat. PnB Rock"},{"name":"Rock"},{"name":"King's Dead (with Kendrick Lamar, Future & James Blake)"},{"name":"Beast Mode (feat. PnB Rock & YoungBoy Never Broke Again)"},{"name":"Rock Bottom"},{"name":"All Summer Long"},{"name":"Too Many Years"},{"name":"Should I Stay or Should I Go - Remastered"},{"name":"Imma Dog (feat. PnB Rock)"},{"name":"Issues (feat. Russ)"},{"name":"Rock Your Body"},{"name":"Rock the Casbah - Remastered"},{"name":"My Songs Know What You Did In The Dark (Light Em Up)"},{"name":"she ready"},{"name":"WIN"},{"name":"We Will Rock You - Remastered 2011"},{"name":"Feelins"}],"time":"2018-06-06T23:28:06.360+0000"}

Endpoints to temperature
-----------------------------------------------------------------------------------------

localhost:8080/temperature/city?cityname=campinas

{"response":{"unit":"CELSIUS","value":21.0},"time":"2018-06-06T22:59:42.977+0000"}

localhost:8080/temperature/country?cityname=campinas&countrycode=br

{"response":{"unit":"CELSIUS","value":21.0},"time":"2018-06-06T22:59:54.197+0000"}

localhost:8080/temperature/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":{"unit":"CELSIUS","value":13.0},"time":"2018-06-06T23:00:11.568+0000"}
