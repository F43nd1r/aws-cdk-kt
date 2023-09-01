package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun buildPointInTimeRecoverySpecificationProperty(initializer: @AwsCdkDsl
    CfnTable.PointInTimeRecoverySpecificationProperty.Builder.() -> Unit = {}):
    CfnTable.PointInTimeRecoverySpecificationProperty =
    CfnTable.PointInTimeRecoverySpecificationProperty.Builder().apply(initializer).build()
