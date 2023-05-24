package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnUser

@Generated
public fun buildLoginProfileProperty(initializer: @AwsCdkDsl
    CfnUser.LoginProfileProperty.Builder.() -> Unit): CfnUser.LoginProfileProperty =
    CfnUser.LoginProfileProperty.Builder().apply(initializer).build()
