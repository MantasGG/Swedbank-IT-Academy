"use strict";
class Person {
    constructor(name) {
        this.name = name;
    }
    announce() {
        return `Hi, my name is ${this.name}`;
    }
}
const person = new Person("Tom");
const newMessage = person.announce();
console.log(person.announce());
