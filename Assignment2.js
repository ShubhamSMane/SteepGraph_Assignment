//

//for reading text file and save in json I use npm and install function text file to json

const fs=require('fs');
//now we are conver text data into json fromat

//now we read text data and store as string by using tostring method
let rawdata=fs.readFileSync('2_Products.txt');

//Convert string into JSON Object
let input=JSON.parse(rawdata);

console.log(input) //for checking input

//I Install npm json2xls and convert json to excel
var json2xls=require('json2xls');

//we have json data in input file

var xls=json2xls(input);//by using this line I store input and add in sheet
fs.writeFileSync('output.xlsx',xls,'binary');//I write file name this is created my me

