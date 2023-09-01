package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.OperationsMetricOptions

@Generated
public fun buildOperationsMetricOptions(initializer: @AwsCdkDsl
    OperationsMetricOptions.Builder.() -> Unit = {}): OperationsMetricOptions =
    OperationsMetricOptions.Builder().apply(initializer).build()
