var http = require('http');
var fs = require('fs');

var myReadStream = fs.createReadStream(__dirname + '/readMe.txt');

myReadStream.on('data', function(chunck){
  console.log('new chunck received: ');
  console.log(chunck);
})
