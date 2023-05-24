package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoGetItemProps
import software.constructs.Construct

@Generated
public fun Construct.dynamoGetItem(id: String, props: DynamoGetItemProps): DynamoGetItem =
    DynamoGetItem(this, id, props)

@Generated
public fun Construct.dynamoGetItem(
  id: String,
  props: DynamoGetItemProps,
  initializer: @AwsCdkDsl DynamoGetItem.() -> Unit,
): DynamoGetItem = DynamoGetItem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDynamoGetItem(id: String, initializer: @AwsCdkDsl
    DynamoGetItem.Builder.() -> Unit): DynamoGetItem = DynamoGetItem.Builder.create(this,
    id).apply(initializer).build()
