package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun buildStreamSpecificationProperty(initializer: @AwsCdkDsl
    CfnTable.StreamSpecificationProperty.Builder.() -> Unit = {}):
    CfnTable.StreamSpecificationProperty =
    CfnTable.StreamSpecificationProperty.Builder().apply(initializer).build()
