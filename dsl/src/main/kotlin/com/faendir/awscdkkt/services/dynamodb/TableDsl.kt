package com.faendir.awscdkkt.services.dynamodb

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
  initializer: Table.() -> Unit = {},
): Table = Table(this, id, props).apply(initializer)
