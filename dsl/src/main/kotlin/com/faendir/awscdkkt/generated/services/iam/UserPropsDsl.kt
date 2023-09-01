package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.UserProps

@Generated
public fun buildUserProps(initializer: @AwsCdkDsl UserProps.Builder.() -> Unit = {}): UserProps =
    UserProps.Builder().apply(initializer).build()
