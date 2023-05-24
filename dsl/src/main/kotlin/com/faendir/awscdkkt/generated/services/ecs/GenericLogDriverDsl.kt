package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.GenericLogDriver

@Generated
public fun buildGenericLogDriver(initializer: @AwsCdkDsl GenericLogDriver.Builder.() -> Unit):
    GenericLogDriver = GenericLogDriver.Builder.create().apply(initializer).build()
