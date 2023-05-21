package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TableOptions

@Generated
public fun tableOptions(initializer: TableOptions.Builder.() -> Unit = {}): TableOptions =
    TableOptions.builder().apply(initializer).build()
