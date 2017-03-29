var http = require('http');
var fs = require('fs');

var server = http.createServer(function(req, res){
  console.log('request was made: '+ req.url);
  //NOTE: if application/json is writen as applicaiton/jason
  // the server will run and the json obejct will be sent to
  //client side. However, the json object will not be shown on
  //browser. it will be downloaded.
  res.writeHead(200, {'content-Type': 'application/json'});
  var myObj = {
    name: 'Alan',
    job: 'programer',
    age: '28'
  };
  res.end(JSON.stringify(myObj));
});

server.listen(3000, '127.0.0.1');
console.log('linstening to 3000');
