package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun pointInTimeRecoverySpecificationProperty(initializer: CfnTable.PointInTimeRecoverySpecificationProperty.Builder.() -> Unit
    = {}): CfnTable.PointInTimeRecoverySpecificationProperty =
    CfnTable.PointInTimeRecoverySpecificationProperty.builder().apply(initializer).build()
