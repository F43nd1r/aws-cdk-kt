package com.faendir.awscdkkt.generated.services.cassandra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnKeyspace

@Generated
public fun buildReplicationSpecificationProperty(initializer: @AwsCdkDsl
    CfnKeyspace.ReplicationSpecificationProperty.Builder.() -> Unit):
    CfnKeyspace.ReplicationSpecificationProperty =
    CfnKeyspace.ReplicationSpecificationProperty.Builder().apply(initializer).build()
