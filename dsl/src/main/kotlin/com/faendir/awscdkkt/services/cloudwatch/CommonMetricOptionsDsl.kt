package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CommonMetricOptions

@Generated
public fun commonMetricOptions(initializer: CommonMetricOptions.Builder.() -> Unit = {}):
    CommonMetricOptions = CommonMetricOptions.builder().apply(initializer).build()
