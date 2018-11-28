package pkgGame;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import pkgEnum.eGameDifficulty;

import org.junit.Test;

public class SudokuPrivateMethodsTest {

	private void PrintStars() {
		for (int i = 0; i < 50; i++)
			System.out.print("*");
		System.out.println();
	}
	
	/**
	 * Sudoku_Test1 -Tests if Sudoku's no-arg constructor builds an instance of Sudoku with the eGameDifficulty 'EASY'. 
	 * 					Also tests if Sudoku's two-arg constructor sets the proper difficulty.
	 */
//	@Test
//	public void Sudoku_Test1() {
//		Sudoku s1 = null;
//		eGameDifficulty medium = eGameDifficulty.MEDIUM;
//		Class<?> cs;
//		try {
//			cs = Class.forName("pkgGame.Sudoku");
//			Constructor noArgConstructor = cs.getDeclaredConstructor();
//			noArgConstructor.setAccessible(true);
//			s1 = (Sudoku) noArgConstructor.newInstance();
//			assertTrue(s1 instanceof Sudoku);
//			Field difficulty = cs.getDeclaredField("eGameDifficulty");
//			difficulty.setAccessible(true);
//			eGameDifficulty eGameDifficulty1 = (eGameDifficulty) difficulty.get(s1);
//			assertTrue(eGameDifficulty1.getiDifficulty() == 100);
//			Sudoku s2 = new Sudoku(9, medium);
//			eGameDifficulty eGameDifficulty2 = (eGameDifficulty) difficulty.get(s2);
//			assertTrue(eGameDifficulty2.getiDifficulty() == 500);
//			
//		} catch (NoSuchMethodException | SecurityException e) {
//			fail("No method found or Security Exception thrown");
//		} catch (InstantiationException e) {
//			fail("Instantiation Exception Thrown");
//		} catch (IllegalAccessException e) {
//			fail("Illegal Access");
//		} catch (IllegalArgumentException e) {
//			fail("Wrong Argument used");
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		}  catch (ClassNotFoundException e) {
//			fail("No Class of name found");
//		} catch (NoSuchFieldException e) {
//			fail("No field of name found");
//		} catch (Exception e) {
//			fail("Test failed to build a Sudoku");
//		}
//	}
//
//	@Test
//	public void Sudoku_Test_SetRegion() {
//
//		Sudoku s1 = null;
//		int iPuzzleSize = 9;
//		int[] iExpectedRegion = new int[iPuzzleSize];
//		for (int i = 0; i < iPuzzleSize; i++) {
//			iExpectedRegion[i] = i + 1;
//		}
//		int[] iActualRegion;
//
//		try {
//			Class<?> c = Class.forName("pkgGame.Sudoku");
//			Constructor constructor = c.getConstructor(new Class[] { int.class });
//			constructor.setAccessible(true);
//			s1 = (Sudoku) constructor.newInstance(iPuzzleSize);
//
//			Method mSetRegion = c.getDeclaredMethod("SetRegion", new Class[] { int.class });
//
//			PrintStars();
//			System.out.println("Testing method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
//			System.out.println("Original Puzzle:");
//			s1.PrintPuzzle();
//			System.out.println("Original Region 0:");
//			System.out.println(Arrays.toString(s1.getRegion(0)));
//
//			System.out.println("Set Puzzle:");
//			mSetRegion.setAccessible(true);
//			mSetRegion.invoke(s1, 0);
//			iActualRegion = s1.getRegion(0);
//
//			s1.PrintPuzzle();
//			System.out.println(Arrays.toString(s1.getRegion(0)));
//
//			assertTrue(Arrays.equals(iExpectedRegion, iActualRegion));
//
//			PrintStars();
//
//		} catch (ClassNotFoundException e1) {
//			fail("ClassNotFoundException");
//		} catch (NoSuchMethodException e) {
//			fail("NoSuchMethodException");
//		} catch (SecurityException e) {
//
//			fail("SecurityException");
//		} catch (InstantiationException e) {
//			fail("InstantiationException");
//		} catch (IllegalAccessException e) {
//			fail("IllegalAccessException");
//		} catch (IllegalArgumentException e) {
//			fail("IllegalArgumentException");
//		} catch (InvocationTargetException e) {
//			fail("InvocationTargetException, Invalid size");
//		}
//
//		PrintStars();
//
//	}
//
//	@Test
//	public void FillDiagonalRegions() {
//		
//		Sudoku s1 = null;
//		int iPuzzleSize = 9;
//		
//		try {
//			Class<?> c = Class.forName("pkgGame.Sudoku");
//			Constructor constructor = c.getConstructor(new Class[] { int.class });
//			constructor.setAccessible(true);
//			s1 = (Sudoku) constructor.newInstance(iPuzzleSize);
//
//			Method mFillDiagonalRegions = c.getDeclaredMethod("FillDiagonalRegions", null);
//
//			PrintStars();
//			System.out.println("Testing method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
//			System.out.println("Original Puzzle:");
//			s1.PrintPuzzle();
//			System.out.println("Original Region 0:");
//			System.out.println(Arrays.toString(s1.getRegion(0)));
//
//			System.out.println("Set Puzzle:");
//			mFillDiagonalRegions.setAccessible(true);
//			mFillDiagonalRegions.invoke(s1, null);
//
//			s1.PrintPuzzle();
//			System.out.println(Arrays.toString(s1.getRegion(0)));
//
//			PrintStars();
//
//		} catch (ClassNotFoundException e1) {
//			fail("ClassNotFoundException");
//		} catch (NoSuchMethodException e) {
//			fail("NoSuchMethodException");
//		} catch (SecurityException e) {
//
//			fail("SecurityException");
//		} catch (InstantiationException e) {
//			fail("InstantiationException");
//		} catch (IllegalAccessException e) {
//			fail("IllegalAccessException");
//		} catch (IllegalArgumentException e) {
//			fail("IllegalArgumentException");
//		} catch (InvocationTargetException e) {
//			fail("InvocationTargetException, Invalid size");
//		}
//
//	}
	/**
	 * This test tests if the constructor for Sudoku replaces the values of the puzzle with zeros until the difficulty is met.
	 */
	@Test
	public void RemoveCellsTest_1() {
		Sudoku s1 = null;
		eGameDifficulty medium = eGameDifficulty.MEDIUM;
		Class<?> cs;
		try {
			
			cs = Class.forName("pkgGame.Sudoku");
			Constructor noArgConstructor = cs.getDeclaredConstructor();
			noArgConstructor.setAccessible(true);
			s1 = new Sudoku(9, medium);
//			Method removecells = cs.getDeclaredMethod("RemoveCells", null);
//			removecells.setAccessible(true);
//			removecells.invoke(s1, null);
			
			
			assertTrue(s1.isPartialSudoku());
			s1.PrintPuzzle();
			
		} catch (NoSuchMethodException | SecurityException e) {
			fail("No method found or Security Exception thrown");
		} catch (InstantiationException e) {
			fail("Instantiation Exception Thrown");
		} catch (IllegalAccessException e) {
			fail("Illegal Access");
		} catch (IllegalArgumentException e) {
			fail("Wrong Argument used");
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			fail("No Class of name found");
		} catch (NoSuchFieldException e) {
			fail("No field of name found");
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
}
