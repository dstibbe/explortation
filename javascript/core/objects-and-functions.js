console.log("Starting experiment");

//1. An empty object
console.log("\nExperiment 1: empty object");
var emptyBox = {}


//2) An object with a field
console.log("\nExperiment 2: An object with a field");
var sizedBox = {};
sizedBox.size = 12;

console.log("Boxsize: " + sizedBox.size );


//3) A method
console.log("\nExperiment 3: A method");
function boe(){
    console.log("Standalone function 'boe()' says: boe");
}
boe();

//4) A method assigned to a variable
console.log("\nExperiment 4: A method assigned to a variable");
var boeVarFunc = function(){
    console.log("Variable containing function 'boeVarFunc()' says: boe");
}
boeVarFunc();


//5) An object with a method
console.log("\nExperiment 5: An object with a method");
var jackInBox = {};
jackInBox.scare = function() {
    console.log("POING!!!!");
}
jackInBox.scare();

//6) An object containing an object
console.log("\nExperiment 6: An object containing an object");
var boxContainer = {};
boxContainer.contents = {};
boxContainer.contents.description = "Something";
console.log("BoxContainer contains box with description: " + boxContainer.contents.description);

//7) All together now
console.log("\nExperiment 7:  All together now");
var box = {};
box.myfield = "field in box";
box.myFunction =  function(){
                   console.log("Box function called");
                  };
var content = {};
content = {};
content.description = "The object contained in the box object";
box.myContent = content;
console.log( box );

//8) Another way of constructing an object
console.log("\nExperiment 8: Another way of constructing an object");
var box2 = {
    myfield: "field in box",
    myFunction:  function(){
        console.log("Box function called");
    },
    myContent: {
        description: "The object contained in the box object"
    }
};
console.log( box2 );

//9) A Map is another way to access fields
console.log("\nExperiment 9: A Map is another way to access fields");

var myFruits = {
    apple : "Apple",
    pear:  "Pear"
};

console.log("Direct acces, apple: " + myFruits.apple);
console.log("Map acces, apple: " + myFruits["apple"]);

//adding fruit
myFruits["banana"] = "Ba-na-na";

console.log("myFruits object after adding map banana item:");
console.log(myFruits);


//10) An Array object
console.log("\nExperiment 10: An Array object");
var myGarage = new Array();

myGarage[0] = "first entry";
myGarage[3] = "fourth entry";
myGarage[5] = "sixth entry";

console.log("myGarage object after adding array items:");
console.log(myGarage);

console.log("Direct acces to array-object items:");
console.log("Item 4: " + myGarage[3]); 

//11) All ways to instantiate an array
console.log("\nExperiment 11: All ways to instantiate an array");
var myGarage1 = new Array();
myGarage1[1] = "second entry";
myGarage1[5] = "sixth entry";

var myGarage2 = [];
myGarage2[1] = "second entry";
myGarage2[5] = "sixth entry";

var myGarage3 = ["first entry", "second entry", "third entry" ];

console.log("Garage 1:");
console.log(myGarage1);

console.log("Garage 2:");
console.log(myGarage2);

console.log("Garage 3:");
console.log(myGarage3);

//12: function madness
console.log("\nExperiment 12: function madness");

//define a function that accepts two arguments
var myTwoArgFunc = function( one, two ){
    console.log("Called function with [one: " + one + ", two: " + two + "]");
}

//this works of course
console.log("* Normal call: ");
myTwoArgFunc("monkey", 12 );

//however, this ALSO works: 
console.log("* Leave one argument out: ");
myTwoArgFunc("lonelyMonkey" ); 
console.log("* Leave all arguments out: ");
myTwoArgFunc(); 
console.log("* Too many arguments: ");
myTwoArgFunc("monkey" , 12 , "and then some");

//Arguments are stored in a local 'arguments object' 
function countArgs() {
    console.log("Arguments given: " );
    console.log(arguments);
    console.log("You gave me [", arguments.length, "] arguments.");
}

console.log("* Determine the arguments by looking at the 'arguments' object");
countArgs("a", "b", "asdf",  1);
