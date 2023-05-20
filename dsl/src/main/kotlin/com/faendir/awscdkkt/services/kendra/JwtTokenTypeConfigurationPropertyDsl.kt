@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex

public
    fun jwtTokenTypeConfigurationProperty(initializer: CfnIndex.JwtTokenTypeConfigurationProperty.Builder.() -> Unit):
    CfnIndex.JwtTokenTypeConfigurationProperty =
    CfnIndex.JwtTokenTypeConfigurationProperty.builder().apply(initializer).build()
