// alert('test');

// console.log("hello");

// console.error("this is an error");

// console.warn('Warning');

// let age = 30;
// age = 312;
// console.log(age);

// const age = 30;

// Data types
// string number boolean null undefined

// const name = 'Mantas';
// const age = 12;
// const isTired = true;
// const x = null;
// const y = undefined;
// let z;

// console.log(name,age,isTired,x,y,z);


//Concatenation

// const age = 30;
// const isTired = false;

// console.log(`My age is ${age} and i am ${isTired}`);

const random = "hello, my, name, is some random name";

// console.log(random.toUpperCase());
// console.log(random.substring(0,10).toUpperCase());

// console.log(random.split(' '));
// console.log(random.split(', '));

// const books = [
//     'text',
//     {
//         test : 'test'
//     }
// ];

// books.push('test');
// console.log(books);


const person = {
    firstName: 'Jonas',
    lastName: 'Baras',
    age: 25,
    likes:['music','drinks','food'],
    address: {
        street: 'Kauno g.',
        city: 'Vilnius',
        country: 'LT'
    }
}

// console.log(person.address.city);
// console.log(person.likes[0]);

const todos = [
    {
        id: 1,
        text: 'Take out trash',
        isCompleted: true
    },
    {
        id: 2,
        text: 'Make bed',
        isCompleted: true
    },
    {
        id: 3,
        text: 'Eat',
        isCompleted: false
    }
]

// console.log(todos);

// const todoString = JSON.stringify(todos);
// console.log(todoString);

// for(let i=0;i<=10;i++){
//     console.log(i);
// }

// let i=0;
// while(i<10){
//     console.log(i);
//     i++;
// }

// const todoText = todos.map(function (todo){
//     return todo.text;
// })
//     console.log(todoText);