#1. (a)
def print_table(n):
    for i in range(1,11):
        print(str(n)+ " X " + str(i) + " = " + str(i*n))


print_table(12)

#1.(b)
def check_prime(n):
    if n > 1:
        for i in range(2, int(n/2)+1):
            if(n % i == 0):
                print("not prime")
                break
        else:
            print("prime")
    else:
        print("not a prime")

check_prime(69)

#1.(c)
def find_fact(n):
    if(n > 1):
        return n * find_fact(n-1)
    else:
        return 1

print(find_fact(12))


#2.

import random

R_EATING = "I don't like eating anything because I'm a bot obviously!"
R_ADVICE = "If I were you, I would go to the internet and type exactly what you wrote there!"


def unknown():
    response = ["Could you please re-phrase that? ",
                "...",
                "Sounds about right.",
                "What does that mean?"][
        random.randrange(4)]
    return response

def message_probability(user_message, recognised_words, single_response=False, required_words=[]):
    message_certainty = 0
    has_required_words = True

    # 
    for word in user_message:
        if word in recognised_words:
            message_certainty += 1

    # 
    percentage = float(message_certainty) / float(len(recognised_words))

    # 
    for word in required_words:
        if word not in user_message:
            has_required_words = False
            break

    # 
    if has_required_words or single_response:
        return int(percentage * 100)
    else:
        return 0


def check_all_messages(message):
    highest_prob_list = {}

    
    def response(bot_response, list_of_words, single_response=False, required_words=[]):
        nonlocal highest_prob_list
        highest_prob_list[bot_response] = message_probability(message, list_of_words, single_response, required_words)

    
    response('Hello!', ['hello', 'hi', 'hey', 'sup', 'heyo'], single_response=True)
    response('See you!', ['bye', 'goodbye'], single_response=True)
    response('I\'m doing fine, and you?', ['how', 'are', 'you', 'doing'], required_words=['how'])
    response('You\'re welcome!', ['thank', 'thanks'], single_response=True)
    response('Thank you!', ['i', 'love', 'code', 'palace'], required_words=['code', 'palace'])

    # Longer responses
    response(R_ADVICE, ['give', 'advice'], required_words=['advice'])
    response(R_EATING, ['what', 'you', 'eat'], required_words=['you', 'eat'])

    best_match = max(highest_prob_list, key=highest_prob_list.get)
    

    return unknown() if highest_prob_list[best_match] < 1 else best_match


# Used to get the response
def get_response(user_input):
    split_message = user_input.split(r'\s+|[,;?!.-]\s*', user_input.lower())
    response = check_all_messages(split_message)
    return response


# Testing the response system
# while True:
#     print('Bot: ' + get_response(input('You: ')))


#Q3(a)
def add(x, y):
    return x + y


def subtract(x, y):
    return x - y


def multiply(x, y):
    return x * y


def divide(x, y):
    return x / y


print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")

while True:
    choice = input("Enter choice : ")

    if choice in ("1", "2", "3", "4"):
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))

        if choice == "1":
            print(num1, "+", num2, "=", add(num1, num2))

        elif choice == "2":
            print(num1, "-", num2, "=", subtract(num1, num2))

        elif choice == "3":
            print(num1, "*", num2, "=", multiply(num1, num2))

        elif choice == "4":
            print(num1, "/", num2, "=", divide(num1, num2))

        next_calculation = input("Another calculation? (Y/N): ")
        if next_calculation == "n":
            break

    else:
        print("Invalid Input")

#Q3(b)
import calendar

y = int(input("year : "))
m = int(input("month : "))
print(calendar.month(y, m))

#Q4(a)
from collections import defaultdict

graph = defaultdict(list)
visited = set()


def addnode(root, child):
    graph[root].append(child)


def dfs(child, visited):
    visited.add(child)
    print(child)

    for i in graph[child]:
        if i not in visited:
            dfs(i, visited)


addnode(0, 1)
addnode(0, 2)
addnode(1, 2)
addnode(2, 0)
addnode(2, 3)
addnode(3, 3)
dfs(2, visited)
print(graph)

#Q4(b)
graph = {"A": ["B", "C"], "B": ["D", "E"], "C": ["F"], "D": [], "E": ["F"], "F": []}

visited = []
queue = []


def bfs(visited, graph, node):
    visited.append(node)
    queue.append(node)

    while queue:
        s = queue.pop(0)
        print(s, end=" ")

        for neighbour in graph[s]:
            if neighbour not in visited:
                visited.append(neighbour)
                queue.append(neighbour)


bfs(visited, graph, "A")

#Q5
from collections import defaultdict

jug1, jug2, aim = 4, 3, 2

visited = defaultdict(lambda: False)


def waterJug(amt1, amt2):

    if (amt1 == aim and amt2 == 0) or (amt2 == aim and amt1 == 0):
        print(amt1, amt2)
        return True
    if visited[(amt1, amt2)] == False:
        print(amt1, amt2)
        visited[(amt1, amt2)] = True
        return (
            waterJug(0, amt2)
            or waterJug(amt1, 0)
            or waterJug(jug1, amt2)
            or waterJug(amt1, jug2)
            or waterJug(
                amt1 + min(amt2, (jug1 - amt1)), amt2 - min(amt2, (jug1 - amt1))
            )
            or waterJug(
                amt1 - min(amt1, (jug2 - amt2)), amt2 + min(amt1, (jug2 - amt2))
            )
        )

    else:
        return False


print("Steps: ")

waterJug(0, 0)


#Q6
def isSafe(graph, color):
    for i in range(4):
        for j in range(i + 1, 4):
            if graph[i][j] and color[j] == color[i]:
                return False
    return True


def gcolor(graph, m, i, color):
    if i == 4:
        if isSafe(graph, color):

            printSolution(color)
            return True
        return False

    for j in range(1, m + 1):
        color[i] = j

        if gcolor(graph, m, i + 1, color):
            return True
        color[i] = 0
    return False


def printSolution(color):
    print("Solution Exists:" " Following are the assigned colors ")
    for i in range(4):
        print(color[i], end=" ")


if __name__ == "__main__":
    graph = [
        [0, 1, 1, 1],
        [1, 0, 1, 0],
        [1, 1, 0, 1],
        [1, 0, 1, 0],
    ]
    m = 3
    color = [0 for i in range(4)]

    if not gcolor(graph, m, 0, color):
        print("Solution does not exist")


#Q7
import numpy as np

arr = np.array([1, 2, 3, 4, 5])

print(arr)


import pandas as pd

mydataset = {
  'cars': ["BMW", "Volvo", "Ford"],
  'passings': [3, 7, 2]
}

myvar = pd.DataFrame(mydataset)

print(myvar)

import matplotlib.pyplot as plt
import numpy as np

xpoints = np.array([0, 6])
ypoints = np.array([0, 250])

plt.plot(xpoints, ypoints)
plt.show()

from sklearn.datasets import load_iris
iris = load_iris()
   

X = iris.data
y = iris.target
   

feature_names = iris.feature_names
target_names = iris.target_names
   

print("Feature names:", feature_names)
print("Target names:", target_names)
   

print("\nType of X is:", type(X))
   

print("\nFirst 5 rows of X:\n", X[:5])

