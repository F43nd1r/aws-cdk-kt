package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnReplicator

@Generated
public fun buildReplicationStartingPositionProperty(initializer: @AwsCdkDsl
    CfnReplicator.ReplicationStartingPositionProperty.Builder.() -> Unit = {}):
    CfnReplicator.ReplicationStartingPositionProperty =
    CfnReplicator.ReplicationStartingPositionProperty.Builder().apply(initializer).build()
