package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TableAttributes

@Generated
public fun tableAttributes(initializer: TableAttributes.Builder.() -> Unit = {}): TableAttributes =
    TableAttributes.builder().apply(initializer).build()
