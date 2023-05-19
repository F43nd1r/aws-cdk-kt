@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
