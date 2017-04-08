console.log('hey sup');

/*normal case: counting time
 */
setTimeout(function(){
  console.log('3 seconds have passed');
}, 3000);

var time = 0;
var timer = setInterval(function(){
  time +=2;
  console.log(time + ' seconds have passed');

/*set a terminal state
 */
  if (time > 5){
    clearInterval(timer);
  }
}, 2000);

console.log(__dirname);
console.log(__filename);
