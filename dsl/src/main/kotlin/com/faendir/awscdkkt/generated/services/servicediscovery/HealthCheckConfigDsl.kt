package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig

@Generated
public fun buildHealthCheckConfig(initializer: @AwsCdkDsl HealthCheckConfig.Builder.() -> Unit):
    HealthCheckConfig = HealthCheckConfig.Builder().apply(initializer).build()
