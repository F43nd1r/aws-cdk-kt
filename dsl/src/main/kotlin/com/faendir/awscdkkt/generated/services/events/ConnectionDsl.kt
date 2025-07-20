package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl Connection.() -> Unit = {},
): Connection = Connection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildConnection(id: String, initializer: @AwsCdkDsl Connection.Builder.() -> Unit = {}): Connection = Connection.Builder.create(this, id).apply(initializer).build()
