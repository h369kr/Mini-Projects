guessLimit = 5
temp = guessLimit
actNum = 57
print("Enter 1st num :")
num1 = int(input())
print("Enter 2nd num :")
num2 = int(input())
print("number is between", num1, "and", num2)
count = 0

while guessLimit > 0:
    print("GUESS THE NUMBER :")
    guessNumber = int(input())
    count = count + 1

    if guessNumber < actNum:
        print('Try with bit bigger num')
        print(temp - count, 'attempts left')

    elif guessNumber > actNum:
        print('Try with bit lesser num')
        print(temp - count, 'attempts left')

    else:
        print("YOU ARE CORRECT!!!")
        break

    guessLimit = guessLimit - 1
if count < 2:
    print(count, 'attempts taken,You are a good guesser')
    
elif count >=2 and count <=5:
    print(count, 'attempts taken,You did OK')
else:
    print('better luck next time')