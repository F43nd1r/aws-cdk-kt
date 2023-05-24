package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AutoScalingOptions

@Generated
public fun buildAutoScalingOptions(initializer: @AwsCdkDsl AutoScalingOptions.Builder.() -> Unit):
    AutoScalingOptions = AutoScalingOptions.Builder().apply(initializer).build()
