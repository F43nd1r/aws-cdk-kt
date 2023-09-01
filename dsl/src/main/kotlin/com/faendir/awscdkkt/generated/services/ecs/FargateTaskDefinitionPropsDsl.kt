package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps

@Generated
public fun buildFargateTaskDefinitionProps(initializer: @AwsCdkDsl
    FargateTaskDefinitionProps.Builder.() -> Unit = {}): FargateTaskDefinitionProps =
    FargateTaskDefinitionProps.Builder().apply(initializer).build()
