package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex

@Generated
public
    fun jwtTokenTypeConfigurationProperty(initializer: CfnIndex.JwtTokenTypeConfigurationProperty.Builder.() -> Unit
    = {}): CfnIndex.JwtTokenTypeConfigurationProperty =
    CfnIndex.JwtTokenTypeConfigurationProperty.builder().apply(initializer).build()
