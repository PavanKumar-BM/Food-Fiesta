package com.example.demo.config;

import com.example.demo.entities.Admin;
import com.example.demo.repositories.AdminRepository;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository, AdminRepository adminRepository) {
        return args -> {
            if (productRepository.count() == 0) {
                // ... (existing product seeding)
                Product p1 = new Product();
                p1.setPname("Hyderabadi Biryani");
                p1.setPprice(410.0);
                p1.setPdescription("Authentic slow-cooked basmati rice with tender spice-marinated chicken.");
                p1.setImagePath("/Images/biryani/Biryani_of_Hyderabadi.jpg");

                Product p2 = new Product();
                p2.setPname("Paneer Butter Masala");
                p2.setPprice(290.0);
                p2.setPdescription("Rich and creamy tomato base with fresh cubes of cottage cheese.");
                p2.setImagePath("/Images/paneer/paneer-butter-masala.jpg");

                Product p3 = new Product();
                p3.setPname("Royal Butter Chicken");
                p3.setPprice(380.0);
                p3.setPdescription("Our signature dish. Silky smooth gravy with tandoori chicken chunks.");
                p3.setImagePath("/Images/chicken/butter-chicken.jpg");

                Product p4 = new Product();
                p4.setPname("Honey Chilli Potato");
                p4.setPprice(150.0);
                p4.setPdescription("Crispy potato fries glazed with honey and fiery Schezwan sauce.");
                p4.setImagePath("/Images/north-india-food/Honey-Chilli-Potato.jpg");

                Product p5 = new Product();
                p5.setPname("Gulab Jamun");
                p5.setPprice(50.0);
                p5.setPdescription("Warm, syrup-soaked berry-sized balls made with milk solids.");
                p5.setImagePath("/Images/north-india-food/Gulab Jamun.jpg");

                Product p6 = new Product();
                p6.setPname("Kolkata Biryani");
                p6.setPprice(350.0);
                p6.setPdescription("Signature biryani with subtle spices, a boiled egg, and a soft potato.");
                p6.setImagePath("/Images/biryani/kolkata biryani.jpg");

                Product p7 = new Product();
                p7.setPname("Tandoori Chicken Tikka");
                p7.setPprice(320.0);
                p7.setPdescription("Juicy chicken chunks marinated in yogurt and spices, grilled to perfection.");
                p7.setImagePath("/Images/chicken/Tandoori-chicken-tikka.jpg");

                Product p8 = new Product();
                p8.setPname("Chola Bhatura");
                p8.setPprice(180.0);
                p8.setPdescription("Spicy chickpea curry served with soft, fluffy deep-fried bread.");
                p8.setImagePath("/Images/north-india-food/chola-bhatura.jpg");

                Product p9 = new Product();
                p9.setPname("Kadai Paneer");
                p9.setPprice(270.0);
                p9.setPdescription("Cottage cheese and bell peppers cooked in a spicy, flavorful tomato gravy.");
                p9.setImagePath("/Images/paneer/Kadai-Paneer.jpg");

                Product p10 = new Product();
                p10.setPname("Hakka Noodles");
                p10.setPprice(190.0);
                p10.setPdescription("Wok-tossed noodles with fresh crunchy vegetables and soy sauce.");
                p10.setImagePath("/Images/chinese/chowmein.jpg");

                Product p11 = new Product(); p11.setPname("Dum Biryani"); p11.setPprice(310.0); p11.setPdescription("Slow-cooked rice and meat with fragrant spices in a sealed pot."); p11.setImagePath("/Images/biryani/Dum-Biryani.jfif");
                Product p12 = new Product(); p12.setPname("Egg Biryani"); p12.setPprice(250.0); p12.setPdescription("Flavorful biryani rice cooked with boiled, spiced eggs."); p12.setImagePath("/Images/biryani/Egg-biryani.jpg");
                Product p13 = new Product(); p13.setPname("Lucknowi Biryani"); p13.setPprice(450.0); p13.setPdescription("Awadhi style biryani known for its mild, rich, and fragrant taste."); p13.setImagePath("/Images/biryani/Lucknowi-biryani.jpg");
                Product p14 = new Product(); p14.setPname("Egg Dum Biryani"); p14.setPprice(280.0); p14.setPdescription("Spiced eggs steamed with aromatic basmati rice."); p14.setImagePath("/Images/biryani/egg-dum-biryani.jpg");
                Product p15 = new Product(); p15.setPname("Veg Biryani"); p15.setPprice(220.0); p15.setPdescription("Mixed vegetables cooked with spiced rice and herbs."); p15.setImagePath("/Images/biryani/veg-biryani.jpg");
                Product p16 = new Product(); p16.setPname("Veg Dum Biryani"); p16.setPprice(240.0); p16.setPdescription("Vegetable layered rice slow-cooked in dum style."); p16.setImagePath("/Images/biryani/veg-dum-biryani.jpeg");
                Product p17 = new Product(); p17.setPname("Afghani Chicken Curry"); p17.setPprice(340.0); p17.setPdescription("Creamy, rich chicken curry infused with mild Afghani spices."); p17.setImagePath("/Images/chicken/Afgani-chicken-curry.jpg");
                Product p18 = new Product(); p18.setPname("Matka Chicken"); p18.setPprice(380.0); p18.setPdescription("Rustic chicken curry cooked in an earthen clay pot."); p18.setImagePath("/Images/chicken/Matka-Chicken.jpg");
                Product p19 = new Product(); p19.setPname("Chicken Karahi"); p19.setPprice(360.0); p19.setPdescription("Spicy chicken cooked with fresh tomatoes and green chilies in a wok."); p19.setImagePath("/Images/chicken/chicken-karahi-kadai.jpg");
                Product p20 = new Product(); p20.setPname("Kheer"); p20.setPprice(90.0); p20.setPdescription("Traditional Indian rice pudding flavored with cardamom and nuts."); p20.setImagePath("/Images/north-india-food/Khir.jpg");
                Product p21 = new Product(); p21.setPname("Laccha Paratha"); p21.setPprice(60.0); p21.setPdescription("Multi-layered, flaky, and crispy Indian flatbread."); p21.setImagePath("/Images/north-india-food/Laccha-Paratha.jpg");
                Product p22 = new Product(); p22.setPname("Soya Chaap"); p22.setPprice(160.0); p22.setPdescription("Tandoori roasted soya bean chunks marinated in spicy yogurt."); p22.setImagePath("/Images/north-india-food/Soya-Chaap.jpg");
                Product p23 = new Product(); p23.setPname("Matar Paneer"); p23.setPprice(240.0); p23.setPdescription("Cottage cheese and green peas in a savory tomato gravy."); p23.setImagePath("/Images/paneer/Matar-Paneer.jpg");
                Product p24 = new Product(); p24.setPname("Paneer Do Pyaza"); p24.setPprice(260.0); p24.setPdescription("Cottage cheese cooked with double the amount of onions and spices."); p24.setImagePath("/Images/paneer/paneer-do-pyaza.jpg");
                Product p25 = new Product(); p25.setPname("Chilli Paneer"); p25.setPprice(250.0); p25.setPdescription("Indo-Chinese style crispy paneer tossed in spicy soy sauce."); p25.setImagePath("/Images/chinese/chilli-Paneer.jfif");
                Product p26 = new Product(); p26.setPname("Veg Momos"); p26.setPprice(120.0); p26.setPdescription("Steamed dumplings filled with finely minced vegetables."); p26.setImagePath("/Images/chinese/momo.webp");
                Product p27 = new Product(); p27.setPname("Mixed Veg Curry"); p27.setPprice(210.0); p27.setPdescription("Assorted seasonal vegetables cooked in a rich, spiced sauce."); p27.setImagePath("/Images/vegetable/veg.jpg");
                Product p28 = new Product(); p28.setPname("Masala Chai"); p28.setPprice(40.0); p28.setPdescription("Classic Indian tea brewed with aromatic spices and milk."); p28.setImagePath("/Images/TEA.jpg");
                Product p29 = new Product(); p29.setPname("Ginger Tea"); p29.setPprice(40.0); p29.setPdescription("Refreshing hot tea infused with fresh ginger."); p29.setImagePath("/Images/TEA2.jpg");
                Product p30 = new Product(); p30.setPname("Gourmet Platter"); p30.setPprice(550.0); p30.setPdescription("A curated assortment of our chef's best appetizers."); p30.setImagePath("/Images/pro.jpg");

                Product p31 = new Product(); p31.setPname("Handi Veg Biryani"); p31.setPprice(270.0); p31.setPdescription("Mixed vegetables layered with rice and cooked in a traditional handi."); p31.setImagePath("/Images/biryani/veg-biryani.jpg");
                Product p32 = new Product(); p32.setPname("Green Tea"); p32.setPprice(50.0); p32.setPdescription("Organic green tea leaves brewed with hot water and honey."); p32.setImagePath("/Images/TEA.jpg");
                Product p33 = new Product(); p33.setPname("Chicken Tikka Masala"); p33.setPprice(390.0); p33.setPdescription("Roasted marinated chicken chunks in a spiced curry sauce."); p33.setImagePath("/Images/chicken/Tandoori-chicken-tikka.jpg");
                Product p34 = new Product(); p34.setPname("Malai Kofta"); p34.setPprice(260.0); p34.setPdescription("Potato and paneer balls deep fried and served in a creamy gravy."); p34.setImagePath("/Images/vegetable/veg.jpg");
                Product p35 = new Product(); p35.setPname("Rasgulla"); p35.setPprice(60.0); p35.setPdescription("Soft and spongy milk-solid balls soaked in light sugar syrup."); p35.setImagePath("/Images/north-india-food/Gulab Jamun.jpg");
                Product p36 = new Product(); p36.setPname("Aloo Paratha"); p36.setPprice(80.0); p36.setPdescription("Whole wheat flatbread stuffed with a spicy potato mixture."); p36.setImagePath("/Images/north-india-food/Laccha-Paratha.jpg");
                Product p37 = new Product(); p37.setPname("Lemon Tea"); p37.setPprice(40.0); p37.setPdescription("A refreshing blend of black tea, sugar, and freshly squeezed lemon."); p37.setImagePath("/Images/TEA2.jpg");
                Product p38 = new Product(); p38.setPname("Palak Paneer"); p38.setPprice(250.0); p38.setPdescription("Soft paneer cubes simmered in a smooth, vibrant spinach puree."); p38.setImagePath("/Images/paneer/Matar-Paneer.jpg");
                Product p39 = new Product(); p39.setPname("Chicken 65"); p39.setPprice(230.0); p39.setPdescription("Spicy, deep-fried chicken starter from South India."); p39.setImagePath("/Images/chicken/Afgani-chicken-curry.jpg");
                Product p40 = new Product(); p40.setPname("Vegetable Hakka Noodles"); p40.setPprice(160.0); p40.setPdescription("Stir-fried noodles with crisp veggies and savory Chinese sauces."); p40.setImagePath("/Images/chinese/chowmein.jpg");

                productRepository.saveAll(List.of(
                    p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, 
                    p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, 
                    p21, p22, p23, p24, p25, p26, p27, p28, p29, p30,
                    p31, p32, p33, p34, p35, p36, p37, p38, p39, p40
                ));
                System.out.println("40 Sample products data seeded into database.");
            }

            if (adminRepository.count() == 0) {
                Admin defaultAdmin = new Admin();
                defaultAdmin.setAdminName("Super Admin");
                defaultAdmin.setAdminEmail("admin@foodfiesta.com");
                defaultAdmin.setAdminPassword("admin123");
                defaultAdmin.setAdminNumber("9876543210");
                adminRepository.save(defaultAdmin);
                System.out.println("✅ Default Admin created: admin@foodfiesta.com / admin123");
            }
        };
    }
}
