package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public fun buildReplicaSpecificationProperty(initializer: @AwsCdkDsl
    CfnGlobalTable.ReplicaSpecificationProperty.Builder.() -> Unit = {}):
    CfnGlobalTable.ReplicaSpecificationProperty =
    CfnGlobalTable.ReplicaSpecificationProperty.Builder().apply(initializer).build()
