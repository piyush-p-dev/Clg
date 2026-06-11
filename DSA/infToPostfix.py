class InfixPostfix:
    def __init__(self):
        self.stack = []

    def precedence(self, op):
        if op in "+-":
            return 1
        if op in "*/":
            return 2
        return 0

    def convert(self, exp):
        postfix = ""

        for ch in exp:
            if ch.isalnum():
                postfix += ch

            elif ch == "(":
                self.stack.append(ch)

            elif ch == ")":
                while self.stack and self.stack[-1] != "(":
                    postfix += self.stack.pop()
                self.stack.pop()

            else:
                while self.stack and self.precedence(ch) <= self.precedence(self.stack[-1]):
                    postfix += self.stack.pop()

                self.stack.append(ch)

        while self.stack:
            postfix += self.stack.pop()

        return postfix


obj = InfixPostfix()
print(obj.convert("A+B*C"))