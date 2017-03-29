var http = require('http');
var fs = require('fs');

var server = http.createServer(function(req, res){
  console.log('request was made: '+ req.url);
  if(req.url === '/home' || req.url === '/'){
    res.writeHead(200, {'content-Type': 'text/html'});
    fs.createReadStream(__dirname + '/index.html').pipe(res);
  }else if(req.url === '/contact'){
    res.writeHead(200, {'content-Type': 'text/html'});
    fs.createReadStream(__dirname + '/contact.html').pipe(res);
  }else if(req.url === '/api/alan'){
    var alan = [{name:'alan', age:22},{name:'yoshi', age:22}];
    //NOTE: if the line below has an error but code above is correct,
    // the server will run. However, the bug below shows up when
    // request for a end point api.
    res.writeHead(200, {'content-Type': 'application/json'});
    res.end(JSON.stringify(alan));
  }
});

server.listen(3000, '127.0.0.1');
console.log('listening to port 3000');
