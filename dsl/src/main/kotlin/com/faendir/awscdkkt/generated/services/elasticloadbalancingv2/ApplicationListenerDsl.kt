package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps
import software.constructs.Construct

@Generated
public fun Construct.applicationListener(id: String, props: ApplicationListenerProps):
    ApplicationListener = ApplicationListener(this, id, props)

@Generated
public fun Construct.applicationListener(
  id: String,
  props: ApplicationListenerProps,
  initializer: @AwsCdkDsl ApplicationListener.() -> Unit,
): ApplicationListener = ApplicationListener(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApplicationListener(id: String, initializer: @AwsCdkDsl
    ApplicationListener.Builder.() -> Unit): ApplicationListener =
    ApplicationListener.Builder.create(this, id).apply(initializer).build()
