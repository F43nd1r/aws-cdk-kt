package com.faendir.awscdkkt.generated.services.chime

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chime.CfnAppInstanceBot
import software.amazon.awscdk.services.chime.CfnAppInstanceBotProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppInstanceBot(
  id: String,
  props: CfnAppInstanceBotProps,
  initializer: @AwsCdkDsl CfnAppInstanceBot.() -> Unit = {},
): CfnAppInstanceBot = CfnAppInstanceBot(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAppInstanceBot(id: String, initializer: @AwsCdkDsl CfnAppInstanceBot.Builder.() -> Unit = {}): CfnAppInstanceBot = CfnAppInstanceBot.Builder.create(this, id).apply(initializer).build()
