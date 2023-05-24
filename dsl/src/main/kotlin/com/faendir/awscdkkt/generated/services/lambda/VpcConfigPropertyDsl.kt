package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public fun buildVpcConfigProperty(initializer: @AwsCdkDsl
    CfnFunction.VpcConfigProperty.Builder.() -> Unit): CfnFunction.VpcConfigProperty =
    CfnFunction.VpcConfigProperty.Builder().apply(initializer).build()
