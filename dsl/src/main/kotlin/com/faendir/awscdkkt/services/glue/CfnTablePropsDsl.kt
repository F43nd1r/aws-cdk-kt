package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTableProps

@Generated
public fun cfnTableProps(initializer: CfnTableProps.Builder.() -> Unit = {}): CfnTableProps =
    CfnTableProps.builder().apply(initializer).build()
