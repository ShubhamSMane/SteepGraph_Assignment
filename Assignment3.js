//first we need to install clsx file from npm in terminal
const reader=require('xlsx')
const fs=require('fs')


//then I read the excel fle by usin reader
const file=reader.readFile('./3_Products.xlsx')//I save file in same folder

//give a blank object for store excel file data
let input=[]

//Store sheet name in below line
const sheets=file.SheetNames

for(let i=0;i<sheets.length;i++)
{
 const temp=reader.utils.sheet_to_json(
  file.Sheets[file.SheetNames[i]]
 )
//by using forEach loop fetch all data in json format
 temp.forEach((res) =>{
  input.push(res)
 })

}

//Now we prient the json data
console.log(input)
