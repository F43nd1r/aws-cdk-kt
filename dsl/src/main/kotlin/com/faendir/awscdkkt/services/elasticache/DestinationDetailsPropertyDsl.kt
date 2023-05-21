package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@Generated
public
    fun destinationDetailsProperty(initializer: CfnReplicationGroup.DestinationDetailsProperty.Builder.() -> Unit
    = {}): CfnReplicationGroup.DestinationDetailsProperty =
    CfnReplicationGroup.DestinationDetailsProperty.builder().apply(initializer).build()
