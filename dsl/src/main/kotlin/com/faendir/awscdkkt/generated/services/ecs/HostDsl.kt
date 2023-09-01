package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Host

@Generated
public fun buildHost(initializer: @AwsCdkDsl Host.Builder.() -> Unit = {}): Host =
    Host.Builder().apply(initializer).build()
