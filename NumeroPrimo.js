function isPrimo(n) {
    if (n <= 1) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}

let n = parseInt(prompt());
console.log(isPrimo(n) ? `${n} é primo` : `${n} não é primo`);
