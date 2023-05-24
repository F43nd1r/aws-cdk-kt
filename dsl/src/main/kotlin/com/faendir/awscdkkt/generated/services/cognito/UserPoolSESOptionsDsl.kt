package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolSESOptions

@Generated
public fun buildUserPoolSESOptions(initializer: @AwsCdkDsl UserPoolSESOptions.Builder.() -> Unit):
    UserPoolSESOptions = UserPoolSESOptions.Builder().apply(initializer).build()
