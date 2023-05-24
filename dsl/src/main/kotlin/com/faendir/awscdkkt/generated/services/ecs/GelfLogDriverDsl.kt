package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.GelfLogDriver
import software.amazon.awscdk.services.ecs.GelfLogDriverProps

@Generated
public fun gelfLogDriver(props: GelfLogDriverProps): GelfLogDriver = GelfLogDriver(props)

@Generated
public fun buildGelfLogDriver(initializer: @AwsCdkDsl GelfLogDriver.Builder.() -> Unit):
    GelfLogDriver = GelfLogDriver.Builder.create().apply(initializer).build()
