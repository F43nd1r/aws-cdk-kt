package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoUpdateItemProps
import software.constructs.Construct

@Generated
public fun Construct.dynamoUpdateItem(id: String, props: DynamoUpdateItemProps): DynamoUpdateItem =
    DynamoUpdateItem(this, id, props)

@Generated
public fun Construct.dynamoUpdateItem(
  id: String,
  props: DynamoUpdateItemProps,
  initializer: @AwsCdkDsl DynamoUpdateItem.() -> Unit,
): DynamoUpdateItem = DynamoUpdateItem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDynamoUpdateItem(id: String, initializer: @AwsCdkDsl
    DynamoUpdateItem.Builder.() -> Unit): DynamoUpdateItem = DynamoUpdateItem.Builder.create(this,
    id).apply(initializer).build()
