package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FluentdLogDriver

@Generated
public fun buildFluentdLogDriver(initializer: @AwsCdkDsl FluentdLogDriver.Builder.() -> Unit = {}): FluentdLogDriver = FluentdLogDriver.Builder.create().apply(initializer).build()
