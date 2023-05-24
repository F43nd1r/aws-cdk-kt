package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.JournaldLogDriver
import software.amazon.awscdk.services.ecs.JournaldLogDriverProps

@Generated
public fun journaldLogDriver(): JournaldLogDriver = JournaldLogDriver()

@Generated
public fun journaldLogDriver(props: JournaldLogDriverProps): JournaldLogDriver =
    JournaldLogDriver(props)

@Generated
public fun buildJournaldLogDriver(initializer: @AwsCdkDsl JournaldLogDriver.Builder.() -> Unit):
    JournaldLogDriver = JournaldLogDriver.Builder.create().apply(initializer).build()
