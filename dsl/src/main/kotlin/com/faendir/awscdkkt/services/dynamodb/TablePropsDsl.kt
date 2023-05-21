package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TableProps

@Generated
public fun tableProps(initializer: TableProps.Builder.() -> Unit = {}): TableProps =
    TableProps.builder().apply(initializer).build()
