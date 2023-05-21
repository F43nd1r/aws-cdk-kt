package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstanceProps

@Generated
public
    fun cfnVerifiedAccessInstanceProps(initializer: CfnVerifiedAccessInstanceProps.Builder.() -> Unit
    = {}): CfnVerifiedAccessInstanceProps =
    CfnVerifiedAccessInstanceProps.builder().apply(initializer).build()
