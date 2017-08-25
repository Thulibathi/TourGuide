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

public class Tab1 extends Fragment {
    private SharedPreferences sharedPreferences;
    private String selectedMenu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment, container, false);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        selectedMenu = sharedPreferences.getString("title", "");


        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((getContext()));
        recyclerView.setLayoutManager(layoutManager);
        List<City> cities = prepareData();
        CityAdapter adapter = new CityAdapter(getContext(),cities);
        recyclerView.setAdapter(adapter);
        return view;

    }

    private List prepareData(){
        List<City> cities = new ArrayList<>();
        switch (selectedMenu) {
            case "Accommodation":
                cities.add(new City("Ruby Stone Boutique Hotel", "Welcome to RubyStone Boutique Hotel\n" +
                        "\n" +
                        "A wonderful fusion of classic suburban residential and cool, urban mix that captures Polokwane’s cosmopolitan atmosphere. Our guests can find a quiet Hub from the hustle & bustle of everyday life. Our convenient location allows for easy access to the major shopping malls and other amenities.\n" +
                        "The hotel lies in the quiet suburb of Fauna Park and provides an ideal relaxed environment to unwind.\n" +
                        "Whether you are in town for business, a special occasion or vacation, our knowledgeable staff will be at your service to provide you with an experience to remember.", "https://t-ec.bstatic.com/images/hotel/max1024x768/315/31573658.jpg", Float.parseFloat("3.8")));
                cities.add(new City("Fusion Boutique Hotel", "With luxurious suites and marble bathrooms, Fusion Boutique is the only 5-star hotel Polokwane. Diverse massage treatments are offered, and there is a zen garden with sun loungers.\n" +
                        "\n" +
                        "Fusion Boutique Hotel is less than 1 km from Polokwane Golf Club and 5 km from Polokwane Game Reserve. Kruger National Park is just a 3-hour drive away.\n" +
                        "\n" +
                        "Suites at Boutique Hotel Fusion are decorated with carved wooden furniture and framed artwork. The spacious marble bathrooms have freestanding bathtubs and underfloor heating.\n" +
                        "\n" +
                        "Enjoy a 5-course breakfast in the Fusion Breakfast Room or a light lunch on the Terrace. Saskia restaurant serve elegant, à la carte cuisine, and you can also dine in the atmospheric wine cellar.\n" +
                        "\n" +
                        "For relaxation, the hotel offers a unique bath and pillow menu for guests.\n" +
                        "\n" +
                        "Fusion Boutique Hotel is 5 km from Polokwane Airport. Free car parking is available. \n" +
                        "\n" +
                        "This property also has one of the top-rated locations in Polokwane! Guests are happier about it compared to other properties in the area.\n" +
                        "\n" +
                        "Couples in particular like the location – they rated it 8.9 for a two-person trip.\n" +
                        "\n" +
                        "This property is also rated for the best value in Polokwane! Guests are getting more for their money when compared to other properties in this city.http://www.fusionboutiquehotel.co.za/.", "https://www.sa-venues.com/visit/fusionboutiquehotel/1.jpg", Float.parseFloat("4.5")));
                cities.add(new City("Eskulaap Hotel", "Eskulaap Park is an exclusive hotel set in one hectare of landscaped gardens. Situated in Polokwane, the capital of the Limpopo Province and formerly known as Pietersburg, the cultural hub of the region halfway between Pretoria and the Zimbabwean border. The city is graced with wide streets, green spaces and a vivid mix of jacaranda and coral trees that are a sight to behold in spring.\n" +
                        "\n" +
                        "Highly personalized service is offered by our personnel combined with luxury accommodation in an atmosphere of rural tranquillity. The hotel is located in the heart of Polokwane, close to shopping malls, hospitals, sport activities and much more. \n" +
                        "\n" +
                        "Exciting attractions include the Bakone Malapa Northern Sotho Open-Air Museum, a must to experience the way of life of the North Sotho people and the Polokwane Game Reserve, 5 km south of the city, which has a host of scenic walks and around 21 species of animal.\n" +
                        "\n" +
                        "The city’s museum is home to the Hugh Exton Photographic Museum with a collection of over 22000 glass negatives that capture the initial five years of the city on celluloid. There is also an art gallery in the Library Gardens building right in the centre of town that definitely is worth a visit. And the Savannah Centre, with its wide offering of shops and relatively peaceful atmosphere, is a great pit stop to stock up on essentials or for a bite to eat.", "https://sncdn.com/db/id/658945/g269910.jpg", 0));
                cities.add(new City("Meropa Hotel", "eaturing free WiFi and an outdoor pool, Meropa Hotel offers accommodations in Polokwane. There is a restaurant and bar and guests can have fun at the casino. Free private parking is available on site.\n" +
                        "\n" +
                        "You will find a 24-hour front desk at the property.\n" +
                        "\n" +
                        "Checkers Shopping Centre (Polokwane) is 4.8 km from Meropa Hotel, and NG Church is 5 km from the property. Polokwane International Airport is 6 km away. \n" +
                        "\n" +
                        "We speak 2 languages, including yours!\n" +
                        "\n" +
                        "Meropa Hotel has been welcoming Booking.com guests since May 8, 2017\n" +
                        "Hotel Chain : Sun International", "https://t-ec.bstatic.com/images/hotel/max1024x768/955/95529247.jpg", 0));
                cities.add(new City("Mountain Inn Country Hotel", "Mountain Inn Country Hotel is situated near the Hangklip Forest Reserve, just 11km outside of Louis Trichardt. The hotel is situated at the top of a mountain pass and offers spectacular views. This is the ideal place for a peaceful getaway while still being within easy reach of many wonderful attractions.\n" +
                        "\n" +
                        "ACCOMMODATION\n" +
                        "All rooms at Mountain Inn Country Hotel are equipped with ceiling fans or air-conditioners, electric blankets, DStv and coffee / tea facilities.\n" +
                        "\n" +
                        "Double Rooms x16: \n" +
                        "These rooms have a double bed and an en-suite bathroom.\n" +
                        "\n" +
                        "Twin Rooms x3: \n" +
                        "These rooms have two single beds and an en-suite bathroom.\n" +
                        "\n" +
                        "Family Rooms x3: \n" +
                        "These rooms sleep two adults and two children in a double bed and two single beds and have an en-suite bathroom.\n" +
                        "\n" +
                        "Executive / Honeymoon Suite x1: \n" +
                        "This room has a Queen-size bed, an en-suite bathroom, Jacuzzi and underfloor heating.\n" +
                        "\n" +
                        "DINING\n" +
                        "At Mountain Inn Country Hotel breakfast is served each morning in the restaurant. We offer a comprehensive a la carte menu and can also arrange prepacked breakfast and lunch.", "https://www.afristay.com/media/thumbnails/pictures/places/22152/g1.jpg.1366x768_q85_crop_upscale.jpg", 0));
                cities.add(new City("Elephant Springs Hotel", "Break away to the Elephant Springs Hotel & Cabanas, where you will find the perfect setting for a holiday or conference, trimmed with unique comfort and true home-from-home pampering. Built in the style of Old Colonial Africa and filled with antiques and memorabilia, the hotel also boasts all modern amenities.\n" +
                        "\n" +
                        "ACCOMMODATION\n" +
                        "Rooms \n" +
                        "Elephant Springs offers 45 air-conditioned bedrooms with en-suite bathrooms. Make your choice from one of our Standard Deluxe, Standard Double or Twin and Family Rooms. Each room has an en-suite bathroom. The Standard Deluxe rooms are on the ground floor and open up onto the pool area and each have a patio where you can enjoy light meals whilst splashing in the sparkling pool.\n" +
                        "\n" +
                        "Cabanas \n" +
                        "Elephant Springs offers 20 six sleeper self-catering cabanas. The cabanas are the perfect setting for a family holiday, conference groups or a simple relaxing weekend away. The cabanas are all clustered around a sparkling pool with lush tropical gardens. The cabanas each have one double room and two twin rooms. Each twin room consists of two separate single beds. The main bedroom has an en suite bathroom with shower and toilet, and the two twin rooms share a bathroom with bath and toilet.\n" +
                        "\n" +
                        "Each cabana has a lounge area with open-plan kitchenette/living space and an outdoor braai at the pool area. The cabanas are cleaned daily by our efficient house keeping team. Please note no pool towels are supplied. Conference and Dining facilities are all within walking distance from the cabanas, with safe secure parking in front of the cabanas. The units have either a direct pool access from your ground floor patio, or a balcony facing the pool. Access to the pool for balcony units are on the side of the complex.\n" +
                        "\n" +
                        "DINING\n" +
                        "The Elephant Springs Hotel offers a uniquely African dining experience. Browse the buffet line or select your choice of dishes from our enticing a la carte menu. Or simply enjoy a drink or watch the soccer in our beautiful bar area.\n" +
                        "\n" +
                        "CONFERENCES\n" +
                        "The hotel offers conference facilities to suit every need and desire, boasting fully-equipped venues ranging from a massive 200-seater hall to an intimate 40-seater conference room. We offer an all-inclusive package including conferencing, accommodation and meals at excellent prices. We are ideally located for conferences all over Limpopo, being centrally located in the town of Bela-Bela between Pretoria and Polokwane.\n" +
                        "\n" +
                        "WEDDINGS\n" +
                        "The Elephant Springs Hotel & Cabanas is within close proximity of local churches. The hotel is ideal for wedding receptions, honeymooners and offers a variety of accommodation for your guests. The Kambaku & Shawu rooms are easily transformed into draped venues that can seat up to 200 guests when combined. The patio is perfect for your buffet with the sparkling swimming pool and lush garden creating a romantic background atmosphere. An array of menus are available to suit your needs.\n" +
                        "\n" +
                        "ATTRACTIONS AND ACTIVITIES\n" +
                        "There is plenty to see and to do nearby. The world renowned Forever Resorts Warmbaths is just opposite the complex and offers a variety of activities for young and old. The Waterfront at the town’s southern entrance is one of the hot spots in Bela-Bela. Other activities in and around Bela Bela include: Spa Treatments, Cable Ski, Fishing, Tennis, Mountain Biking, Hiking Trails, Game Drives, 4x4 Routes, Golf, Quad Biking, Bowling, Carousel Casino, Cinemas and Trampolines.", "https://milesforstyle.com/wp-content/uploads/2015/03/Fam-Room300450.jpg", 0));
                cities.add(new City("Musina Hotel & Conference Centre", "The Hotel showcases a refined taste and creates a memorable experience for the weary traveler, tourist passing through, family on vacation or business executive. South of Musina on the N1 Road, the hotel welcomes guests from all over the world to have a peaceful rest and a fine dining experience.\n" +
                        "\n" +
                        "Musina Hotel aims to surpass expectations of our Guests by providing a personalized and memorable experience.\n" +
                        "\n" +
                        "We have a zero tolerance approach to crime with a 24 hour security system in place to make sure that our guests feels safe and at home at all times.\n" +
                        "\n" +
                        "ACCOMMODATION\n" +
                        "Standard Rooms (x20): \n" +
                        "These air-conditioned rooms offer one double bed or two single beds, a desk and chair, flat-screen TVs with selected DStv channels, a telephone for room service and tea and coffee facilities. Sleeps 2.\n" +
                        "\n" +
                        "Luxury Room (x14): \n" +
                        "These air-conditioned rooms offer one double bed, a desk and chair, flat-screen TVs with selected DStv channels, a telephone for room service and tea and coffee facilities. Sleeps 2.\n" +
                        "\n" +
                        "Deluxe Room (x4): \n" +
                        "These air-conditioned rooms offer one double bed and a single sleeper couch, a desk and chair, flat-screen TVs with selected DStv channels, a telephone for room service and tea and coffee facilities. Sleeps 2.\n" +
                        "\n" +
                        "Budget Room, Self Catering, Single Beds (x10): \n" +
                        "These air-conditioned rooms offer 2 x single beds, a desk and chair, flat-screen TVs with selected DStv channels, a telephone for room service and tea and coffee facilities. For added extra there is a two plate stove with oven, pot and pan, cutlery and crockery for 2 people.\n" +
                        "\n" +
                        "Budget Room, Non Self Catering, Double Bed (x4): \n" +
                        "These air-conditioned rooms offer one double bed, a desk and chair, flat-screen TVs with selected DStv channels, a telephone for room service and tea and coffee facilities.\n" +
                        "\n" +
                        "ONSITE FACILITIES\n" +
                        "Free WiFi throughout the hotel is available. A Mike's Kitchen branch is opening at Musina Hotel & Conference Centre soon. Musina Hotel is home to one of world’s best car hiring companies, we can therefore ensure that you get a vehicle to use during your stay at very affordable rates.\n" +
                        "\n" +
                        "CONFERENCING\n" +
                        "Shaft 1 and Shaft 2 are modern venues that will ensure you have a successful conference or meeting. Our friendly team will ensure that the ambiance suits your theme and that cuisine satisfies your buds.", "http://www.musinahotel.co.za/images/contact-musina-hotel.jpg", 0));
                cities.add(new City("Hans Merensky Hotel and Spa", "Situated on the border of the world renowned Kruger National Park, the Hans Merensky Hotel and Spa offers a unique blend of golf and game to both local and international visitors, offering luxury accommodation, sports, conference facilities and a world famous golf course that is home to a wide variety of game and over 200 species of birds. Air-conditioned and secluded en-suite accommodation is offered in the form of thatched chalets situated along the golf course and hotel rooms in the garden.\n" +
                        "\n" +
                        "ACCOMMODATION\n" +
                        "The hotel consists of 100 Standard Hotel Rooms, 31 Luxury Hotel Rooms and two Executive Suites.\n" +
                        "\n" +
                        "The rooms are luxurious and furnished with either twin bed or double beds. Family rooms have comfortable sofa beds for children. Bathrooms are spacious with walk-in showers. Room facilities include air-conditioning, selected DStv channels, tea / coffee stations and telephones.\n" +
                        "\n" +
                        "INDULGESENSES SPA\n" +
                        "At IndulgeSenses Spa, you are most certainly assured to leave feeling refreshed, rejuvenated, and overall feeling like a completely new person. With treatments ranging from facials, manicures, pedicures, waxing, many different types of massages from head to toe, and our range of milk baths, you will definitely feel and look your best and wanting to come back for more.\n" +
                        "\n" +
                        "GOLF IN THE WILD\n" +
                        "Designed by Bob Grimsdell, Hans Merensky Golf Course provides a truly unique golfing experience with a range of challenging holes. Having hosted many high-profile professional and amateur tournaments, the course is of widely acknowledged quality. The course is lined with bushveld forming a beautiful backdrop to the holes, and gives the impression that the course is far older than its 30 years.", "http://www.roomsforafrica.com/new-gallery/hansmerenskyhotelxspa_4-x_large.jpg", 0));
                cities.add(new City("Protea Hotel Kruger Gate", "On the banks of the Sabie River, and situated only 100 meters from the Kruger Gate of the Kruger National Park, the Protea Hotel Kruger Gate provides guests with the ideal situation from which to experience Africa first-hand. Truly the gateway to Nature, the lodge offers arranged game drives through the Kruger National Park, along with open vehicle safaris and organized game trails.\n" +
                        "\n" +
                        "ACCOMMODATION\n" +
                        "As much of the natural bush has been left in the grounds, and a veranda reminiscent of a tree house takes the guests to bedrooms echoing with the sounds of the night.\n" +
                        "\n" +
                        "Hotel Rooms \n" +
                        "Each of the 96 luxury air-conditioned en-suite bedrooms will make you feel part of the bushveld environment. The rooms consist of standard 4 star facilities including DSTV, tea/coffee making facilities, aircon, and hairdryer.\n" +
                        "\n" +
                        "Chalets \n" +
                        "Protea Hotel Kruger Gate has 8 four-sleeper fully equipped self catering chalets located in the hotels’ private reserve. Each chalet is fully serviced and has two luxury ensuite bedrooms, one upper - loft bedroom, a spacious lounge area, DSTV, self-contained kitchen, and private outdoor braai area.\n" +
                        "\n" +
                        "The chalets are in close proximity to the hotel’s restaurants. Bushveld dining offers a buffet style breakfast in the Kudyela Restaurant whilst an a’la carte lunch is served on the hotel’s unique wooden sundeck. Dine under diamond bright stars at the open air Lapa restaurant, and sample the sumptuous array of buffet dishes including potjies of fragrant delicacies.\n" +
                        "\n" +
                        "DINING\n" +
                        "Bushveld dining offers a buffet-style breakfast in the Kudyela restaurant, whilst an a’la carte lunch, featuring traditional African and International fare, is served on the wooden sundeck. As the dinner drum sounds, surely one of the most memorable moments of your visit will be dining under diamond-bright stars at the Lapa restaurant. The Lapa offers a sumptuous array of buffet dishes, including game and bubbling potjies of fragrant delicacies.\n" +
                        "\n" +
                        "ACTIVITIES\n" +
                        "The unique view deck and sundowner bar area, overlooking the mysterious Sabie River flowing through the Kruger National park, offer front row seats to a very spectacular display of Africa. The deck allows our guests the opportunity to come within touching distance of Africa's impressive variety of game. Explore the experience of the wild, by going on a walking trail with an expert guide in the hotel’s private reserve. \n" +
                        "\n" +
                        "A bird-watchers paradise awaits enthusiast on our doorstep. A choice of on-site facilities such as miniature golf, a floodlit tennis court, volleyball, mini putt-putt, children's playground and game’s room, will keep even the most active occupied. In the heat of the day, take the lead of the wildlife that surrounds you, by taking a refreshing dip in the swimming pool.", "https://www.south-african-lodges.com/media/protea-hotel-kruger-gate-room-2.jpg", 0));
                cities.add(new City("Coach House Hotel & Spa", "Coach House Hotel & Spa offers world-class hospitality in luxurious comfort and scenic tranquility in the friendly ambience of a gracious country estate. Brimming with history, the Coach House is on the site of the original staging post and hotel used by travellers in the feverish gold rush days of the late 19th century.\n" +
                        "\n" +
                        "Situated on 560 lush hectares of the Letaba district in Limpopo Province, the hotel nestles atop a spur looking over the verdant Letsitele valley and the dramatic splendour of the Drakensberg Mountains and is the perfect venue for weddings and conferences.\n" +
                        "\n" +
                        "A superb wine cellar offers an excellent choice of fine wines and our acclaimed and charming Zeederberg Restaurant offers fine dining with outstanding cuisine. Since it first opened in 1983, the Coach House has gained a reputation both locally and abroad as \"one of the finest and friendliest hotels in South Africa.”\n" +
                        "\n" +
                        "ACCOMMODATION\n" +
                        "The Coach House offers 39 spacious, well-appointed rooms offering every comfort and convenience and each with its own generous en-suite bathroom and separate shower. There are nine Suites, 25 Premier rooms with extra long king-size double or three quarter twin beds and five standard single rooms.\n" +
                        "\n" +
                        "All rooms have private verandahs with sweeping panoramic mountain views and are fitted with luxurious percale cotton sheets and mohair blankets, heated towel rails, air-conditioning, ceiling fans and personal bathrobes. Other room facilities include electronic safes, hairdryers, and heaters, mini bars and satellite TV with 18 channels.\n" +
                        "\n" +
                        "The bathrooms have an extensive range of guest amenities and the rooms are stocked with fresh flowers, spring water, fresh fruit, and homemade biscuits daily. The Suites and Premier rooms have log-burning fireplaces where one can snuggle up on a chilly winter's night after a perfect day.\n" +
                        "\n" +
                        "DINING\n" +
                        "Fine wining and dining is a daily occurrence at the Coach House! Renowned for the finest breakfast in the country, there is no better place to enjoy this than on the verandah overlooking the pool, which offers spectacular views of the northern Drakensberg Mountains. Feast on a stunning full buffet of fruit, yoghurt, cereals, cold meats, smoked salmon, cheeses, homemade breads and pastries and many more mouth-watering delights. A variety of delicious cooked breakfasts is available daily.\n" +
                        "\n" +
                        "The chef and his team specialise in preparing exceptionally good food! They use only the freshest seasonal ingredients, most of which are sourced locally, like the Lunsklip River trout, Bonsmara beef, and sub-tropical fruits and nuts. Tantalize your taste buds with mouth-watering lunches and candle-lit dinners from the à la carte menu in the Zeederberg Restaurant where vegetarian and special dietary requirements are easily catered for on request.\n" +
                        "\n" +
                        "The sumptuous Sunday buffet lunch is a festive affair with an array of delicious, carefully prepared dishes to please everyone.\n" +
                        "\n" +
                        "AGATHA SPA\n" +
                        "Feel the stress simply melt away in the tranquil surroundings of the luxurious Agatha Spa where ancient Roman hydrotherapy meets modern health and wellness techniques. Add to this the incredible natural beauty of the magnificent Drakensberg Mountains and you have the ingredients for an unforgettable day at Agatha Spa.", "https://media-cdn.tripadvisor.com/media/photo-o/0a/3c/61/47/bedroom-soft-light.jpg", 0));
                break;
            case "Attraction":
                cities.add(new City("Bakone Malapa Museum", "The stylish Bakone Malapa Museum is a wonderful place to experience the rich culture of the BaSotho people. \n" +
                        "\n" +
                        "The Bakone, a highly sophisticated subgroup of the Northern Sotho tribe, will give you a warm welcome and enthusiastically share their contemporary and traditional customs. \n" +
                        "\n" +
                        "The guides are superb story tellers and the village becomes alive as they take you on a journey through their traditional way of life. \n" +
                        "\n" +
                        "Considered a living museum, the Bakone tribesmen practise long-standing traditions to explain the traditions of Africa’s people. Another reconstructed village like it is the open-air Tsonga Museum near Tzaneen. \n" +
                        "\n" +
                        "Bakone Malapa is built in the style used by the northern Sotho 250 years ago and demonstrates the daily life of the Bakone clan. \n" +
                        "\n" +
                        "Two homesteads exhibit and explain fire making, maize grinding and beer brewing in the traditional manner. Handcraft demonstrations include pottery, basketry and bead work. Most of these locally-made creations are sold from the onsite craft shop. \n" +
                        "\n" +
                        "And that’s not all – the museum and cultural village has a bird sanctuary, wildlife reserve, hiking trails and outdoor recreation areas. \n" +
                        "Directions to Bakone Malapa Museum\n" +
                        "\n" +
                        "The Bakone Malapa Museum is 9 km from Polokwane on the R37 (Burgersfort Road) and is easily accessible by road.", "https://www.sa-venues.com/attractions/limpopo/images/bakone-malapa.jpg", Float.parseFloat("4.5")));

                cities.add(new City("Polokwane Game Reserve", "Polokwane Game Reserve is one of the most notable municipal reserves in the country. Unusually large, it protects a comparatively rare vegetation type and is home to some fairly finicky eaters like sable antelope. It’s a lovely wildlife experience, not far from Johannesburg, and you can explore it on horseback.\n" +
                        "\n" +
                        "DID YOU KNOW?\n" +
                        "\n" +
                        "Wild animals tolerate horse riders closer to them than they do vehicles or people on foot.\n" +
                        "\n" +
                        "A handy three hours' drive from Johannesburg, Polokwane Game Reserve guarantees a high-quality, low-cost wildlife experience where you can see plenty of game, forests of aloes and unusual birds.\n" +
                        "\n" +
                        "In fact, Polokwane Game Reserve is something of an open secret among the birding fraternity. This is probably the easiest place to spot South African specials like the short-clawed lark as well as the Kalahari scrub-robin, ashy tit, zitting cisticola and burnt-neck eremomela. You might also see the unreasonably beautiful violet-backed starling.\n" +
                        "\n" +
                        "Most of the rich grasslands around the city of Polokwane in Limpopo have been converted to agriculture. This reserve is one of the last places you’ll find particular kinds of vegetation like the fertile Pietersberg Plateau False Grassland habitat.\n" +
                        "\n" +
                        "That’s because the fertile soils it grows on have mostly been snapped up by surrounding agriculture. But the nutritious grasses support some very rare species, like sable and tsessebe antelope. You could also see less finicky creatures like the white rhino. There are also giraffe, zebra, impala and more than a dozen more mammal species.\n" +
                        "\n" +
                        "Polokwane Game Reserve is 3 200 hectares in size and is one of the largest municipal reserves in the country. It has an excellent network of roads, so you can easily drive yourself around for game viewing. If you prefer your wildlife experiences on foot, there’s a 21km long hiking route. If you’re really energetic, you can do it in a day, but there are overnight facilities too.\n" +
                        "\n" +
                        "There’s also a less strenuous 5km trail, perfect for a morning’s ramble, or you can book a morning or evening game drive.\n" +
                        "\nWHO TO CONTACT\n" +
                        "\n" +
                        "Polokwane Game Reserve\n" +
                        "Tel: +27 (0) 15 290 2331/3\n" +
                        "\n" +
                        "Nature’s Way Adventure Safaris\n" +
                        "Tel: +27 (0) 15- 263-6473\n" +
                        "Cell: +27 (0) 83-380-2322\n" +
                        "Email: naturesway@telkomsa.net" +
                        "But if you’re up for something more exotic, you can do some horse-riding through the reserve with a local operator. And not just any an amble through the bush either. Apart from morning rides, lunchtime rides (including a sumptuous spread) or sunset rides with sundowner snacks, you could also opt to ride by full moon through the bush – an experience you will never forget.", "https://www.sa-venues.com/game-reserves/graphics/polokwane/1.jpg", 1));
                cities.add(new City("Turfloop Nature Reserve", "Lying due west of the University of Limpopo's Turfloop campus, just east of Polokwane, is the provincially administered Turfloop Nature Reserve (sometimes also called a game reserve).\n" +
                        "\n" +
                        "Named after the Turfloop township outside Polokwane, it centres around a body of water known as the Turfloop Dam – the original reason for the formation of the reserve was to protect the reservoir and its wetlands.\n" +
                        "\n" +
                        "The under resourced and anonymous little reserve does not make it onto the average visitor's list for the region, and admittedly it is a little down at heel with roads overgrown with grass, little to no facilities, and a rather vague turn-off the R71, opposite a couple of general dealer stores.\n" +
                        "\n" +
                        "However, despite this obscurity, Turfloop is surprisingly worth a visit. Placed in the shade by the Kruger National Park it might be, but it has several rather unique arguments for visiting.\n" +
                        "\n" +
                        "Firstly, it has rich cultural ties. The reserve abundant in Mamabolo mountain bushveld, peppered with immense granite outcrops that are a feature of the landscape, lies on the communal land of the people of the village of Mambolo. There is also a rock art site, the Mankweng Rock Art Site, associated with the Turfloop Dam.\n" +
                        "\n" +
                        "Secondly, the reserve is a peaceful and relaxed environment in which to spot game – giraffe, wildebeest, impalas and ostrich are easily spotted - away from the crowds of the Kruger National Park.\n" +
                        "\n" +
                        "And finally Turfloop is a birding mecca that protects a breeding site for the nothernmost population of the southern bald ibis. The levels of the Turfloop dam tend to fluctuate, depending on rainfall in the area. As a result the birds change with the season.\n" +
                        "\n" +
                        "The shoreline of the dam exposes mudflats during summer where you might spot the odd wader, but also more common wetland birds like ducks, teals, shovelers and grebes. There is a rocky island on the dam that serves as a breeding site for the white-breasted cormorant, black-headed heron, African sacred ibis, African spoonbill and yellow-billed egret.\n" +
                        "\n" +
                        "Expect to pay an entry fee.", "https://www.sa-venues.com/attractions/gallery/limpopo/1410/1.jpg", 0));
                cities.add(new City("Makapansgat Valley", "Not only is Makapansgat of interest to paleontologists - numerous caves in the Makapansgat valley hold fossils that date back to 3.3 million years before the present, linking directly to the history at the Cradle of Humankind, when the valley was a tropical paradise - but it also displays an incredible diversity of life. \n" +
                        "\n" +
                        "This series of caves together form a national monument and intentions are that it should soon become a World Heritage Site. Primates in the shape of baboons and vervet monkeys make this their playground, whilst bush babies or galagos come out at night to forage for food. Like our forefathers, whose remains have been found in the Makapansgat catchment, these primates find a good supply of plant food in the form of seeds, tubers, fruits and berries. Nowhere is the biodiversity of early times in such rich display as in the caves of the Makapansgat Valley. \n" +
                        "\n" +
                        "The hills surrounding the Makapansgat valley are dotted with caves. Many of these are silting up or filled up long ago and are re-opened by local quarries in search of limestone. During one such search during mining operations in the 1920s, a large number of fossil bones were blown out of a particularly large cave in the area. It was not fully investigated until 1947, when it was confirmed that there were remains of Australopithecus africanus or early man..", "http://www.riddledchain.org/makapanvalley.jpg", 0));
                cities.add(new City("Masebe Nature Reserve", "Masebe might be small – 4500 hectares but it has been described as intensely interesting by visitors. It forms part of the north-eastern side of the Waterberg escarpment with streams of water freely flowing from the mountain to form a myriad waterfalls during the rainy season. \n" +
                        "\n" +
                        "It is a communal owned nature reserve, run by the local Bakenberg community. Seven villages donated their land for use as a nature reserve and took on responsibility in partnership with the Limpopo government (Limpopo has large areas still devoted to rural communities who continue to live as they have for centuries). \n" +
                        "\n" +
                        "What makes Masebe Nature Reserve interesting is the variety of rock formation that combine with vegetation and rivers to make it especially beautiful. The scenery is one of the major reasons people visit Masebe. That and its three bushveld San Rock-art sites that have survived principally due to the inaccessibility of the area, which has kept it so well-conserved. \n" +
                        "\n" +
                        "One rock formation in particular is known as Magagamatala. This huge 300 metre-high sandstone buttress that towers over the Mogalakwena River defines the southern boundary of Masebe. \n" +
                        "\n" +
                        "The local Telekishi community has set up a visitor centre in the nature reserve to offer guided tours of this historic site – it played a part in the 1854 Boer settler skirmishes. The reserve includes sable, tsessebe, giraffe, zebra, nyala, eland, kudu and leopard, and as such is safe for hiking. Its hiking trails and rock climbing facilities are another reason for its popularity. \n" +
                        "\n" +
                        "Masebe is on the African Ivory Route – a selection of roads and camps that take the traveler off the beaten track.", "https://www.snupit.co.za/content/photos/333109/333109-f24aed08-f27e-487c-bfda-38188c7a2e02.jpg", 0));
                cities.add(new City("Schuinsdraai Nature Reserve ", "Almostly 42 kilometres due north of Groblersdal, Schuinsdraai Nature Reserve surrounds the Flag Boshielo Dam (formerly known as Arabie Dam) in the Sekhukhune District of Limpopo. \n" +
                        "\n" +
                        "The almost 9 200 hectare reserve was proclaimed in 1993 and incorporates central sandy bushveld (regarded as poorly protected in the country), savanna biome and plant species that need conservation. The reserve intends restoring a full distribution of the type of game that would historically have wandered these plains. \n" +
                        "\n" +
                        "At last count there were over 3 300 different animals present in the reserve, including antelope, blue wildebeest, zebra, warthog, giraffe, baboons, caracal, black-backed jackal, and the endangered brown hyena. \n" +
                        "\n" +
                        "Hippos too frequent the reserve, but they are not officially resident – they wander up the Olifants River, a critically endangered river dissected by the reserve. Eleven species of bird, listed on the IUCN Red List of Threatened Species, occur within the reserve. These include the African finfoot, Cape vulture, half-collared kingfisher, lanner falcon, lesser flamingo, martial eagle, red-billed oxpecker, secretary bird and tawny eagle. \n" +
                        "\n" +
                        "Eighteen different amphibians live in Schuinsdraai, including the bushveld rain frog and painted reed frog. And there is a large group of crocodiles in the dam. Day visitors can picnic at sites, there is a slipway for boat access into the dam, there are a number of informal hiking trails, birding trails and mountain bike trails – none very well signposted as yet, but there for those who seek them. \n" +
                        "\n" +
                        "There are plans afoot to improve the reserve by introducing water sports to the dam, constructing a bar, restaurant and swimming area, and extending the game fence.", "https://sncdn.com/db/id/816536/1799383a.jpg", 0));
                cities.add(new City("Wolkberg Wilderness Area", "The Wolkberg Wilderness Mountain Reserve in Limpopo is a day-tripper's delight with plenty to see and do. Also known as the 'cloudy mountains', the Wolkberg Wilderness offers gorgeous picnic spots, rivers, waterfalls and walking trails, as well as rich bird and mammal life.\n" +
                        "\n" +
                        "DID YOU KNOW?\n" +
                        "\n" +
                        "At 2 050m, Serala is the Wolkberg's highest peak\n" +
                        "\n" +
                        "The Wolkberg Wilderness Mountain Reserve is a 22 000 hectare playground for all manner of adventurers.\n" +
                        "\n" +
                        "Whether you're into a good hard hike through steep gorges and along ancient cliffs, or just a gentle day picnicking and ambling alongside a rushing river, the Wolkberg Wilderness area is a quiet and beautiful escape.\n" +
                        "\n" +
                        "This Limpopo reserve is much admired by local hikers, climbers, walkers and wanderers, thanks to its variety of trails and diverse habitat. There are marked trails, but you can walk anywhere you want, exploring dramatic gorges and cliffs, thickly forested ravines and wide-open grasslands.\n" +
                        "\n" +
                        "While you're out walking you may well see smaller antelope such as klipspringer, grey rhebok, duiker, bushbuck and mountain reedbuck, as well as monkeys, baboons, elusive otters and the spotted genet.\n" +
                        "\n" +
                        "Birders are in for a treat too – the Wolkberg Wilderness is home to the rare bat hawk, as well as black eagles, crowned eagles, hamerkops, bat hawks, pearl-breasted swallows and more.\n" +
                        "\n" +
                        "The Wolkberg is the last and northermost stand of the majestic Drakensberg mountain range and was proclaimed, in part, because of its many endemic species. Part of its great appeal is its accessibility. The pretty town of Haenertsburg is only 14 km away.\n" +
                        "\n" +
                        "Don't leave home without your swimming costume. The 'cloudy mountains', as the area is also known, boasts many a clear stream, refreshing waterfalls and potholed pools.\n" +
                        "\n" +
                        "The Letaba, Thabina, Letsitele and Mohlapitse Rivers all originate in the Wolkberg Wilderness, a litany of ancient African names whose river courses are guarded by yellowwoods, wild figs, wild beeches and waterberry trees.", "http://www.southafrica.net/cache/ce_cache/made/68d1052601edf53b/serala%20peak%20Wolkberg_960_472_80auto_s_c1_center_center.jpg", 0));
                cities.add(new City("Percy Fyfe Conservancy", "The main function of the Percy Fyfe Conservancy is as a breeding farm for roan antelope and disease-free buffalo, but there is also a camp for students where children can learn about and interact with wildlife in the conservancy. \n" +
                        "\n" +
                        "Cyclists enjoy the dirt roads within the conservancy, between the Matopos-like formations (incredible granite hill formations that look a bit like the backs of whales or castles; similar to those found in the Matopos National Park just outside Bulawayo in southern Zimbabwe) on 12 kilometres of road. \n" +
                        "\n" +
                        "Conversely bikes can also cycle on designated hiking trails for something a little more exciting and longer – 20 km. \n" +
                        "\n" +
                        "There are game drives available in Percy Fyfe Conservancy, but the predominantly hoofed game in the conservancy makes walking and cycling one of the best ways to see them and enjoy being out of doors. \n" +
                        "\n" +
                        "You can contact the reserve on Telephone: +27 (0)15 491-5678", "https://www.safarinow.com/db/id/263597/gt306377.jpg", 0));
                break;
            case "Events":
                cities.add(new City("Today is monday"));
                break;
            case "Airport":
                cities.add(new City("Polokwane International Airport","Polokwane International Airport (PTG), also known as Pietersburg International Airport or Gateway International Airport, is a small airport located in Polokwane that serves as an international port of entry into the Limpopo province. The airport opened in 1996 on the site of a former air force base and is easily accessible by road or rail.\n" +
                        "\n" +
                        "The airport boasts a world class terminal building which is in excess of 4,000 square meters, with ample retail and commercial space to meet the demands of discerning travellers. The airport has 4 aprons with a parking capacity of 74,800m², modern air traffic control, excellent navigational aids, and 2 serviced runways.","http://www.gaal.co.za/wp-content/uploads/2015/12/9.jpg",0));
        }
        return cities;
    }
}
