package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun hibernationOptionsProperty(initializer: CfnLaunchTemplate.HibernationOptionsProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.HibernationOptionsProperty =
    CfnLaunchTemplate.HibernationOptionsProperty.builder().apply(initializer).build()
