package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.ec2TaskDefinition(id: String, initializer: Ec2TaskDefinition.() -> Unit = {}):
    Ec2TaskDefinition = Ec2TaskDefinition(this, id).apply(initializer)

@Generated
public fun Construct.ec2TaskDefinition(
  id: String,
  props: Ec2TaskDefinitionProps,
  initializer: Ec2TaskDefinition.() -> Unit = {},
): Ec2TaskDefinition = Ec2TaskDefinition(this, id, props).apply(initializer)
