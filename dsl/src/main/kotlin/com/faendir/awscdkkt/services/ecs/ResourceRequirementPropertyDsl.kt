package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun resourceRequirementProperty(initializer: CfnTaskDefinition.ResourceRequirementProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.ResourceRequirementProperty =
    CfnTaskDefinition.ResourceRequirementProperty.builder().apply(initializer).build()
