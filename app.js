var express = require('express');
var app = express();
app.get('/', function(req, res){
  //express is clever enought to set header.
  res.send('this is the home page');
})

app.get('/contact', function(req, res){
  //express is clever enought to set header.
  res.send('this is the contact page');
})

app.listen(3000);
