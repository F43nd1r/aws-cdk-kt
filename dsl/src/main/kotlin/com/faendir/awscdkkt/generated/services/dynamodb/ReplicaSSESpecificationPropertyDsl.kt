package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public fun buildReplicaSSESpecificationProperty(initializer: @AwsCdkDsl
    CfnGlobalTable.ReplicaSSESpecificationProperty.Builder.() -> Unit = {}):
    CfnGlobalTable.ReplicaSSESpecificationProperty =
    CfnGlobalTable.ReplicaSSESpecificationProperty.Builder().apply(initializer).build()
