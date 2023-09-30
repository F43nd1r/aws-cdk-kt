package com.faendir.awscdkkt.generated.services.efs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystem

@Generated
public fun buildReplicationDestinationProperty(initializer: @AwsCdkDsl
    CfnFileSystem.ReplicationDestinationProperty.Builder.() -> Unit = {}):
    CfnFileSystem.ReplicationDestinationProperty =
    CfnFileSystem.ReplicationDestinationProperty.Builder().apply(initializer).build()
