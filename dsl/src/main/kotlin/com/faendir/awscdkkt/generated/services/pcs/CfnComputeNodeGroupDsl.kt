package com.faendir.awscdkkt.generated.services.pcs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pcs.CfnComputeNodeGroup
import software.amazon.awscdk.services.pcs.CfnComputeNodeGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComputeNodeGroup(
  id: String,
  props: CfnComputeNodeGroupProps,
  initializer: @AwsCdkDsl CfnComputeNodeGroup.() -> Unit = {},
): CfnComputeNodeGroup = CfnComputeNodeGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnComputeNodeGroup(id: String, initializer: @AwsCdkDsl
    CfnComputeNodeGroup.Builder.() -> Unit = {}): CfnComputeNodeGroup =
    CfnComputeNodeGroup.Builder.create(this, id).apply(initializer).build()
