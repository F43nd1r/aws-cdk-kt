@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

public
    fun pointInTimeRecoverySpecificationProperty(initializer: CfnTable.PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
    CfnTable.PointInTimeRecoverySpecificationProperty =
    CfnTable.PointInTimeRecoverySpecificationProperty.builder().apply(initializer).build()
