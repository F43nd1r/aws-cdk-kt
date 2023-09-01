package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ContainerImageConfig

@Generated
public fun buildContainerImageConfig(initializer: @AwsCdkDsl ContainerImageConfig.Builder.() -> Unit
    = {}): ContainerImageConfig = ContainerImageConfig.Builder().apply(initializer).build()
