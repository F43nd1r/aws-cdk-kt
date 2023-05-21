package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnServerlessCluster

@Generated
public fun iamProperty(initializer: CfnServerlessCluster.IamProperty.Builder.() -> Unit = {}):
    CfnServerlessCluster.IamProperty =
    CfnServerlessCluster.IamProperty.builder().apply(initializer).build()
