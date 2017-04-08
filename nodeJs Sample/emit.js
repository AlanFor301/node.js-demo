//constructor
var events = require('events');
var util = require('util');
//elements.on('click', function(){});
//myEmitter is an object.
var myEmitter = new  events.EventEmitter();

myEmitter.on('someEvent', function(mssg){
  console.log(mssg);
});
myEmitter.emit('someEvent', 'hello world!');


//new object operator
var Person = function (name) {
  this.name = name;
}
//
util.inherits(Person, events.EventEmitter);

var james = new Person('james');
var alan = new Person('Alan');
var mary = new Person('Mary');

var people = [james, alan, mary];
people.forEach(function(person){
  person.on('speak', function(mssg){
    console.log(person.name + ' said '+ mssg);
  });
});

james.emit('speak', 'heelo yoooooooooo');
alan.emit('speak', 'sup');
mary.emit('speak', 'BYeeeeeee');
