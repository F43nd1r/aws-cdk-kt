package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.parameterGroup(id: String, props: ParameterGroupProps): ParameterGroup =
    ParameterGroup(this, id, props)

@Generated
public fun Construct.parameterGroup(
  id: String,
  props: ParameterGroupProps,
  initializer: @AwsCdkDsl ParameterGroup.() -> Unit,
): ParameterGroup = ParameterGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildParameterGroup(id: String, initializer: @AwsCdkDsl
    ParameterGroup.Builder.() -> Unit): ParameterGroup = ParameterGroup.Builder.create(this,
    id).apply(initializer).build()
