package org.example.inheritance;

public class Amphibian extends Animal {
    public abstract class Amphibian extends Animal implements Huntable {

        private String name;
        protected boolean breathing;

        public Animal() {
        }

        protected Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("animal eating");
        }

        public abstract void makeSound();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
}
