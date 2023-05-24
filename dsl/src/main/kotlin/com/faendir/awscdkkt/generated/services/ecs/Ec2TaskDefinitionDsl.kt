package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.ec2TaskDefinition(id: String): Ec2TaskDefinition = Ec2TaskDefinition(this, id)

@Generated
public fun Construct.ec2TaskDefinition(id: String, initializer: @AwsCdkDsl
    Ec2TaskDefinition.() -> Unit): Ec2TaskDefinition = Ec2TaskDefinition(this,
    id).apply(initializer)

@Generated
public fun Construct.ec2TaskDefinition(id: String, props: Ec2TaskDefinitionProps): Ec2TaskDefinition
    = Ec2TaskDefinition(this, id, props)

@Generated
public fun Construct.ec2TaskDefinition(
  id: String,
  props: Ec2TaskDefinitionProps,
  initializer: @AwsCdkDsl Ec2TaskDefinition.() -> Unit,
): Ec2TaskDefinition = Ec2TaskDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEc2TaskDefinition(id: String, initializer: @AwsCdkDsl
    Ec2TaskDefinition.Builder.() -> Unit): Ec2TaskDefinition =
    Ec2TaskDefinition.Builder.create(this, id).apply(initializer).build()
