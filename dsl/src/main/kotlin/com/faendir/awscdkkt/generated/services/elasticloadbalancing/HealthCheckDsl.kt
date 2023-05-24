package com.faendir.awscdkkt.generated.services.elasticloadbalancing

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck

@Generated
public fun buildHealthCheck(initializer: @AwsCdkDsl HealthCheck.Builder.() -> Unit): HealthCheck =
    HealthCheck.Builder().apply(initializer).build()
