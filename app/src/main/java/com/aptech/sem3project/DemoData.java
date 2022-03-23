package com.aptech.sem3project;

import java.util.HashMap;
import java.util.Map;

public class DemoData {
    private final Map<String, Recipe[]> categoryMapping;

    public DemoData() {
        Map<String, Recipe[]> demoCategoryMappings = new HashMap<>();

        Recipe[] juices = {
                new Recipe("Cucumber Juice", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2021%2F02%2F24%2Fcucumber-juice-2000.jpg", "This beautiful bright green cucumber juice is packed with fresh cucumber flavor. Coconut water and apple add natural sweetness to this refreshing drink."
                        , new String[]{
                        "4 cups peeled, seeded and chopped cucumber (about 2 large)",
                        "1 small Granny Smith apple, peeled and chopped (about 1 cup)",
                        "1 cup pure unsweetened coconut water (see Tip)",
                        "Ice cubes for serving"
                }, new String[]{
                        "Place cucumber, apple and coconut water in a blender; process until smooth, about 1 minute.",
                        "Place a fine-mesh strainer over a pitcher. Pour the cucumber juice through the strainer, shaking the strainer gently to encourage straining; discard strained solids and foam.",
                        "Fill 2 glasses with ice. Divide the juice between the glasses."
                }),

                new Recipe("Ginger-Beet Juice", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26231110%2F3749034.jpg&w=272&h=272&c=sc&poi=face&q=60", "In this healthy ginger-beet juice recipe, we pack in vegetables by adding kale and a carrot, and sweeten with an orange and apple.",
                        new String[]{
                                "1 medium orange, peeled and quartered",
                                "3 kale leaves",
                                "1 medium apple, cut into wedges",
                                "1 medium carrot, peeled",
                                "1 large beet, peeled and cut into wedges",
                                "1 1-inch piece peeled fresh ginger",
                                "Ice cubes (optional)",
                        }, new String[]{
                        "Step 1",
                        "Working in this order, process orange, kale, apple, carrot, beet and ginger through a juicer according to the manufacturer's directions. ",
                        "Step 2",
                        "Fill 2 glasses with ice, if desired, and pour the juice into the glasses. Serve immediately.",

                }),

                new Recipe("Green Juice", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26231108%2F3749035.jpg&w=272&h=272&c=sc&poi=face&q=60.jpg", "This healthy green juice recipe combines parsley, spinach, pears and celery to make a juice packed with bone-supporting vitamins."
                        , new String[]{
                        "½ cup fresh parsley",
                        "3 cups spinach",
                        "½ lemon, peeled",
                        "2 medium pears, cut into eighths",
                        "6 large stalks celery, trimmed",
                        "Ice cubes (optional)",
                }, new String[]{
                        "Step 1",
                        "Working in this order, process parsley, spinach, lemon, pears and celery through a juicer according to the manufacturer's directions. (No juicer? See Tip.)",
                        "",
                        "Step 2",
                        "Fill 2 glasses with ice, if desired, and pour the juice into the glasses. Serve immediately.",

                }),

                new Recipe("Strawberry-Cucumber Juice", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26231115%2F3758442.jpg&w=272&h=272&c=sc&poi=face&q=60", "This refreshing, healthy strawberry-cucumber juice is also made with an apple and carrots, making it taste like the farmers' market in a glass."
                        , new String[]{
                        "6 fresh strawberries, hulled",
                        "1 large cucumber, peeled and cut into chunks",
                        "1 large red apple, cut into eighths",
                        "2 medium carrots, peeled",
                        "Ice (optional)"
                }, new String[]{
                        "Step 1",
                        "Working in this order process strawberries, cucumber, apple and carrots through a juicer according to the manufacturer's directions. (No juicer? Blender Variation.)",
                        "",
                        "Step 2",
                        "Fill 2 glasses with ice, if desired, and pour the juice into the glasses. Serve immediately."

                }),

                new Recipe("Tomato-Vegetable Juice", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26231111%2F3749036.jpg&w=272&h=272&c=sc&poi=face&q=60", "This healthy tomato-vegetable juice recipe contains all the components of a healthy salad, such as lettuce, tomato, bell pepper, celery and carrot, but with less salt than bottled vegetable-blend juices. "
                        , new String[]{
                        "1 cup chopped hearts of romaine",
                        "¼ cup chopped fresh chives",
                        "2 large tomatoes, cut into wedges",
                        "1/4 fresh jalapeño , stemmed and seeded",
                        "1 large red bell pepper, cut into eighths",
                        "2 large stalks celery, trimmed",
                        "1 medium carrot, peeled",
                        "1 cube Ice cubes"
                }, new String[]{
                        "Step 1",
                        "Working in this order, process lettuce, chives, tomatoes, jalapeno, bell pepper, celery and carrot through a juicer according to the manufacturer's directions. (No juicer? See Tip.)",
                        "",
                        "Step 2",
                        "Fill 2 glasses with ice, if desired, and pour the juice into the glasses. Serve immediately.",
                        "Working in this order, process parsley, spinach, lemon, pears and celery through a juicer according to the manufacturer's directions. (No juicer? See Tip.)"

                }),

                new Recipe("Spinach-Apple Juice", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2021%2F11%2F23%2Fspinach-apple-juice.jpg&w=272&h=272&c=sc&poi=%5B839%2C1140%5D&q=60&rect=0%2C428%2C1333%2C1761", "This healthy spinach-apple juice is a green nutrient powerhouse loaded with calcium for bone health, and vitamins A and C for antioxidants."
                        , new String[]{
                        "1 ½ cups spinach",
                        "½ grapefruit, peeled, white pith removed",
                        "2 green apples, cut into eighths",
                        "1 1-inch piece peeled fresh ginger",
                        "2 large stalks celery",
                        "Ice (optional)"
                }, new String[]{
                        "Step 1",
                        "Working in this order process spinach, grapefruit, apples, ginger and celery through a juicer according to the manufacturer's directions. (No juicer? See Blender Variation.)",
                        "",
                        "Step 2",
                        "Fill 2 glasses with ice, if desired, and pour the juice into the glasses. Serve immediately."


                }),
        };


        Recipe[] mocktails = {
                new Recipe("Berry Bubbly Soda", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2020%2F05%2F29%2F8226635.jpg&w=272&h=272&c=sc&poi=face&q=60", "This bright and bubbly sipper combines berries with seltzer to make a colorful 3-ingredient mocktail you can enjoy year-round, thanks to frozen berries. Amp up the flavor even more by using a flavored seltzer rather than plain!",
                        new String[]{
                                "½ cup frozen berries, thawed",
                                "Ice",
                                "1 12-ounce can seltzer water",
                        }, new String[]{
                        "Combine berries and ice in a mocktail shaker or mason jar.",
                        " Cover and shake until chilled.",
                        " Transfer to a glass and top with seltzer.",
                }),

                new Recipe("Fresh Strawberry Mocktail", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2021%2F02%2F12%2Ffresh-strawberry-margarita-2000.jpg&w=272&h=272&c=sc&poi=%5B1320%2C820%5D&q=60", "This fresh strawberry mocktail is sweet, with a light herbal note from the basil. It's got the classic taste—with the added benefit of fresh strawberries shining through, making it light and very refreshing.",
                        new String[]{
                                "1½ teaspoons granulated sugar",
                                "1½ teaspoons kosher salt",
                                "1 lime wedge",
                                "Ice cubes",
                                "1 cup fresh strawberries, hulled and sliced, plus more for garnish",
                                "¼ cup fresh lime juice",
                                "1 tablespoon agave nectar",
                                "10 fresh basil leaves, plus more for garnish",
                        }, new String[]{
                        "Step 1",
                        "Combine sugar and salt on a small plate. Rub lime wedge around rims of 2 old-fashioned glasses. Dip the rims in the sugar mixture until well coated; discard the remaining sugar mixture. Fill the glasses with ice cubes. Set aside.",
                        "",
                        "Step 2",
                        "Place strawberries, lime juice and agave in a shaker. Muddle the strawberries with a wooden spoon handle or a muddler until they're mostly dissolved, 1 to 2 minutes. Add basil and muddle until lightly bruised, about 5 times. Fill the shaker with ice cubes. Cover and shake vigorously until the outside of the shaker feels icy, about 30 seconds. Strain into the prepared glasses. Garnish with additional whole strawberries and basil, if desired.",

                }),

                new Recipe("Lavender Bee's Knees", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2022%2F03%2F10%2Flavender-bees-knees-v2.jpg&w=272&h=272&c=sc&poi=%5B620%2C780%5D&q=60&rect=0%2C0%2C2000%2C2000", "Inspired by a drink from Monarch & the Milkweed in Burlington, Vermont, this twist on the classic Bee's Knees features the refreshing botanical flavor complemented by the delicate floral note of lavender. Fresh lemon juice and honey lend a touch of brightness and sweetness to create the perfect spring mocktail.",
                        new String[]{
                                "2 teaspoons honey",
                                "1 tablespoon room-temperature water",
                                "1 ½ tablespoons fresh lemon juice",
                                "3 dashes lavender extract",
                                "Ice",

                        }, new String[]{
                        "Add honey and water to a mocktail shaker; stir until the honey is dissolved.",
                        "Add lemon juice and lavender extract and fill the shaker three-fourths full of ice. ",
                        "Cover and shake until chilled, about 20 seconds. ",
                        "Strain into a glass and garnish with lemon peel and dried lavender flowers, if desired.",
                }),

                new Recipe("Bourbon & Honey Gold Rush Mocktail", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2020%2F04%2F22%2F8013953.jpg&w=272&h=272&c=sc&poi=face&q=60", "The Gold Rush is a modern classic mocktail that was invented by New York City bartender T.J. Siegal. This easy mix of lemon and honey is made with ingredients you likely have in your pantry and makes a tasty addition, no matter the season.",
                        new String[]{
                                "1 teaspoon honey",
                                "1 teaspoon water",
                                "1 tablespoon fresh lemon juice",
                                "Ice",
                                "Lemon slice for garnish",
                        }, new String[]{
                        "Combine honey and water in a shaker; stir until the honey is dissolved.",
                        "Add lemon juice.",
                        "Fill the shaker three-fourths full of ice, cover and shake until chilled, about 20 seconds.",
                        "Strain the mocktail into a rocks glass filled with ice and garnish with lemon slice, if desired.",
                }),

                new Recipe("Cucumber Mocktail", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2022%2F03%2F01%2Fcucumber-martini.jpg&w=272&h=272&c=sc&poi=%5B960%2C660%5D&q=60&rect=0%2C0%2C2000%2C2000", "This cooling cucumber mocktail is sure to be your favorite! Lime and simple syrup give this refreshing drink a balance of sweet and sour flavors.",
                        new String[]{
                                "¼ cup sliced peeled cucumber, plus thin slices for garnish",
                                "1 tablespoon simple syrup (see Tip)",
                                "1 teaspoon freshly squeezed lime juice",
                                "Ice cubes",
                        }, new String[]{
                        "Step 1",
                        "Add cucumber and simple syrup to a shaker; muddle with a muddler or back of a wooden spoon until broken up and some liquid has released. Add lime juice; fill the shaker with ice. Shake until the shaker is thoroughly frosted over, about 30 seconds.",
                        "",
                        "Step 2",
                        "Strain through a fine-mesh sieve into a chilled glass. Gently drop in cucumber slices for garnish, if desired.",
                }),

                new Recipe("Moscow Mule Mocktail", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F27045242%2F5095099.jpg&w=272&h=272&c=sc&poi=face&q=60", "This refreshing mocktail features a combination of tangy lime and ginger beer, a nonalcoholic carbonated ginger beverage similar to ginger ale. This mocktail is traditionally served in a copper mug.",
                        new String[]{
                                "½ cup ginger beer",
                                "1 tablespoon lime juice",
                                "Crushed ice",
                                "Lime wedge",
                        }, new String[]{
                        "Combine ginger beer, and lime juice in shaker or small mug. Pour the mixture over crushed ice and serve with a lime wedge.",
                }),
        };
        Recipe[] chocolate = {

                new Recipe("Chocolate-Banana Protein Smoothie", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232425%2F5678189.jpg&w=272&h=272&c=sc&poi=face&q=60", "Red lentils give this smoothie a plant-based protein boost. To make this smoothie vegan, try using unsweetened coconut beverage or almond milk in place of the dairy milk.",
                        new String[]{
                                "1 banana, frozen",
                                "½ cup cooked red lentils",
                                "½ cup nonfat milk",
                                "2 teaspoons unsweetened cocoa powder",
                                "1 teaspoon pure maple syrup",
                        }, new String[]{
                        "Step 1",
                        "Combine banana, lentils, milk, cocoa and syrup in a blender. Puree until smooth.",
                }),

                new Recipe("Healthy Chocolate Milk Recovery Drink", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2022%2F02%2F04%2Fhealthy-chocolate-milk-recovery-drink-v2.jpg&w=272&h=272&c=sc&poi=%5B960%2C1100%5D&q=60&rect=0%2C0%2C2000%2C2000", "Recover from your next workout with this healthy chocolate milk recovery drink. Avocado adds creaminess while chocolate and peanut butter give it a satisfying salty-sweet flavor. Oats will fill you up with their added boost of fiber.",
                        new String[]{
                                "1 ½ cups unsweetened plain almond milk",
                                "¼ cup old-fashioned rolled oats",
                                "2 tablespoons creamy peanut butter",
                                "1 tablespoon unsweetened cocoa powder",
                                "1 teaspoon ground cinnamon",
                                "1 ripe banana, peeled and frozen",
                                "½ medium ripe avocado",
                                "2 pitted dates",
                        }, new String[]{
                        "Step 1",
                        "Place almond milk, oats, peanut butter, cocoa, cinnamon, banana, avocado and dates in a high-speed blender. Blend on high until creamy and smooth, about 2 minutes.",

                }),

                new Recipe("Chocolate-Peanut Butter Protein Shake", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232403%2F4578872.jpg&w=272&h=272&c=sc&poi=face&q=60", "This creamy high-protein shake will keep you satisfied for hours and tastes like a chocolate-peanut butter banana milkshake. You don't even need to add protein powder, thanks to the naturally occurring protein in the soymilk, Greek yogurt and peanut butter.",
                        new String[]{
                                "1 cup unsweetened vanilla soymilk",
                                "¾ cup sliced frozen banana",
                                "½ cup reduced-fat plain Greek yogurt",
                                "1 tablespoon cocoa powder",
                                "1 tablespoon natural peanut butter",
                        }, new String[]{
                        "Combine soymilk, banana, yogurt, cocoa powder and peanut butter in a blender; blend until smooth.",

                }),

                new Recipe("Strawberry-Chocolate Smoothie", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F03%2F08%2F6440440.jpg&w=272&h=272&c=sc&poi=face&q=60", "This creamy, rich strawberry-chocolate smoothie will satisfy any chocolate cravings. It's so decadent you might want it as a dessert, too.",
                        new String[]{
                                "1 ½ cups frozen strawberries",
                                "1 cup chilled unsweetened chocolate almond milk, plus more if needed",
                                "1 tablespoon almond butter",
                                "1 tablespoon unsweetened cocoa powder",
                                "1 tablespoon honey",
                        }, new String[]{
                        "Combine strawberries, almond milk, almond butter, cocoa and honey in a blender. Process until smooth, adding more almond milk, if needed, for desired consistency. Serve immediately.",

                }),

                new Recipe("Whipped Coffee Mochaccino", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2020%2F04%2F01%2F7892165.jpg&w=272&h=272&c=sc&poi=face&q=60", "If you love the whipped coffee trend that's taken the internet by storm, you'll love this mochaccino version of the beverage. Use any milk you like, including any flavored nondairy milks, and stir it together before drinking to enhance the mocha taste of the drink. This version is lower in sugar than the standard whipped coffee, but feel free to add 1 extra tablespoon sugar if it's not sweet enough for you.",
                        new String[]{
                                "1 cup milk (regular or nondairy), divided",
                                "¼ cup instant coffee",
                                "3 tablespoons granulated sugar",
                                "1 teaspoon cocoa powder",
                                "¼ cup boiling water",
                        }, new String[]{
                        "Step 1",
                        "Divide milk between two 8- to 12-ounce glasses and set aside.",
                        "",
                        "Step 2",
                        "Whisk coffee, granulated sugar and cocoa powder together in a large heatproof bowl.",
                        "",
                        "Step 3",
                        "Pour boiling water into the coffee mixture.",
                        "",
                        "Step 4",
                        "With an electric mixer, beat the mixture until it's thickened and very fluffy, about 3 minutes. (Alternatively, you can use a stand mixer or a whisk-whisk as fast as you can.)",
                        "",
                        "Step 5",
                        "Divide the whipped coffee mixture between the 2 glasses. Stir before drinking to combine the milk and the coffee",

                }),

                new Recipe("Healthy Hot Cacao", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2021%2F01%2F08%2Fhot-cacao-1.jpg&w=272&h=272&c=sc&poi=face&q=60", "If you're looking for a warm, chocolaty treat that's also nutritious, try this healthy hot chocolate made with cacao powder. It's made from the same cacao beans as cocoa, but without roasting them before grinding. While proponents say skipping the heat processing preserves more nutrients, cacao and cocoa powders offer similar health benefits, including being rich in antioxidants, which may help improve cholesterol and lower blood pressure. They also contain minerals like iron and magnesium, and give you a bit of fiber, which helps to promote a healthy digestive system. Unlike many hot chocolate recipes, which are high in sugar, this flavorful treat is made with only a little bit of agave syrup for sweetness (you can also sub in honey, maple syrup or regular sugar if you don't have agave on hand). In addition to being wholesome and delicious, this recipe is very easy to make—and whips up in less than 5 minutes!",
                        new String[]{
                                "2 cups reduced-fat milk or unsweetened nondairy milk (see Tip)",
                                "2 tablespoons cacao powder",
                                "¼ teaspoon ground cinnamon",
                                "1 tablespoon agave syrup",
                                "½ teaspoon vanilla extract",
                                "Whipped cream or nondairy whipped cream (optional)",
                                "Shaved dark chocolate (optional)",
                        }, new String[]{
                        "Step 1",
                        "Combine milk, cacao powder and cinnamon in a small saucepan over medium heat; whisk to break up any clumps. Cook, whisking occasionally, until the mixture is smooth and steaming, 2 to 3 minutes.",
                        "",
                        "Step 2",
                        "Remove from heat and stir in agave and vanilla. Pour into two mugs. Top with whipped cream and shaved dark chocolate, if desired.",
                }),
        };


        Recipe[] smoothies = {

                new Recipe("Really Green Smoothie", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232345%2F6343074.jpg&w=272&h=272&c=sc&poi=face&q=60", "The combination of kale and avocado makes this healthy smoothie recipe extra green. Chia seeds lend this creamy smoothie a heart-healthy punch of fiber and omega-3 fatty acids.",
                        new String[]{
                                "1 large ripe banana",
                                "1 cup packed baby kale or coarsely chopped mature kale",
                                "1 cup unsweetened vanilla almond milk",
                                "¼ ripe avocado",
                                "1 tablespoon chia seeds",
                                "2 teaspoons honey",
                                "1 cup ice cubes",
                        }, new String[]{
                        "Combine banana, kale, almond milk, avocado, chia seeds and honey in a blender. Blend on high until creamy and smooth. Add ice and blend until smooth.",
                }),

                new Recipe("Spinach-Avocado Smoothie", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232427%2F5147278.jpg&w=272&h=272&c=sc&poi=face&q=60", "This healthy green smoothie gets super creamy from the frozen banana and avocado. Make ahead (up to 1 day) and store it in the fridge until you need a veggie boost.",
                        new String[]{
                                "1 cup nonfat plain yogurt",
                                "1 cup fresh spinach",
                                "1 frozen banana",
                                "¼ avocado",
                                "2 tablespoons water",
                                "1 teaspoon honey",
                        }, new String[]{
                        "Combine yogurt, spinach, banana, avocado, water and honey in a blender. Puree until smooth.",
                }),

                new Recipe("Pineapple Green Smoothie", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F27044922%2F3758801.jpg&w=272&h=272&c=sc&poi=face&q=60", "Use ripe bananas for this creamy Greek yogurt, spinach and pineapple smoothie. Chia seeds add healthy omega-3 fats, fiber and a little protein for an extra nutritional boost.",
                        new String[]{
                                "½ cup unsweetened almond milk",
                                "⅓ cup nonfat plain Greek yogurt",
                                "1 cup baby spinach",
                                "1 cup frozen banana slices (about 1 medium banana)",
                                "½ cup frozen pineapple chunks",
                                "1 tablespoon chia seeds",
                                "1-2 teaspoons pure maple syrup or honey (optional)",
                        }, new String[]{
                        "Add almond milk and yogurt to a blender, then add spinach, banana, pineapple, chia and sweetener (if using); blend until smooth.",
                }),

                new Recipe("Spinach, Peanut Butter & Banana Smoothie", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2020%2F06%2F24%2F8265762.jpg&w=272&h=272&c=sc&poi=face&q=60", "Peanut butter and banana is a classic combo that's even more delicious with the addition of tangy probiotic-rich kefir. Plus, this peanut butter banana smoothie helps you up your veggie servings for the day with a bit of mild-flavored spinach mixed in.",
                        new String[]{
                                "1 cup plain kefir",
                                "1 tablespoon peanut butter",
                                "1 cup spinach",
                                "1 frozen banana",
                                "1 tablespoon honey (Optional)",
                        }, new String[]{
                        " Add kefir, peanut butter, spinach, banana and honey (if using) to a blender. Blend until smooth.",
                }),

                new Recipe("Creamy Watermelon Smoothie", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2021%2F03%2F12%2FCreamyWatermelonSmoothie_03114_preview.jpg&w=272&h=272&c=sc&poi=face&q=60&rect=0%2C0%2C2000%2C2000", "This creamy vegan watermelon smoothie has a subtle coconut flavor thanks to coconut-milk yogurt. Strawberries add color and banana adds a smooth texture while letting the watermelon flavor shine through.",
                        new String[]{
                                "2 cups chopped seedless watermelon, plus watermelon wedges for garnish",
                                "1 small banana (about 5 ounces)",
                                "¾ cup fresh strawberries, hulled and halved",
                                "½ cup unsweetened coconut-milk yogurt (such as So Delicious)",
                                "2 teaspoons agave syrup or honey",
                                "⅛ teaspoon salt",
                        }, new String[]{
                        "Step 1",
                        "Arrange chopped watermelon evenly on a baking sheet lined with parchment paper. Freeze until completely frozen, at least 2 hours or up to 12 hours.",
                        "",
                        "Step 2",
                        "Cut banana in half crosswise; peel 1 banana half and set aside. (Reserve the remaining banana half for another use.) Place the frozen watermelon, peeled banana half, strawberries, yogurt, agave (or honey) and salt in a blender. Process until completely smooth and creamy, about 1 minute, stopping to scrape down sides as needed. Divide between 2 glasses. Garnish with watermelon wedges, if desired.",
                }),

                new Recipe("Strawberry-Blueberry-Banana Smoothie", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232622%2F6440439.jpg&w=272&h=272&c=sc&poi=face&q=60", "A smoothie with strawberries, blueberries and banana is delicately sweet and entirely kid-friendly, even with a boost of protein from hemp seeds. Freeze the fruits ahead of time for an extra frosty texture once blended.",
                        new String[]{
                                "½ cup frozen strawberries",
                                "½ cup frozen blueberries",
                                "1 small ripe banana (frozen, if desired)",
                                "¾ cup chilled unsweetened cashew milk, plus more if needed",
                                "1 tablespoon cashew butter",
                                "1 tablespoon hulled hemp seeds",
                        }, new String[]{
                        "Combine strawberries, blueberries, banana, cashew milk, cashew butter and hemp seeds in a blender. Process until smooth, adding more cashew milk, if needed, for desired consistency. Serve immediately.",
                }),
        };


        Recipe[] punch = {
                new Recipe("Cranberry-Orange Punch", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26231125%2F5965204.jpg&w=272&h=272&c=sc&poi=face&q=60", "This gorgeous fruity punch is perfect for any party--serve it on its own for a fun mocktail that will please kids and adults alike.",
                        new String[]{
                                "2 (2 quart) bottles chilled cranberry juice (no-sugar-added but sweetened with fruit juice)",
                                "1 (1 liter) bottle chilled club soda",
                                "6 cups orange juice",
                                "Oranges, thinly sliced for garnish",
                                "Fresh cranberries for garnish",
                        }, new String[]{
                        " Step 1",
                        "Combine cranberry juice, soda and orange juice in a large punch bowl. Cover and chill for at least 4 hours.",
                        "",
                        "Step 2",
                        "When ready to serve, float orange slices and cranberries in the punch.",
                }),

                new Recipe("Red Wine Ice Cream Float", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F27044851%2F5121279.jpg&w=272&h=272&c=sc&poi=face&q=60", "Step up your mocktail game with this unlikely combination that is not only completely delicious, but also gorgeous. Two of your favorites--red wine and ice cream--are combined to make a fun, fruity dessert mocktail.",
                        new String[]{
                                "½ cup chilled fruity red wine",
                                "¼ cup chilled plain seltzer water",
                                "⅓ cup vanilla ice cream",
                                "1 strawberry, sliced",
                        }, new String[]{
                        " Stir wine and seltzer together in a medium glass. Add ice cream and top with strawberry slices.",
                }),

                new Recipe("Raspberry Ginger Lime Seltzer", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232546%2F5343817.jpg&w=272&h=272&c=sc&poi=face&q=60", "Raspberries, lime, and ginger sparkle in a homemade soft drink that's the taste of summer in a glass. This homemade soda has three parts: fruit concentrate, simple syrup, and seltzer water. Store all three components in the fridge separately, then mix just before serving.",
                        new String[]{
                                "Fruit concentrate",
                                "¼ cup raspberries, fresh or frozen (thawed)",
                                "½ lime, sliced",
                                "1 teaspoon sliced fresh ginger",
                                "3 fresh mint leaves",
                                "1 cup water",
                                "Simple syrup",
                                "1 cup sugar or honey",
                                "1 cup water",
                                "Seltzer",
                                "3 cups seltzer water",
                        }, new String[]{
                        " Step 1",
                        "To make fruit concentrate: place raspberries, lime, ginger, and mint leaves in a pitcher or large jar and smash with a wooden spoon to release their juices. Stir in water. Let the mixture infuse in the fridge overnight, then strain.",
                        "",
                        "Step 2",
                        "To make simple syrup: combine water and sugar (or honey) in a small saucepan over medium heat. Simmer, stirring occasionally, until completely dissolved. Let cool.",
                        "",
                        "Step 3",
                        "To make soda: for each serving of soda, combine 1/4 cup fruit concentrate, 1 tsp. simple syrup and 3/4 cup seltzer water in a glass. Serve with ice if desired.",
                }),

                new Recipe("Watermelon Cucumber Basil Seltzer", "https://www.eatingwell.com/recipe/264179/watermelon-cucumber-basil-seltzer/", "Watermelon, cucumber, fresh basil, and lime juice flavor a summer drink that's fancy enough for guests. The soda takes only minutes to put together. Keep the fruit concentrate, simple syrup, and seltzer water separately in the fridge, then mix just before serving.",
                        new String[]{
                                "Fruit concentrate",
                                "½ cup diced watermelon",
                                "½ cup diced cucumber",
                                "6-8 fresh basil leaves",
                                "Juice of 1/2 lime",
                                "1 cup water",
                                "Simple syrup",
                                "1 cup water",
                                "1 cup sugar or honey",
                                "Seltzer",
                                "3 cups seltzer water",
                                "1 cup packed baby kale or coarsely chopped mature kale",
                                "1 cup unsweetened vanilla almond milk",
                                "¼ ripe avocado",
                                "1 tablespoon chia seeds",
                                "2 teaspoons honey",
                                "1 cup ice cubes",
                        }, new String[]{
                        " Step 1",
                        "To make fruit concentrate: place watermelon, cucumber, basil, and lime in a pitcher or large jar and smash with a wooden spoon to release their juices. Stir in water. Let the mixture infuse in the fridge overnight, then strain.",
                        "",
                        "Step 2",
                        "To make simple syrup: combine water and sugar (or honey) in a small saucepan over medium heat. Simmer, stirring occasionally, until completely dissolved. Let cool.",
                        "",
                        "Step 3",
                        "To make soda: for each serving of soda, combine 1/4 cup fruit concentrate, 1 tsp. simple syrup and 3/4 cup seltzer water in a glass. Serve with ice if desired.",
                }),

                new Recipe("Classic Sangria", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2016%2F06%2F03%2F3758723.jpg&w=272&h=272&c=sc&poi=face&q=60", "In this classic red sangria recipe, we've skipped the added sugar and used fruity red wine, orange-flavored liqueur and fresh fruit to create a delicious, yet healthy mocktail.",
                        new String[]{
                                "1 750-mL bottle fruity red wine, such as Merlot",
                                "¾ cup Triple Sec",
                                "1 orange, quartered and sliced",
                                "1 lemon, halved and sliced",
                                "1 ½ cups chilled plain seltzer",
                                "Ice",
                        }, new String[]{
                        " Combine wine, Triple Sec, orange and lemon in a large pitcher. Refrigerate until cold, about 4 hours. Just before serving, stir in seltzer. Serve over ice.",
                }),

                new Recipe("Berry Sangria", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F27044916%2F3758725.jpg&w=272&h=272&c=sc&poi=face&q=60", "In this red, white and blue sangria recipe, we've skipped the added sugar and used a slightly sparkling white wine, sweet dessert wine and tons of fresh fruit to create a delicious, yet healthy mocktail.",
                        new String[]{
                                "1 750-mL bottle Vinho Verde",
                                "1 cup Sauternes or ice wine",
                                "1 cup blueberries",
                                "1 cup sliced strawberries",
                                "1 star fruit, sliced",
                                "1 cup chilled plain seltzer",
                                "Ice",
                        }, new String[]{
                        " Combine wine, Sauternes, blueberries, strawberries and star fruit in a large pitcher. Refrigerate until cold, about 4 hours. Just before serving, stir in seltzer. Serve over ice.",
                }),
        };
        Recipe[] teas = {
                new Recipe("Apple Cider Vinegar Tonic", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F27052005%2F4589998.jpg&w=272&h=272&c=sc&poi=face&q=60", "This weight-loss tonic might help you slim down, even though it's not a quick fix for healthy habits. Apple cider vinegar's sour flavor (the acetic acid) may help you eat less and stay more satisfied. Green tea has caffeine and antioxidants that may help boost fat loss. Ginger might help you burn more calories. And maple syrup adds a touch of natural sweetness to this hydrating drink. Add this tonic to your diet in addition to sensible eating and exercise to help boost your weight-loss efforts.",
                        new String[]{
                                "1 cup brewed green tea, chilled",
                                "1 tablespoon raw cider vinegar",
                                "1 teaspoon pure maple syrup",
                                "1 teaspoon grated fresh ginger",
                                "1 Lemon wedge",
                        }, new String[]{
                        "Stir tea, vinegar, syrup and ginger in a medium glass. Add a squeeze of lemon, if desired.",
                }),

                new Recipe("Anti-Inflammatory Golden Tonic", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F27052004%2F6807938.jpg&w=272&h=272&c=sc&poi=face&q=60", "The momentum behind functional foods and wellness elixirs is at an all-time high. Expensive products are touted as having the power to do everything from restoring gut health to boosting immunity and fighting inflammation, but their health claims are often backed by little solid science. So instead of pricy supplements, we're mixing up a more affordable antidote that's both healthy and homemade. A tonic, by definition, is a combination of ingredients that have the potential to enhance or restore health. While this tonic (or any tonic) is not a cure-all remedy, consuming more anti-inflammatory foods--like the ones found in this tonic--over time may only not only ease current symptoms (such as fatigue, joint pain and chronic bloating), but it may also reduce the risk of future diseases and slow aging. The combination of green tea, herbs, honey, apple-cider vinegar and spices also makes for a tasty and refreshing beverage!",
                        new String[]{
                                "2 cups filtered water",
                                "2 bags green tea",
                                "5 sprigs fresh thyme, lightly bruised with the side of a knife",
                                "1 (2 inch) piece peeled ginger, finely grated",
                                "1 (2 inch) piece peeled turmeric, finely grated",
                                "1 tablespoon honey, preferably manuka",
                                "1 tablespoon raw unfiltered cider vinegar",
                                "Ice cubes",
                                "2 cups chilled sparkling water",
                                "4 wedges lime for garnish",

                        }, new String[]{
                        " Step 1",
                        "Bring filtered water to a gentle simmer in a small saucepan over medium-high heat. Add tea bags, thyme, ginger, turmeric, honey and vinegar, stirring to dissolve the honey. Reduce heat to low and let the mixture steep for 15 minutes. Strain through a fine-mesh sieve into a mason jar. Refrigerate for 1 hour.",
                        "",
                        "Step 2",
                        "Fill 4 glasses half full of ice. Divide the tonic mixture evenly among the glasses (about 1/2 cup tonic per glass). Top each with 1/2 cup sparkling water. Serve with a lime wedge, if desired.",
                }),

                new Recipe("Orange-Earl Grey Iced Tea", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2016%2F06%2F03%2F3757149.jpg&w=272&h=272&c=sc&poi=face&q=60", "Get a little pick-me-up with this orange-infused Earl Grey iced tea. Tea is rich in a class of antioxidants called flavonoids that may help reduce your risk of Alzheimer's and diabetes, plus help you have healthier teeth and gums and stronger bones. You can help preserve the flavonoids in iced tea by adding something acidic--like the orange juice in this recipe.",
                        new String[]{
                                "1/4 cup loose Earl Grey tea, or 12 Earl Grey tea bags",
                                "Peel of 1 orange, plus orange wedges for garnish",
                                "4 cups boiling water",
                                "¾ cup orange juice",
                                "¼ cup sugar",
                                "4 cups cold water",
                        }, new String[]{
                        " Step 1",
                        "Steep loose tea (or tea bags) and orange peel in boiling water for 3 to 5 minutes.",
                        "",
                        "Step 2",
                        "Strain the tea (or remove tea bags and orange peel) and pour into a large pitcher. Stir in orange juice and sugar until the sugar is dissolved. Add cold water. Refrigerate until chilled, about 2 hours. Serve over ice with orange wedges, if desired.",
                }),

                new Recipe("Warm Honey Green Tea", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2018%2F07%2F07%2F6482743.jpg&w=272&h=272&c=sc&poi=face&q=60", "Green tea is loaded with antioxidants and has been shown to keep your blood sugar stable. We like it flavored with orange, lemon, and honey in this easy recipe.",
                        new String[]{
                                "4 cups water",
                                "4 lemon peel strips (2 1/2 x 1 inches each)",
                                "4 orange peel strips (2 1/2 x 1 inches each)",
                                "4 green tea bags",
                                "2 teaspoons honey",
                                "4 lemon slices",
                        }, new String[]{
                        " Step 1",
                        "Stir together the water, lemon peel strips, and orange peel strips in a medium saucepan. Bring to boiling; reduce heat. Simmer, uncovered, for 10 minutes. Remove the lemon and orange strips with a slotted spoon and discard.",
                        "",
                        "Step 2",
                        "Place tea bags in a teapot; immediately add the simmering water mixture. Cover and let steep according to the tea package directions (1 to 3 minutes). Remove the tea bags, squeezing gently. Discard the tea bags. Stir in honey. Pour the tea into four heatproof mugs or cups and garnish each with a lemon slice. Serve immediately.",
                }),

                new Recipe("Matcha Green Tea Latte", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F26232352%2F3759276.jpg&w=272&h=272&c=sc&poi=face&q=60", "A touch of honey balances the bitterness of matcha in this healthy latte recipe. For a nondairy latte, swap unsweetened almond, soy or coconut milk for the low-fat milk.",
                        new String[]{
                                "¼ cup boiling water",
                                "1 teaspoon matcha tea powder",
                                "1 cup low-fat milk",
                                "1 teaspoon honey",
                        }, new String[]{
                        " Blend boiling water with matcha powder in a blender until foamy. Heat milk with honey until almost boiling. Vigorously whisk the milk until frothy. Pour the milk into a mug, then pour in the tea.",
                }),

                new Recipe("Homemade Kombucha", "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F44%2F2019%2F08%2F27052008%2F5507724.jpg&w=272&h=272&c=sc&poi=face&q=60", "Kombucha is a lightly fizzy, fermented tea drink that's making waves for its probiotic benefits and tart flavor. Making kombucha at home is quite simple: make sweetened tea, add it to a jar with a scoby (symbiotic culture of bacteria and yeast) and let it ferment for about a week. The scoby is a pancake-shaped living culture that eats most of the sugar in the tea, turning it into a tangy and delicious fermented beverage.",
                        new String[]{
                                "1 gallon water",
                                "1 cup sugar",
                                "6 plain black tea bags",
                                "1 kombucha scoby ",
                                "1 cup starter kombucha",
                        }, new String[]{
                        " Step 1",
                        "Bring water to a boil in a large pot. Once boiling, remove from heat and stir in sugar, then add tea bags.",
                        "",
                        "Step 2",
                        "Allow the tea to cool to room temperature, 2 to 3 hours. Remove the tea bags, then pour the tea into a 1-gallon glass jar. Gently pour scoby and starter kombucha into the jar.",
                        "",
                        "Step 3",
                        "Cover the jar with a paper towel or clean tea towel and affix it with a rubber band. Place the jar in a warm (the ideal temperature is 75 degrees F), dark location until it is tangy and fruity, about 8 days. Avoid cool locations, which can lead to mold. Note: During fermenting, the scoby may float on top or sink to the bottom and, after a few days, a new scoby layer will form.",
                        "",
                        "Step 4",
                        "After 8 days, taste the kombucha for doneness. If it tastes sweeter than you prefer, allow the kombucha to ferment for another day or two. If necessary, continue tasting for up to 14 days until the desired flavor is reached.",
                        "",
                        "Step 5",
                        "When the kombucha is done, remove the scoby and place it in sealable container with 1 cup of the kombucha to store. (Store it, refrigerated, for up to 2 weeks until you're ready to make the next batch of kombucha. If, over time, the scoby grows several layers thick, remove a layer and discard it, or share it with a friend.)",
                        "",
                        "Step 6",
                        "Pour the kombucha through a fine-mesh strainer into a pitcher or large measuring cup(s) to filter out any sediment. Using a funnel, pour the kombucha into sealable glass bottles.",
                        "",
                        "Step 7",
                        "Close the bottles and return them to the warm, dark storage location until carbonated, 1 to 2 weeks.",
                }),


        };


        demoCategoryMappings.put("juices", juices);
        demoCategoryMappings.put("mocktails", mocktails);
        demoCategoryMappings.put("chocolate drinks", chocolate);
        demoCategoryMappings.put("smoothies", smoothies);
        demoCategoryMappings.put("punches", punch);
        demoCategoryMappings.put("teas", teas);

        this.categoryMapping = demoCategoryMappings;
    }

    public Map<String, Recipe[]> getCategoryMapping() {
        return categoryMapping;
    }
}
