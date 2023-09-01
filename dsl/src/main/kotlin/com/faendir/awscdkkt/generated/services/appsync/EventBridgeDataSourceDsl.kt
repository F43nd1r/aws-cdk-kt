package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EventBridgeDataSource.() -> Unit = {},
): EventBridgeDataSource = EventBridgeDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEventBridgeDataSource(id: String, initializer: @AwsCdkDsl
    EventBridgeDataSource.Builder.() -> Unit = {}): EventBridgeDataSource =
    EventBridgeDataSource.Builder.create(this, id).apply(initializer).build()
