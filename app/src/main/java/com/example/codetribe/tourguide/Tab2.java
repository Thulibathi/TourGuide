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

public class Tab2 extends Fragment {
    private SharedPreferences sharedPreferences;
    private String selectedMenu = "";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.tab1_fragment,container,false);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        selectedMenu = sharedPreferences.getString("title", "");
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((getContext()));
        recyclerView.setLayoutManager(layoutManager);
        List<City> cities = prepareData();
        CityAdapter adapter = new CityAdapter(getContext(),cities);
        recyclerView.setAdapter(adapter);
        return  view;
    }
    private List prepareData(){
        List<City> cities = new ArrayList<>();
        switch (selectedMenu)
        {
            case "Accommodation":
                cities.add(new City("Pafuri Self Catering Units","Our most popular self-catering units are numbers 1-2-3, which is 70 square each and have a master bedroom with a queen size bed. The second bedroom has two single beds and an additional single bed can be added to the open-plan lounge, dining room, and functional fully-equipped kitchen. An appealing veranda with BBQ facilities extends the lounge. Bathroom has a shower only.Every unit has a carport and remote control gate (for easy access). We also offer DStv (including KYKNET), a splash pool, a lapa with BBQ facilities and a green garden with hidden corners and benches for relaxation. All bed linen and towels are supplied, the apartment is cleaned on a daily basis, a same day laundry service is available as well as a car wash. Continental breakfasts and suppers are available on request at additional cost.Please note that Pafuri Self-catering is in the overnight accommodation business and do not allow parties, loud music and alcohol misuse on our premises. We are PET FRIENDLY - small breeds only!\n" +
                        "\n" +
                        "Facilities\n" +
                        "Airport Shuttle\n" +
                        "Wheelchair Enabled\n" +
                        "Laundry Facilities*\n" +
                        "Braai/Barbecue\n" +
                        "Swimming Pool\n" +
                        "Pet Friendly*\n" +
                        "Cosy","http://www.roomsforafrica.com/new-gallery/pafuriselfcateringunits_12-x_large.jpg",Float.parseFloat("4.0")));
                cities.add(new City("Danlee Overnight Accommodation","Situated 3 km from Peter Mokaba Stadium, Danlee Overnight Accommodation in Polokwane offers en-suite rooms, free WiFi and private parking. The N1 highway is 7 minutes' drive away.\n" +
                        "\n" +
                        "The simple decorated rooms here will provide you with a TV with select satellite channels and tea-and-coffee making facilities. Featuring a shower, private bathrooms also come with a hairdryer and free toiletries. Some rooms have a garden view. Extras include a desk and ceiling fans and air conditioning.\n" +
                        "\n" +
                        "Breakfast is optional for a surcharge.\n" +
                        "\n" +
                        "The guest house is 1.5 km from Savannah Shopping Centre and 5.8 km from the Mall of the North and 4 km from the town centre of Polokwane. \n" +
                        "\n" +
                        "This property also has one of the top-rated locations in Polokwane! Guests are happier about it compared to other properties in the area.\n" +
                        "\n" +
                        "Couples in particular like the location – they rated it 9.1 for a two-person trip.\n" +
                        "\n" +
                        "This property is also rated for the best value in Polokwane! Guests are getting more for their money when compared to other properties in this city.","https://media-cdn.tripadvisor.com/media/photo-s/09/cf/81/7d/danlee-overnight-accommodation.jpg",Float.parseFloat("3.0")));
                cities.add(new City("Opitrapi Guest House","Overview\n" +
                        "Opitrapi Guesthouse & Self Catering is a home away from home. A tranquil cozy haven, not only for Business Executives, but also for adventurous tourists. Only a stones throw from Peter Mokaba Stadium and Polokwane CBD, Opitrapi is convenient, secure and affordable.\n" +
                        "Available as a Self Catering unit or on a Bed & Breakfast basis, the unit is fully equipped with 2 bedrooms, and can sleep up to 5 people. The rooms are cozy, yet airy with lots of cupboard space. The open plan lounge & kitchen area is spacious and has all the comforts of home.\n" +
                        "On a hot day you can cool down in the onsite swimming pool.\n" +
                        "Opitrapi is close to all sorts of amenities and the in-room brochure will help find what you are looking for. \n" +
                        "Your friendly hosts, Ina & Douglas, have lived in the area for more than 27 years and have a wealth of knowledge of the surroundings. Ina will be happy to whip up a number of delicious meals if you are not in the mood for cooking.\n" +
                        "Ina & Douglas are Creative Genius' and you are bound to find something that you will want to take home, from their intriguing stash of curios for sale.\n" +
                        "\n" +
                        "Facilities\n" +
                        "Room Facilities\n" +
                        "\n" +
                        "Non-SmokingSatellite TVTelevision\n" +
                        "On Site Facilities\n" +
                        "\n" +
                        "Children AllowedLaundryPoolRestaurantSelf Catering\n" +
                        "Local Facilities\n" +
                        "\n" +
                        "BarBeautyBikingCasinoEntertainmentFishingGame ViewingGolf CourseGymShopping/CuriosToursOther","https://sncdn.com/db/id/601167/g134018.jpg",Float.parseFloat("4.0")));
                cities.add(new City("Victoria Place Guest House","Victoria Place Guest House is a Victorian style Guest House located in Polokwane, the urban centre of the Limpopo province and the most important city north of Gauteng. Polokwane offers an abundance of adventure activities, animal parks, and sporting venues.\n" +
                        "\n" +
                        "Accommodation is available in 14 spacious, beautifully decorated, en-suite bedrooms and 4 luxurious suites. Each guest bedroom offers comfy beds with crisp, white, percale linen and fluffy towels. In-room facilities include hair dryers, complimentary tea, coffee and biscuits, a fully stocked bar fridge, free Wi-Fi and a TV with selected DStv channels. For your comfort, there are fans, heaters and electric blankets provided. \n" +
                        "\n" +
                        "Guest house facilities include laundry and dry-cleaning service, secure parking and a scrumptious full English and continental breakfast are served in the relaxed atmosphere of the dining room or on the veranda.","https://sncdn.com/db/id/882159/g243593.jpg",Float.parseFloat("4.0")));
                cities.add(new City("Sidze Guest House","Offering a restaurant, Sidze Guest House is located in Polokwane. Free WiFi access is available.\n" +
                        "\n" +
                        "Each room here will provide you with a TV and air conditioning. There is also an electric kettle. Featuring a bath or shower, private bathroom also comes with free toiletries. You can enjoy garden view from the room.\n" +
                        "\n" +
                        "At Sidze Guest House you will find a garden. The property offers free parking on site.\n" +
                        "\n" +
                        "The guest house is 2.5 km from Peter Mokaba Stadium. Polokwane International Airport is 3 km away. A shuttle to the airport can arranged upon request. ","https://www.sleeping-out.co.za/ftp/Gallery/sidzeguesthouse-26289-67749.jpg",Float.parseFloat("2.3")));
                cities.add(new City("De Plaas Guest House","De Plaas Guest house is situated near the CBD of Polokwane (Pietersburg), the capital of Limpopo Province and is close to various shopping centres, hospitals and schools.\n" +
                        "\n" +
                        "Our accommodation consists of 12 luxury double bedrooms, which 2 rooms are family rooms and 3 rooms are semi-self catering with en-suite bathrooms, equipped with air-conditioning or fan and DStv. Join us in our dining room where you can feast on a scrumptious breakfast or dinner.\n" +
                        "\n" +
                        "A sunken, fully license bar offers guests the perfect place to unwind after a long day in the buzz of the city. Alternatively you can braai and relax around the fire in the boma to your hearts content.\n" +
                        "\n" +
                        "We can accommodate approximately 50 people in our conference facility.","http://deplaas.co.za/wp-content/uploads/2011/11/De-Plaas-hp1.jpg",Float.parseFloat("3")));
                cities.add(new City("McDonald's B&B","McDonald's B&B is set in beautiful country surroundings on the N1, close to the Polokwane International Airport, where guests can simply relax and unwind in this natural bushveld environment. \n" +
                        "\n" +
                        "The bed and breakfast offers six Standard, spacious double rooms. All of the rooms have their own private bathrooms and contain either a double bed or twin single beds. One of the rooms can also be converted into a family room on request.\n" +
                        "\n" +
                        "The swimming pool provides a refreshing haven as visitors can cool off during the warm summer afternoons.\n" +
                        "\n" +
                        "Facilities\n" +
                        "Braai/Barbecue\n" +
                        "Swimming Pool\n" +
                        "Parking on Premises\n" +
                        "Languages Spoken\n" +
                        "English\n" +
                        "Afrikaans\n" +
                        "Response Rate: 100%\n" +
                        "Enquiry Response Time: 16 hours\n" +
                        "Minimum stay: 1 Days\n" +
                        "Type: Guest House\n" +
                        "Sleeps: 12\n" +
                        "Check-in: 02:00 PM\n" +
                        "Check-out: 10:00 AM\n" +
                        "Reviews: 1 Reviews\n","https://sncdn.com/db/id/1441876/g388112.jpg",Float.parseFloat("2")));
                cities.add(new City("Elegant Guest house","Elegant Guest House is situated 2.5 km from Peter Mokaba Stadium in Polokwane. Surrounded by huge indigenous trees, ferns, palms, cycads and many other tropical and subtropical plants, Elegant Guest House is perfect for relaxing and enjoying the South African sunshine, culture and great atmosphere.\n" +
                        "\n" +
                        "This unique guest house consists of six unique, private bedrooms with en-suite bathrooms. All rooms differ in style and features to ensure a unique experience. We are situated close to shops, restaurants, and the airport.\n" +
                        "\n" +
                        "Enjoy the warm hospitality of your hosts in a tranquil, homely setting.\n" +
                        "\n" +
                        "Facilities\n" +
                        "Airport Shuttle\n" +
                        "Laundry Facilities*\n" +
                        "Braai/Barbecue\n" +
                        "Swimming Pool\n" +
                        "Wi-Fi\n" +
                        "No Credit Card ","http://www.namibian.org/travel/lodging/pictures/elegant-guesthouse/fullsize/Terrace_and_garden_area_fs.jpg",Float.parseFloat("5")));

                cities.add(new City("Broadlands Equestria Guest Farm","Broadlands Equestria Guest Farm, fondly known as THE STABLES, is located 3 km from Mall of the North, in Polokwane. We offer affordable, budget but comfortable accommodation. Being a guest farm, our accommodation remains rustic but very unique and comfortable. Each unit is unique. We are known for our very friendly and helpful staff. We offer breakfast baskets each morning. We offer braai facilities and assistance. We will light up your braai and you can sit under the African stars and enjoy the beauty of the night. We are in very close proximity to restaurants and fast food service providers who deliver directly to our gate. So just arrive and relax, while enjoying the farms quiet atmosphere. You can go on a horse ride with one of our experienced staff or take a leisurely walk and meet the great number of birds that we have on the property. Our property is very secure and we have a 24 hour watch. Our guests become our friends! Escape the noise and enjoy our peace on this special property.\n" +
                        "\n" +
                        "Conference Venues: For guests staying on the property we have a small conference / meeting room with a whiteboard, projector screen and flip chart board. Tea and coffee can is available for users at a small fee.\n" +
                        "\n" +
                        "Family friendly: Children have space all around. Pony rides & outrides can be booked at R250 per person. \n" +
                        " Tuck Shop on site for your convenience.\n" +
                        " Restaurants within 2 km. Takeaways are also delivered to our main gate (Pizzas, Nandos, KFC, Fish Aways)\n" +
                        "\n" +
                        "Romantic: Couples wanting a romantic picnic are able to book an outride and picnic alone in our bush camp. \n" +
                        " \n" +
                        " It is a spectacular property in town where you can take leisurely walk, enjoy the birds and do star-gazing.\n" +
                        "\n" +
                        "Facilities\n" +
                        "Laundry Facilities*\n" +
                        "Braai/Barbecue\n" +
                        "No Credit Card Facilities\n" +
                        "Parking on Premises\n" +
                        "Languages Spoken\n" +
                        "English\n" +
                        "Afrikaans\n" +
                        "Northern Sotho (Sesotho sa Leboa)\n" +
                        "Sotho (Sesotho)","https://www.safarinow.com/db/id/924812/g320806.jpg",0));
                cities.add(new City("Bongiwe Accommodation","Bongiwe Accommodation is located in the city of Polokwane, the cultural hub of the region, halfway between Pretoria and the Zimbabwean border. Our guest house offers comfortable rooms and also have a conference facility. There are nine, well-equipped rooms with air-conditioning, TVs with DStv, bar fridges, Microwaves and en-suite bathrooms with showers and baths. The guest house is only 10 minutes from Gateway Airport and are close to highways and shopping centers, casinos and the Mokaba Stadium. The guest house has a warm and friendly atmosphere, ideal for business people, travellers and tourists. We offer laundry services on request at additional charge and no pets are allowed on the premises. All meals are served in our cosy dining room.\n" +
                        "\n" +
                        "Facilities\n" +
                        "Swimming Pool\n" +
                        "Languages Spoken\n" +
                        "English\n" +
                        "Xhosa (isiXhosa)\n" +
                        "Grading\n" +
                        "3 Stars - Tourism Grading Council of South Africa","https://sncdn.com/db/id/844712/g212190.jpg",Float.parseFloat("5")));
                cities.add(new City("Lily-Lo Guest House","Lily-Lo Guest House is situated only 5 km outside Polokwane, in a charming country setting with a sense of tranquil relaxation. This is the ideal accommodation for a family or a group of friends.\n" +
                        "\n" +
                        "We offer seven en-suite guest rooms with a choice between self-catering and bed and breakfast, equipped with all the basic comforts to make your stay a memorable one. All linen and towels are provided, and laundry services can be arranged.\n" +
                        "\n" +
                        "Enjoy a leisurely stroll through the garden and explore its many hidden delights. Take a dip in our swimming pool next to the inviting lapa, were braais and get-togethers can be arranged. We have conferencing facilities for up to 40 delegates available. All meals can be enjoyed by prior arrangement in the country-style dining area.\n" +
                        "\n" +
                        "Facilities\n" +
                        "Braai/Barbecue\n" +
                        "Swimming Pool\n" +
                        "Parking on Premises\n" +
                        "Languages Spoken\n" +
                        "English\n" +
                        "Afrikaans\n" +
                        "Grading\n" +
                        "3 Stars - Tourism Grading Council of South Africa","https://www.safarinow.com/db/id/814326/g449277.jpg",Float.parseFloat("2")));
            case "Attraction":
                cities.add(new City("Polokwane Museum","Conveniently situated across the road from the Hugh Exton Photographic Museum and Civic Centre, Polokwane Museum is an excellent spot to while away a few hours. \n" +
                        "\n" +
                        "Occupying a lovely late Victorian shop built in 1906; the building was beautifully restored in 1986 and is now a National Monument. \n" +
                        "\n" +
                        "Here you can discover the secrets of this city and surrounding region as well as Stone Age and Iron Age artefacts. A highlight of the museum is a display depicting the colourful traditional cultures of Limpopo people. \n" +
                        "\n" +
                        "Complete your trip back in time and stroll across the street to the Hugh Exton Photographic Museum for an insight into the gold rush days of Polokwane's beginnings.","https://sncdn.com/db/id/690827/go167324.jpg",0));
                cities.add(new City("Hugh Eksteen Photographic Museum.","Housed in an 1890 Dutch reformed church in Polokwane is the Hugh Eksteen Photographic Museum. Browse through over 23000 negatives and original photographs taken by Hugh Eksteen who lived to be 91 years old.\n" +
                        " \n" +
                        "The photos portray what the area of Polokwane (previously known as Pietersburg) looked like between 1892 and 1945 as well as an insight into the architecture, celebrities of the time, clothing, industry and trade.\n" +
                        " \n" +
                        "Take a look at the cameras used and browse through Eksteen appointment books containing notes of every photo he took, the subject and the cost. Eksteen took photos of everyone and everything, regardless of race, age or religion and was present to photograph historic events of that time. There is a lot to see and discover at the museum and it is definitely worth a visit.","http://www.sahistory.org.za/sites/default/files/styles/article_image/public/place%20images/hugh_eksteen_museum_0.jpg?itok=fhOZ4802",0));
                cities.add(new City(" Bakone Malapa Open-Air Museum","The Bakone Malapa Open-air Museum, where tribesmen practise long-standing traditions to enlighten visitors about the traditions of Africa’s people, is one of two similar museums in Limpopo - the other is the Tsonga open-air Museum near Tzaneen. \n" +
                        "\n" +
                        "Bakone Malapa is a reconstructed village in the style used by the northern Sotho about 250 years ago designed to demonstrate the daily life of the Bakone, a highly sophisticated subgroup of the northern Sotho tribe. \n" +
                        "\n" +
                        "The cultural village includes two homesteads or lapas that display and explain fire making, maize grinding and beer brewing as they would have been carried out years ago. There are also handcraft demonstrations that include pottery, basketry and bead work and most of these locally-made crafts are then sold from the local craft shop. \n" +
                        "\n" +
                        "The guides are all excellent story tellers and the village’s architectural and cultural styles come alive through their eyes as they take one through the village’s traditional way of life. But the museum is more than a cultural village alone. There is a bird sanctuary, a game reserve, hiking trails and outdoor recreation areas.","https://www.sa-venues.com/attractions/gallery/limpopo/588/1.jpg",0));
                cities.add(new City("The Tropic of Capricorn","Also known as the Southern Tropic, the Tropic of Capricorn is one of the five major circles of latitude that marks maps of the earth. In addition, it is the southern boundary of the tropics and indicates the southernmost latitude at which the Sun can be seen directly overhead at midday.\n" +
                        "\n" +
                        "Although the Tropic of Capricorn is an imaginary geographical line, the Capricorn Region of Limpopo is fortunately visible for all to see. Stretching from the Ysterberg Mountain tracing the lower limits of the Wolkberg Mountains to the Tropic of Capricorn in the north, the Capricorn Region has all the makings of an amazing road trip.\n" +
                        "\n" +
                        "As you can see there is simply no shortage of things to do in this region. From the forests, dams and famous bushveld of the province to the quiet charm of the capital – Limpopo is waiting to become your favourite holiday destination.","https://i.ytimg.com/vi/7euwVAAZQcs/hqdefault.jpg",0));
                cities.add(new City("Mapungubwe Heritage Site & Museum","Mapungubwe National Park and World Heritage Site is the ideal location for anyone interested in the park’s wildlife and birds, to those in search of serenity, identity and the extraordinary history of this World Heritage Site. Mapungubwe National Park and World Heritage site).\n" +
                        "\n" +
                        "Mapungubwe National Park is one of Limpopo’s three national parks, It also hosts a World Heritage Site and a Museum. activities in Mapungubwe includes a visit a guided visit to the world heritage site where it is also believed that civilization in southern africa started, Game drives, a visit to a museum and a picnic site at a confluence where the Shashe river merges with Limpopo river to form bounderies between South Africa, Botswana and Zimbabwe.) Mapungubwe National Park and World Heritage Site is the ideal location for anyone interested in the park’s wildlife and birds, to those in search of serenity, identity and the extraordinary history of this World Heritage Site…","https://ih1.redbubble.net/image.9350167.6435/flat,1000x1000,075,f.u7.jpg",0));
                cities.add(new City("Phiphidi Waterfalls","Another secret of the of the Vhavenda people, the Phiphidi waterfalls, was named after a chief-tainess and means melodious. The water falls are situated a mere 15 km from the capital Thohoyandou on the Mutshindudu River. A cemetery where ancestors of the Tshivase royal Family are buried can be found in the forest above the falls.","http://www.2tenhotel.com/images/uploads/tshatshingo.JPG",0));
                cities.add(new City("Tshakuma Fruit Market In Venda Area","Tshakuma is a local and vegetables market that also accommodates traditional Vhavhenda sculptors and craftsmen, and is located halfway between Louis Trichardt and Thohoyandou next to Levuvhu on the R24. It is the Largest open air fresh produce market in South Africa. Vhembe fresh produce Secondary cooperative, trading as Vhembe fresh produce market was formed by 19primary cooperatives from Vhembe District Municipality, Limpopo Province. These 19 primary Cooperatives have over 500 individual members.\n" +
                        "\n" +
                        "The formation of the fresh produce was a result which came after the Vhembe Local Economic Development conducted a research study to determine the reasons why there was no agricultural development in the area. The result of this study then informed the LED that the low interest/development of agriculture was due to the limited access to market in the area. Tshakhuma village was identified as a possible home for the marketing cooperative as it already had an existing pack house that only required upgrades and better infrastructure.\n" +
                        "\n" +
                        "Tshakhuma Fruit market is the leading market access for quality fresh produce which are affordable, accessible and convenient.","https://mw2.google.com/mw-panoramio/photos/medium/41075967.jpg",0));
                cities.add(new City("Eersteling Monument","The Eersteling Monument is located just south of Polokwane and is the site of South Africa’s first gold rush. It stands as a reminder of the times as well as being a tribute to the first gold power plant.\n" +
                        "\n" +
                        "In 1871 gold was first discovered in Eersteling and soon the town was full of hopeful enthusiasts, with the area playing an important role in South Africa’s history.\n" +
                        "\n" +
                        "This site was declared a national monument on 29 June 1938.","http://mw2.google.com/mw-panoramio/photos/medium/23708582.jpg",0));
            case "Events":
        }
        return cities;
    }
}
