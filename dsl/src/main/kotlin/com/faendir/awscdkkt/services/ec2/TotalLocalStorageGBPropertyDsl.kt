package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun totalLocalStorageGBProperty(initializer: CfnLaunchTemplate.TotalLocalStorageGBProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.TotalLocalStorageGBProperty =
    CfnLaunchTemplate.TotalLocalStorageGBProperty.builder().apply(initializer).build()
