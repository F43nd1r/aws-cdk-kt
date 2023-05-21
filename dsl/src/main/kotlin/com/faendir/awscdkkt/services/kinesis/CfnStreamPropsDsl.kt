package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStreamProps

@Generated
public fun cfnStreamProps(initializer: CfnStreamProps.Builder.() -> Unit = {}): CfnStreamProps =
    CfnStreamProps.builder().apply(initializer).build()
