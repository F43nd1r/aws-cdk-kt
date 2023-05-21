package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun ephemeralStorageProperty(initializer: CfnTaskDefinition.EphemeralStorageProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.EphemeralStorageProperty =
    CfnTaskDefinition.EphemeralStorageProperty.builder().apply(initializer).build()
