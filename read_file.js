//reqire modules. call the module name as the var name.
var fs = require('fs');

//read file relative dir to the current js file.
//var readMe =  fs.readFileSync('readMe.txt', 'utf8');

fs.readFile('readMe.txt', 'utf8', function(err, data){
  fs.writeFile('writeMe.txt',data);
})

//fs.writeFileSync('writeMe.txt', readMe);
