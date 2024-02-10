package com.faendir.awscdkkt.generated.services.cassandra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public fun buildReplicaSpecificationProperty(initializer: @AwsCdkDsl
    CfnTable.ReplicaSpecificationProperty.Builder.() -> Unit = {}):
    CfnTable.ReplicaSpecificationProperty =
    CfnTable.ReplicaSpecificationProperty.Builder().apply(initializer).build()
