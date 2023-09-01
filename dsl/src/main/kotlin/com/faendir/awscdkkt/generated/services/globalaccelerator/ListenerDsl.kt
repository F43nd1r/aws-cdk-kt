package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.Listener
import software.amazon.awscdk.services.globalaccelerator.ListenerProps
import software.constructs.Construct

@Generated
public fun Construct.listener(
  id: String,
  props: ListenerProps,
  initializer: @AwsCdkDsl Listener.() -> Unit = {},
): Listener = Listener(this, id, props).apply(initializer)

@Generated
public fun Construct.buildListener(id: String, initializer: @AwsCdkDsl Listener.Builder.() -> Unit =
    {}): Listener = Listener.Builder.create(this, id).apply(initializer).build()
