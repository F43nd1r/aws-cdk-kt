package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@Generated
public
    fun replicationDestinationProperty(initializer: CfnReplicationConfiguration.ReplicationDestinationProperty.Builder.() -> Unit
    = {}): CfnReplicationConfiguration.ReplicationDestinationProperty =
    CfnReplicationConfiguration.ReplicationDestinationProperty.builder().apply(initializer).build()
