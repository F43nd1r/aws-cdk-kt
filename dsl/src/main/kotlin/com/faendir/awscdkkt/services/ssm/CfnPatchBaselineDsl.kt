package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnPatchBaselineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPatchBaseline(
  id: String,
  props: CfnPatchBaselineProps,
  initializer: CfnPatchBaseline.() -> Unit = {},
): CfnPatchBaseline = CfnPatchBaseline(this, id, props).apply(initializer)
