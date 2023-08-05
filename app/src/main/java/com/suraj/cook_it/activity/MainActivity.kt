package com.suraj.cook_it.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.suraj.cook_it.databinding.ActivityMainBinding
import com.suraj.cook_it.model.Recipe
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        addRecipeViewPager(
            "Vada Pav", "Veg",
            "Vada Pav is a popular street food from Mumbai, India, consisting of a spicy potato vada (potato dumpling) sandwiched between a pav (bread roll). It's a delicious and satisfying snack that you can easily make at home.",

            listOf(

                "4 to 5 medium-sized potatoes, boiled, peeled, and mashed\n",
                "1 small onion, finely chopped\n",
                "2 to 3 green chilies, finely chopped (adjust to your spice preference)\n",
                "1-inch piece of ginger, grated\n",
                "1/2 teaspoon mustard seeds\n",
                "1/2 teaspoon cumin seeds\n",
                "A pinch of asafoetida (hing)\n",
                "A few curry leaves\n",
                "1/2 teaspoon turmeric powder\n",
                "1/2 teaspoon red chili powder\n",
                "1 tablespoon chopped coriander leaves\n",
                "Salt to taste\n",
                "1 tablespoon vegetable oil\n",
                "8 pav (small bread rolls)\n"

            ),

            listOf(

                "Heat vegetable oil in a pan over medium heat.\n" +
                        "Add mustard seeds, cumin seeds, asafoetida, and curry leaves. Let them splutter.\n" +
                        "Add finely chopped onions and sauté until they turn translucent.\n",
                "Add chopped green chilies and grated ginger. Sauté for a minute.\n" +
                        "Stir in turmeric powder, red chili powder, and salt.\n" +
                        "Add the boiled and mashed potatoes. Mix everything well, ensuring the spices are evenly distributed.\n",
                "Cook the mixture for a few minutes until the flavors blend. Add chopped coriander leaves and mix again.\n" +
                        "Let the potato mixture cool down.\n",
                "Take a pav and slice it horizontally, but not entirely through.\n" +
                        "Place a portion of the cooled potato vada inside the pav and press it gently to hold its shape.\n"

            ),
            "150 g",
            "30 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fvadapav.jpg?alt=media&token=6e18269f-01c0-4b7d-bcc2-de1984fe2d5f"
        )




        addRecipeViewPager(
            "Samosa",
            "Veg",
            "Deep-fried Indian pastry filled with spiced potatoes and peas.",
            listOf(
                "2 cups all-purpose flour",
                "1/4 cup vegetable oil",
                "1/2 tsp carom seeds (ajwain)",
                "1/2 tsp salt",
                "1/2 cup water",
                "2 large potatoes, boiled and mashed",
                "1/2 cup green peas",
                "1 small onion, finely chopped",
                "1 tsp cumin seeds",
                "1 tsp garam masala",
                "1 tsp ground coriander",
                "1/2 tsp red chili powder",
                "1/4 cup chopped cilantro",
                "Oil for deep frying"
            ),
            listOf(
                "In a bowl, mix all-purpose flour, vegetable oil, carom seeds, and salt.",
                "Gradually add water and knead the dough until it becomes smooth.",
                "Cover the dough and let it rest for 30 minutes.",
                "In a skillet, heat some oil and sauté cumin seeds until they splutter.",
                "Add chopped onions and cook until they turn translucent.",
                "Stir in mashed potatoes, green peas, garam masala, ground coriander, red chili powder, and chopped cilantro.",
                "Season with salt and cook until the filling is well combined and heated through.",
                "Divide the rested dough into small balls and roll them into thin circles.",
                "Cut the circles in half and form cones, fill them with the potato filling, and seal the edges.",
                "Heat oil for deep frying and fry the samosas until they turn golden brown and crispy.",
                "Serve hot with tamarind chutney or mint chutney."
            ),
            "220 g",
            "50 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fsamosa.jpg?alt=media&token=1221ce08-4dc3-48ad-99f2-660d0c48b1c8"
        )


        addRecipeViewPager(
            "Chole",
            "Veg",
            "Chole refers to an Indian chickpeas curry, especially popular in northern parts of India. Chole is made with soaking chickpeas (also known as garbanzo beans) overnight and then cooking them with onions, tomatoes and spices to make this really flavorful curry. There are many ways in which you can make chole, and there’s no really right or wrong way of making them.",

            listOf(
                "1/2 cup White Chick Peas\n",
                "1 teaspoon Tea Powder or Tea Leaves\n",
                "2 Red Ripe Tomatoes, chopped\n",
                "21 large Onion, finely chopped\n",
                "1½ teaspoons Ginger-Garlic Paste\n",
                "1 Green Chilli, finely chopped\n",
                "1/2 teaspoon Red Chilli Powder\n",
                "1/4 teaspoon Turmeric Powder\n",
                "3 tablespoons Cooking Oil\n",
                "Salt to taste\n",
                "2 tablespoons finely chopped Coriander Leaves\n",
                "1 small piece of Bay Leaf\n",
                "1 Black Cardamom\n",
                "1 tablespoon Coriander Seeds\n",
                "1 teaspoon Cumin Seeds\n",
                "4-5 Black Peppercorns\n",
                "1 Dry Red Chilli\n",
                "2 Cloves (lavang)\n",
                "1-inch piece of Cinnamon\n",
            ),

            listOf(
                "Soak white chickpeas in water overnight or for around 8-10 hours.\n",
                "Tie 1 teaspoon tea leaves in a plain muslin cloth. Tied tea leaves used for enhancing the color and flavor of chana. You can also use tea bags in place of tea leaves.\n",
                "Pressure cook soaked white chickpeas with a tied tea leaves pouch, enough water and salt in a 3-liter capacity steel/aluminum pressure cooker over medium flame. After 4-5 whistles, turn off the flame and let the pressure comes down naturally. Do not open the lid immediately to cook the chana perfectly. Open the lid and remove tied tea leaves pouch. Drain the excess water from boiled chickpeas in a large bowl. Keep the drained water to use later in the recipe. If pressure cooker is not available, you can also use a deep pan to boil chickpeas but it would take more time to cook.\n",
                "Dry roast bay leaf, black cardamom, coriander seeds, cumin seeds, black peppercorns, dry red chilli, cloves and cinnamon in a pan until nice aroma starts or for around 1-minute over low flame. Let them cool for a while and then grind them in a small jar of a mixer grinder to make smooth dry punjabi masala powder.\n",
                "Mash 2 tablespoons boiled chickpeas with backside of a large spoon or grind in a grinder to make a medium coarse paste. Grind tomatoes in a mixer grinder to make tomato puree.\n",
                "Heat 3-tablespoons cooking oil in a kadai or pan over medium flame. Add chopped onion and sauté until it turns light brown or for approx. 1-2 minutes. Add ginger-garlic paste and chopped green chilli. Mix well and cook for 30 seconds.\n",
                "Add tomato puree and salt (only for tomato puree because we have already added salt while boiling white chickpeas). Cook on medium flame until oil starts to separate, around 4-5 minutes. Stir it in between occasionally to prevent sticking.\n",
                "Add turmeric powder, red chilli powder and dry masala powder (prepared in step-4).\n",
                "Mix well and sauté for a minute.\n",
                "Add boiled chickpeas, mashed chickpeas and 1-cup water (preserved drained water of boiled chickpeas), mix well.\n",
                "Cook until gravy becomes thick, it will take around 4-5 minutes. Turn off the flame. Transfer white chana masala curry to a serving bowl and garnish with chopped coriander leaves. Serve it hot with bhatura or steamed rice.\n"
            ),
            "240 g",
            "40 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fchole.jpg?alt=media&token=77dad502-7f7b-40ec-acf0-c4204d836ec1"
        )


        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------


        addRecipe(

            "Chocolate Cake",
            "Veg",
            "A delicious chocolate cake recipe.",
            listOf(
                "2 cups all-purpose flour",
                "1 cup sugar",
                "1/2 cup cocoa powder"
            ),
            listOf(
                "Preheat the oven to 350°F.",
                "Grease and flour a 9x13 inch baking pan.",
                "In a large mixing bowl, combine flour, sugar, and cocoa powder.",
                "In a separate bowl, mix together eggs, milk, and vegetable oil.",
                "Gradually add the wet ingredients to the dry ingredients and mix until smooth.",
                "Pour the batter into the prepared baking pan.",
                "Bake in the preheated oven for 30-35 minutes or until a toothpick inserted in the center comes out clean.",
                "Let the cake cool completely before frosting or serving."
            ),
            "300 g",
            "40 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FChocolateCake.jpg?alt=media&token=f725c243-65d8-475c-ae65-074300f19216"
        )






        addRecipe(
            "Pasta Carbonara",
            "Veg",
            "Classic Italian pasta dish.",
            listOf(
                "1 lb spaghetti",
                "1/2 cup grated Parmesan",
                "4 large eggs"
            ),
            listOf(
                "Cook the pasta in a large pot of boiling salted water until al dente. Drain the pasta, reserving some pasta water.",
                "In a mixing bowl, whisk together grated Parmesan and eggs until well combined.",
                "Add the cooked pasta to the bowl with the egg and cheese mixture. Toss quickly to coat the pasta evenly.",
                "The heat from the pasta will cook the eggs, creating a creamy sauce.",
                "If the sauce is too thick, add a little of the reserved pasta water to achieve the desired consistency.",
                "Serve immediately, and top with additional grated Parmesan and black pepper if desired."
            ),
            "400 g",
            "35 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FPastaCarbonara.jpg?alt=media&token=843d5cc4-af27-4cbe-86ea-10bf2b45321f"
        )


        addRecipe(
            "Margherita Pizza",
            "Veg",
            "Classic Italian pizza topped with fresh tomatoes and basil.",
            listOf(
                "1 pizza dough",
                "1/2 cup pizza sauce",
                "1 cup shredded mozzarella cheese",
                "2-3 ripe tomatoes, sliced",
                "Fresh basil leaves",
                "Salt and pepper to taste"
            ),
            listOf(
                "Preheat the oven to 450°F.",
                "Roll out the pizza dough on a floured surface to your desired thickness.",
                "Place the rolled-out dough on a pizza stone or baking sheet.",
                "Spread the pizza sauce evenly over the dough.",
                "Top with shredded mozzarella cheese, tomato slices, and fresh basil leaves.",
                "Season with salt and pepper.",
                "Bake in the preheated oven for 10-12 minutes or until the crust is golden and the cheese is melted and bubbly.",
                "Slice and serve hot."
            ),
            "280 g",
            "25 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FMargheritaPizza.jpg?alt=media&token=011f17ab-c977-4f1b-9cf1-93d000552d93"
        )



        addRecipe(
            "Caesar Salad",
            "Veg",
            "Classic Caesar salad with croutons and parmesan cheese.",
            listOf(
                "1 head romaine lettuce, torn",
                "1/2 cup Caesar salad dressing",
                "1/4 cup grated Parmesan cheese",
                "1 cup croutons"
            ),
            listOf(
                "In a large salad bowl, add torn romaine lettuce.",
                "Pour Caesar salad dressing over the lettuce and toss to coat.",
                "Add grated Parmesan cheese and croutons to the salad.",
                "Toss everything together until well combined.",
                "Serve immediately as a delicious side or light meal."
            ),
            "220 g",
            "15 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FcaesarSalad.jpg?alt=media&token=266fdd7d-3e04-48d4-be6c-cf0eeba71638"
        )






        addRecipe(
            "Vegetable Biryani",
            "Veg",
            "Fragrant and flavorful Indian rice dish with mixed vegetables.",
            listOf(
                "1 cup basmati rice, soaked for 30 minutes",
                "1 cup mixed vegetables (carrots, peas, potatoes, etc.)",
                "1 large onion, thinly sliced",
                "2 cloves garlic, minced",
                "1 tbsp biryani masala",
                "1/4 cup yogurt",
                "1/4 cup chopped mint leaves",
                "1/4 cup chopped cilantro",
                "1/4 cup fried onions (optional, for garnish)",
                "1/4 cup toasted cashews (optional, for garnish)",
                "2 tbsp ghee or vegetable oil",
                "Whole spices (cinnamon, cloves, cardamom) for flavor",
                "Salt to taste"
            ),
            listOf(
                "In a large pot, heat ghee or vegetable oil and sauté the whole spices until fragrant.",
                "Add thinly sliced onions and minced garlic. Sauté until the onions turn golden brown.",
                "Stir in mixed vegetables and cook for a few minutes.",
                "Add biryani masala, soaked basmati rice, chopped mint, and cilantro.",
                "Pour yogurt over the mixture and mix everything gently.",
                "Add enough water to cook the rice and season with salt.",
                "Cover the pot and let the biryani cook on low heat until the rice is tender and fully cooked.",
                "Garnish with fried onions and toasted cashews before serving."
            ),
            "380 g",
            "35 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FVegetableBiryani.jpg?alt=media&token=1e99a271-b70a-4ab4-88c5-8862ac4d0adf"
        )





        addRecipe(
            "Biryani",
            "Veg",
            "Classic Indian rice dish.",
            listOf(
                "1 lb basmati rice",
                "1 lb chicken",
                "1/2 cup yogurt"
            ),
            listOf(
                "Wash the rice in cold water until the water runs clear. Soak the rice in water for 30 minutes.",
                "In a large pot, heat oil or ghee over medium heat. Add whole spices like cinnamon, cardamom, and bay leaves.",
                "Add chopped onions and sauté until they turn golden brown.",
                "Add the marinated chicken and cook until it changes color.",
                "Mix in yogurt and cook until the chicken is tender and cooked through.",
                "In a separate pot, boil water and cook the soaked rice until it is 70-80% cooked.",
                "Layer the cooked chicken and rice in the pot, starting and ending with rice.",
                "Cover the pot with a lid and cook on low heat for about 30 minutes or until the rice is fully cooked and the flavors are infused."
            ),
            "500 g",
            "35 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fbiryani.jpg?alt=media&token=53273b95-70ba-4015-8fa7-c22cbdb70f93"
        )



        addRecipe(
            "Chicken Tikka Masala",
            "Non-Veg",
            "Creamy and flavorful Indian chicken curry.",
            listOf(
                "1 lb boneless chicken, cut into cubes",
                "1 cup plain yogurt",
                "2 tbsp vegetable oil",
                "1 large onion, finely chopped",
                "2 cloves garlic, minced",
                "1 tbsp ginger paste",
                "1 can (14 oz) tomato sauce",
                "2 tbsp garam masala",
                "1 tbsp ground cumin",
                "1 tsp chili powder",
                "1/2 cup heavy cream",
                "Fresh cilantro for garnish",
                "Salt and pepper to taste"
            ),
            listOf(
                "In a bowl, marinate the chicken cubes in yogurt, garam masala, ground cumin, chili powder, ginger paste, and garlic.",
                "In a large skillet, heat vegetable oil and sauté the finely chopped onions until golden brown.",
                "Add the marinated chicken and cook until the chicken is tender and cooked through.",
                "Stir in tomato sauce and let it simmer for 10 minutes.",
                "Pour in the heavy cream and cook for an additional 5 minutes.",
                "Season with salt and pepper to taste.",
                "Garnish with fresh cilantro and serve hot with steamed rice or naan bread."
            ),
            "420 g",
            "45 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FChickenTikkaMasala.jpg?alt=media&token=b3001b3f-533d-4c43-915f-49e7317988be"
        )




        addRecipe(
            "Butter Chicken",
            "Non-Veg",
            "Rich and creamy Indian chicken curry in a buttery tomato sauce.",
            listOf(
                "1 lb boneless chicken, cut into cubes",
                "1 cup plain yogurt",
                "2 tbsp vegetable oil",
                "1 large onion, finely chopped",
                "2 cloves garlic, minced",
                "1 tbsp ginger paste",
                "1 can (14 oz) tomato puree",
                "1/4 cup heavy cream",
                "1 tbsp garam masala",
                "1 tsp ground turmeric",
                "1 tsp ground cumin",
                "1 tsp paprika",
                "2 tbsp butter",
                "Salt to taste"
            ),
            listOf(
                "In a bowl, marinate the chicken cubes in yogurt, ground turmeric, ground cumin, and paprika.",
                "In a large skillet, heat vegetable oil and sauté chopped onions until golden brown.",
                "Add minced garlic and ginger paste. Cook for a minute until fragrant.",
                "Stir in marinated chicken and cook until the chicken is browned.",
                "Add garam masala and tomato puree to the skillet. Let it simmer for 15 minutes.",
                "Pour in heavy cream and butter. Cook until the sauce thickens.",
                "Season with salt to taste.",
                "Serve hot with naan or rice."
            ),
            "420 g",
            "40 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FButterChicken.jpg?alt=media&token=6b93786a-1195-4323-b8d6-18921056178b"
        )






        addRecipe(
            "Palak Paneer",
            "Veg",
            "Creamy spinach curry with paneer (Indian cottage cheese).",
            listOf(
                "200g paneer (Indian cottage cheese), cut into cubes",
                "1 bunch spinach, washed and chopped",
                "1 large onion, finely chopped",
                "2 tomatoes, pureed",
                "1 tsp cumin seeds",
                "1 tbsp ginger-garlic paste",
                "1 tsp garam masala",
                "1/2 tsp turmeric powder",
                "1/2 tsp ground cumin",
                "1/4 cup heavy cream",
                "1 tbsp ghee or vegetable oil",
                "Salt to taste"
            ),
            listOf(
                "Blanch the chopped spinach in hot water for 2 minutes. Drain and immediately plunge it into ice-cold water to retain its green color.",
                "In a blender, puree the blanched spinach to a smooth paste.",
                "In a large skillet, heat ghee or vegetable oil and sauté cumin seeds until they splutter.",
                "Add finely chopped onions and cook until they become translucent.",
                "Stir in ginger-garlic paste, ground turmeric, and ground cumin. Cook for a minute until fragrant.",
                "Add tomato puree and cook until the oil starts to separate.",
                "Add paneer cubes and the spinach puree. Mix well and cook for 5 minutes.",
                "Pour in heavy cream and garam masala. Cook for an additional 2 minutes.",
                "Season with salt to taste.",
                "Serve hot with naan or rice."
            ),
            "320 g",
            "35 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fpalakpaneer.jpg?alt=media&token=1c2b9b2e-5773-49ef-b102-802f9ca8814e"
        )



        addRecipe(
            "Paneer Tikka",
            "Veg",
            "Tandoori-spiced grilled Indian cottage cheese.",
            listOf(
                "200g paneer (Indian cottage cheese), cut into cubes",
                "1 bell pepper, cut into chunks",
                "1 onion, cut into chunks",
                "1/4 cup yogurt",
                "1 tbsp ginger-garlic paste",
                "1 tsp garam masala",
                "1 tsp ground cumin",
                "1/2 tsp turmeric powder",
                "1/2 tsp red chili powder",
                "1 tbsp lemon juice",
                "Salt to taste",
                "Wooden skewers for grilling"
            ),
            listOf(
                "In a bowl, mix yogurt, ginger-garlic paste, garam masala, ground cumin, turmeric powder, red chili powder, lemon juice, and salt to form a marinade.",
                "Add paneer cubes, bell pepper, and onion chunks to the marinade. Toss to coat the pieces well.",
                "Cover the bowl and let the paneer and vegetables marinate for at least 30 minutes.",
                "Thread the paneer, bell pepper, and onion onto wooden skewers.",
                "Grill the skewers on a hot grill or stovetop grill pan until the paneer and vegetables are charred and cooked through.",
                "Serve hot with mint chutney and lemon wedges."
            ),
            "250 g",
            "30 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FpaneerTikka.jpg?alt=media&token=b5337158-640b-40d0-ace9-255c40af8b68"
        )






        addRecipe(
            "Chana Masala",
            "Veg",
            "Spicy and tangy Indian chickpea curry.",
            listOf(
                "2 cups cooked chickpeas",
                "1 large onion, finely chopped",
                "2 tomatoes, pureed",
                "2 cloves garlic, minced",
                "1-inch ginger, grated",
                "1 tsp cumin seeds",
                "1 tsp turmeric powder",
                "1 tsp ground coriander",
                "1 tsp garam masala",
                "1/2 tsp chili powder",
                "1/4 cup chopped cilantro",
                "1/4 cup water",
                "2 tbsp vegetable oil",
                "Salt to taste"
            ),
            listOf(
                "In a large skillet, heat vegetable oil and sauté cumin seeds until they splutter.",
                "Add finely chopped onions and cook until they become translucent.",
                "Stir in minced garlic and grated ginger and cook for a minute.",
                "Add turmeric powder, ground coriander, garam masala, and chili powder. Cook for a minute.",
                "Pour in the pureed tomatoes and cook until the oil starts to separate.",
                "Add cooked chickpeas and mix well with the spices.",
                "Pour water over the mixture and let it simmer for 10 minutes.",
                "Season with salt to taste and garnish with chopped cilantro.",
                "Serve hot with steamed rice or naan bread."
            ),
            "280 g",
            "25 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FChanaMasala.jpg?alt=media&token=8a5c8299-b86a-4d0e-950d-be7fb3886ce5"
        )




        addRecipe(
            "Malai Kofta",
            "Veg",
            "A rich and creamy vegetarian dish with deep-fried potato and paneer balls served in a flavorful tomato-based gravy.",
            listOf(
                "For Koftas:",
                "2 large potatoes, boiled and mashed",
                "100g paneer (Indian cottage cheese), grated",
                "2 tbsp cornstarch",
                "1/2 tsp garam masala",
                "1/2 tsp ground cumin",
                "Salt to taste",
                "Oil for deep frying",
                "For Gravy:",
                "2 tbsp ghee or vegetable oil",
                "1 large onion, finely chopped",
                "2 tomatoes, pureed",
                "1/4 cup cashew nuts, soaked in water",
                "1 tsp ginger-garlic paste",
                "1/2 cup heavy cream",
                "1/2 tsp ground turmeric",
                "1 tsp ground coriander",
                "1 tsp ground cumin",
                "1/2 tsp red chili powder",
                "1/4 tsp ground cinnamon",
                "1/4 tsp ground cardamom",
                "Salt to taste",
                "Fresh cilantro for garnish"
            ),
            listOf(
                "In a large bowl, mix mashed potatoes, grated paneer, cornstarch, garam masala, ground cumin, and salt to form a smooth dough.",
                "Divide the dough into small balls and deep fry them in hot oil until golden brown and crispy. Drain excess oil on paper towels.",
                "In a blender, blend soaked cashew nuts with a little water to form a smooth paste.",
                "In a separate skillet, heat ghee or vegetable oil and sauté chopped onions until golden brown.",
                "Add ginger-garlic paste and cook until fragrant.",
                "Stir in tomato puree and cook until the oil starts to separate.",
                "Add the cashew nut paste, heavy cream, ground turmeric, ground coriander, ground cumin, red chili powder, ground cinnamon, and ground cardamom. Mix well and cook for a few minutes.",
                "Pour in water to achieve the desired consistency of the gravy. Season with salt.",
                "Add the fried koftas to the gravy and let them simmer for a few minutes to absorb the flavors.",
                "Garnish with fresh cilantro before serving.",
                "Serve hot with naan, roti, or rice."
            ),
            "380 g",
            "45 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2FMalai%20Kofta.jpg?alt=media&token=ca625fe9-e6e6-43d9-8eeb-3062b67e62df"
        )











        addRecipe(
            "Pani Puri",
            "Veg",
            "A popular Indian street food consisting of crispy puris filled with spicy and tangy flavored water, chickpeas, and potatoes.",
            listOf(
                "30 puris (hollow, crispy round shells)",
                "1 cup cooked chickpeas",
                "2 large potatoes, boiled and diced",
                "1/2 cup tamarind pulp",
                "1/4 cup mint chutney",
                "1/2 cup chopped onions",
                "1/2 cup chopped tomatoes",
                "2-3 green chilies, finely chopped (adjust to taste)",
                "1/4 cup chopped cilantro",
                "1 tsp chaat masala",
                "1 tsp roasted cumin powder",
                "1/2 tsp black salt",
                "1/4 tsp red chili powder",
                "Salt to taste",
                "Water as needed"
            ),
            listOf(
                "Prepare the pani (flavored water) by mixing tamarind pulp, mint chutney, chaat masala, roasted cumin powder, black salt, red chili powder, and salt in water.",
                "Adjust the spices and tanginess according to your taste preferences.",
                "In a separate bowl, combine the cooked chickpeas, diced potatoes, chopped onions, chopped tomatoes, green chilies, and chopped cilantro.",
                "Crack the top of each puri to create a small opening and fill them with the chickpea-potato mixture.",
                "Dip the filled puri into the prepared pani and immediately pop the whole puri into your mouth to enjoy the burst of flavors.",
                "Repeat the process with the remaining puris and enjoy this delightful and refreshing street food snack."
            ),
            "40 g",
            "30 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fpanipuri2.jpg?alt=media&token=f646737f-0054-43d7-b6bd-41300222f561"
        )


        addRecipe(
            "Dum Aloo",
            "Veg",
            "Baby potatoes cooked in a rich and flavorful tomato and yogurt-based gravy.",
            listOf(
                "500g baby potatoes, boiled and peeled",
                "1 cup yogurt (curd)",
                "1 large onion, finely chopped",
                "2 tomatoes, pureed",
                "1/4 cup cashew nuts, soaked in water",
                "1 tsp ginger paste",
                "1 tsp garlic paste",
                "1 tsp ground turmeric",
                "1 tsp ground cumin",
                "1 tsp ground coriander",
                "1/2 tsp red chili powder",
                "1/4 tsp ground cinnamon",
                "1/4 tsp ground cardamom",
                "1/4 tsp ground cloves",
                "1/4 cup milk or cream",
                "2 tbsp ghee or vegetable oil",
                "Fresh cilantro for garnish",
                "Salt to taste"
            ),
            listOf(
                "In a blender, blend soaked cashew nuts with a little water to form a smooth paste.",
                "In a large skillet, heat ghee or vegetable oil and sauté chopped onions until golden brown.",
                "Add ginger paste and garlic paste. Cook for a minute until fragrant.",
                "Stir in tomato puree and cook until the oil starts to separate.",
                "Add the cashew nut paste, ground turmeric, ground cumin, ground coriander, red chili powder, ground cinnamon, ground cardamom, and ground cloves. Mix well and cook for a few minutes.",
                "Whisk yogurt (curd) and add it to the skillet. Cook for a few more minutes until the gravy thickens.",
                "Add boiled and peeled baby potatoes to the gravy. Mix well and let them simmer in the gravy for 5-7 minutes.",
                "Pour in milk or cream to enhance the richness of the gravy. Cook for an additional 2 minutes.",
                "Season with salt to taste.",
                "Garnish with fresh cilantro before serving.",
                "Serve hot with naan, roti, or rice."
            ),
            "320 g",
            "40 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fdumaloo.jpg?alt=media&token=146657a7-4a54-4fa5-bfb9-fc02d2371b59"
        )







        addRecipe(
            "Aloo Gobi",
            "Veg",
            "A classic Indian vegetarian dish made with potatoes and cauliflower cooked in aromatic spices.",
            listOf(
                "2 cups cauliflower florets",
                "2 large potatoes, peeled and cut into cubes",
                "1 large onion, finely chopped",
                "2 tomatoes, finely chopped",
                "1 tsp ginger paste",
                "1 tsp garlic paste",
                "1/2 tsp ground turmeric",
                "1 tsp ground cumin",
                "1 tsp ground coriander",
                "1/2 tsp red chili powder",
                "1/4 tsp ground cinnamon",
                "1/4 tsp ground cardamom",
                "1/4 tsp ground cloves",
                "1/4 cup vegetable broth or water",
                "2 tbsp vegetable oil",
                "Fresh cilantro for garnish",
                "Salt to taste"
            ),
            listOf(
                "In a large skillet, heat vegetable oil and sauté chopped onions until golden brown.",
                "Add ginger paste and garlic paste. Cook for a minute until fragrant.",
                "Stir in finely chopped tomatoes and cook until they become soft and the oil starts to separate.",
                "Add ground turmeric, ground cumin, ground coriander, red chili powder, ground cinnamon, ground cardamom, ground cloves, and salt. Mix well and cook for a few more minutes.",
                "Add cauliflower florets and potato cubes to the skillet. Mix well to coat the vegetables with the spices.",
                "Pour in vegetable broth or water to help the vegetables cook and create steam.",
                "Cover the skillet with a lid and cook over medium heat until the potatoes and cauliflower become tender. Stir occasionally to prevent sticking.",
                "Once the vegetables are cooked, remove the lid and continue to cook for a few more minutes until any excess liquid evaporates.",
                "Garnish with fresh cilantro before serving.",
                "Serve hot with naan, roti, or rice."
            ),
            "230 g",
            "30 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Faloogobi.jpg?alt=media&token=9c3f60c9-8c77-4b5b-abef-64337c83d55e"
        )



        addRecipe(
            "Samosa",
            "Veg",
            "Deep-fried Indian pastry filled with spiced potatoes and peas.",
            listOf(
                "For the Dough:",
                "2 cups all-purpose flour",
                "1/4 cup vegetable oil",
                "1/2 tsp carom seeds (ajwain)",
                "1/2 tsp salt",
                "1/2 cup water",
                "For the Filling:",
                "2 large potatoes, boiled and mashed",
                "1/2 cup green peas",
                "1 small onion, finely chopped",
                "1 tsp cumin seeds",
                "1 tsp garam masala",
                "1 tsp ground coriander",
                "1/2 tsp red chili powder",
                "1/4 cup chopped cilantro",
                "Oil for deep frying"
            ),
            listOf(
                "In a bowl, mix all-purpose flour, vegetable oil, carom seeds, and salt.",
                "Gradually add water and knead the dough until it becomes smooth.",
                "Cover the dough and let it rest for 30 minutes.",
                "In a skillet, heat some oil and sauté cumin seeds until they splutter.",
                "Add chopped onions and cook until they turn translucent.",
                "Stir in mashed potatoes, green peas, garam masala, ground coriander, red chili powder, and chopped cilantro.",
                "Season with salt and cook until the filling is well combined and heated through.",
                "Divide the rested dough into small balls and roll them into thin circles.",
                "Cut the circles in half and form cones, fill them with the potato filling, and seal the edges.",
                "Heat oil for deep frying and fry the samosas until they turn golden brown and crispy.",
                "Serve hot with tamarind chutney or mint chutney."
            ),
            "220 g",
            "50 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fsamosa.jpg?alt=media&token=1221ce08-4dc3-48ad-99f2-660d0c48b1c8"
        )



        addRecipe(
            "Vada Pav",
            "Veg",
            "Vada Pav is a popular street food from Mumbai, India, consisting of a spicy potato vada (potato dumpling) sandwiched between a pav (bread roll). It's a delicious and satisfying snack that you can easily make at home.",
            listOf(
                "4 to 5 medium-sized potatoes, boiled, peeled, and mashed",
                "1 small onion, finely chopped",
                "2 to 3 green chilies, finely chopped (adjust to your spice preference)",
                "1-inch piece of ginger, grated",
                "1/2 teaspoon mustard seeds",
                "1/2 teaspoon cumin seeds",
                "A pinch of asafoetida (hing)",
                "A few curry leaves",
                "1/2 teaspoon turmeric powder",
                "1/2 teaspoon red chili powder",
                "1 tablespoon chopped coriander leaves",
                "Salt to taste",
                "1 tablespoon vegetable oil",
                "8 pav (small bread rolls)"
            ),
            listOf(
                "Heat vegetable oil in a pan over medium heat.",
                "Add mustard seeds, cumin seeds, asafoetida, and curry leaves. Let them splutter.",
                "Add finely chopped onions and sauté until they turn translucent.",
                "Add chopped green chilies and grated ginger. Sauté for a minute.",
                "Stir in turmeric powder, red chili powder, and salt.",
                "Add the boiled and mashed potatoes. Mix everything well, ensuring the spices are evenly distributed.",
                "Cook the mixture for a few minutes until the flavors blend. Add chopped coriander leaves and mix again.",
                "Let the potato mixture cool down.",
                "Take a pav and slice it horizontally, but not entirely through.",
                "Place a portion of the cooled potato vada inside the pav and press it gently to hold its shape.",
                "Serve hot and enjoy the lip-smacking Vada Pav!"
            ),
            "150 g",
            "30 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fvadapav.jpg?alt=media&token=6e18269f-01c0-4b7d-bcc2-de1984fe2d5f"
        )

        addRecipe(
            "Chole",
            "Veg",
            "Chole refers to an Indian chickpeas curry, especially popular in northern parts of India. Chole is made with soaking chickpeas (also known as garbanzo beans) overnight and then cooking them with onions, tomatoes and spices to make this really flavorful curry. There are many ways in which you can make chole, and there’s no really right or wrong way of making them.",
            listOf(
                "1/2 cup White Chick Peas",
                "1 teaspoon Tea Powder or Tea Leaves",
                "2 Red Ripe Tomatoes, chopped",
                "2 large Onion, finely chopped",
                "1½ teaspoons Ginger-Garlic Paste",
                "1 Green Chilli, finely chopped",
                "1/2 teaspoon Red Chilli Powder",
                "1/4 teaspoon Turmeric Powder",
                "3 tablespoons Cooking Oil",
                "Salt to taste",
                "2 tablespoons finely chopped Coriander Leaves",
                "1 small piece of Bay Leaf",
                "1 Black Cardamom",
                "1 tablespoon Coriander Seeds",
                "1 teaspoon Cumin Seeds",
                "4-5 Black Peppercorns",
                "1 Dry Red Chilli",
                "2 Cloves (lavang)",
                "1-inch piece of Cinnamon"
            ),
            listOf(
                "Soak white chickpeas in water overnight or for around 8-10 hours.",
                "Tie 1 teaspoon tea leaves in a plain muslin cloth. Tied tea leaves used for enhancing the color and flavor of chana. You can also use tea bags in place of tea leaves.",
                "Pressure cook soaked white chickpeas with a tied tea leaves pouch, enough water and salt in a 3-liter capacity steel/aluminum pressure cooker over medium flame. After 4-5 whistles, turn off the flame and let the pressure come down naturally. Do not open the lid immediately to cook the chana perfectly. Open the lid and remove the tied tea leaves pouch. Drain the excess water from boiled chickpeas in a large bowl. Keep the drained water to use later in the recipe. If a pressure cooker is not available, you can also use a deep pan to boil chickpeas, but it would take more time to cook.",
                "Dry roast bay leaf, black cardamom, coriander seeds, cumin seeds, black peppercorns, dry red chili, cloves, and cinnamon in a pan until a nice aroma starts or for around 1 minute over low flame. Let them cool for a while and then grind them in a small jar of a mixer grinder to make a smooth dry Punjabi masala powder.",
                "Mash 2 tablespoons boiled chickpeas with the backside of a large spoon or grind in a grinder to make a medium coarse paste. Grind tomatoes in a mixer grinder to make tomato puree.",
                "Heat 3 tablespoons cooking oil in a kadai or pan over medium flame. Add chopped onion and sauté until it turns light brown or for approx. 1-2 minutes. Add ginger-garlic paste and chopped green chili. Mix well and cook for 30 seconds.",
                "Add tomato puree and salt (only for tomato puree because we have already added salt while boiling white chickpeas). Cook on medium flame until oil starts to separate, around 4-5 minutes. Stir it in between occasionally to prevent sticking.",
                "Add turmeric powder, red chili powder, and dry masala powder (prepared in step 4). Mix well and sauté for a minute.",
                "Add boiled chickpeas, mashed chickpeas, and 1 cup water (preserved drained water of boiled chickpeas), mix well.",
                "Cook until the gravy becomes thick, it will take around 4-5 minutes. Turn off the flame. Transfer white chana masala curry to a serving bowl and garnish with chopped coriander leaves.",
                "Serve it hot with bhatura or steamed rice. Enjoy this flavorful Chole dish!"
            ),
            "240 g",
            "40 mins",
            "https://firebasestorage.googleapis.com/v0/b/cook-it-658f5.appspot.com/o/images%2Fchole.jpg?alt=media&token=77dad502-7f7b-40ec-acf0-c4204d836ec1"

        )


        readRecipesFragment()


    }

    fun addRecipe(
        title: String,
        isVeg: String,
        description: String,
        ingredients: List<String>,
        instructions: List<String>,
        calorie: String,
        cookTime: String,
        imageUrl: String
    ) {
        val newRecipe = Recipe(
            title = title,
            id = "${title}${generateRandom4DigitNumber()}",
            isVeg = isVeg,
            description = description,
            ingredients = ingredients,
            instructions = instructions,
            calorie = calorie,
            cookTime = cookTime,
            imageUrl = imageUrl
        )

        // Call the addRecipe function with the newRecipe object
        addRecipe(newRecipe) { isSuccess ->
            if (isSuccess) {
                // Recipe added successfully
                // You can perform any further actions here, such as showing a success message or refreshing the recipe list
                Toast.makeText(this@MainActivity, "Recipe added successfully", Toast.LENGTH_SHORT)
                    .show()
            } else {
                // Error occurred while adding the recipe
                // Handle the error here, such as showing an error message to the user
                Toast.makeText(
                    this@MainActivity,
                    "Error occurred while adding the recipe",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    fun addRecipe(recipe: Recipe, onComplete: (Boolean) -> Unit) {
        // Create a new document with an auto-generated ID
        val recipeDocumentRef = db.collection("recipes").document()
        val recipeDocumentRefVeg = db.collection("recipesVeg").document()
        val recipeDocumentRefNonVeg = db.collection("recipesNonVeg").document()

        // Set the data for the recipe document
        recipeDocumentRef.set(recipe)
            .addOnSuccessListener {
                onComplete(true) // Recipe added successfully
            }
            .addOnFailureListener { e ->
                onComplete(false) // Error occurred while adding the recipe
            }


        if (recipe.isVeg == "Veg") {
            // Set the data for the recipe document
            recipeDocumentRefVeg.set(recipe)
                .addOnSuccessListener {
                    onComplete(true) // Recipe added successfully
                }
                .addOnFailureListener { e ->
                    onComplete(false) // Error occurred while adding the recipe
                }
        } else {
            // Set the data for the recipe document
            recipeDocumentRefNonVeg.set(recipe)
                .addOnSuccessListener {
                    onComplete(true) // Recipe added successfully
                }
                .addOnFailureListener { e ->
                    onComplete(false) // Error occurred while adding the recipe
                }
        }


    }


    fun addRecipeViewPager(

        title: String,
        isVeg: String,
        description: String,
        ingredients: List<String>,
        instructions: List<String>,
        calorie: String,
        cookTime: String,
        imageUrl: String
    ) {
        val newRecipe = Recipe(
            title = title,
            id = "${title}${generateRandom4DigitNumber()}",
            isVeg = isVeg,
            description = description,
            ingredients = ingredients,
            instructions = instructions,
            calorie = calorie,
            cookTime = cookTime,
            imageUrl = imageUrl
        )

        // Call the addRecipe function with the newRecipe object
        addRecipeViewPager(newRecipe) { isSuccess ->
            if (isSuccess) {
                // Recipe added successfully
                // You can perform any further actions here, such as showing a success message or refreshing the recipe list
                Toast.makeText(this@MainActivity, "Recipe added successfully", Toast.LENGTH_SHORT)
                    .show()
            } else {
                // Error occurred while adding the recipe
                // Handle the error here, such as showing an error message to the user
                Toast.makeText(
                    this@MainActivity,
                    "Error occurred while adding the recipe",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }


    fun addRecipeViewPager(recipe: Recipe, onComplete: (Boolean) -> Unit) {
        // Create a new document with an auto-generated ID
        val recipeDocumentRef = db.collection("recipesViewPager").document()

        // Set the data for the recipe document
        recipeDocumentRef.set(recipe)
            .addOnSuccessListener {
                onComplete(true) // Recipe added successfully
            }
            .addOnFailureListener { e ->
                onComplete(false) // Error occurred while adding the recipe
            }
    }


    private fun readRecipesFragment() {
        db.collection("recipesViewPager")
            .get()
            .addOnSuccessListener { querySnapshot ->
                val recipes = mutableListOf<Recipe>()
                for (document in querySnapshot) {
                    val recipe = document.toObject(Recipe::class.java)
                    recipes.add(recipe)
                }

                // Handle the recipes data here, for example, display them in a RecyclerView or ListView
                for (recipe in recipes) {
                    Log.d("Recipe", "Title: ${recipe.title}")
                    Log.d("Recipe", "Description: ${recipe.description}")
                    Log.d("Recipe", "Ingredients: ${recipe.ingredients}")
                    Log.d("Recipe", "Instructions: ${recipe.instructions}")
                    Log.d("Recipe", "Cook Time: ${recipe.cookTime}")
                    Log.d("Recipe", "Image URL: ${recipe.imageUrl}")
                    Log.d("Recipe", "------------------------")
                }
            }
            .addOnFailureListener { exception ->
                // Handle any errors that occur during data retrieval
                Log.e("ReadRecipesFragment", "Error getting recipes: ${exception.message}")
            }
    }


    private fun readRecipes(sectionName: String) {
        db.collection("recipes")
            .whereEqualTo("section", sectionName)
            .get()
            .addOnSuccessListener { querySnapshot ->
                val recipes = mutableListOf<Recipe>()
                for (document in querySnapshot) {
                    val recipe = document.toObject(Recipe::class.java)
                    recipes.add(recipe)
                }

                // Handle the recipes data here, for example, display them in a RecyclerView or ListView
                for (recipe in recipes) {
                    Log.d("Recipe", "Title: ${recipe.title}")
                    Log.d("Recipe", "Description: ${recipe.description}")
                    Log.d("Recipe", "Ingredients: ${recipe.ingredients}")
                    Log.d("Recipe", "Instructions: ${recipe.instructions}")
                    Log.d("Recipe", "Cook Time: ${recipe.cookTime}")
                    Log.d("Recipe", "Image URL: ${recipe.imageUrl}")
                    Log.d("Recipe", "------------------------")
                }
            }
            .addOnFailureListener { exception ->
                // Handle any errors that occur during data retrieval
                Log.e("ReadRecipes", "Error getting recipes: ${exception.message}")
            }
    }

    fun generateRandom4DigitNumber(): String {
        val random = Random(System.currentTimeMillis())
        val randomNumber = random.nextInt(1000, 10000)
        return randomNumber.toString()
    }


}
