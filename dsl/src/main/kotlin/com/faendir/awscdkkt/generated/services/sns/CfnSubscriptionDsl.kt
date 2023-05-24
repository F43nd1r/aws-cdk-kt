package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnSubscription
import software.amazon.awscdk.services.sns.CfnSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscription(id: String, props: CfnSubscriptionProps): CfnSubscription =
    CfnSubscription(this, id, props)

@Generated
public fun Construct.cfnSubscription(
  id: String,
  props: CfnSubscriptionProps,
  initializer: @AwsCdkDsl CfnSubscription.() -> Unit,
): CfnSubscription = CfnSubscription(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubscription(id: String, initializer: @AwsCdkDsl
    CfnSubscription.Builder.() -> Unit): CfnSubscription = CfnSubscription.Builder.create(this,
    id).apply(initializer).build()
