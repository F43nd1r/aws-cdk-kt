package com.faendir.awscdkkt.generated.services.lex

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotVersion
import software.amazon.awscdk.services.lex.CfnBotVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBotVersion(
  id: String,
  props: CfnBotVersionProps,
  initializer: @AwsCdkDsl CfnBotVersion.() -> Unit = {},
): CfnBotVersion = CfnBotVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBotVersion(id: String, initializer: @AwsCdkDsl
    CfnBotVersion.Builder.() -> Unit = {}): CfnBotVersion = CfnBotVersion.Builder.create(this,
    id).apply(initializer).build()
