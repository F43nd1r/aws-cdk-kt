@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TableAttributes

public fun tableAttributes(initializer: TableAttributes.Builder.() -> Unit): TableAttributes =
    TableAttributes.builder().apply(initializer).build()
