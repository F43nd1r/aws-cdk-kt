package com.faendir.awscdkkt.generated.services.redshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterParameterGroup(id: String, props: CfnClusterParameterGroupProps):
    CfnClusterParameterGroup = CfnClusterParameterGroup(this, id, props)

@Generated
public fun Construct.cfnClusterParameterGroup(
  id: String,
  props: CfnClusterParameterGroupProps,
  initializer: @AwsCdkDsl CfnClusterParameterGroup.() -> Unit,
): CfnClusterParameterGroup = CfnClusterParameterGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClusterParameterGroup(id: String, initializer: @AwsCdkDsl
    CfnClusterParameterGroup.Builder.() -> Unit): CfnClusterParameterGroup =
    CfnClusterParameterGroup.Builder.create(this, id).apply(initializer).build()
