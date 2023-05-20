@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotVersion
import software.amazon.awscdk.services.lex.CfnBotVersionProps
import software.constructs.Construct

public fun Construct.cfnBotVersion(
  id: String,
  props: CfnBotVersionProps,
  initializer: CfnBotVersion.() -> Unit = {},
): CfnBotVersion = CfnBotVersion(this, id, props).apply(initializer)
