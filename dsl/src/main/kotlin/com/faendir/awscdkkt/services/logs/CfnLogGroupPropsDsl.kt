package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnLogGroupProps

@Generated
public fun cfnLogGroupProps(initializer: CfnLogGroupProps.Builder.() -> Unit = {}): CfnLogGroupProps
    = CfnLogGroupProps.builder().apply(initializer).build()
