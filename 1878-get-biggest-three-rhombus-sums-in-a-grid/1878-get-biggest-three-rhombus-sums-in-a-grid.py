class Solution:
    def getBiggestThree(self, grid):
        m=len(grid)
        n=len(grid[0])
        s=set()

        for i in range(m):
            for j in range(n):
                s.add(grid[i][j])

                k=1
                while i+2*k<m and j-k>=0 and j+k<n:
                    total=0

                    x=i
                    y=j

                    for d in range(1,k+1):
                        total+=grid[x+d][y+d]

                    for d in range(1,k+1):
                        total+=grid[x+k+d][y+k-d]

                    for d in range(1,k+1):
                        total+=grid[x+2*k-d][y-d]

                    for d in range(1,k):
                        total+=grid[x+k-d][y-k+d]

                    total+=grid[i][j]
                    s.add(total)

                    k+=1

        return sorted(s,reverse=True)[:3]




            
                


            
            


        