function processSentence(sentence){
    let vowels = 'aeiouAEIOU';
    let vowelCount = 0
    let consonantCount = 0

    for(let i = 0 ; i<sentence.length ; i++){
        let c = sentence[i]

        if((c>='a' && c<='z') || (c>='A' && c<='z')){
            if(vowels.includes(c)){
                vowelCount++;
            }else{
                consonantCount++;
            }
        }
    }

    //Break the word into sentence
    let words = sentence.split(" ")
    let reverseWordList = []

    //reverse the word
    for(let i = 0 ; i<words.length ; i++){
        let currentWord = words[i]
        let reverseWord = ""

        for(let j = currentWord.length - 1; j>=0 ; j--){
            reverseWord+=currentWord[j]
        }

        reverseWordList.push(reverseWord)
    }

    let finalSentence = reverseWordList.join(" ")

    return{
        vowels : vowelCount,
        consonant : consonantCount,
        reverseSentence : finalSentence
    }
}

const result = processSentence("Hello World")
console.log(result)