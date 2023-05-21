package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.OperationsMetricOptions

@Generated
public fun operationsMetricOptions(initializer: OperationsMetricOptions.Builder.() -> Unit = {}):
    OperationsMetricOptions = OperationsMetricOptions.builder().apply(initializer).build()
