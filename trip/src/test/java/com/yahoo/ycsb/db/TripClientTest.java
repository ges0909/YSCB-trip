package com.yahoo.ycsb.db;

import com.yahoo.ycsb.DBException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TripClientTest {

  private static TripClient tripClient;

  @BeforeClass
  public static void setUp() {
    tripClient = new TripClient();
  }

  @AfterClass
  public static void tearDown() throws DBException {
    tripClient.cleanup();
  }

  @Test
  public void establishTripSession() throws DBException {
    tripClient.init();
  }
}
