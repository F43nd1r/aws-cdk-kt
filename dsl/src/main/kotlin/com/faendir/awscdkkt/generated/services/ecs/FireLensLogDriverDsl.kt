package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FireLensLogDriver
import software.amazon.awscdk.services.ecs.FireLensLogDriverProps

@Generated
public fun fireLensLogDriver(props: FireLensLogDriverProps): FireLensLogDriver =
    FireLensLogDriver(props)

@Generated
public fun buildFireLensLogDriver(initializer: @AwsCdkDsl FireLensLogDriver.Builder.() -> Unit):
    FireLensLogDriver = FireLensLogDriver.Builder.create().apply(initializer).build()
