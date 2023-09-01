package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItem
import software.amazon.awscdk.services.stepfunctions.tasks.DynamoPutItemProps
import software.constructs.Construct

@Generated
public fun Construct.dynamoPutItem(
  id: String,
  props: DynamoPutItemProps,
  initializer: @AwsCdkDsl DynamoPutItem.() -> Unit = {},
): DynamoPutItem = DynamoPutItem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDynamoPutItem(id: String, initializer: @AwsCdkDsl
    DynamoPutItem.Builder.() -> Unit = {}): DynamoPutItem = DynamoPutItem.Builder.create(this,
    id).apply(initializer).build()
