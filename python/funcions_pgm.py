'''
def introduction(firstName="Jummy", lastName="Smith"):

    print("Hello, my name is", firstName, lastName)

    

introduction("ketan" ,"Nagar")

O/p:
    ketan@ketan-tuf-fx505dt:~/python$ python3 funcions_pgm.py
Hello, my name is ketan Nagar


def subtra(a, b):
    print(a - b)

subtra(5, b=2)    # outputs: 3
subtra(a=5, 2)    # Syntax Error


ketan@ketan-tuf-fx505dt:~/python$ python3 funcions_pgm.py
  File "funcions_pgm.py", line 19
    subtra(a=5, 2)    # Syntax Error
               ^
SyntaxError: positional argument follows keyword argument


def fun():
    return "mkbhd"  # return - Keyword


x= fun();


print("The function has executed its result , it;s " +x)


print(None) #Runtime error , None -Keyword 


def strangeFunction(n):

    if(n % 2 == 0):

        return True

    else:

        return False



x= strangeFunction(3)



print(x)

'''


def strangeListFunction(n):

    strangeList = []



    for i in range(0, n):

        strangeList.insert(0, i)



    return strangeList



print(strangeListFunction(5))
