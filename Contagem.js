function contar(arr, N) {
    let count = 0;
    for (let num of arr) {
        if (num >= arr[0] && num <= N) {
            count++;
        }
    }
    return count;
}

let N = parseInt(prompt("Digite o valor de N:"));
let arr = [1, 2, 3, 4, 5, 6];
console.log(`Contagem de valores entre o primeiro dado e N: ${contar(arr, N)}`);
