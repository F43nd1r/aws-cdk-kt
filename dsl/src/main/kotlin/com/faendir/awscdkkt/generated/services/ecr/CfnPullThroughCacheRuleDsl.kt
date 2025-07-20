package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPullThroughCacheRule(id: String, initializer: @AwsCdkDsl CfnPullThroughCacheRule.() -> Unit = {}): CfnPullThroughCacheRule = CfnPullThroughCacheRule(this, id).apply(initializer)

@Generated
public fun Construct.cfnPullThroughCacheRule(
  id: String,
  props: CfnPullThroughCacheRuleProps,
  initializer: @AwsCdkDsl CfnPullThroughCacheRule.() -> Unit = {},
): CfnPullThroughCacheRule = CfnPullThroughCacheRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPullThroughCacheRule(id: String, initializer: @AwsCdkDsl CfnPullThroughCacheRule.Builder.() -> Unit = {}): CfnPullThroughCacheRule = CfnPullThroughCacheRule.Builder.create(this, id).apply(initializer).build()
