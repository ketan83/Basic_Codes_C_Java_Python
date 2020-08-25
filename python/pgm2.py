var = 1
print(var)
var = var + 1
print(var)

a = 3.0

b = 4.0

c = (a ** 2 + b ** 2) ** 0.5

print("c =", c)

john=30
mary=20
adam=50
print("john=",john)
print("mary=",mary)
print("adam=",adam)
total_apples=john+mary+adam
print("TotalApples=",total_apples)

kilometers = 12.25

miles = 7.38



miles_to_kilometers = 11.88

kilometers_to_miles = 7.67



print(miles, "miles is", round(miles_to_kilometers, 2), "kilometers")

print(kilometers, "kilometers is", round(kilometers_to_miles, 2), "miles")



'''
anything = float(input("Enter a number: "))  #input() function example

something = anything ** 2.0

print(anything, "to the power of 2 is", something)
'''

leg_a = float(input("Input first leg length: "))

leg_b = float(input("Input second leg length: "))

hypo = (leg_a**2 + leg_b**2) ** .5

print("Hypotenuse length is", hypo)
