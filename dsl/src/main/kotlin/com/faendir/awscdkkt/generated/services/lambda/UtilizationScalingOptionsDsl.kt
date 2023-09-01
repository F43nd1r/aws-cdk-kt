package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.UtilizationScalingOptions

@Generated
public fun buildUtilizationScalingOptions(initializer: @AwsCdkDsl
    UtilizationScalingOptions.Builder.() -> Unit = {}): UtilizationScalingOptions =
    UtilizationScalingOptions.Builder().apply(initializer).build()
