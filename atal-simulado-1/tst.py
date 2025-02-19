def count_different(s):
    already_read = []
    for i in s:
        if(i not in already_read):
            already_read.append(i)
    return len(already_read)

def is_diversa(s):
    for i in s:
        count = s.count(i)
        if(count>(count_different(s))):
            return False   
    return True


def diversas_meio(s):
    print(s)
    if(len(s)==1):
        return 1
   
    if(is_diversa(s)):
        return 1+diversas_meio(s[1:-1])
    else:
        return diversas_meio(s[1:-1])
    
print(diversas_meio("zapzapzap"))