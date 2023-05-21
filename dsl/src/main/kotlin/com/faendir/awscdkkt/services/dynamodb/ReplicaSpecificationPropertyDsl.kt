package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public
    fun replicaSpecificationProperty(initializer: CfnGlobalTable.ReplicaSpecificationProperty.Builder.() -> Unit
    = {}): CfnGlobalTable.ReplicaSpecificationProperty =
    CfnGlobalTable.ReplicaSpecificationProperty.builder().apply(initializer).build()
