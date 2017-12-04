/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.falcon.lifecycle.engine.oozie.archival;

import org.apache.falcon.FalconException;
import org.apache.falcon.entity.v0.cluster.Cluster;
import org.apache.falcon.entity.v0.feed.Feed;
import org.apache.falcon.lifecycle.PolicyBuilder;
import org.apache.falcon.lifecycle.archival.AgeBasedArchival;
import org.apache.hadoop.fs.Path;

import java.util.Properties;

public class AgeBasedArchivalBuilder implements PolicyBuilder {

    private static final String NAME = new AgeBasedArchival().getName();

    @Override
    public Properties build(Cluster cluster, Path buildPath, Feed feed) throws FalconException {
        Properties wfProps = buildWorkflow(cluster, buildPath, feed);
        return buildCoordinator(cluster, buildPath, feed, wfProps);
    }

    @Override
    public String getPolicyName() {
        return NAME;
    }

    public Properties buildCoordinator(Cluster cluster, Path buildPath, Feed feed, Properties wfProps)
            throws FalconException {
        return AgeBasedArchivalCoordinatorBuilder.build(cluster, buildPath, feed, wfProps);
    }

    public Properties buildWorkflow(Cluster cluster, Path buildPath, Feed feed) throws FalconException {
        return AgeBasedArchivalWorkflowBuilder.build(cluster, buildPath, feed);
    }
}