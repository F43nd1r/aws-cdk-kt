@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.Connection
import software.amazon.awscdk.services.events.ConnectionProps
import software.constructs.Construct

public fun Construct.connection(
  id: String,
  props: ConnectionProps,
  initializer: Connection.() -> Unit = {},
): Connection = Connection(this, id, props).apply(initializer)
