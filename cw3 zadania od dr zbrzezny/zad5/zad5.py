from Student import Student

def main():
    stu1 = Student("kacper","Zaczek")
    stu1.add_quiz(20)
    stu1.add_quiz(5)
    print(stu1.get_name())
    print(stu1.get_average_score())



if __name__ == '__main__':
    main()