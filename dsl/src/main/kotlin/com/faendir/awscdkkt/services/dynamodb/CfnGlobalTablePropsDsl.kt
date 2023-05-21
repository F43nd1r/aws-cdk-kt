package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps

@Generated
public fun cfnGlobalTableProps(initializer: CfnGlobalTableProps.Builder.() -> Unit = {}):
    CfnGlobalTableProps = CfnGlobalTableProps.builder().apply(initializer).build()
