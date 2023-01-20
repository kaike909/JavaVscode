function strings(string1, string2) {
    let tem = true
    for (let i = 0; i < string1.length; i++) {
        let char1 = string1.charAt(i).toLowerCase()
        for (let j = 0; j < string2.length; j++) {
            let char2 = string2.charAt(j).toLowerCase()
            if (char1 == char2) {
                tem = true
                break
            } else {
                tem = false
            }
        }
        if (!tem) {
            return tem
        }
    }
    for (let i = 0; i < string2.length; i++) {
        let char1 = string2.charAt(i).toLowerCase()
        for (let j = 0; j < string1.length; j++) {
            let char2 = string1.charAt(j).toLowerCase()
            if (char1 == char2) {
                tem = true
                break
            } else {
                tem = false
            }
        }
        if (!tem) {
            return tem
        }
    }
    return tem
}

console.log(strings('OvO', 'oVo'))
console.log(strings('abcde', 'aebdf'))