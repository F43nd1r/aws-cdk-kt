@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
