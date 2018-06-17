
Technologies used
-----------------------------------------------------------------------------------------
Python 3, Flask, Open Weather Map (pyowm), Spotify (Spotipy)

Settings and notes
-----------------------------------------------------------------------------------------
Define the constants in open_weather_map.py.

1. open_weather_map_key

Define the constants in spotify.py.

1. spotify_client_id
2. spotify_secret

Set the path to Windows if not configured.

SETX PATH "%PATH%;C:\Python\Python36\Scripts"

Needed to install.

1. py -m pip install --user virtualenv
2. pip install flask flask-jsonpify flask-sqlalchemy flask-restful
3. pip install pyowm
4. pip install spotipy

Script to be executed.

py app.py

Endpoints to category
-----------------------------------------------------------------------------------------
localhost:8080/category/city?cityname=campinas&countrycode=br

{"response":"pop","time":"2018-06-17 13:29:56.437655"}

localhost:8080/category/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":"pop","time":"2018-06-17 13:31:03.350843"}

Endpoints to Spotify
-----------------------------------------------------------------------------------------
localhost:8080/spotify/playlist/classical

{"response":{"category":"classical","tracks":[{"name":"Requiem: Lacrimosa"},{"name":"Sonata No. 14 \"Moonlight\" in C-Sharp Minor\", Op. 27 No. 2: I. Adagio sostenuto"},{"name":"Gymnopedie"},{"name":"Unaccompanied Cello Suite No. 1 in G Major, BWV 1007: I. Prélude"},{"name":"Air on a G String"},{"name":"Adagio Albinoni"},{"name":"The Ludlows"},{"name":"Memories (Top Gun)"},{"name":"Six Etudes for Piano - q = 108"},{"name":"Bagatelle No. 25 in A Minor, WoO 59 \"Für Elise\""},{"name":"Blackbird (Arr. for Classical Guitar)"},{"name":"Cello Suite No. 1 in G Major, BWV 1007: I. Prélude (Arranged for Lute by Thomas Dunford)"},{"name":"Violin Partita No. 3 in E Major, BWV 1006 (Arr. F. Brüggen for Recorder): I. Preludio"},{"name":"Love Story (Made Famous by Taylor Swift )"},{"name":"Goldberg-Variationen, BWV 988: Variatio 24. Canone all'Ottava. a 1 Clav."},{"name":"Cello Suite No. 1 in G Major, BWV 1007: II. Allemande (Arranged for Lute by Thomas Dunford)"},{"name":"Cello Suite No. 1 in G Major, BWV 1007: III. Courante (Arranged for Lute by Thomas Dunford)"},{"name":"Cello Suite No. 1 in G Major, BWV 1007: IV. Sarabande (Arranged for Lute by Thomas Dunford)"},{"name":"Cello Suite No. 1 in G Major, BWV 1007: V. Menuet I - VI. Menuet II (Arranged for Lute by Thomas Dunford)"},{"name":"Suite in G Minor, BWV 995: I. Prélude (Arranged by Bach from Cello Suite No. 5 in C Minor, BWV 1011)"}]},"time":"2018-06-17 13:32:13.721608"}

localhost:8080/spotify/playlist/party

{"response":{"category":"party","tracks":[{"name":"Welcome to the Party (with French Montana & Lil Pump, feat. Zhavia Ward) - from Deadpool 2"},{"name":"Ghost Town"},{"name":"Play It Again"},{"name":"Party"},{"name":"House Party"},{"name":"Party In The U.S.A."},{"name":"Wouldn't Leave"},{"name":"Party Monster"},{"name":"Dirt Road Anthem"},{"name":"My Kinda Party"},{"name":"No Shame (Future feat. PARTYNEXTDOOR)"},{"name":"That's My Kind Of Night"},{"name":"Come and See Me (feat. Drake)"},{"name":"Surprise Party (feat. Blackbear)"},{"name":"party favor"},{"name":"Party Rock Anthem"},{"name":"Body Party"},{"name":"Pity Party"},{"name":"Life Of The Party"},{"name":"Crash My Party"}]},"time":"2018-06-17 13:33:12.917408"}

localhost:8080/spotify/playlist/pop

{"response":{"category":"pop","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"bitches (feat. Charli XCX, Icona Pop, Elliphant, ALMA)"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Pop Dat"},{"name":"Waking Lions"},{"name":"Pop iiT"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Waking Lions"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Footsteps"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Trenches"}]},"time":"2018-06-17 13:33:30.101462"}

localhost:8080/spotify/playlist/rock

{"response":{"category":"rock","tracks":[{"name":"Horses (with PnB Rock, Kodak Black & A Boogie Wit da Hoodie)"},{"name":"Everyday We Lit (feat. PnB Rock)"},{"name":"Selfish"},{"name":"Rock"},{"name":"King's Dead (with Kendrick Lamar, Future & James Blake)"},{"name":"SMASH! - feat. PnB Rock"},{"name":"Beast Mode (feat. PnB Rock & YoungBoy Never Broke Again)"},{"name":"All Summer Long"},{"name":"Rock Bottom"},{"name":"Too Many Years"},{"name":"Rock and Roll"},{"name":"Should I Stay or Should I Go - Remastered"},{"name":"WIN"},{"name":"My Songs Know What You Did In The Dark (Light Em Up)"},{"name":"Imma Dog (feat. PnB Rock)"},{"name":"Rock the Casbah - Remastered"},{"name":"Issues (feat. Russ)"},{"name":"Rock Your Body"},{"name":"We Will Rock You - Remastered 2011"},{"name":"she ready"}]},"time":"2018-06-17 13:33:49.759048"}

-----------------------------------------------------------------------------------------
localhost:8080/spotify/track/classical

{"response":["Requiem: Lacrimosa","Sonata No. 14 \"Moonlight\" in C-Sharp Minor\", Op. 27 No. 2: I. Adagio sostenuto","Gymnopedie","Unaccompanied Cello Suite No. 1 in G Major, BWV 1007: I. Prélude","Air on a G String","Adagio Albinoni","The Ludlows","Memories (Top Gun)","Six Etudes for Piano - q = 108","Bagatelle No. 25 in A Minor, WoO 59 \"Für Elise\"","Blackbird (Arr. for Classical Guitar)","Cello Suite No. 1 in G Major, BWV 1007: I. Prélude (Arranged for Lute by Thomas Dunford)","Violin Partita No. 3 in E Major, BWV 1006 (Arr. F. Brüggen for Recorder): I. Preludio","Love Story (Made Famous by Taylor Swift )","Goldberg-Variationen, BWV 988: Variatio 24. Canone all'Ottava. a 1 Clav.","Cello Suite No. 1 in G Major, BWV 1007: II. Allemande (Arranged for Lute by Thomas Dunford)","Cello Suite No. 1 in G Major, BWV 1007: III. Courante (Arranged for Lute by Thomas Dunford)","Cello Suite No. 1 in G Major, BWV 1007: IV. Sarabande (Arranged for Lute by Thomas Dunford)","Cello Suite No. 1 in G Major, BWV 1007: V. Menuet I - VI. Menuet II (Arranged for Lute by Thomas Dunford)","Suite in G Minor, BWV 995: I. Prélude (Arranged by Bach from Cello Suite No. 5 in C Minor, BWV 1011)"],"time":"2018-06-17 13:35:20.664076"}

localhost:8080/spotify/track/party

{"response":["Welcome to the Party (with French Montana & Lil Pump, feat. Zhavia Ward) - from Deadpool 2","Ghost Town","Play It Again","Party","House Party","Party In The U.S.A.","Wouldn't Leave","Party Monster","Dirt Road Anthem","My Kinda Party","No Shame (Future feat. PARTYNEXTDOOR)","That's My Kind Of Night","Come and See Me (feat. Drake)","Surprise Party (feat. Blackbear)","party favor","Party Rock Anthem","Body Party","Pity Party","Life Of The Party","Crash My Party"],"time":"2018-06-17 13:35:37.003805"}

localhost:8080/spotify/track/pop

{"response":["Pop Star","Pop Style","Pop Style","bitches (feat. Charli XCX, Icona Pop, Elliphant, ALMA)","A Crime To Remember","I Love It (feat. Charli XCX)","Pop That","pop a pill","Pop Dat","Waking Lions","Pop iiT","Love Scars Pt. 2 / Rack City","Waking Lions","Pop","Deadman's Wonderland","Sleeping With A Friend","Pop Style","Footsteps","Pop Thieves (Make It Feel Good)","Trenches"],"time":"2018-06-17 13:35:55.600846"}

localhost:8080/spotify/track/rock

{"response":["Horses (with PnB Rock, Kodak Black & A Boogie Wit da Hoodie)","Everyday We Lit (feat. PnB Rock)","Selfish","Rock","King's Dead (with Kendrick Lamar, Future & James Blake)","SMASH! - feat. PnB Rock","Beast Mode (feat. PnB Rock & YoungBoy Never Broke Again)","All Summer Long","Rock Bottom","Too Many Years","Rock and Roll","Should I Stay or Should I Go - Remastered","WIN","My Songs Know What You Did In The Dark (Light Em Up)","Imma Dog (feat. PnB Rock)","Rock the Casbah - Remastered","Issues (feat. Russ)","Rock Your Body","We Will Rock You - Remastered 2011","she ready"],"time":"2018-06-17 13:34:26.984720"}

Endpoints to recommendation
-----------------------------------------------------------------------------------------
localhost:8080/recommendation/city?cityname=campinas&countrycode=br

{"response":{"location":{"city":"campinas","country":"br","latitude":"0.0","longitude":"0.0"},"playlist":{"category":"pop","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"bitches (feat. Charli XCX, Icona Pop, Elliphant, ALMA)"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Pop Dat"},{"name":"Waking Lions"},{"name":"Pop iiT"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Waking Lions"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Footsteps"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Trenches"}]},"temperature":{"unit":"CELSIUS","value":"22.0"}},"time":"2018-06-17 13:38:05.737270"}

localhost:8080/recommendation/playlist/city?cityname=campinas&countrycode=br

{"response":{"category":"pop","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"bitches (feat. Charli XCX, Icona Pop, Elliphant, ALMA)"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Pop Dat"},{"name":"Waking Lions"},{"name":"Pop iiT"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Waking Lions"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Footsteps"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Trenches"}]},"time":"2018-06-17 13:38:26.536806"}

localhost:8080/recommendation/track/city?cityname=campinas&countrycode=br

{"response":["Pop Star","Pop Style","Pop Style","bitches (feat. Charli XCX, Icona Pop, Elliphant, ALMA)","A Crime To Remember","I Love It (feat. Charli XCX)","Pop That","pop a pill","Pop Dat","Waking Lions","Pop iiT","Love Scars Pt. 2 / Rack City","Waking Lions","Pop","Deadman's Wonderland","Sleeping With A Friend","Pop Style","Footsteps","Pop Thieves (Make It Feel Good)","Trenches"],"time":"2018-06-17 13:38:47.249382"}

-----------------------------------------------------------------------------------------

localhost:8080/recommendation/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":{"location":{"city":"","country":"","latitude":"52.3555177","longitude":"-1.1743197000000691"},"playlist":{"category":"pop","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"bitches (feat. Charli XCX, Icona Pop, Elliphant, ALMA)"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Pop Dat"},{"name":"Waking Lions"},{"name":"Pop iiT"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Waking Lions"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Footsteps"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Trenches"}]},"temperature":{"unit":"CELSIUS","value":"16.5"}},"time":"2018-06-17 13:39:21.781812"}

localhost:8080/recommendation/playlist/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":{"category":"pop","tracks":[{"name":"Pop Star"},{"name":"Pop Style"},{"name":"Pop Style"},{"name":"bitches (feat. Charli XCX, Icona Pop, Elliphant, ALMA)"},{"name":"A Crime To Remember"},{"name":"I Love It (feat. Charli XCX)"},{"name":"Pop That"},{"name":"pop a pill"},{"name":"Pop Dat"},{"name":"Waking Lions"},{"name":"Pop iiT"},{"name":"Love Scars Pt. 2 / Rack City"},{"name":"Waking Lions"},{"name":"Pop"},{"name":"Deadman's Wonderland"},{"name":"Sleeping With A Friend"},{"name":"Pop Style"},{"name":"Footsteps"},{"name":"Pop Thieves (Make It Feel Good)"},{"name":"Trenches"}]},"time":"2018-06-17 13:39:56.745883"}

localhost:8080/recommendation/track/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":["Pop Star","Pop Style","Pop Style","bitches (feat. Charli XCX, Icona Pop, Elliphant, ALMA)","A Crime To Remember","I Love It (feat. Charli XCX)","Pop That","pop a pill","Pop Dat","Waking Lions","Pop iiT","Love Scars Pt. 2 / Rack City","Waking Lions","Pop","Deadman's Wonderland","Sleeping With A Friend","Pop Style","Footsteps","Pop Thieves (Make It Feel Good)","Trenches"],"time":"2018-06-17 13:40:12.786539"}

Endpoints to temperature
-----------------------------------------------------------------------------------------
localhost:8080/temperature/city?cityname=campinas&countrycode=br

{"response":22,"time":"2018-06-17 13:41:28.361149"}

localhost:8080/temperature/coordinate?latitude=52.3555177&longitude=-1.1743197000000691

{"response":16.5,"time":"2018-06-17 13:41:44.903459"}
