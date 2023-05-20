@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions

public
    fun userPoolResourceServerOptions(initializer: UserPoolResourceServerOptions.Builder.() -> Unit):
    UserPoolResourceServerOptions =
    UserPoolResourceServerOptions.builder().apply(initializer).build()
