package com.faendir.awscdkkt.services.wisdom

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.amazon.awscdk.services.wisdom.CfnAssistantProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssistant(
  id: String,
  props: CfnAssistantProps,
  initializer: CfnAssistant.() -> Unit = {},
): CfnAssistant = CfnAssistant(this, id, props).apply(initializer)
