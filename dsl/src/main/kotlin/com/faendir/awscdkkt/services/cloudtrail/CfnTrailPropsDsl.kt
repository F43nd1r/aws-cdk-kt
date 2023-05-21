package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrailProps

@Generated
public fun cfnTrailProps(initializer: CfnTrailProps.Builder.() -> Unit = {}): CfnTrailProps =
    CfnTrailProps.builder().apply(initializer).build()
