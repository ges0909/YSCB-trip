package com.yahoo.ycsb.db;

import com.tietoenator.trip.jxp.TdbException;
import com.tietoenator.trip.jxp.session.TdbSession;
import com.tietoenator.trip.jxp.session.TdbTripNetSession;
import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;
import com.yahoo.ycsb.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class TripClient extends DB {

  private static final Logger LOG = LoggerFactory.getLogger(TripClient.class);
  private TdbSession session;

  @Override
  public void init() throws DBException {
    super.init();
    Properties properties = super.getProperties();
    try {
      session = new TdbTripNetSession("infforgebln01", 23567, false);
      session.login("system", "admin");
    } catch (TdbException e) {
      LOG.error(e.getLocalizedMessage());
    }
    LOG.info("Session to TRIP established successfully.");
  }

  @Override
  public void cleanup() throws DBException {
    try {
      session.logout();
    } catch (TdbException e) {
      LOG.error(e.getLocalizedMessage());
    }
    super.cleanup();
    LOG.info("Session to TRIP closed.");
  }

  @Override
  public Status read(String table, String key, Set<String> fields, Map<String, ByteIterator> result) {
    return null;
  }

  @Override
  public Status scan(String table, String startkey, int recordcount, Set<String> fields, Vector<HashMap<String, ByteIterator>> result) {
    return null;
  }

  @Override
  public Status update(String table, String key, Map<String, ByteIterator> values) {
    return null;
  }

  @Override
  public Status insert(String table, String key, Map<String, ByteIterator> values) {
    return null;
  }

  @Override
  public Status delete(String table, String key) {
    return null;
  }
}
