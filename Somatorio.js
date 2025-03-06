function somatorio(n) {
    let soma = 0;
    for (let i = 1; i <= n; i++) {
        soma += i;
    }
    return soma;
}

let n = parseInt(prompt());
console.log(`Somatório de ${n} é ${somatorio(n)}`);
