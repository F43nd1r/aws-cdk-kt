package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscriptionFilter(
  id: String,
  props: CfnSubscriptionFilterProps,
  initializer: @AwsCdkDsl CfnSubscriptionFilter.() -> Unit = {},
): CfnSubscriptionFilter = CfnSubscriptionFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubscriptionFilter(id: String, initializer: @AwsCdkDsl
    CfnSubscriptionFilter.Builder.() -> Unit = {}): CfnSubscriptionFilter =
    CfnSubscriptionFilter.Builder.create(this, id).apply(initializer).build()
