package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.RetryPolicy

@Generated
public fun buildRetryPolicy(initializer: @AwsCdkDsl RetryPolicy.Builder.() -> Unit = {}): RetryPolicy = RetryPolicy.Builder().apply(initializer).build()
