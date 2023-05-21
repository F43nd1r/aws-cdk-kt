package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnTableProps

@Generated
public fun cfnTableProps(initializer: CfnTableProps.Builder.() -> Unit = {}): CfnTableProps =
    CfnTableProps.builder().apply(initializer).build()
