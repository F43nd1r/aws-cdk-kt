package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun taskDefinitionPlacementConstraintProperty(initializer: CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty =
    CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.builder().apply(initializer).build()
