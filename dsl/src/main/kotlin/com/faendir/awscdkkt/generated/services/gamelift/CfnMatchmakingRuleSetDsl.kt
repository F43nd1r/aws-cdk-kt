package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnMatchmakingRuleSet.() -> Unit = {},
): CfnMatchmakingRuleSet = CfnMatchmakingRuleSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMatchmakingRuleSet(id: String, initializer: @AwsCdkDsl
    CfnMatchmakingRuleSet.Builder.() -> Unit = {}): CfnMatchmakingRuleSet =
    CfnMatchmakingRuleSet.Builder.create(this, id).apply(initializer).build()
