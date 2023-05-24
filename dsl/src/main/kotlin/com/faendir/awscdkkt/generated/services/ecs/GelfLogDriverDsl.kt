package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.GelfLogDriver

@Generated
public fun buildGelfLogDriver(initializer: @AwsCdkDsl GelfLogDriver.Builder.() -> Unit):
    GelfLogDriver = GelfLogDriver.Builder.create().apply(initializer).build()
