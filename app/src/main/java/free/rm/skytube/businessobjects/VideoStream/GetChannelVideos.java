/*
 * SkyTube
 * Copyright (C) 2016  Ramon Mifsud
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation (version 3 of the License).
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package free.rm.skytube.businessobjects.VideoStream;

import java.io.IOException;

import free.rm.skytube.businessobjects.GetYouTubeVideoBySearch;

/**
 * Returns the videos of a channel.  The channel is specified by calling {@link #setQuery(String)}.
 */
public class GetChannelVideos extends GetYouTubeVideoBySearch {

	@Override
	public void init() throws IOException {
		super.init();
		videosList.setOrder("date");
	}


	/**
	 * Set the channel id.
	 *
	 * @param channelId	Channel ID.
	 */
	@Override
	public void setQuery(String channelId) {
		if (videosList != null)
			videosList.setChannelId(channelId);
	}

}
