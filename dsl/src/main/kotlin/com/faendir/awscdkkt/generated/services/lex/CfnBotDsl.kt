package com.faendir.awscdkkt.generated.services.lex

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnBot.() -> Unit = {},
): CfnBot = CfnBot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBot(id: String, initializer: @AwsCdkDsl CfnBot.Builder.() -> Unit = {}): CfnBot = CfnBot.Builder.create(this, id).apply(initializer).build()
