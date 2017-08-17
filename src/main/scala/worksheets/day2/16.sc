val flag = true
class Base
class D1 extends Base
class D2 extends Base

null
def x0 = throw new RuntimeException
()

def x = if(flag) new Base else new D1
def x1 = if(flag) new D1 else new D2
def x2 = if(flag) new D1 else 10
def x3 = if(flag) true else 10
def x4 = if(flag) new D1 else null
def x5: D1 = null
def x6 = if(flag) 10 else  null
def x7 = if(flag) new D1 else throw new RuntimeException
def x8 = if(flag) 10 else throw new RuntimeException
def x9: AnyRef = new D1
def x10: Unit = new D1
def x11 = if(flag) new D1
def x12 = if(flag) 10
