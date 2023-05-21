package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.UserProps

@Generated
public fun userProps(initializer: UserProps.Builder.() -> Unit = {}): UserProps =
    UserProps.builder().apply(initializer).build()
