package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnHostProps

@Generated
public fun cfnHostProps(initializer: CfnHostProps.Builder.() -> Unit = {}): CfnHostProps =
    CfnHostProps.builder().apply(initializer).build()
