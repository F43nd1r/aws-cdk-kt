package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ServiceConnectTlsConfiguration

@Generated
public fun buildServiceConnectTlsConfiguration(initializer: @AwsCdkDsl
    ServiceConnectTlsConfiguration.Builder.() -> Unit = {}): ServiceConnectTlsConfiguration =
    ServiceConnectTlsConfiguration.Builder().apply(initializer).build()
