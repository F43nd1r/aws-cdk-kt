@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnScript
import software.amazon.awscdk.services.gamelift.CfnScriptProps
import software.constructs.Construct

public fun Construct.cfnScript(
  id: String,
  props: CfnScriptProps,
  initializer: CfnScript.() -> Unit = {},
): CfnScript = CfnScript(this, id, props).apply(initializer)
