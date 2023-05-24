package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTaskDefinition(id: String, props: CfnTaskDefinitionProps): CfnTaskDefinition
    = CfnTaskDefinition(this, id, props)

@Generated
public fun Construct.cfnTaskDefinition(
  id: String,
  props: CfnTaskDefinitionProps,
  initializer: @AwsCdkDsl CfnTaskDefinition.() -> Unit,
): CfnTaskDefinition = CfnTaskDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTaskDefinition(id: String, initializer: @AwsCdkDsl
    CfnTaskDefinition.Builder.() -> Unit): CfnTaskDefinition =
    CfnTaskDefinition.Builder.create(this, id).apply(initializer).build()
