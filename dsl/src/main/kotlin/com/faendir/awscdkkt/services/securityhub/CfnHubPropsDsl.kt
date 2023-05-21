package com.faendir.awscdkkt.services.securityhub

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnHubProps

@Generated
public fun cfnHubProps(initializer: CfnHubProps.Builder.() -> Unit = {}): CfnHubProps =
    CfnHubProps.builder().apply(initializer).build()
