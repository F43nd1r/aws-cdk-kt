package com.faendir.awscdkkt.generated.services.docdb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.CfnEventSubscription
import software.amazon.awscdk.services.docdb.CfnEventSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventSubscription(
  id: String,
  props: CfnEventSubscriptionProps,
  initializer: @AwsCdkDsl CfnEventSubscription.() -> Unit = {},
): CfnEventSubscription = CfnEventSubscription(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventSubscription(id: String, initializer: @AwsCdkDsl
    CfnEventSubscription.Builder.() -> Unit = {}): CfnEventSubscription =
    CfnEventSubscription.Builder.create(this, id).apply(initializer).build()