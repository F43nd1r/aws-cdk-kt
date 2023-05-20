@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.OperationsMetricOptions

public fun operationsMetricOptions(initializer: OperationsMetricOptions.Builder.() -> Unit):
    OperationsMetricOptions = OperationsMetricOptions.builder().apply(initializer).build()
