class PolyNode:
    def __init__(self, coef, exp):
        self.coef = coef
        self.exp = exp
        self.next = None

def create_poly(A):
    temp = None
    last = None
    for i in range(0, len(A), 2):
        p = PolyNode(A[i], A[i+1])
        if temp is None:
            temp = p
            last = p
        else:
            last.next = p
            last = p
    return temp

def add_poly(p1, p2):
    temp = None
    last = None
    while p1 is not None and p2 is not None:
        if p1.exp > p2.exp:
            p = PolyNode(p1.coef, p1.exp)
            p1 = p1.next
        elif p1.exp < p2.exp:
            p = PolyNode(p2.coef, p2.exp)
            p2 = p2.next
        else:
            p = PolyNode(p1.coef + p2.coef, p1.exp)
            p1 = p1.next
            p2 = p2.next
        if temp is None:
            temp = p
            last = p
        else:
            last.next = p
            last = p
    while p1 is not None:
        p = PolyNode(p1.coef, p1.exp)
        if temp is None:
            temp = p
            last = p
        else:
            last.next = p
            last = p
        p1 = p1.next
    while p2 is not None:
        p = PolyNode(p2.coef, p2.exp)
        if temp is None:
            temp = p
            last = p
        else:
            last.next = p
            last = p
        p2 = p2.next
    return temp

def traverse(p):
    print("\nThe polynomial is:")
    while p is not None:
        if p.next is not None:
            print(f"{p.coef}x^{p.exp} + ", end="")
        else:
            print(f"{p.coef}x^{p.exp}")
        p = p.next

# Example usage
a = [3, 2, 5, 1, 6, 0]
b = [4, 3, 8, 1, 5, 0]

poly1 = create_poly(a)
poly2 = create_poly(b)

traverse(poly1)
traverse(poly2)

poly3 = add_poly(poly1, poly2)

traverse(poly3)
