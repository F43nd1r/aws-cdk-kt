@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

public
    fun streamSpecificationProperty(initializer: CfnTable.StreamSpecificationProperty.Builder.() -> Unit):
    CfnTable.StreamSpecificationProperty =
    CfnTable.StreamSpecificationProperty.builder().apply(initializer).build()
