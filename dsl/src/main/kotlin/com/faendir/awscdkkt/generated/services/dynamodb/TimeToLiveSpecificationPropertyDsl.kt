package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun buildTimeToLiveSpecificationProperty(initializer: @AwsCdkDsl
    CfnTable.TimeToLiveSpecificationProperty.Builder.() -> Unit = {}):
    CfnTable.TimeToLiveSpecificationProperty =
    CfnTable.TimeToLiveSpecificationProperty.Builder().apply(initializer).build()
