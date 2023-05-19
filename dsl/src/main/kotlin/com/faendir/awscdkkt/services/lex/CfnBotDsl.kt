@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
