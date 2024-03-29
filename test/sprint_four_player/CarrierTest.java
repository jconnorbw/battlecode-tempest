package sprint_four_player;

import battlecode.common.*;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class CarrierTest {

    // Testing running Carrier when designated elixir well is null.
    @Test
    public void testRunCarrierElixirWellNull() throws GameActionException, NoSuchFieldException, IllegalAccessException {
        CarrierRobotController rc = new CarrierRobotController();
        Carrier carrier = new Carrier();
        // Create fields for private globals.
        Field designatedElixirWellField = Carrier.class.getDeclaredField("designatedElixirWell");
        Field designatedWellTypeField = Carrier.class.getDeclaredField("designatedWellType");
        Field islandLocationField = Carrier.class.getDeclaredField("islandLocation");
        Field collectingAnchorField = Carrier.class.getDeclaredField("collectingAnchor");
        Field elixirDepositHistoryField = Carrier.class.getDeclaredField("elixirDepositHistory");

        // Set accessible to true.
        designatedElixirWellField.setAccessible(true);
        designatedWellTypeField.setAccessible(true);
        islandLocationField.setAccessible(true);
        collectingAnchorField.setAccessible(true);
        elixirDepositHistoryField.setAccessible(true);

        // Set fields for test
        designatedElixirWellField.set(carrier, null);
        designatedWellTypeField.set(carrier, 0);
        islandLocationField.set(carrier, new MapLocation(1, 1));
        collectingAnchorField.set(carrier, Anchor.STANDARD);
        elixirDepositHistoryField.set(carrier, -1);

        // Set other parameters for testing
        rc.setCanPlaceAnchor(false);
        rc.setLocation(new MapLocation(0, 0));
        rc.setResourceAmount(ResourceType.NO_RESOURCE, 40);
        int[] initialArray = new int[] {
                80, 0, 0, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                80, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 600
        };
        rc.setSharedArray(initialArray);

        // Run test
        carrier.runCarrier(rc);
        assertEquals(new MapLocation(1, 1), designatedElixirWellField.get(carrier));
        assertEquals(1, designatedWellTypeField.get(carrier));
    }

    // Testing running Carrier when islandLocation is null.
    @Test
    public void testRunCarrierIslandLocationNull() throws GameActionException, NoSuchFieldException, IllegalAccessException {
        CarrierRobotController rc = new CarrierRobotController();
        Carrier carrier = new Carrier();
        // Create fields for private globals.
        Field designatedElixirWellField = Carrier.class.getDeclaredField("designatedElixirWell");
        Field designatedWellTypeField = Carrier.class.getDeclaredField("designatedWellType");
        Field islandLocationField = Carrier.class.getDeclaredField("islandLocation");
        Field collectingAnchorField = Carrier.class.getDeclaredField("collectingAnchor");
        Field elixirDepositHistoryField = Carrier.class.getDeclaredField("elixirDepositHistory");

        // Set accessible to true.
        designatedElixirWellField.setAccessible(true);
        designatedWellTypeField.setAccessible(true);
        islandLocationField.setAccessible(true);
        collectingAnchorField.setAccessible(true);
        elixirDepositHistoryField.setAccessible(true);

        // Set fields for test
        designatedElixirWellField.set(carrier, new MapLocation(1, 1));
        designatedWellTypeField.set(carrier, 2);
        islandLocationField.set(carrier, null);
        collectingAnchorField.set(carrier, Anchor.STANDARD);
        elixirDepositHistoryField.set(carrier, -1);

        // Set other parameters for testing
        rc.setCanPlaceAnchor(false);
        rc.setLocation(new MapLocation(0, 0));
        rc.setResourceAmount(ResourceType.NO_RESOURCE, 40);
        int[] initialArray = new int[] {
                80, 0, 0, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                80, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 600
        };
        rc.setSharedArray(initialArray);

        // Run test
        carrier.runCarrier(rc);
        assertEquals(new MapLocation(1, 1), islandLocationField.get(carrier));
    }

    // Testing running Carrier when collect anchor is null.
    @Test
    public void testRunCarrierCollectingAnchorNull() throws GameActionException, NoSuchFieldException, IllegalAccessException {
        CarrierRobotController rc = new CarrierRobotController();
        Carrier carrier = new Carrier();
        // Create fields for private globals.
        Field designatedElixirWellField = Carrier.class.getDeclaredField("designatedElixirWell");
        Field designatedWellTypeField = Carrier.class.getDeclaredField("designatedWellType");
        Field islandLocationField = Carrier.class.getDeclaredField("islandLocation");
        Field collectingAnchorField = Carrier.class.getDeclaredField("collectingAnchor");
        Field elixirDepositHistoryField = Carrier.class.getDeclaredField("elixirDepositHistory");

        // Set accessible to true.
        designatedElixirWellField.setAccessible(true);
        designatedWellTypeField.setAccessible(true);
        islandLocationField.setAccessible(true);
        collectingAnchorField.setAccessible(true);
        elixirDepositHistoryField.setAccessible(true);

        // Set fields for test
        designatedElixirWellField.set(carrier, new MapLocation(1, 1));
        designatedWellTypeField.set(carrier, 2);
        islandLocationField.set(carrier, new MapLocation(1, 1));
        collectingAnchorField.set(carrier, null);
        elixirDepositHistoryField.set(carrier, -1);

        // Set other parameters for testing
        rc.setCanPlaceAnchor(false);
        rc.setCanTakeAnchor(Anchor.STANDARD);
        rc.setLocation(new MapLocation(0, 0));
        rc.setResourceAmount(ResourceType.NO_RESOURCE, 40);
        int[] initialArray = new int[] {
                80, 0, 0, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                80, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 600
        };
        rc.setSharedArray(initialArray);

        // Run test
        carrier.runCarrier(rc);
        assertEquals(Anchor.STANDARD, collectingAnchorField.get(carrier));
    }

    // Testing running Carrier when collect anchor is null after being placed.
    @Test
    public void testRunCarrierCollectingAnchorPlaced() throws GameActionException, NoSuchFieldException, IllegalAccessException {
        CarrierRobotController rc = new CarrierRobotController();
        Carrier carrier = new Carrier();
        // Create fields for private globals.
        Field designatedElixirWellField = Carrier.class.getDeclaredField("designatedElixirWell");
        Field designatedWellTypeField = Carrier.class.getDeclaredField("designatedWellType");
        Field islandLocationField = Carrier.class.getDeclaredField("islandLocation");
        Field collectingAnchorField = Carrier.class.getDeclaredField("collectingAnchor");
        Field elixirDepositHistoryField = Carrier.class.getDeclaredField("elixirDepositHistory");

        // Set accessible to true.
        designatedElixirWellField.setAccessible(true);
        designatedWellTypeField.setAccessible(true);
        islandLocationField.setAccessible(true);
        collectingAnchorField.setAccessible(true);
        elixirDepositHistoryField.setAccessible(true);

        // Set fields for test
        designatedElixirWellField.set(carrier, new MapLocation(1, 1));
        designatedWellTypeField.set(carrier, 2);
        islandLocationField.set(carrier, new MapLocation(1, 1));
        collectingAnchorField.set(carrier, Anchor.STANDARD);
        elixirDepositHistoryField.set(carrier, -1);

        // Set other parameters for testing
        rc.setCanPlaceAnchor(true);
        rc.setLocation(new MapLocation(0, 0));
        rc.setResourceAmount(ResourceType.NO_RESOURCE, 40);
        int[] initialArray = new int[] {
                80, 0, 0, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                80, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 600
        };
        rc.setSharedArray(initialArray);

        // Run test
        carrier.runCarrier(rc);
        assertEquals(null, collectingAnchorField.get(carrier));
    }

    // Testing running Carrier when handling resources.
    @Test
    public void testRunCarrierHandlingResources() throws GameActionException, NoSuchFieldException, IllegalAccessException {
        CarrierRobotController rc = new CarrierRobotController();
        Carrier carrier = new Carrier();
        // Create fields for private globals.
        Field designatedElixirWellField = Carrier.class.getDeclaredField("designatedElixirWell");
        Field designatedWellTypeField = Carrier.class.getDeclaredField("designatedWellType");
        Field islandLocationField = Carrier.class.getDeclaredField("islandLocation");
        Field collectingAnchorField = Carrier.class.getDeclaredField("collectingAnchor");
        Field elixirDepositHistoryField = Carrier.class.getDeclaredField("elixirDepositHistory");

        // Set accessible to true.
        designatedElixirWellField.setAccessible(true);
        designatedWellTypeField.setAccessible(true);
        islandLocationField.setAccessible(true);
        collectingAnchorField.setAccessible(true);
        elixirDepositHistoryField.setAccessible(true);

        // Set fields for test
        designatedElixirWellField.set(carrier, new MapLocation(1, 1));
        designatedWellTypeField.set(carrier, 2);
        islandLocationField.set(carrier, new MapLocation(1, 1));
        collectingAnchorField.set(carrier, null);
        elixirDepositHistoryField.set(carrier, -1);

        // Set other parameters for testing
        rc.setCanPlaceAnchor(false);
        rc.setCanTakeAnchor(false);
        rc.setCanCollectResource(true);
        rc.setLocation(new MapLocation(0, 0));
        int[] initialArray = new int[] {
                80, 0, 0, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                80, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 600
        };
        rc.setSharedArray(initialArray);

        // Run test
        assertEquals(0, rc.getResourceAmount(ResourceType.NO_RESOURCE));
        carrier.runCarrier(rc);
        assertEquals(40, rc.getResourceAmount(ResourceType.NO_RESOURCE));
    }

    // Testing running Carrier when handling Elixir creation.
    @Test
    public void testRunCarrierHandlingElixirCreation() throws GameActionException, NoSuchFieldException, IllegalAccessException {
        CarrierRobotController rc = new CarrierRobotController();
        Carrier carrier = new Carrier();
        // Create fields for private globals.
        Field designatedElixirWellField = Carrier.class.getDeclaredField("designatedElixirWell");
        Field designatedWellTypeField = Carrier.class.getDeclaredField("designatedWellType");
        Field islandLocationField = Carrier.class.getDeclaredField("islandLocation");
        Field collectingAnchorField = Carrier.class.getDeclaredField("collectingAnchor");
        Field elixirDepositHistoryField = Carrier.class.getDeclaredField("elixirDepositHistory");

        // Set accessible to true.
        designatedElixirWellField.setAccessible(true);
        designatedWellTypeField.setAccessible(true);
        islandLocationField.setAccessible(true);
        collectingAnchorField.setAccessible(true);
        elixirDepositHistoryField.setAccessible(true);

        // Set fields for test
        designatedElixirWellField.set(carrier, new MapLocation(1, 1));
        designatedWellTypeField.set(carrier, 2);
        islandLocationField.set(carrier, new MapLocation(1, 1));
        collectingAnchorField.set(carrier, null);
        elixirDepositHistoryField.set(carrier, 0);

        // Set other parameters for testing
        rc.setCanPlaceAnchor(false);
        rc.setCanTakeAnchor(false);
        rc.setCanCollectResource(false);
        rc.setCanDepositResource(true);
        rc.setResourceAmount(ResourceType.ADAMANTIUM, 40);
        rc.setLocation(new MapLocation(0, 0));
        int[] initialArray = new int[] {
                80, 0, 0, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                80, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 500
        };
        rc.setSharedArray(initialArray);

        // Run test
        assertEquals(40, rc.getResourceAmount(ResourceType.ADAMANTIUM));
        carrier.runCarrier(rc);
        assertEquals(0, rc.getResourceAmount(ResourceType.ADAMANTIUM));
    }

    // Testing running Carrier when handling HQ operations.
    @Test
    public void testRunCarrierHandlingHQOperations() throws GameActionException, NoSuchFieldException, IllegalAccessException {
        CarrierRobotController rc = new CarrierRobotController();
        Carrier carrier = new Carrier();
        // Create fields for private globals.
        Field designatedElixirWellField = Carrier.class.getDeclaredField("designatedElixirWell");
        Field designatedWellTypeField = Carrier.class.getDeclaredField("designatedWellType");
        Field islandLocationField = Carrier.class.getDeclaredField("islandLocation");
        Field collectingAnchorField = Carrier.class.getDeclaredField("collectingAnchor");
        Field elixirDepositHistoryField = Carrier.class.getDeclaredField("elixirDepositHistory");

        // Set accessible to true.
        designatedElixirWellField.setAccessible(true);
        designatedWellTypeField.setAccessible(true);
        islandLocationField.setAccessible(true);
        collectingAnchorField.setAccessible(true);
        elixirDepositHistoryField.setAccessible(true);

        // Set fields for test
        designatedElixirWellField.set(carrier, new MapLocation(1, 1));
        designatedWellTypeField.set(carrier, 2);
        islandLocationField.set(carrier, new MapLocation(1, 1));
        collectingAnchorField.set(carrier, null);
        elixirDepositHistoryField.set(carrier, 40);

        // Set other parameters for testing
        rc.setCanPlaceAnchor(false);
        rc.setCanTakeAnchor(false);
        rc.setCanCollectResource(false);
        rc.setCanDepositResource(true);
        rc.setResourceAmount(ResourceType.ADAMANTIUM, 40);
        rc.setLocation(new MapLocation(0, 0));
        int[] initialArray = new int[] {
                80, 0, 0, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                80, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 500
        };
        rc.setSharedArray(initialArray);

        // Run test
        assertEquals(40, rc.getResourceAmount(ResourceType.ADAMANTIUM));
        assertEquals(40, elixirDepositHistoryField.get(carrier));
        carrier.runCarrier(rc);
        assertEquals(0, rc.getResourceAmount(ResourceType.ADAMANTIUM));
        assertEquals(0, elixirDepositHistoryField.get(carrier));
    }

    // Testing handling of HQ operations, weight not zero.
    @Test
    public void testHandleHQOperationsWeightNotZero() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(0, 0));
        rc.setCanDepositResource(false);
        rc.setResourceAmount(ResourceType.NO_RESOURCE, 39);
        Carrier.handleHQOperations(rc, new MapLocation(1, 1));
        assertEquals(39, rc.getWeight());
    }

    // Testing handling of HQ operations, weight zero.
    @Test
    public void testHandleHQOperationsWeightZero() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(0, 0));
        rc.setResourceAmount(ResourceType.ADAMANTIUM, 13);
        rc.setResourceAmount(ResourceType.MANA, 13);
        rc.setResourceAmount(ResourceType.ELIXIR, 13);
        Carrier.handleHQOperations(rc, new MapLocation(1, 1));
        assertEquals(0, rc.getWeight());
    }

    // Testing handling of Elixir creation, depositing correct amount.
    @Test
    public void testHandleElixirCreation() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(1, 1));
        rc.setResourceAmount(ResourceType.ADAMANTIUM, 40);
        rc.setResourceAmount(ResourceType.MANA, 25);

        assertEquals(25, rc.getResourceAmount(ResourceType.MANA));
        Carrier.handleElixirCreation(rc, new MapLocation(1, 1), 1);
        assertEquals(0, rc.getResourceAmount(ResourceType.MANA));

        assertEquals(40, rc.getResourceAmount(ResourceType.ADAMANTIUM));
        Carrier.handleElixirCreation(rc, new MapLocation(1, 1), 2);
        assertEquals(0, rc.getResourceAmount(ResourceType.ADAMANTIUM));
    }

    // Testing handling of resource collection, no well, explore.
    @Test
    public void testHandleResourceCollectionNoWellExplore() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(2, 2));
        Carrier.handleResourceCollection(rc, rc.getLocation(), null);
        assertEquals(new MapLocation(1, 1), rc.getLocation());
        Movement.resetGlobals();
    }

    // Testing handling of resource collection, can.
    @Test
    public void testHandleResourceCollection() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(1, 1));
        Carrier.handleResourceCollection(rc, rc.getLocation(), new MapLocation(1, 1));
        assertEquals(40, rc.getResourceAmount(ResourceType.NO_RESOURCE));
    }

    // Testing handling of anchor, exploring when no island.
    @Test
    public void testHandleAnchorExplore() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(2, 2));
        Carrier.handleAnchor(rc, rc.getLocation(), null);
        assertEquals(new MapLocation(1, 1), rc.getLocation());
        Movement.resetGlobals();
    }

    // Testing handling of anchor, cannot place anchor.
    @Test
    public void testHandleAnchorCannotPlaceAnchor() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(1, 1));
        rc.setCanPlaceAnchor(false);
        Carrier.handleAnchor(rc, rc.getLocation(), new MapLocation(1, 1));
        assertFalse(rc.didPlaceAnchor());
    }

    // Testing handling of anchor, can place anchor.
    @Test
    public void testHandleAnchorCanPlaceAnchor() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(1, 1));
        Carrier.handleAnchor(rc, rc.getLocation(), new MapLocation(1, 1));
        assertTrue(rc.didPlaceAnchor());
    }

    // Testing locating a designated Elixir well cannot.
    @Test
    public void testLocateDesignatedElixirWellCannot() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        int[] initialArray = new int[] {
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0
        };
        rc.setSharedArray(initialArray);
        Carrier.locateDesignatedElixirWell(rc);
        assertNull(Communication.findPotentialElixirWell(rc));
        assertNull(rc.getIndicator());
    }

    // Testing locating a designated Elixir well can.
    @Test
    public void testLocateDesignatedElixirWell() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        int[] initialArray = new int[] {
                0, 0, 0, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0
        };
        rc.setSharedArray(initialArray);
        Carrier.locateDesignatedElixirWell(rc);
        assertArrayEquals(new int[] {1, 1, 1}, Communication.findPotentialElixirWell(rc));
        assertEquals(rc.getIndicator(), "Future Elixir well located.");
    }

    // Testing conquer island if cannot.
    @Test
    public void testConquerIslandCannot() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(1, 1));
        rc.setIslandLocation(new MapLocation(1, 1));
        rc.setCanPlaceAnchor(false);
        assertFalse(Carrier.conquerIsland(rc, rc.getLocation(), rc.getIslandLocation()));
        assertFalse(rc.didPlaceAnchor());
    }

    // Testing conquer island, must move first.
    @Test
    public void testConquerIslandMoveFirst() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(0, 0));
        rc.setIslandLocation(new MapLocation(1, 1));
        assertTrue(Carrier.conquerIsland(rc, rc.getLocation(), rc.getIslandLocation()));
        assertTrue(rc.didPlaceAnchor());
        assertEquals(rc.getIndicator(), "Huzzah, placed anchor!");
    }

    // Testing conquer island, does not need to move.
    @Test
    public void testConquerIsland() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(0, 0));
        rc.setIslandLocation(new MapLocation(0, 0));
        assertTrue(Carrier.conquerIsland(rc, rc.getLocation(), rc.getIslandLocation()));
        assertTrue(rc.didPlaceAnchor());
        assertEquals(rc.getIndicator(), "Huzzah, placed anchor!");
    }

    // Testing building elixir well with wrong well type.
    @Test
    public void testBuildElixirWellWrongWellType() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        assertEquals(0, Carrier.buildElixirWell(rc, new MapLocation(1, 1), 3));
    }

    // Testing building elixir well cannot.
    @Test
    public void testBuildElixirWellCannot() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setResourceAmount(ResourceType.MANA, 0);
        rc.setResourceAmount(ResourceType.ADAMANTIUM, 0);
        assertEquals(0, Carrier.buildElixirWell(rc, new MapLocation(1, 1), 1));
        assertEquals(0, Carrier.buildElixirWell(rc, new MapLocation(1, 1), 2));
    }

    // Testing building elixir can.
    @Test
    public void testBuildElixirWellCan() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setResourceAmount(ResourceType.MANA, 25);
        rc.setResourceAmount(ResourceType.ADAMANTIUM, 30);
        assertEquals(25, Carrier.buildElixirWell(rc, new MapLocation(1, 1), 1));
        assertEquals(30, Carrier.buildElixirWell(rc, new MapLocation(1, 1), 2));
    }

    // Testing cannot build Elixir well.
    @Test
    public void testCanBuildElixirWellNot() {
        CarrierRobotController rc = new CarrierRobotController();
        assertFalse(Carrier.canBuildElixirWell(rc, 1));
        assertFalse(Carrier.canBuildElixirWell(rc, 2));
        assertFalse(Carrier.canBuildElixirWell(rc, 3));
    }

    // Testing can build Elixir well.
    @Test
    public void testCanBuildElixirWell() {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setResourceAmount(ResourceType.ADAMANTIUM, 40);
        // Well type 2 represents mana (opposite type)
        assertTrue(Carrier.canBuildElixirWell(rc, 2));
        rc.setResourceAmount(ResourceType.ADAMANTIUM, 0);
        rc.setResourceAmount(ResourceType.MANA, 40);
        // Well type 1 represents adamantium (opposite type)
        assertTrue(Carrier.canBuildElixirWell(rc, 1));
    }

    // Testing deposit resource but amount too low.
    @Test
    public void testDepositResourceAmountZero() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setResourceAmount(ResourceType.NO_RESOURCE, 40);
        assertFalse(Carrier.depositResource(rc, new MapLocation(1, 1), ResourceType.ADAMANTIUM, 0));
        assertEquals(rc.getResourceAmount(ResourceType.NO_RESOURCE), 40);
    }

    // Testing deposit resource cannot transfer.
    @Test
    public void testDepositResourceCannot() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setCanDepositResource(false);
        rc.setResourceAmount(ResourceType.NO_RESOURCE, 40);
        assertFalse(Carrier.depositResource(rc, new MapLocation(1, 1), ResourceType.ADAMANTIUM, 40));
        assertEquals(rc.getResourceAmount(ResourceType.NO_RESOURCE), 40);
    }

    // Testing deposit resource can transfer.
    @Test
    public void testDepositResourceCan() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setResourceAmount(ResourceType.NO_RESOURCE, 40);
        assertTrue(Carrier.depositResource(rc, new MapLocation(1, 1), ResourceType.NO_RESOURCE, 40));
        assertEquals(rc.getResourceAmount(ResourceType.NO_RESOURCE), 0);
    }

    // Testing collecting from anywhere (just uses collectFromWell method on a loop)
    @Test
    public void testCollectFromAnywhere() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setLocation(new MapLocation(1, 1));
        Carrier.collectFromAnywhere(rc, rc.getLocation());
        // Collecting from all direction and current location (9 * 40)
        assertEquals(rc.getResourceAmount(ResourceType.NO_RESOURCE), 360);
    }

    // Testing can collect from well.
    @Test
    public void testCollectFromWell() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        Carrier.collectFromWell(rc, new MapLocation(0, 0), 1);
        assertEquals(rc.getResourceAmount(ResourceType.NO_RESOURCE), 1);
    }

    // Testing cannot collect from well.
    @Test
    public void testCollectFromWellCannot() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setCanCollectResource(false);
        Carrier.collectFromWell(rc, new MapLocation(0, 0), 1);
        assertEquals(rc.getResourceAmount(ResourceType.NO_RESOURCE), 0);
    }

    // Testing can collect STANDARD anchor.
    @Test
    public void testCollectAnchorSTANDARD() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setCanTakeAnchor(Anchor.STANDARD);
        Carrier.collectAnchor(rc, new MapLocation(0, 0));
        assertEquals(Anchor.STANDARD, rc.getAnchor());
    }

    // Testing can collect ACCELERATING anchor.
    @Test
    public void testCollectAnchorACCELERATING() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setCanTakeAnchor(Anchor.ACCELERATING);
        Carrier.collectAnchor(rc, new MapLocation(0, 0));
        assertEquals(Anchor.ACCELERATING, rc.getAnchor());
    }

    // Testing cannot collect anchor.
    @Test
    public void testCollectAnchorCannot() throws GameActionException {
        CarrierRobotController rc = new CarrierRobotController();
        rc.setCanTakeAnchor(false);
        Carrier.collectAnchor(rc, new MapLocation(0, 0));
        assertNull(rc.getAnchor());
    }
}

 /**
 * Implements a simple mock RobotController for testing Carrier related functionality.
 **/
class CarrierRobotController implements RobotController {
    private boolean canTakeAnchorResult = true;
    private boolean canCollectResourceResult = true;
    private boolean canDepositResourceResult = true;
    private boolean canPlaceAnchorResult = true;
    private boolean anchorPlaced = false;
    private int resourceAmount = 0;
    private int adamantiumAmount = 0;
    private int manaAmount = 0;
    private int elixirAmount = 0;
    private Anchor anchorType;
    private MapLocation currentLocation;
    private MapLocation islandLocation;
    private String indicator;
     // Create a sharedArray of 64 integers.
     int[] sharedArray = new int[] {
             0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0
     };

    public void setLocation(MapLocation location) {
        currentLocation = location;
    }

    public void setIslandLocation(MapLocation location) {
        islandLocation = location;
    }

     public void setSharedArray(int[] sharedArrayResult) {
         sharedArray = sharedArrayResult.clone();
     }

    public MapLocation getIslandLocation() {
        return islandLocation;
    }

    public String getIndicator() {
        return indicator;
    }

     public void setCanCollectResource(boolean result) {
         canCollectResourceResult = result;
     }

     public void setCanPlaceAnchor(boolean result) {
        canPlaceAnchorResult = result;
     }

     public boolean didPlaceAnchor() {
        return anchorPlaced;
     }

     public void setResourceAmount(ResourceType rType, int amount) {
        switch (rType) {
            case ADAMANTIUM:
                adamantiumAmount = amount;
                break;
            case MANA:
                manaAmount = amount;
                break;
            case ELIXIR:
                elixirAmount = amount;
                break;
            default:
                resourceAmount = amount;
                break;
        }
     }

     public void setCanDepositResource(boolean result) {
         canDepositResourceResult = result;
     }

     public void setCanTakeAnchor(boolean result) {
        canTakeAnchorResult = result;
    }

    public void setCanTakeAnchor(Anchor type) {
        anchorType = type;
    }

    @Override
    public int getRoundNum() {
        return 0;
    }

    @Override
    public int getMapWidth() {
        return 3;
    }

    @Override
    public int getMapHeight() {
        return 3;
    }

    @Override
    public int getIslandCount() {
        return 0;
    }

    @Override
    public int getRobotCount() {
        return 0;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public Team getTeam() {
        return null;
    }

    @Override
    public RobotType getType() {
        return null;
    }

    @Override
    public MapLocation getLocation() {
        return currentLocation;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getResourceAmount(ResourceType rType) {
        switch (rType) {
            case ADAMANTIUM:
                return adamantiumAmount;
            case MANA:
                return manaAmount;
            case ELIXIR:
                return elixirAmount;
            default:
                return resourceAmount;
        }
    }

    @Override
    public Anchor getAnchor() throws GameActionException {
        return anchorType;
    }

    @Override
    public int getNumAnchors(Anchor anchorType) {
        return 0;
    }

    @Override
    public int getWeight() {
        return resourceAmount == 0 ? adamantiumAmount + manaAmount + elixirAmount : resourceAmount;
    }

    @Override
    public boolean onTheMap(MapLocation loc) {
        return false;
    }

    @Override
    public boolean canSenseLocation(MapLocation loc) {
        return false;
    }

    @Override
    public boolean canActLocation(MapLocation loc) {
        return false;
    }

    @Override
    public boolean isLocationOccupied(MapLocation loc) throws GameActionException {
        return false;
    }

    @Override
    public boolean canSenseRobotAtLocation(MapLocation loc) {
        return false;
    }

    @Override
    public RobotInfo senseRobotAtLocation(MapLocation loc) throws GameActionException {
        return null;
    }

    @Override
    public boolean canSenseRobot(int id) {
        return false;
    }

    @Override
    public RobotInfo senseRobot(int id) throws GameActionException {
        return null;
    }

    @Override
    public RobotInfo[] senseNearbyRobots() {
        return new RobotInfo[0];
    }

    @Override
    public RobotInfo[] senseNearbyRobots(int radiusSquared) throws GameActionException {
        return new RobotInfo[0];
    }

    @Override
    public RobotInfo[] senseNearbyRobots(int radiusSquared, Team team) throws GameActionException {
        return new RobotInfo[0];
    }

    @Override
    public RobotInfo[] senseNearbyRobots(MapLocation center, int radiusSquared, Team team) throws GameActionException {
        return new RobotInfo[0];
    }

    @Override
    public boolean sensePassability(MapLocation loc) throws GameActionException {
        return false;
    }

    @Override
    public int senseIsland(MapLocation loc) throws GameActionException {
        return 0;
    }

    @Override
    public int[] senseNearbyIslands() {
        return new int[0];
    }

    @Override
    public MapLocation[] senseNearbyIslandLocations(int idx) throws GameActionException {
        return new MapLocation[0];
    }

    @Override
    public MapLocation[] senseNearbyIslandLocations(int radiusSquared, int idx) throws GameActionException {
        return new MapLocation[0];
    }

    @Override
    public MapLocation[] senseNearbyIslandLocations(MapLocation center, int radiusSquared, int idx) throws GameActionException {
        return new MapLocation[0];
    }

    @Override
    public Team senseTeamOccupyingIsland(int islandIdx) throws GameActionException {
        return null;
    }

    @Override
    public int senseAnchorPlantedHealth(int islandIdx) throws GameActionException {
        return 0;
    }

    @Override
    public Anchor senseAnchor(int islandIdx) throws GameActionException {
        return null;
    }

    @Override
    public boolean senseCloud(MapLocation loc) throws GameActionException {
        return false;
    }

    @Override
    public MapLocation[] senseNearbyCloudLocations() {
        return new MapLocation[0];
    }

    @Override
    public MapLocation[] senseNearbyCloudLocations(int radiusSquared) throws GameActionException {
        return new MapLocation[0];
    }

    @Override
    public MapLocation[] senseNearbyCloudLocations(MapLocation center, int radiusSquared) throws GameActionException {
        return new MapLocation[0];
    }

    @Override
    public WellInfo senseWell(MapLocation loc) throws GameActionException {
        return null;
    }

    @Override
    public WellInfo[] senseNearbyWells() {
        return new WellInfo[0];
    }

    @Override
    public WellInfo[] senseNearbyWells(int radiusSquared) throws GameActionException {
        return new WellInfo[0];
    }

    @Override
    public WellInfo[] senseNearbyWells(MapLocation center, int radiusSquared) throws GameActionException {
        return new WellInfo[0];
    }

    @Override
    public WellInfo[] senseNearbyWells(ResourceType resourceType) {
        return new WellInfo[0];
    }

    @Override
    public WellInfo[] senseNearbyWells(int radiusSquared, ResourceType resourceType) throws GameActionException {
        return new WellInfo[0];
    }

    @Override
    public WellInfo[] senseNearbyWells(MapLocation center, int radiusSquared, ResourceType resourceType) throws GameActionException {
        return new WellInfo[0];
    }

    @Override
    public MapInfo senseMapInfo(MapLocation loc) throws GameActionException {
        return null;
    }

    @Override
    public MapInfo[] senseNearbyMapInfos() {
        return new MapInfo[0];
    }

    @Override
    public MapInfo[] senseNearbyMapInfos(int radiusSquared) throws GameActionException {
        return new MapInfo[0];
    }

    @Override
    public MapInfo[] senseNearbyMapInfos(MapLocation center) throws GameActionException {
        return new MapInfo[0];
    }

    @Override
    public MapInfo[] senseNearbyMapInfos(MapLocation center, int radiusSquared) throws GameActionException {
        return new MapInfo[0];
    }

    @Override
    public MapLocation adjacentLocation(Direction dir) {
        return null;
    }

    @Override
    public MapLocation[] getAllLocationsWithinRadiusSquared(MapLocation center, int radiusSquared) throws GameActionException {
        return new MapLocation[0];
    }

    @Override
    public boolean isActionReady() {
        return false;
    }

    @Override
    public int getActionCooldownTurns() {
        return 0;
    }

    @Override
    public boolean isMovementReady() {
        return true;
    }

    @Override
    public int getMovementCooldownTurns() {
        return 0;
    }

    @Override
    public boolean canMove(Direction dir) {
        return true;
    }

    @Override
    public void move(Direction dir) throws GameActionException {
        currentLocation = currentLocation.add(dir);
    }

    @Override
    public boolean canBuildRobot(RobotType type, MapLocation loc) {
        return false;
    }

    @Override
    public void buildRobot(RobotType type, MapLocation loc) throws GameActionException {

    }

    @Override
    public boolean canAttack(MapLocation loc) {
        return false;
    }

    @Override
    public void attack(MapLocation loc) throws GameActionException {

    }

    @Override
    public boolean canBoost() {
        return false;
    }

    @Override
    public void boost() throws GameActionException {

    }

    @Override
    public boolean canDestabilize(MapLocation loc) {
        return false;
    }

    @Override
    public void destabilize(MapLocation loc) throws GameActionException {

    }

    @Override
    public boolean canCollectResource(MapLocation loc, int amount) {
        return canCollectResourceResult;
    }

    @Override
    public void collectResource(MapLocation loc, int amount) throws GameActionException {
         if (amount == -1) {
             // Fill up on resources.
             resourceAmount += 40;
         }
         else {
             resourceAmount += amount;
         }
    }

    @Override
    public boolean canTransferResource(MapLocation loc, ResourceType rType, int amount) {
        return canDepositResourceResult;
    }

    @Override
    public void transferResource(MapLocation loc, ResourceType rType, int amount) throws GameActionException {
        switch (rType) {
            case ADAMANTIUM:
                adamantiumAmount -= amount;
                break;
            case MANA:
                manaAmount -= amount;
                break;
            case ELIXIR:
                elixirAmount -= amount;
                break;
            default:
                resourceAmount -= amount;
                break;
        }
    }

    @Override
    public boolean canBuildAnchor(Anchor anchor) {
        return false;
    }

    @Override
    public void buildAnchor(Anchor anchor) throws GameActionException {

    }

    @Override
    public boolean canTakeAnchor(MapLocation loc, Anchor anchorType) {
        if (canTakeAnchorResult) {
            return anchorType == this.anchorType;
        }
        return false;
    }

    @Override
    public void takeAnchor(MapLocation loc, Anchor anchorType) throws GameActionException {
        this.anchorType = anchorType;
    }

    @Override
    public boolean canReturnAnchor(MapLocation loc) {
        return false;
    }

    @Override
    public void returnAnchor(MapLocation loc) throws GameActionException {

    }

    @Override
    public boolean canPlaceAnchor() {
        return canPlaceAnchorResult;
    }

    @Override
    public void placeAnchor() throws GameActionException {
        anchorPlaced = true;
    }

    @Override
    public int readSharedArray(int index) throws GameActionException {
        return sharedArray[index];
    }

    @Override
    public boolean canWriteSharedArray(int index, int value) {
        return true;
    }

    @Override
    public void writeSharedArray(int index, int value) throws GameActionException {

    }

    @Override
    public void disintegrate() {

    }

    @Override
    public void resign() {

    }

    @Override
    public void setIndicatorString(String string) {
        indicator = string;
    }

    @Override
    public void setIndicatorDot(MapLocation loc, int red, int green, int blue) {

    }

    @Override
    public void setIndicatorLine(MapLocation startLoc, MapLocation endLoc, int red, int green, int blue) {

    }
}