package com.prominentpixel.filedemos;

public class Demo05NxNMatrix {
    public static void main(String[] args) {

    }
}
/*-----------o/p------------
def cells_sol (N, K, tasks):
    rows = set([i+1 for i in xrange(N)])
    columns = set([i+1 for i in xrange(N)])
    result = []

    for task in tasks:
        rows.discard(task[0])
        columns.discard(task[1])
        result.append(len(rows)*len(columns))

    return result


N, K = map(int, raw_input().split())
task = []
for _ in range(K):
    i, j = map(int, raw_input().split())
    X = i, j
    task.append(X)


out_ = cells_sol(N, K, task)
print (' '.join(map(str, out_)))
* */