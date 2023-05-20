@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTableProps

public fun cfnTableProps(initializer: CfnTableProps.Builder.() -> Unit): CfnTableProps =
    CfnTableProps.builder().apply(initializer).build()
