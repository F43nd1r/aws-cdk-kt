@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

public
    fun replicaGlobalSecondaryIndexSpecificationProperty(initializer: CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.Builder.() -> Unit):
    CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty =
    CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.builder().apply(initializer).build()
