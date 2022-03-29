class Person {
    name: string;

    constructor(name: string){
        this.name = name;
    }

    announce(): string{
        return `Hi, my name is ${this.name}`;
    }
}

const person = new Person("Tom");

const newMessage: string = person.announce();

console.log(person.announce());