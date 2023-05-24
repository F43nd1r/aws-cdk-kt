package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun buildEphemeralStorageProperty(initializer: @AwsCdkDsl
    CfnTaskDefinition.EphemeralStorageProperty.Builder.() -> Unit):
    CfnTaskDefinition.EphemeralStorageProperty =
    CfnTaskDefinition.EphemeralStorageProperty.Builder().apply(initializer).build()
