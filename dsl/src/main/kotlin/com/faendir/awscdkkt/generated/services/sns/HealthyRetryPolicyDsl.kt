package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.HealthyRetryPolicy

@Generated
public fun buildHealthyRetryPolicy(initializer: @AwsCdkDsl HealthyRetryPolicy.Builder.() -> Unit =
    {}): HealthyRetryPolicy = HealthyRetryPolicy.Builder().apply(initializer).build()
