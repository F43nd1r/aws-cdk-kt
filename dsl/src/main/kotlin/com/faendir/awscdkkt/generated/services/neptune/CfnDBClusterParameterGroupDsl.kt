package com.faendir.awscdkkt.generated.services.neptune

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBClusterParameterGroup(
  id: String,
  props: CfnDBClusterParameterGroupProps,
  initializer: @AwsCdkDsl CfnDBClusterParameterGroup.() -> Unit = {},
): CfnDBClusterParameterGroup = CfnDBClusterParameterGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBClusterParameterGroup(id: String, initializer: @AwsCdkDsl
    CfnDBClusterParameterGroup.Builder.() -> Unit = {}): CfnDBClusterParameterGroup =
    CfnDBClusterParameterGroup.Builder.create(this, id).apply(initializer).build()
