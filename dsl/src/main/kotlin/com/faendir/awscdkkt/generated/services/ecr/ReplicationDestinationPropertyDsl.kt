package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@Generated
public fun buildReplicationDestinationProperty(initializer: @AwsCdkDsl
    CfnReplicationConfiguration.ReplicationDestinationProperty.Builder.() -> Unit = {}):
    CfnReplicationConfiguration.ReplicationDestinationProperty =
    CfnReplicationConfiguration.ReplicationDestinationProperty.Builder().apply(initializer).build()
