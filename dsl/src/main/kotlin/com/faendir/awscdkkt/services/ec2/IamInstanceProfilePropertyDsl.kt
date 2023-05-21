package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun iamInstanceProfileProperty(initializer: CfnLaunchTemplate.IamInstanceProfileProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.IamInstanceProfileProperty =
    CfnLaunchTemplate.IamInstanceProfileProperty.builder().apply(initializer).build()
