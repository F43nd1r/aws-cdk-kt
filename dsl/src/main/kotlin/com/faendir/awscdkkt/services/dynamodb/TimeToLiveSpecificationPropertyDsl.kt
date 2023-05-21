package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun timeToLiveSpecificationProperty(initializer: CfnTable.TimeToLiveSpecificationProperty.Builder.() -> Unit
    = {}): CfnTable.TimeToLiveSpecificationProperty =
    CfnTable.TimeToLiveSpecificationProperty.builder().apply(initializer).build()
