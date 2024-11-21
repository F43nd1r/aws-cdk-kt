package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.ThrottlePolicy

@Generated
public fun buildThrottlePolicy(initializer: @AwsCdkDsl ThrottlePolicy.Builder.() -> Unit = {}):
    ThrottlePolicy = ThrottlePolicy.Builder().apply(initializer).build()
