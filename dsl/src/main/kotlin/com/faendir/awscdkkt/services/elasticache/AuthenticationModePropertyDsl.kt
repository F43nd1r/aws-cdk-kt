@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnUser

public
    fun authenticationModeProperty(initializer: CfnUser.AuthenticationModeProperty.Builder.() -> Unit):
    CfnUser.AuthenticationModeProperty =
    CfnUser.AuthenticationModeProperty.builder().apply(initializer).build()
