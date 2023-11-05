package com.costas.animal.midterms

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.costas.animal.midterms.databinding.ActivityAnimalNamesBinding

class AnimalNamesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnimalNamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalNamesBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val animals: MutableList<Animals> = ArrayList()
        animals.add(Animals("Antelope", "Antelopes are herbivorous mammals known for their agility and distinctive curved horns. They are found in various habitats, from grasslands to deserts."))
        animals.add(Animals("Bear", "Bears are large, omnivorous mammals with shaggy fur and strong limbs. They come in various species like grizzly bears, polar bears, and pandas."))
        animals.add(Animals("Cat", "Cats are small domesticated carnivorous mammals known for their agility, grace, and independent behavior. They make popular pets."))
        animals.add(Animals("Dog", "Dogs are domesticated canines that come in various breeds, serving as loyal companions, working animals, and even service animals."))
        animals.add(Animals("Elephant", "Elephants are the largest land mammals, known for their massive size, long trunk, and tusks. They are herbivores and are found in Africa and Asia."))
        animals.add(Animals("Fox", "Foxes are small to medium-sized carnivorous mammals known for their cunning behavior and bushy tails. They are found in various parts of the world."))
        animals.add(Animals("Giraffe", "Giraffes are the world's tallest land animals, recognized by their long necks and unique spotted coat patterns. They are herbivores found in Africa."))
        animals.add(Animals("Horse", "Horses are large, hoofed mammals often used for riding, racing, and as working animals. They have played a significant role in human history."))
        animals.add(Animals("Ibis", "Ibises are wading birds with long, curved bills. They are often found near water and are known for their distinctive appearance."))
        animals.add(Animals("Jaguar", "Jaguars are large felines known for their beautiful spotted coat. They are powerful predators found in the Americas."))
        animals.add(Animals("Kangaroo", "Kangaroos are marsupials with powerful hind legs, adapted for hopping. They are native to Australia and nearby regions."))
        animals.add(Animals("Lion", "Lions are majestic big cats known for their social behavior and the distinctive manes of males. They are apex predators and symbolize strength and royalty."))
        animals.add(Animals("Monkey", "Monkeys are primates with prehensile tails and a wide range of species and behaviors. They are found in various parts of the world."))
        animals.add(Animals("Nightingale","Nightingales are small songbirds known for their beautiful singing, often associated with poetry and music."))
        animals.add(Animals("Octopus", "Octopuses are intelligent, marine cephalopods with soft bodies and multiple tentacles. They are known for their camouflage abilities."))
        animals.add(Animals("Panda", "Pandas are distinctive black and white bears native to China. They are known for their bamboo diet and iconic appearance."))
        animals.add(Animals("Quail", "Quails are small ground-dwelling birds known for their distinctive calls and delicious meat. They are found in various parts of the world."))
        animals.add(Animals("Rabbit", "Rabbits are small herbivorous mammals known for their long ears and rapid reproduction. They are common pets and are found in the wild as well."))
        animals.add(Animals("Snake", " Snakes are elongated, legless reptiles with a wide range of species, from harmless to venomous."))
        animals.add(Animals("Tiger", "Tigers are large, striped big cats known for their strength and beauty. They are apex predators and are found in various parts of Asia."))
        animals.add(Animals("Urchin", "Urchins are spiky, marine echinoderms that inhabit the ocean floor. They are related to sea stars and sea cucumbers."))
        animals.add(Animals("Vulture", "Vultures are scavenging birds known for their bald heads and strong beaks, feeding on carrion."))
        animals.add(Animals("Wallaby", "Wallabies are small to medium-sized marsupials related to kangaroos, native to Australia and nearby regions."))
        animals.add(Animals("Xenos", "Xenos are small, insectivorous birds found in Central and South America, known for their distinctive plumage and behavior."))
        animals.add(Animals("Yak", "Yaks are large, shaggy-haired mammals adapted to high altitudes, primarily found in the Himalayan region. They are used for their milk, meat, and labor."))
        animals.add(Animals("Zebra", "Zebras are herbivorous mammals known for their black and white striped coats. They are native to Africa and are often seen in savannas."))

        val context = this
        val adapter = MyAdapter(animals, context)

        binding.animalsList.layoutManager = LinearLayoutManager(this)
        binding.animalsList.adapter = adapter
    }

    fun manageblockAnimal() {
        val intent = Intent(this, ManageBlockActivity::class.java)
        startActivity(intent)
    }
}