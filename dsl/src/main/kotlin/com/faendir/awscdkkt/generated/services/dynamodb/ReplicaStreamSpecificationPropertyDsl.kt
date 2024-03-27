package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public fun buildReplicaStreamSpecificationProperty(initializer: @AwsCdkDsl
    CfnGlobalTable.ReplicaStreamSpecificationProperty.Builder.() -> Unit = {}):
    CfnGlobalTable.ReplicaStreamSpecificationProperty =
    CfnGlobalTable.ReplicaStreamSpecificationProperty.Builder().apply(initializer).build()
