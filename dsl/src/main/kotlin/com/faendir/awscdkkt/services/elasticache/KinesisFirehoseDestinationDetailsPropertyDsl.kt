package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@Generated
public
    fun kinesisFirehoseDestinationDetailsProperty(initializer: CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit
    = {}): CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty =
    CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.builder().apply(initializer).build()
