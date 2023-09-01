package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolProps

@Generated
public fun buildUserPoolProps(initializer: @AwsCdkDsl UserPoolProps.Builder.() -> Unit = {}):
    UserPoolProps = UserPoolProps.Builder().apply(initializer).build()
