package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.CfnTag

@Generated
public fun cfnTag(initializer: CfnTag.Builder.() -> Unit = {}): CfnTag =
    CfnTag.builder().apply(initializer).build()
