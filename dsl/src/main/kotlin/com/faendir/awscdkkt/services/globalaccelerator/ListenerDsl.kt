package com.faendir.awscdkkt.services.globalaccelerator

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
  initializer: Listener.() -> Unit = {},
): Listener = Listener(this, id, props).apply(initializer)
