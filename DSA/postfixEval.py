class PostfixEvaluation:
    def evaluate(self, exp):
        stack = []

        for ch in exp:
            if ch.isdigit():
                stack.append(int(ch))
            else:
                b = stack.pop()
                a = stack.pop()

                if ch == '+':
                    stack.append(a + b)
                elif ch == '-':
                    stack.append(a - b)
                elif ch == '*':
                    stack.append(a * b)
                elif ch == '/':
                    stack.append(a / b)

        return stack.pop()


obj = PostfixEvaluation()
print(obj.evaluate("23+5*"))