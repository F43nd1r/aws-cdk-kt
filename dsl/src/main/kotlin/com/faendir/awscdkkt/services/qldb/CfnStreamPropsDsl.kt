package com.faendir.awscdkkt.services.qldb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnStreamProps

@Generated
public fun cfnStreamProps(initializer: CfnStreamProps.Builder.() -> Unit = {}): CfnStreamProps =
    CfnStreamProps.builder().apply(initializer).build()
