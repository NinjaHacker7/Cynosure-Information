let n = 15;
let binary = 0;
let pow = 1;
while(n!=0){
    let rem = n % 2;
    n = Math.floor(n / 2);
    binary += rem*pow;
    pow *= 10;
    
}
console.log(binary);


