package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void BracketsBeforeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void BracketsWithinReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void BracketsAroundReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void OneBracketReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void Reverse3dBracketsReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void MultipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void BackwardBracketsSetsWithTextReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]Launch[]Code["));
    }

    @Test
    public void MultipleBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }

    @Test
    public void OddNumberOfBracketsEndReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void OddNumberOfBracketsReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void NestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
}



