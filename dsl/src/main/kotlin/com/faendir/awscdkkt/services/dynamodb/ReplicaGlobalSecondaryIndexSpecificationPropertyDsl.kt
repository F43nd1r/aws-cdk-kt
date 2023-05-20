@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

public
    fun replicaGlobalSecondaryIndexSpecificationProperty(initializer: CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.Builder.() -> Unit):
    CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty =
    CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.builder().apply(initializer).build()
