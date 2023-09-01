package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource

@Generated
public fun buildDynamoEventSource(table: ITable, initializer: @AwsCdkDsl
    DynamoEventSource.Builder.() -> Unit = {}): DynamoEventSource =
    DynamoEventSource.Builder.create(table).apply(initializer).build()
