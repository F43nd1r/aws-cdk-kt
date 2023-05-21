package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.EventBridgeDataSource
import software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.eventBridgeDataSource(
  id: String,
  props: EventBridgeDataSourceProps,
  initializer: EventBridgeDataSource.() -> Unit = {},
): EventBridgeDataSource = EventBridgeDataSource(this, id, props).apply(initializer)
