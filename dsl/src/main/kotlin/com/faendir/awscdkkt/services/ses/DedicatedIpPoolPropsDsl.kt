package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.DedicatedIpPoolProps

@Generated
public fun dedicatedIpPoolProps(initializer: DedicatedIpPoolProps.Builder.() -> Unit = {}):
    DedicatedIpPoolProps = DedicatedIpPoolProps.builder().apply(initializer).build()
