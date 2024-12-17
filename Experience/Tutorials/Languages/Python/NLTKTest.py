import nltk
from nltk import sent_tokenize

try:
    nltk.data.find('tokenizers/punkt')
except LookupError:
    nltk.download('punkt')

text = input("Enter text: ")
sentences = sent_tokenize(text)

print(sentences)

# autoCorrector(word):
from nltk import edit_distance

edit_distance("hello", "hallo")

word = input("Say hello: ")

print(edit_distance(word, word[1:]) in (0, 1) and ("do you mean" + word + " instead?"))
