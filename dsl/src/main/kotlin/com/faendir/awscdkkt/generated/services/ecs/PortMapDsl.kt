package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.PortMap
import software.amazon.awscdk.services.ecs.PortMapping

@Generated
public fun portMap(networkmode: NetworkMode, pm: PortMapping): PortMap = PortMap(networkmode, pm)

@Generated
public fun buildPortMap(networkmode: NetworkMode, initializer: @AwsCdkDsl
    PortMap.Builder.() -> Unit): PortMap =
    PortMap.Builder.create(networkmode).apply(initializer).build()
