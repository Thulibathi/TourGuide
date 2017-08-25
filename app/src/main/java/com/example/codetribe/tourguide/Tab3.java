package com.example.codetribe.tourguide;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codetribe on 8/17/2017.
 */

public class Tab3 extends Fragment {
    private SharedPreferences sharedPreferences;
    private String selectedMenu = "";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view  = inflater.inflate(R.layout.tab1_fragment,container,false);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        selectedMenu = sharedPreferences.getString("title", "");
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(false);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((getContext()));
        recyclerView.setLayoutManager(layoutManager);
        List<City> cities = prepareData();
        CityAdapter adapter = new CityAdapter(getContext(),cities);
        recyclerView.setAdapter(adapter);
        return  view;
    }
    private List prepareData() {
        List<City> cities = new ArrayList<>();
        switch (selectedMenu)
        {
            case "Accommodation":
                cities.add(new City("Tzaneen Country Lodge ", "For accommodation in Tzaneen this is the place to be ... in the heart of the north eastern Lowveld of the magical Limpopo Province in South Africa - you will find the Tzaneen Country Lodge with its new Earth Spa.\n" +
                        "\n" +
                        "The privately owned Tzaneen Country Lodge offers warm hospitality and Limpopo charm with a wealth of beauty and allure. It's all there for the taking in an area where history, geography and culture add character in a tantalizing mix.\n" +
                        "\n" +
                        "The tastefully decorated Tzaneen Country Lodge offers world-class hospitality, discreet security and outstanding service. Exclusive and private, the lodge is nestled on 150 hectares of farmland and indigenous forest.\n" +
                        "\n" +
                        "We are in one of the most beautiful regions in South Africa; the Tzaneen Country Lodge is also only 84 km from the Phalaborwa Gate of the Kruger National Park. We are centrally located to explore the beauty and magic of Limpopo, Modjadji's Kingdom of the Rain Queen.\n" +
                        "\n" +
                        "We offer genuine hospitality with stylish hotel rooms and relaxing pools in perfect harmony with the surrounding countryside. Our beautiful landscaped gardens with indigenous forest and dams on the property make for peaceful and happy holidays. In addition, we offer professional Conference facilities to suit any budget.","https://media-cdn.tripadvisor.com/media/photo-s/03/07/6c/2d/tzaneen-country-lodge.jpg", Float.parseFloat("4.3")));

                cities.add(new City("Zororo Lodge","Situated just outside of the urban city of Polokwane, Zororo Lodge offers a tranquil getaway to guests. The professional conference facilities and comfortable accommodation makes it ideal for corporate and leisure travellers.\n" +
                        "\n" +
                        "This lovely lodge is set in a lush garden and offers 30 well-appointed rooms. All of these rooms have twin- or queen-size beds and private bathrooms. Other amenities include tea and coffee facilities, TVs with DStv access, bar fridges and Wi-Fi Internet access.\n" +
                        "\n" +
                        "The lodge also has an on-site restaurant, providing delicious meals to cater to every palate. There are also two conference rooms available, ensuring that business guests will not be disappointed. The lodge is also a great place to host a wedding or a special event.","https://sncdn.com/db/id/2244904/g2_1489517.jpg",0));
                cities.add(new City("Bolivia Lodge","Bolivia Lodge offers the perfect balance between a fully fledged conference centre with 14 different venues as well as accommodation options to suite your every need in a tranquil environment.\n" +
                        "\n" +
                        "Venues can accommodate between eight and 1400 guests depending on your type of event, including weddings, shows, exhibitions, launches, gala events, team building and meetings all conveniently on one site. We have two standby generators on site in case of power failures.\n" +
                        "\n" +
                        "Bolivia Lodge is conveniently situated on a small holding on the Eastern side of Polokwane on the Modjadjiskloof Road, within 6km from the Polokwane CBD, only 20 min from the Polokwane International Airport and just 700m from the regional mall, Mall of the North.\n" +
                        "\n" +
                        "Known for a relaxed atmosphere in a bush environment, Bolivia Lodge offers the ideal option for any type of event or conference with accommodation options to enhance your experience.\n" +
                        "\n" +
                        "Accommodation options include our Honeymoon/Executive Suite, Luxury, Standard and Budget rooms.\n" +
                        "\n" +
                        "Ample, secure parking as well as a 24 hour reception desk service, is available for delegates and guests. On-site amenities include a swimming pool, bar, cell phone airtime vending machine and mini kiosk.\n" +
                        "\n" +
                        "Bolivia Lodge offers a free courtesy mini bus shuttle service to and from shopping malls, airports, bus stations and sports stadiums on request .\n","https://sncdn.com/db/id/1702097/g1739098.jpg",0));
                cities.add(new City("Yellowstone Luxury Lodge","Yellowstone Luxury Lodge is centrally situated in Polokwane, surrounded by lush and beautiful gardens. It is close to the Medi Clinic and the provincial hospital as well as the CBD.\n" +
                        "\n" +
                        "We offer 13 comfortable rooms in total, including the Presidential and Executive Suite. There is a large enclosed swimming pool for those hot summer days, with a lapa and private bar next to the pool. Our conference facilities can seat up to 70 delegates, and is also popular for wedding ceremonies and any other function. \n" +
                        "\n" +
                        "Polokwane, the capital of the Limpopo Province and formerly known as Pietersburg, is the cultural hub of the region half way between Pretoria and the Zimbabwean border. The city is graced with wide streets, green spaces and a vivid mix of Jacaranda and coral trees that are a sight to behold in spring.","https://www.travelground.com/img/1200x800/letterbox/AAEAAQAAAAAAAAAAAAAAJGEyMzNjOGU1LTNkMGEtNGY4YS04YzIyLTcxMWUwZThmOWQ3Nw.jpg",0));
                cities.add(new City("Dinoko Country Lodge","Dinoko Country Lodge is a 2 Star eco-tourism facility based approximately 20 km west of Polokwane on the R101/Mokopane Road. The lodge was built on 40 hectares of unspoilt African savannah, ensuring guests enjoy the freedom and tranquility of the outdoors with all the amenities of a modern bed and breakfast lodge. We offer a relaxed atmosphere for a well-deserved family getaway or simply a place to rest for the business traveller.\n" +
                        "\n" +
                        "Accommodation is offered in 15 fully furnished en-suite rooms, each with a separate entrance opening out onto the gardens. The local vegetation encourages a unique habitat for some of our local fauna and flora. In addition, the lodge offers two fine conference facilities seating 40 and 120 delegates respectively, and we can also offer catering services for events and functions, as well as tents, tables, and chairs for hire.\n" +
                        "\n" +
                        "Polokwane, as the capital city of Limpopo Province, has a host of activities and places of interest to visit including Polokwane Nature Reserve, Bakone Malapa Traditional Sotho Museum, The Irish House Museum, Meropa Casino and Entertainment World, Magwannani Meropa Day Spa, and the African Ivory Route Safari.","https://aff.bstatic.com/images/hotel/max500/441/44161321.jpg",0));
                cities.add(new City("Ivory Lodge","Situated in the capital city of Limpopo, Ivory Lodge offers guests a tranquil stay while visiting Polokwane. The stylish accommodation and state-of-the-art conference facilities makes this an ideal stopover for leisure and corporate travellers.\n" +
                        "\n" +
                        "There are 28 comfortably furnished rooms available, of which all have twin and double beds and lovely en-suite bathrooms. The stylish décor flows from the bedrooms to the comfortable lounge, creating a truly relaxing atmosphere.\n" +
                        "\n" +
                        "Guests can enjoy delicious meals in the spacious dining area before exploring this bustling city. This city has many jazz clubs and the biggest shopping centre in Limpopo, offering guests a wide variety of things to do. There are also many natural attractions nearby, ensuring that all guests have a truly memorable stay.","http://www.ivorysafarilodge.com/wp-content/uploads/2013/09/Ivory-Lodge-Main.jpg",0));
                cities.add(new City("Mukurumanzi Lodge","Mukurumanzi Lodge is conveniently located on the outskirts of Polokwane, in the heart of the Limpopo Province; it offers a tranquil and relaxing stay. Tucked away from the hustle and bustle of the city, Mukurumanzi Lodge offers accommodation within the quiet and tranquil surroundings of the bushveld.\n" +
                        "\n" +
                        "Guests have a choice of staying in one of eight rooms, all uniquely decorated and tastefully furnished. Four of the rooms offer double beds, while the other rooms have two three-quarter beds each. The rooms have en-suite bathrooms and are equipped with TVs and tea and coffee facilities. Each room has a workstation and safekeeping facilities are available on request. We service the rooms daily.\n" +
                        "\n" +
                        "Guests can enjoy meals at the restaurant, have a drink at the sports bar, relax around the swimming pool or make use of the Jacuzzi. Under-cover and open braai areas are also available for guests to use. A laundry and ironing service is available on request and we can arrange a shuttle service. Internet and email facilities are available on request and the lodge has credit card facilities.\n" +
                        "\n" +
                        "Mukurumanzi Lodge has easy access to all major routes and is an ideal home-base for traveling representatives. Various shops, restaurants, hospitals, the Peter Mokaba Stadium, tennis, golf and horse riding are all in close proximity. Guests can explore the beauty and magic of Limpopo and the Kingdom of Modjadji the Rain Queen.","https://sncdn.com/db/id/1207652/g363213.jpg",Float.parseFloat("4")));
                cities.add(new City("Dinoko Country Lodge","Dinoko Country Lodge is a 2 Star eco-tourism facility based approximately 20 km west of Polokwane on the R101/Mokopane Road. The lodge was built on 40 hectares of unspoilt African savannah, ensuring guests enjoy the freedom and tranquility of the outdoors with all the amenities of a modern bed and breakfast lodge. We offer a relaxed atmosphere for a well-deserved family getaway or simply a place to rest for the business traveller.\n" +
                        "\n" +
                        "Accommodation is offered in 15 fully furnished en-suite rooms, each with a separate entrance opening out onto the gardens. The local vegetation encourages a unique habitat for some of our local fauna and flora. In addition, the lodge offers two fine conference facilities seating 40 and 120 delegates respectively, and we can also offer catering services for events and functions, as well as tents, tables, and chairs for hire.\n" +
                        "\n" +
                        "Polokwane, as the capital city of Limpopo Province, has a host of activities and places of interest to visit including Polokwane Nature Reserve, Bakone Malapa Traditional Sotho Museum, The Irish House Museum, Meropa Casino and Entertainment World, Magwannani Meropa Day Spa, and the African Ivory Route Safari.\n" +
                        "\n" +
                        "Conference Venues: Two conference facilities are available seating 40 and 120 delegates respectively.\n" +
                        "\n" +
                        "Facilities\n" +
                        "Braai/Barbecue\n" +
                        "Swimming Pool\n" +
                        "Languages Spoken\n" +
                        "English\n" +
                        "Grading\n" +
                        "2 Stars - Tourism Grading Council of South Africa","https://aff.bstatic.com/images/hotel/840x460/441/44161346.jpg",Float.parseFloat("3")));
            case "Events":
        }
        return cities;
    }
}
