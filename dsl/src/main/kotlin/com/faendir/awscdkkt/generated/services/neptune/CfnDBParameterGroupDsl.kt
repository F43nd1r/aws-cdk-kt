package com.faendir.awscdkkt.generated.services.neptune

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBParameterGroup
import software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBParameterGroup(id: String, props: CfnDBParameterGroupProps):
    CfnDBParameterGroup = CfnDBParameterGroup(this, id, props)

@Generated
public fun Construct.cfnDBParameterGroup(
  id: String,
  props: CfnDBParameterGroupProps,
  initializer: @AwsCdkDsl CfnDBParameterGroup.() -> Unit,
): CfnDBParameterGroup = CfnDBParameterGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBParameterGroup(id: String, initializer: @AwsCdkDsl
    CfnDBParameterGroup.Builder.() -> Unit): CfnDBParameterGroup =
    CfnDBParameterGroup.Builder.create(this, id).apply(initializer).build()
