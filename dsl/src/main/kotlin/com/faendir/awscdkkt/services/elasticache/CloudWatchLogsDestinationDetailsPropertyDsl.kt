@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

public
    fun cloudWatchLogsDestinationDetailsProperty(initializer: CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit):
    CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty =
    CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.builder().apply(initializer).build()
