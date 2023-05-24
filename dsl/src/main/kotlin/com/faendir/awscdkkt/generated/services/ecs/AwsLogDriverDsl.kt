package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AwsLogDriver
import software.amazon.awscdk.services.ecs.AwsLogDriverProps

@Generated
public fun awsLogDriver(props: AwsLogDriverProps): AwsLogDriver = AwsLogDriver(props)

@Generated
public fun buildAwsLogDriver(initializer: @AwsCdkDsl AwsLogDriver.Builder.() -> Unit): AwsLogDriver
    = AwsLogDriver.Builder.create().apply(initializer).build()
