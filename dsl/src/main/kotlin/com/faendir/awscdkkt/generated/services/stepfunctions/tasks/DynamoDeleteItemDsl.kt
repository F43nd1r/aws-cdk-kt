package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoDeleteItemProps
import software.constructs.Construct

@Generated
public fun Construct.dynamoDeleteItem(
  id: String,
  props: DynamoDeleteItemProps,
  initializer: @AwsCdkDsl DynamoDeleteItem.() -> Unit = {},
): DynamoDeleteItem = DynamoDeleteItem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDynamoDeleteItem(id: String, initializer: @AwsCdkDsl
    DynamoDeleteItem.Builder.() -> Unit = {}): DynamoDeleteItem =
    DynamoDeleteItem.Builder.create(this, id).apply(initializer).build()
