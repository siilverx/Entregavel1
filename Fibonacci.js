function exibirFibonacci(n) {
    let a = 0, b = 1;
    let fib = [a, b];
    for (let i = 2; i < n; i++) {
        let temp = a + b;
        fib.push(temp);
        a = b;
        b = temp;
    }
    console.log(fib.join(" "));
}

let n = parseInt(prompt("Digite o valor de N para gerar a sequência de Fibonacci:"));
console.log(`Sequência de Fibonacci até o ${n}º termo:`);
exibirFibonacci(n);
