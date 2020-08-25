'''
a = int(input("Enter value in a"))
b = int(input("Enter value in b"))

z = (a**2 + 2 *a *b + b**2)

print("Using formaula (a+b)**2 = a^2 + 2ab +b^2 final value of z is " ,z)



a = input("Enter a word in a")
b = input("Enter a word in b")

print("The Worst Actors Of Bollywood are ",a,"and",b)

fnam = input("May I have your first name, please? ")
lnam = input("May I have your last name, please? ")
print("Thank you.")
print("\nYour name is " + fnam + " " + lnam + ".")

print("+" + 10 * "-" + "+")                  # In Replication * operator is used
print(("|" + " " * 10 + "|\n") * 5, end="")
print("+" + 10 * "-" + "+")
ketan@ketan-tuf-fx505dt:~/python$ python3 pgm3.py
+----------+
|          |
|          |
|          |
|          |
|          |
+----------+
ketan@ketan-tuf-fx505dt:~/python$ 

leg_a = float(input("Input first leg length: "))    # type conversion - str()
leg_b = float(input("Input second leg length: "))
print("Hypotenus length is "+str((leg_a**2 + leg_b**2)** .5))


#Arithmatic Operations
a = int(input("ENter value in  a"))

b = int(input("ENter value in  b"))



z  =  a + b;

print("Additon  of 2 no.s is ",z)

print("\n")



z  =  a - b;

print("Subraction  of 2 no.s is ",z)

print("\n")



z  =  a * b;

print("Multiplicaton  of 2 no.s is ",z)

print("\n")



z  =  a / b;

print("Division  of 2 no.s is ",z)

print("\n")



z  =  a % b;

print("Modulus  of 2 no.s is ",z)

print("\n")
'''

x = float(input("Enter value for x: "))



# put your code here

y = (1 / (x +1 / (x + 1 /(x + x**-1))))

print("y =", y)
