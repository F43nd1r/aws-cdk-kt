package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CommonMetricOptions

@Generated
public fun buildCommonMetricOptions(initializer: @AwsCdkDsl CommonMetricOptions.Builder.() -> Unit =
    {}): CommonMetricOptions = CommonMetricOptions.Builder().apply(initializer).build()
