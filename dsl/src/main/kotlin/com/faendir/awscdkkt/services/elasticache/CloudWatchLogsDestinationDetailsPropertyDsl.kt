package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@Generated
public
    fun cloudWatchLogsDestinationDetailsProperty(initializer: CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit
    = {}): CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty =
    CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.builder().apply(initializer).build()
