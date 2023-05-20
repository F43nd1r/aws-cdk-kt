@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TableProps

public fun tableProps(initializer: TableProps.Builder.() -> Unit): TableProps =
    TableProps.builder().apply(initializer).build()
