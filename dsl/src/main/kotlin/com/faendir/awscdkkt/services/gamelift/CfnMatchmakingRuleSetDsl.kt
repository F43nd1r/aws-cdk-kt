package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMatchmakingRuleSet(
  id: String,
  props: CfnMatchmakingRuleSetProps,
  initializer: CfnMatchmakingRuleSet.() -> Unit = {},
): CfnMatchmakingRuleSet = CfnMatchmakingRuleSet(this, id, props).apply(initializer)
