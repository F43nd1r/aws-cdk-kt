package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex

@Generated
public
    fun userTokenConfigurationProperty(initializer: CfnIndex.UserTokenConfigurationProperty.Builder.() -> Unit
    = {}): CfnIndex.UserTokenConfigurationProperty =
    CfnIndex.UserTokenConfigurationProperty.builder().apply(initializer).build()
