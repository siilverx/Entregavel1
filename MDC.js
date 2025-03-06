
function mdc(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

let a = parseInt(prompt())
let b = parseInt(prompt())

console.log(`MDC de ${a} e ${b} é ${mdc(a, b)}`);
