package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TablePropsV2
import software.amazon.awscdk.services.dynamodb.TableV2
import software.constructs.Construct

@Generated
public fun Construct.tableV2(
  id: String,
  props: TablePropsV2,
  initializer: @AwsCdkDsl TableV2.() -> Unit = {},
): TableV2 = TableV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTableV2(id: String, initializer: @AwsCdkDsl TableV2.Builder.() -> Unit = {}): TableV2 = TableV2.Builder.create(this, id).apply(initializer).build()
