package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun buildSSESpecificationProperty(initializer: @AwsCdkDsl
    CfnTable.SSESpecificationProperty.Builder.() -> Unit): CfnTable.SSESpecificationProperty =
    CfnTable.SSESpecificationProperty.Builder().apply(initializer).build()
