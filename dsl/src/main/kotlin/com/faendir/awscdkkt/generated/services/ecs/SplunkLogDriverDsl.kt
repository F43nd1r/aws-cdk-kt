package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.SplunkLogDriver
import software.amazon.awscdk.services.ecs.SplunkLogDriverProps

@Generated
public fun splunkLogDriver(props: SplunkLogDriverProps): SplunkLogDriver = SplunkLogDriver(props)

@Generated
public fun buildSplunkLogDriver(initializer: @AwsCdkDsl SplunkLogDriver.Builder.() -> Unit):
    SplunkLogDriver = SplunkLogDriver.Builder.create().apply(initializer).build()
