package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.ServiceConnect

@Generated
public fun buildServiceConnect(networkmode: NetworkMode, initializer: @AwsCdkDsl
    ServiceConnect.Builder.() -> Unit = {}): ServiceConnect =
    ServiceConnect.Builder.create(networkmode).apply(initializer).build()
