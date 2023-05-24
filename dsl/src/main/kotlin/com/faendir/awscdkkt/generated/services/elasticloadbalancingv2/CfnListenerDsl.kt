package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnListener(id: String, props: CfnListenerProps): CfnListener =
    CfnListener(this, id, props)

@Generated
public fun Construct.cfnListener(
  id: String,
  props: CfnListenerProps,
  initializer: @AwsCdkDsl CfnListener.() -> Unit,
): CfnListener = CfnListener(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnListener(id: String, initializer: @AwsCdkDsl
    CfnListener.Builder.() -> Unit): CfnListener = CfnListener.Builder.create(this,
    id).apply(initializer).build()
