@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

public
    fun timeToLiveSpecificationProperty(initializer: CfnTable.TimeToLiveSpecificationProperty.Builder.() -> Unit):
    CfnTable.TimeToLiveSpecificationProperty =
    CfnTable.TimeToLiveSpecificationProperty.builder().apply(initializer).build()
