package org.testng.remote.support;

import org.osgi.framework.VersionRange;
import org.testng.remote.AbstractRemoteTestNGFactory;
import org.testng.remote.IRemoteTestNG;

import com.google.auto.service.AutoService;

@AutoService(RemoteTestNGFactory.class)
public class RemoteTestNGFactory6_9_10 extends AbstractRemoteTestNGFactory {

  private static final VersionRange RANGE = new VersionRange("6.9.10");

  @Override
  public IRemoteTestNG createRemoteTestNG() {
    return new RemoteTestNG6_9_10();
  }

  @Override
  protected VersionRange getAcceptableVersions() {
    return RANGE;
  }
}
