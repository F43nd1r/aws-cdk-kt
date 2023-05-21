package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias
import software.amazon.awscdk.services.lex.CfnBotAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBotAlias(
  id: String,
  props: CfnBotAliasProps,
  initializer: CfnBotAlias.() -> Unit = {},
): CfnBotAlias = CfnBotAlias(this, id, props).apply(initializer)
