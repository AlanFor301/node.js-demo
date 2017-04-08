// nORMAL FUNCTION STATEMENT
function sayHi(){
  console.log('hi');

}


sayHi();


//function expression

var sayBye = function(){
  console.log('bye');
}
sayBye();


//pass a funcion into another function
function callFunction(sayYo){
  sayYo();
}

var sayHo = function(){
  console.log('yo');
};


callFunction(sayHo);
