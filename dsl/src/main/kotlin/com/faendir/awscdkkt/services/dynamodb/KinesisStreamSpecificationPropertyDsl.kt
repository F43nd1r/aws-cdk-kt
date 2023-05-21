package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun kinesisStreamSpecificationProperty(initializer: CfnTable.KinesisStreamSpecificationProperty.Builder.() -> Unit
    = {}): CfnTable.KinesisStreamSpecificationProperty =
    CfnTable.KinesisStreamSpecificationProperty.builder().apply(initializer).build()
