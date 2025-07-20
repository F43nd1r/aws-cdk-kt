package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.JournaldLogDriver

@Generated
public fun buildJournaldLogDriver(initializer: @AwsCdkDsl JournaldLogDriver.Builder.() -> Unit = {}): JournaldLogDriver = JournaldLogDriver.Builder.create().apply(initializer).build()
