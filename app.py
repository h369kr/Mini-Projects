from Question import Question

question_prompt = [
    "What color are apples ?\n(a) Red\n(b) Yellow\n(c) Blue\n\n",
    "What color are bananas ?\n(a) Red\n(b) Yellow\n(c) Blue\n\n",
    "What color are gwavas ?\n(a) Green\n(b) Yellow\n(c) Blue\n\n" 
]

questions = [
    #Question(question.prompt,question.answer)
    Question(question_prompt[0],"a"),
    Question(question_prompt[1],"b"),
    Question(question_prompt[2],"a")
]

def run_test(questions):
    score = 0
    for question in questions:
        answer = input(question.prompt)
        if answer == question.answer:
            score+=1
    print("You got "+ str(score) + "/" + str(len(questions))+" correct")

run_test(questions)
