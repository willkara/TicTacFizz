list = [x for x in range(1, 100)]
#Generate a list of numbers between 1 and 100

for num in list:
    #Go through each number in the list
    if num % 3 == 0:

        print("Fizz")
    elif num % 5 == 0:
        #If number is divisible by 5, print Buzz
        print("Buzz")
    elif num % 15:
        #If number is divisible by both (lowest common multiple is 15), print FizzBuzz
        print("FizzBuzz")
