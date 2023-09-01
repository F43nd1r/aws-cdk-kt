package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps

@Generated
public fun buildApplicationListenerProps(initializer: @AwsCdkDsl
    ApplicationListenerProps.Builder.() -> Unit = {}): ApplicationListenerProps =
    ApplicationListenerProps.Builder().apply(initializer).build()
