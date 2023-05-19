@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.EventBridgeDataSource
import software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps
import software.constructs.Construct

public fun Construct.eventBridgeDataSource(
  id: String,
  props: EventBridgeDataSourceProps,
  initializer: EventBridgeDataSource.() -> Unit = {},
): EventBridgeDataSource = EventBridgeDataSource(this, id, props).apply(initializer)
