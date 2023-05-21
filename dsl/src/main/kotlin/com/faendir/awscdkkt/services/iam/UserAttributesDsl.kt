package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.UserAttributes

@Generated
public fun userAttributes(initializer: UserAttributes.Builder.() -> Unit = {}): UserAttributes =
    UserAttributes.builder().apply(initializer).build()
