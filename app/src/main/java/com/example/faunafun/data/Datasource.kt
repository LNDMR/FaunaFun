package com.example.faunafun.data

import com.example.faunafun.R
import com.example.faunafun.data.model.Animal
import com.example.faunafun.data.model.Category

class Datasource {
    fun getAnimals(): List<Category> {
        return listOf(
            Category("Mammals",
                listOf(Animal("Kangaroo",  R.drawable.kangaroo),
                    Animal("Blue Wale",  R.drawable.bluewale),
                    Animal("Leopard",  R.drawable.leopard),
                    Animal("Hedgehog",  R.drawable.hedgehog),
                )),
            Category("Reptiles",
                listOf(Animal("Chameleon",  R.drawable.chameleon),
                    Animal("Komodo Dragon",  R.drawable.komodo_dragen),
                    Animal("King Cobra",  R.drawable.king_cobra),
                    Animal("American Alligator",  R.drawable.american_alligator),
                )),
            Category("Birds",
                listOf(Animal("Penguin",  R.drawable.penguin),
                    Animal("Eastern Bluebird",  R.drawable.eastern_bluebird),
                    Animal("Flamingo",  R.drawable.flamingo),
                    Animal("Snowy Owl",  R.drawable.snowyowl),
                )),
            Category("Fish",
                listOf(Animal("Goblin Shark",  R.drawable.goblin_shark),
                    Animal("Seahorse",  R.drawable.seahorse),
                    Animal("Pufferfish",  R.drawable.puffer_fish),
                    Animal("Clownfish",  R.drawable.clownfish),
                )),



        )
    }
}