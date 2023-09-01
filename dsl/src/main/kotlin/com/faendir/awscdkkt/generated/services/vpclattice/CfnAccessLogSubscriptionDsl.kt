package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessLogSubscription(
  id: String,
  props: CfnAccessLogSubscriptionProps,
  initializer: @AwsCdkDsl CfnAccessLogSubscription.() -> Unit = {},
): CfnAccessLogSubscription = CfnAccessLogSubscription(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessLogSubscription(id: String, initializer: @AwsCdkDsl
    CfnAccessLogSubscription.Builder.() -> Unit = {}): CfnAccessLogSubscription =
    CfnAccessLogSubscription.Builder.create(this, id).apply(initializer).build()
