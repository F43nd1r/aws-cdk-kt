@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.UserAttributes

public fun userAttributes(initializer: UserAttributes.Builder.() -> Unit): UserAttributes =
    UserAttributes.builder().apply(initializer).build()
