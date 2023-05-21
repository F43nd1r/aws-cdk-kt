package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias

@Generated
public fun lambdaCodeHookProperty(initializer: CfnBotAlias.LambdaCodeHookProperty.Builder.() -> Unit
    = {}): CfnBotAlias.LambdaCodeHookProperty =
    CfnBotAlias.LambdaCodeHookProperty.builder().apply(initializer).build()
