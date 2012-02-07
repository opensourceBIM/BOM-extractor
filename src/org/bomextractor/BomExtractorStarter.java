package org.bomextractor;

import org.bimserver.satellite.SatelliteServer;
import org.bimserver.satellite.activities.BomExtractor;
import org.bimserver.satellite.gui.SatelliteGui;

public class BomExtractorStarter {
	public static void main(String[] args) {
		new BomExtractorStarter().start();
	}

	private void start() {
		SatelliteServer satelliteServer = new SatelliteServer();
		satelliteServer.registerActivity(new BomExtractor());
		new SatelliteGui(satelliteServer);
	}
}
