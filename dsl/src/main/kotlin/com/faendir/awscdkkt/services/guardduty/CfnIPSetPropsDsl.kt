package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnIPSetProps

@Generated
public fun cfnIPSetProps(initializer: CfnIPSetProps.Builder.() -> Unit = {}): CfnIPSetProps =
    CfnIPSetProps.builder().apply(initializer).build()
