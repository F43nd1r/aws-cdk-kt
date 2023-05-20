@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps
import software.constructs.Construct

public fun Construct.cfnPullThroughCacheRule(
  id: String,
  props: CfnPullThroughCacheRuleProps,
  initializer: CfnPullThroughCacheRule.() -> Unit = {},
): CfnPullThroughCacheRule = CfnPullThroughCacheRule(this, id, props).apply(initializer)

public fun Construct.cfnPullThroughCacheRule(id: String,
    initializer: CfnPullThroughCacheRule.() -> Unit = {}): CfnPullThroughCacheRule =
    CfnPullThroughCacheRule(this, id).apply(initializer)
