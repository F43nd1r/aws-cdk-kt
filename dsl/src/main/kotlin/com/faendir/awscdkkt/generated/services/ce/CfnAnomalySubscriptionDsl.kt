package com.faendir.awscdkkt.generated.services.ce

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalySubscription
import software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnomalySubscription(
  id: String,
  props: CfnAnomalySubscriptionProps,
  initializer: @AwsCdkDsl CfnAnomalySubscription.() -> Unit = {},
): CfnAnomalySubscription = CfnAnomalySubscription(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnomalySubscription(id: String, initializer: @AwsCdkDsl CfnAnomalySubscription.Builder.() -> Unit = {}): CfnAnomalySubscription = CfnAnomalySubscription.Builder.create(this, id).apply(initializer).build()
