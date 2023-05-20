@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnPatchBaselineProps
import software.constructs.Construct

public fun Construct.cfnPatchBaseline(
  id: String,
  props: CfnPatchBaselineProps,
  initializer: CfnPatchBaseline.() -> Unit = {},
): CfnPatchBaseline = CfnPatchBaseline(this, id, props).apply(initializer)
