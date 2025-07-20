package com.faendir.awscdkkt.generated.services.dax

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnParameterGroup
import software.amazon.awscdk.services.dax.CfnParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnParameterGroup(id: String, initializer: @AwsCdkDsl CfnParameterGroup.() -> Unit = {}): CfnParameterGroup = CfnParameterGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnParameterGroup(
  id: String,
  props: CfnParameterGroupProps,
  initializer: @AwsCdkDsl CfnParameterGroup.() -> Unit = {},
): CfnParameterGroup = CfnParameterGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnParameterGroup(id: String, initializer: @AwsCdkDsl CfnParameterGroup.Builder.() -> Unit = {}): CfnParameterGroup = CfnParameterGroup.Builder.create(this, id).apply(initializer).build()
