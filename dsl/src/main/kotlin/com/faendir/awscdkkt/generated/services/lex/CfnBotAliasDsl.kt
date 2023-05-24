package com.faendir.awscdkkt.generated.services.lex

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias
import software.amazon.awscdk.services.lex.CfnBotAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBotAlias(id: String, props: CfnBotAliasProps): CfnBotAlias =
    CfnBotAlias(this, id, props)

@Generated
public fun Construct.cfnBotAlias(
  id: String,
  props: CfnBotAliasProps,
  initializer: @AwsCdkDsl CfnBotAlias.() -> Unit,
): CfnBotAlias = CfnBotAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBotAlias(id: String, initializer: @AwsCdkDsl
    CfnBotAlias.Builder.() -> Unit): CfnBotAlias = CfnBotAlias.Builder.create(this,
    id).apply(initializer).build()
