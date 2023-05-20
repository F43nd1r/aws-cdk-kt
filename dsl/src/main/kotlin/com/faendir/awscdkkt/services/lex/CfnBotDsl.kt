@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot
import software.amazon.awscdk.services.lex.CfnBotProps
import software.constructs.Construct

public fun Construct.cfnBot(
  id: String,
  props: CfnBotProps,
  initializer: CfnBot.() -> Unit = {},
): CfnBot = CfnBot(this, id, props).apply(initializer)
