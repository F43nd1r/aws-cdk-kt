package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPullThroughCacheRule(id: String,
    initializer: CfnPullThroughCacheRule.() -> Unit = {}): CfnPullThroughCacheRule =
    CfnPullThroughCacheRule(this, id).apply(initializer)

@Generated
public fun Construct.cfnPullThroughCacheRule(
  id: String,
  props: CfnPullThroughCacheRuleProps,
  initializer: CfnPullThroughCacheRule.() -> Unit = {},
): CfnPullThroughCacheRule = CfnPullThroughCacheRule(this, id, props).apply(initializer)
