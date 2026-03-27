package com.faendir.awscdkkt.generated.services.elementalinference

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elementalinference.CfnFeed
import software.amazon.awscdk.services.elementalinference.CfnFeedProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFeed(
  id: String,
  props: CfnFeedProps,
  initializer: @AwsCdkDsl CfnFeed.() -> Unit = {},
): CfnFeed = CfnFeed(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFeed(id: String, initializer: @AwsCdkDsl CfnFeed.Builder.() -> Unit = {}): CfnFeed = CfnFeed.Builder.create(this, id).apply(initializer).build()
