let a = 1;
let b = a;
a = 2;
console.log(b);

let obj = {
  name: "Linh",
  score: 20,
};

let obj2 = obj;
obj.name = "Lộc";

console.log(obj);
console.log(obj2);
