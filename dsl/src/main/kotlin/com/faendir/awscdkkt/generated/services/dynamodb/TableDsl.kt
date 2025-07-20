package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableProps
import software.constructs.Construct

@Generated
public fun Construct.table(
  id: String,
  props: TableProps,
  initializer: @AwsCdkDsl Table.() -> Unit = {},
): Table = Table(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTable(id: String, initializer: @AwsCdkDsl Table.Builder.() -> Unit = {}): Table = Table.Builder.create(this, id).apply(initializer).build()
