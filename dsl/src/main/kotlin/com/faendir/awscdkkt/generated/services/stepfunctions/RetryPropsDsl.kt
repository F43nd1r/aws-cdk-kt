package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.RetryProps

@Generated
public fun buildRetryProps(initializer: @AwsCdkDsl RetryProps.Builder.() -> Unit = {}): RetryProps =
    RetryProps.Builder().apply(initializer).build()
