package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun buildVolumeProperty(initializer: @AwsCdkDsl
    CfnTaskDefinition.VolumeProperty.Builder.() -> Unit = {}): CfnTaskDefinition.VolumeProperty =
    CfnTaskDefinition.VolumeProperty.Builder().apply(initializer).build()
