package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.Connection
import software.amazon.awscdk.services.events.ConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.connection(
  id: String,
  props: ConnectionProps,
  initializer: Connection.() -> Unit = {},
): Connection = Connection(this, id, props).apply(initializer)
