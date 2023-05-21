package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public
    fun replicaSSESpecificationProperty(initializer: CfnGlobalTable.ReplicaSSESpecificationProperty.Builder.() -> Unit
    = {}): CfnGlobalTable.ReplicaSSESpecificationProperty =
    CfnGlobalTable.ReplicaSSESpecificationProperty.builder().apply(initializer).build()
