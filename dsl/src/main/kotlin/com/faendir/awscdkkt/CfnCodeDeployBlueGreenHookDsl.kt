@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnCodeDeployBlueGreenHook
import software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps
import software.constructs.Construct

public fun Construct.cfnCodeDeployBlueGreenHook(
  id: String,
  props: CfnCodeDeployBlueGreenHookProps,
  initializer: CfnCodeDeployBlueGreenHook.() -> Unit = {},
): CfnCodeDeployBlueGreenHook = CfnCodeDeployBlueGreenHook(this, id, props).apply(initializer)
