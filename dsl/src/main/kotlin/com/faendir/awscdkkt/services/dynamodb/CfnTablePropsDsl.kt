package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTableProps

@Generated
public fun cfnTableProps(initializer: CfnTableProps.Builder.() -> Unit = {}): CfnTableProps =
    CfnTableProps.builder().apply(initializer).build()
