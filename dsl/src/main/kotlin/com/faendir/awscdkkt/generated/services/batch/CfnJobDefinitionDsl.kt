package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnJobDefinition(
  id: String,
  props: CfnJobDefinitionProps,
  initializer: @AwsCdkDsl CfnJobDefinition.() -> Unit = {},
): CfnJobDefinition = CfnJobDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnJobDefinition(id: String, initializer: @AwsCdkDsl CfnJobDefinition.Builder.() -> Unit = {}): CfnJobDefinition = CfnJobDefinition.Builder.create(this, id).apply(initializer).build()
