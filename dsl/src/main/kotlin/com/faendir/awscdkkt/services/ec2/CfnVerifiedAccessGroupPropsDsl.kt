package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps

@Generated
public fun cfnVerifiedAccessGroupProps(initializer: CfnVerifiedAccessGroupProps.Builder.() -> Unit =
    {}): CfnVerifiedAccessGroupProps =
    CfnVerifiedAccessGroupProps.builder().apply(initializer).build()
