package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun buildKinesisStreamSpecificationProperty(initializer: @AwsCdkDsl
    CfnTable.KinesisStreamSpecificationProperty.Builder.() -> Unit = {}):
    CfnTable.KinesisStreamSpecificationProperty =
    CfnTable.KinesisStreamSpecificationProperty.Builder().apply(initializer).build()
