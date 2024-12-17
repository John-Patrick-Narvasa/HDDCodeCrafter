def display_question(question, options):
    print(question)
    for i, option in enumerate(options):
        print(f"{i+1}. {option}")
    print()

def get_user_answer():
    while True:
        try:
            answer = int(input("Enter your answer (1-4): "))
            if 1 <= answer <= 4:
                return answer
            else:
                print("Please enter a valid option (1-4).")
        except ValueError:
            print("Please enter a valid option (1-4).")

def check_answer(answer, correct_answer):
    if answer == correct_answer:
        print("Correct answer!")
        return True
    else:
        print("Incorrect answer!")
        return False

def run_quiz(questions):
    score = 0
    for question in questions:
        display_question(question["question"], question["options"])
        user_answer = get_user_answer()
        if check_answer(user_answer, question["answer"]):
            score += 1
    print(f"\nQuiz completed! You scored {score}/{len(questions)}.")

# Sample questions
quiz_questions = [
    {
        "question": "What is the capital of France?",
        "options": [
            "Paris",
            "London",
            "Berlin",
            "Rome"
        ],
        "answer": 1
    },
    {
        "question": "Who painted the Mona Lisa?",
        "options": [
            "Leonardo da Vinci",
            "Pablo Picasso",
            "Vincent van Gogh",
            "Michelangelo"
        ],
        "answer": 1
    },
    {
        "question": "Which planet is known as the Red Planet?",
        "options": [
            "Mars",
            "Venus",
            "Saturn",
            "Jupiter"
        ],
        "answer": 1
    }
]

# Run the quiz
run_quiz(quiz_questions)