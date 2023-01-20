let nums = [1, 2, 3, 4, 5]

function mult(x, int) {
    let vetor1 = []
    x.forEach(e => vetor1.push(e * int))
    console.log(vetor1)
}

function multAcima5(x, int) {
    let vetor2 = []
    if (int < 5) return
    x.forEach(e => vetor2.push(e * int))
    console.log(vetor2)
}

mult(nums, 3)
multAcima5(nums, 1)