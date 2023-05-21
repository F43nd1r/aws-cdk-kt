package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public
    fun replicaGlobalSecondaryIndexSpecificationProperty(initializer: CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.Builder.() -> Unit
    = {}): CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty =
    CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.builder().apply(initializer).build()
