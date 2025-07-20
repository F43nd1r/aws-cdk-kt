package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.ConfluentSchemaRegistry

@Generated
public fun buildConfluentSchemaRegistry(initializer: @AwsCdkDsl ConfluentSchemaRegistry.Builder.() -> Unit = {}): ConfluentSchemaRegistry = ConfluentSchemaRegistry.Builder.create().apply(initializer).build()
