var Person = /** @class */ (function () {
    function Person(name) {
        this.name = name;
    }
    Person.prototype.announce = function () {
        return "Hi, my name is ".concat(this.name);
    };
    return Person;
}());
var person = new Person("Tom");
var newMessage = person.announce();
console.log(person.announce());
