package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnPatchBaselineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPatchBaseline(id: String, props: CfnPatchBaselineProps): CfnPatchBaseline =
    CfnPatchBaseline(this, id, props)

@Generated
public fun Construct.cfnPatchBaseline(
  id: String,
  props: CfnPatchBaselineProps,
  initializer: @AwsCdkDsl CfnPatchBaseline.() -> Unit,
): CfnPatchBaseline = CfnPatchBaseline(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPatchBaseline(id: String, initializer: @AwsCdkDsl
    CfnPatchBaseline.Builder.() -> Unit): CfnPatchBaseline = CfnPatchBaseline.Builder.create(this,
    id).apply(initializer).build()
