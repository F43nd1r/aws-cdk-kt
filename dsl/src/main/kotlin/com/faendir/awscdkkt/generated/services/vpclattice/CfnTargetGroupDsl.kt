package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTargetGroup(
  id: String,
  props: CfnTargetGroupProps,
  initializer: @AwsCdkDsl CfnTargetGroup.() -> Unit = {},
): CfnTargetGroup = CfnTargetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTargetGroup(id: String, initializer: @AwsCdkDsl CfnTargetGroup.Builder.() -> Unit = {}): CfnTargetGroup = CfnTargetGroup.Builder.create(this, id).apply(initializer).build()
