@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableProps
import software.constructs.Construct

public fun Construct.table(
  id: String,
  props: TableProps,
  initializer: Table.() -> Unit = {},
): Table = Table(this, id, props).apply(initializer)
