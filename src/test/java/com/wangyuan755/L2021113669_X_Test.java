package com.wangyuan755;


import java.beans.Transient;
import java.util.*;

import org.junit.Test;
import org.junit.Assert;

public class L2021113669_X_Test extends Solution20
{
    @Test
    public void testfindMinHeightTrees()
    {
        List<Integer> a = new ArrayList<Integer>();
        a.add(2);
        Assert.assertEquals(a, findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}})); 
          
    }   
}
