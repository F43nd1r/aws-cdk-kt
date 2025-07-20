package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnProductSubscription
import software.amazon.awscdk.services.securityhub.CfnProductSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProductSubscription(
  id: String,
  props: CfnProductSubscriptionProps,
  initializer: @AwsCdkDsl CfnProductSubscription.() -> Unit = {},
): CfnProductSubscription = CfnProductSubscription(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProductSubscription(id: String, initializer: @AwsCdkDsl CfnProductSubscription.Builder.() -> Unit = {}): CfnProductSubscription = CfnProductSubscription.Builder.create(this, id).apply(initializer).build()
