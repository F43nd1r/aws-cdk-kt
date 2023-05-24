package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolClientProps

@Generated
public fun buildUserPoolClientProps(initializer: @AwsCdkDsl UserPoolClientProps.Builder.() -> Unit):
    UserPoolClientProps = UserPoolClientProps.Builder().apply(initializer).build()
