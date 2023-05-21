package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot
import software.amazon.awscdk.services.lex.CfnBotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBot(
  id: String,
  props: CfnBotProps,
  initializer: CfnBot.() -> Unit = {},
): CfnBot = CfnBot(this, id, props).apply(initializer)
