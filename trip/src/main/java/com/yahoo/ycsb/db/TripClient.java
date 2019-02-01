package com.yahoo.ycsb.db;

import com.tietoenator.trip.jxp.TdbException;
import com.tietoenator.trip.jxp.database.TdbDatabaseDesign;
import com.tietoenator.trip.jxp.session.TdbSession;
import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.DBException;
import com.yahoo.ycsb.Status;

import java.util.*;

public class TripClient extends DB {

  @Override
  public void init() throws DBException {
    super.init();
    Properties properties = super.getProperties();
    // open trip connection to establish a session
    TdbSession session = SessionFactory.newInstance("**** Create Database ****", false);
    try {
      TdbDatabaseDesign db = new TdbDatabaseDesign(session);
    } catch (TdbException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void cleanup() throws DBException {
    // close trip connection
    super.cleanup();
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
